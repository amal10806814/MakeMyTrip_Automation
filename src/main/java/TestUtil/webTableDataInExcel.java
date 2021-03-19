package TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webTableDataInExcel {

    static WebDriver driver ;

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "D:\\ChromeDriver\\chromedriver.exe");

         driver = new ChromeDriver();

        driver.get("https://www.w3schools.com/html/html_tables.asp");

        driver.manage().window().maximize();

        String beforeXpathcompanyName = "//*[@id='customers']/tbody/tr[";
        String afterXpathcompanyName = "]/td[1]";

        String beforeXpathContact = "//*[@id='customers']/tbody/tr[";
        String afterXpathContact = "]/td[2]";

      List<WebElement> rowCount =  driver.findElements(By.xpath("//*[@id='customers']//tr"));
        System.out.println(rowCount.size());
        int rowsize = rowCount.size();

        Xls_Reader reader = new Xls_Reader("C:\\Users\\amal.chaudhry\\Desktop\\ReadExcelSelenium.xlsx");

        if(!reader.isSheetExist("WebTable")) {
            reader.addSheet("WebTable");
            reader.addColumn("WebTable", "companyName");
            reader.addColumn("WebTable", "Contactname");
        }

        for(int i = 2 ; i <=rowsize ;i++ )
        {
            String finalxpathcompanyName = beforeXpathcompanyName+i+afterXpathcompanyName;
            String companyName = driver.findElement(By.xpath(finalxpathcompanyName)).getText();
            System.out.println(companyName);
            reader.setCellData("WebTable","companyName", i ,companyName );

            String finalxpathContact = beforeXpathContact+i+afterXpathContact;
            String Contactname = driver.findElement(By.xpath(finalxpathContact)).getText();
            System.out.println(Contactname);
            reader.setCellData("WebTable","Contactname", i ,Contactname );
        }
    }
}

