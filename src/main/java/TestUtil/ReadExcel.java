package TestUtil;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcel {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("C:\\Users\\amal.chaudhry\\Desktop\\ReadExcelSelenium.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet("Sheet1");  // providing sheet name
        // XSSFSheet sheet = workbook.getsheetAt(0);  //providing sheet index

        int rowCount = sheet.getLastRowNum(); // returns row count

       int ColumnCount =  sheet.getRow(0).getLastCellNum();   // return column count

        for(int i = 0 ; i<rowCount ; i++)
        {
           XSSFRow currentRow =  sheet.getRow(i);

            for( int j = 0 ; j < ColumnCount ; j++)
            {
              String str =  sheet.getRow(i).getCell(j).toString();
                System.out.print(" " + str);
            }
            System.out.println("");
        }

    }
}
