package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import utilities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFile {


    @Given("user write excelFile")
    public void user_write_excel_file() throws IOException {

        //#  1) Let's create a new Class WriteExcel
        //#  2) Let's create a new test method writeExcelTest()
        //#  3) Let's go to the 1st line by following the steps
        //#  4) Let's create a new cell for cell 4
        //#  5) Let's print "Population" in the cell we created
        //#  6) Let's print 1500000 in the 2nd line population column
        //#  7) Let's print 250000 in the 10th line population column
        //#  8) Let's print 54000 in the 15th line population column
        //#  9) Let's save the file
        //#  10) Close the file

        //#  4) Let's create a new cell for cell 4
        String filePath = "src/test/java/utilities/countries.xlsx";
        FileInputStream fis = new FileInputStream(filePath);

        // We create a copy of the original excel file and work on it.
        // At the end we will replace this copy with the original file.
        Workbook workbook = WorkbookFactory.create(fis);

        workbook.getSheet("Sayfa1").getRow(0).getCell(4).setCellValue("Population");

        //#  6) Let's print 1500000 in the 2nd line population column
        workbook.getSheet("Sheet1").getRow(1).getCell(4).setCellValue("1500000");

        //#  7) Let's print 250000 in the 10th line population column
        workbook.getSheet("Sheet1").getRow(1).getCell(9).setCellValue("250000");

        //#  8) Let's print 54000 in the 15th line population column
        workbook.getSheet("Sheet1").getRow(1).getCell(14).setCellValue("54000");

        //#  9) Let's save the file using OUTPUT Stream. We replace the original file with our copy.
        FileOutputStream fos = new FileOutputStream(filePath);
        workbook.write(fos);

        //We have created a method for writing in an Excel file.
        ReusableMethods.writeExcelFileSayfa1(1,3,"Ali");

    }


}
