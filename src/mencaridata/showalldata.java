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

    public showalldata() throws FileNotFoundException, IOException {
        File myFile = findFile("C:\\", "Daftar_Harga_PO.xlsx");

        FileInputStream fis = new FileInputStream(myFile);

        // Finds the workbook instance for XLSX file
        setmyWorkBook(fis);

        // Return first sheet from the XLSX workbook
        setmySheet(0);

    }

    private static File findFile(final String rootFilePath, final String fileToBeFound) {

        File rootFile = new File(rootFilePath);
        File[] subFiles = rootFile.listFiles();
        for (File file : subFiles != null ? subFiles : new File[]{}) {
            if (file.getAbsolutePath().endsWith(fileToBeFound)) {
                return file;
            } else if (file.isDirectory()) {
                File f = findFile(file.getAbsolutePath(), fileToBeFound);
                if (f != null) {
                    return f;
                }
            }
        }
        return null; // null returned in case your file is not found
        //source code : https://stackoverflow.com/questions/25422244/java-automatically-detecting-input-file-path
    }

    public Vector<String> show(XSSFSheet mySheet, XSSFWorkbook myWorkBook) {
        //could search up to 100 data
        Vector datal = new Vector();
        Vector<String> vcell = new Vector();

        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            //putting current row
            XSSFRow row = mySheet.getRow(rowIndex);

            //search every cell
            if (row != null) {

                //variables for put the strings
                String cellValue = null;
                String cellValuemaynull = null;

                XSSFCell cell = row.getCell(1);
                if (cell != null) {
                    vcell.removeAll(vcell);
                    //Uraian Pekerjaan
                    vcell.add(row.getCell(1).getStringCellValue());

                    //Volume
                    vcell.add(String.valueOf(row.getCell(2).getNumericCellValue()));

                    //Satuan
                    vcell.add(row.getCell(3).getStringCellValue());

                    //harga satuan
                    vcell.add(String.format(Locale.US, "%,d", (long) row.getCell(4).getNumericCellValue()).replace(',', '.'));
                }
            }
            
            //simpan ke data1
            datal.add(vcell);
            System.out.println(datal);
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