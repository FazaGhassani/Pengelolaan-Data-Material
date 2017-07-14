package mencaridata;

import java.io.*;
import java.util.*;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class showalldata {

    private XSSFWorkbook myWorkBook;
    private XSSFSheet mySheet;
    String myFile;
    
    public showalldata(int tab) throws FileNotFoundException, IOException {
        mencarifile m = new mencarifile();
        
        if(tab == 1){
            //myFile = m.findFile("C:\\", "Daftar_Harga_PO.xlsx");
            myFile = "C:\\db_java\\Daftar_Harga_PO.xlsx";
            
        }else if(tab == 2){
            //myFile = m.findFile("C:\\", "Daftar_Harga_Bangunan_dan_Pekerja.xlsx");
            myFile = "C:\\db_java\\Daftar_Harga_Bangunan_dan_Pekerja.xlsx";
        }

        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        setmyWorkBook(fis);

        // Return first sheet from the XLSX workbook
        setmySheet(0);

    }

    public String[][] show(XSSFSheet mySheet, XSSFWorkbook myWorkBook) {
        //could search up to 100 data
        String[][] datal = new String[1001][5];
        int rowdatal = 0;

        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            //putting current row
            XSSFRow row = mySheet.getRow(rowIndex);
            //search every cell
            if (row != null) {

                XSSFCell cell = row.getCell(1);
                if (cell != null) {
                    int columndatal = 0;

                    //Uraian Pekerjaan
                    datal[rowdatal][columndatal] = row.getCell(1).getStringCellValue();
                    columndatal++;

                    //Volume
                    datal[rowdatal][columndatal] = String.valueOf(row.getCell(2).getNumericCellValue());
                    columndatal++;

                    //Satuan
                    datal[rowdatal][columndatal] = row.getCell(3).getStringCellValue();
                    columndatal++;

                    //harga satuan
                    datal[rowdatal][columndatal] = String.format(Locale.US, "%,d", (long) row.getCell(4).getNumericCellValue()).replace(',', '.');
                    columndatal++;

                    //add rowdata
                    rowdatal++;
                }
            }
        }

        return datal;
    }

    ////////////////////////////////////////////////////////////////////////////
    /////////////////////setter getter//////////////////////////////////////////
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

    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
}
