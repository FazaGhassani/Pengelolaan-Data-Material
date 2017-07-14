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
    private int numberfind = 0; //buat nyimpen index
    
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
    
    public void tambahdata(String material, String unit, int harga){
        XSSFRow lastrow = mySheet.getRow(mySheet.getLastRowNum());
        XSSFRow row = mySheet.createRow(mySheet.getLastRowNum()+1);
        int number = (int)lastrow.getCell(0).getNumericCellValue();
        row.createCell(0).setCellValue(number+1);
        row.createCell(1).setCellValue(material);
        row.createCell(2).setCellValue(1);
        row.createCell(3).setCellValue(unit);
        row.createCell(4).setCellValue(harga);
        
        saveFile();
    }
    
    //search yang akan mencari ke semua cell
    public boolean cariData(String material, int volume, String unit, int harga){
        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            XSSFRow row1 = mySheet.getRow(rowIndex);
            if (row1 != null) {
                if(row1.getCell(1).getStringCellValue().equals(material)
                        &&row1.getCell(2).getNumericCellValue()==volume
                        &&row1.getCell(3).getStringCellValue().equals(unit)
                        &&row1.getCell(4).getNumericCellValue()==harga){
                    numberfind = rowIndex;
                    return true;}
            }
        }
        return false;
    }
    
    public void ubahData(String material, int volume, String unit, int harga,
            String materialb, int volumeb, String unitb, int hargab){
        if(cariData(material,volume,unit,harga)){
            //ubah data pada row ke rowIndex
            XSSFRow row = mySheet.getRow(numberfind);
            row.getCell(1).setCellValue(materialb);
            row.getCell(2).setCellValue(volume);
            row.getCell(3).setCellValue(unitb);
            row.getCell(4).setCellValue(hargab);
            saveFile();
        }
    }
    
    public void deleteData(){
        mySheet.removeRow(mySheet.getRow(numberfind));
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
