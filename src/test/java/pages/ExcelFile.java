package pages;



import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;


public class ExcelFile {
    String path="/Users/pc/IdeaProjects/FasttrackCucumber/src/test/java/Utilties/us-500.xlsx";

    @Test
    public  void test() throws Exception {
        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet worksheet=workbook.getSheetAt(0);
        System.out.println(worksheet.getRow(2).getCell(2));

    }

    @Test
    public  void test1() throws Exception {
        FileInputStream file=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(file);
        XSSFSheet worksheet=workbook.getSheetAt(0);
        XSSFCell cell=worksheet.getRow(0).getCell(0);
        cell.setCellValue(30000);
        System.out.println(cell);


        System.out.println(workbook.getNumberOfSheets());
        System.out.println(worksheet.getLastRowNum());
        System.out.println(worksheet.getRow(500).toString());
        System.out.println(worksheet.getPhysicalNumberOfRows());
        System.out.println(worksheet.getRow(30).getCell(31));

        FileOutputStream fos=new FileOutputStream(path);


        workbook.write(fos);

        fos.close();
        workbook.close();
        file.close();



  }
}
