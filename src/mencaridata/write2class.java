package mencaridata;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;
import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write2class {

    private XSSFWorkbook myWorkBook;
    private XSSFSheet mySheet;

    public XSSFWorkbook getMyWorkBook() {
        return myWorkBook;
    }

    public void setMyWorkBook() {
        this.myWorkBook = new XSSFWorkbook();
    }

    public XSSFSheet getMySheet() {
        return mySheet;
    }

    //making new sheet
    public void setMySheet(XSSFWorkbook wb) {
        this.mySheet = wb.createSheet("Sheet1");
    }

    public write2class() {
        setMyWorkBook();
        setMySheet(this.getMyWorkBook());
    }

    public void write2excel(Vector v, String str, String name) throws FileNotFoundException {
        //looprownya
        //loop colomnya
        //masukin ke excel tiap cell
        String FILE_NAME = str + name + ".xlsx";
        System.out.println(str);
        System.out.println(FILE_NAME);
        int rnmb = 0; //for loop row
        for (Object i : v) {
            Vector<String> vecrow = (Vector<String>) i; //so the object can be loop

            Row row = this.mySheet.createRow(rnmb++); //creating new row

            int cnmb = 0;
            for (Object ii : vecrow) {
                Cell cell = row.createCell(cnmb++); //creating new cell in the row
                cell.setCellValue((String) ii); //put the value on that cell
            }
        }

        //try to save the workbook
        try {
            FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
            this.myWorkBook.write(outputStream);
            this.myWorkBook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
