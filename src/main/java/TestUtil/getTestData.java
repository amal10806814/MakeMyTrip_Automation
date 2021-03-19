package TestUtil;

import java.util.ArrayList;

public class getTestData {

    static Xls_Reader reader;

    public static ArrayList<Object[]> getTestDatafromExcel() {
        ArrayList<Object[]> mydata = new ArrayList<Object[]>();

        try {
            reader = new Xls_Reader("C:\\Users\\amal.chaudhry\\Desktop\\ReadExcelSelenium.xlsx");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        for (int rowCount = 2; rowCount <= reader.getRowCount("Sheet1"); rowCount++) {
            String firstname = reader.getCellData("Sheet1", "firstname", rowCount);
            String lastname = reader.getCellData("Sheet1", "lastname", rowCount);
            String email = reader.getCellData("Sheet1", "email", rowCount);
            String password = reader.getCellData("Sheet1", "password", rowCount);

            Object abc[] = {firstname, lastname, email, password};
            mydata.add(abc);
        }

        return mydata;
    }

}
