package mencaridata;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class PengelolaData {
    private XSSFWorkbook myWorkBook;
    private XSSFSheet mySheet;
    private String myFile;
    
    public PengelolaData(int i) throws FileNotFoundException, IOException {
        
        mencarifile m = new mencarifile();
        if(i == 0){
            myFile = "C:\\db_java\\Daftar_Harga_PO.xlsx";
        }
        else if (i == 1){
            myFile = "C:\\db_java\\Daftar_Harga_Bangunan_dan_Pekerja.xlsx";
        }

        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        setmyWorkBook(fis);

        // Return first sheet from the XLSX workbook
        setmySheet(0);

    }
    
    public void tambahdata(String material, int volume, String unit, int harga){
        XSSFRow row = mySheet.createRow(mySheet.getLastRowNum()+1);
        row.createCell(0).setCellValue("");
        row.createCell(1).setCellValue(material);
        row.createCell(2).setCellValue(volume);
        row.createCell(3).setCellValue(unit);
        row.createCell(4).setCellValue(harga);
        
        saveFile();
    }
    
    public void saveFile(){
        try {
            FileOutputStream outputStream = new FileOutputStream(myFile);
            this.myWorkBook.write(outputStream);
            this.myWorkBook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    //setter getter/////////////////////////////////////////////////////////////
    public XSSFWorkbook getmyWorkBook() {
        return myWorkBook;
    }

    public XSSFSheet getmySheet() {
        return mySheet;
    }

    public void setmyWorkBook(FileInputStream fis) throws IOException {
        myWorkBook = new XSSFWorkbook(fis);
    }

    public void setmySheet(int i) {
        mySheet = myWorkBook.getSheetAt(i);
    }
}
