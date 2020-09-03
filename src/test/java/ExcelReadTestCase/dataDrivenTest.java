package ExcelReadTestCase;

import cucumber.api.java.eo.Se;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class dataDrivenTest {

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");

        driver.manage().window().maximize();

        FileInputStream file = new FileInputStream("C:\\Users\\amal.chaudhry\\Desktop\\ReadExcelSelenium.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(0);

        int rowCount = sheet.getLastRowNum();

        int cellCount = sheet.getRow(0).getLastCellNum();

        for(int i = 1 ; i <=rowCount ; i++)
        {
        String firstname = sheet.getRow(i).getCell(0).toString();

        String lastname = sheet.getRow(i).getCell(1).toString();

        String email = sheet.getRow(i).getCell(2).toString();

        String password = sheet.getRow(i).getCell(3).toString();

        String date = sheet.getRow(i).getCell(4).toString();
        System.out.println(date);

        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(firstname);

        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(lastname);

        driver.findElement(By.name("reg_email__")).clear();
        driver.findElement(By.name("reg_email__")).sendKeys(email);

        driver.findElement(By.name("reg_passwd__")).clear();
        driver.findElement(By.name("reg_passwd__")).sendKeys(password);

       Select select = new Select(driver.findElement(By.id("month")));
       select.selectByVisibleText(date);

        }

    }
}
