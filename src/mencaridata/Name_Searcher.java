package mencaridata;

import java.io.*;
import java.util.*;
import java.sql.Date;

import org.apache.poi.ss.usermodel.Cell; 
import org.apache.poi.ss.usermodel.Row; 
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet; 
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public final class Name_Searcher {
    
    private XSSFWorkbook myWorkBook;
    private XSSFSheet mySheet;
    
    public Name_Searcher() throws FileNotFoundException, IOException{
            File myFile = findFile("C:\\", "Daftar_Harga_PO.xlsx");
            
            FileInputStream fis = new FileInputStream(myFile);

            // Finds the workbook instance for XLSX file
            setmyWorkBook(fis);
           
            // Return first sheet from the XLSX workbook
            setmySheet(0);
            
    }
    
    //untuk mencari file di C
    private static File findFile(final String rootFilePath, final String fileToBeFound) {

        File rootFile = new File(rootFilePath);
        File[] subFiles = rootFile.listFiles();
        for (File file : subFiles != null ? subFiles : new File[] {}) {
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
    
    //searching by name
    public String[][] Search_by_name(XSSFSheet mySheet, XSSFWorkbook myWorkBook, String name){
        //could search up to 100 data
        String[][] datal = new String[101][5];
        int rowdatal = 0;
        
        for(int rowIndex = 0; rowIndex <= mySheet.getLastRowNum(); rowIndex++){
                //putting current row
                XSSFRow row = mySheet.getRow(rowIndex);
                //search every cell
                if(row!=null){
                    //variables for put the strings
                    String cellValue =  null;
                    String cellValuemaynull = null;
                    
                    XSSFCell cell = row.getCell(1);
                    if(cell!=null){
                        //this part will split every word in one cell
                        String[] splited = cell.getStringCellValue().split("\\b+");
                        
                        for(String spliteds : splited){
                            if(spliteds.toLowerCase().contains(name.toLowerCase())){
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
                        
                        /*
                        //PREVIOUS VERSION OF SEARCHING DATA, UPPER AND LOWER CASE MATTER
                        //ketika ketemu maka akan melakukan seperti di bawah ini
                        if(Arrays.asList(splited).contains(name)){
                            int columndatal = 0;
                            //mengembalikan data ke dalam tabel (?)
                            //Nama Barang
                            datal[rowdatal][columndatal] = row.getCell(0).getStringCellValue();
                            columndatal++;
                            
                            //satuan
                            datal[rowdatal][columndatal] = row.getCell(1).getStringCellValue();
                            columndatal++;
                            
                            //harga satuan
                            datal[rowdatal][columndatal] = String.valueOf(row.getCell(2).getNumericCellValue());
                            columndatal++;
                            
                            //menambahkan rowdata
                            rowdatal++;
                            
                        }*/
                        
                    }
                }
        }
        
        return datal;
    }
    
    
    ////////////////////////////////////////////////////////////////////////////
    /////////////////////setter getter//////////////////////////////////////////
    public XSSFWorkbook getmyWorkBook(){
        return myWorkBook;
    }
    
    public XSSFSheet getmySheet(){
        return mySheet;
    }
    
    public void setmyWorkBook(FileInputStream fis) throws IOException{
        myWorkBook = new XSSFWorkbook (fis);
    }
    
    public void setmySheet(int i){
        mySheet = myWorkBook.getSheetAt(i);
    }
    
    /////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////
}
