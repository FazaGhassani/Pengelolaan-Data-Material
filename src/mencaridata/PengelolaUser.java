package mencaridata;

import java.io.*;
import java.util.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PengelolaUser {
    
    private String nama = null;
    private String usrnm = null;
    private String pass = null;
    private XSSFWorkbook myWorkBook;
    private XSSFSheet mySheet;
    //private final File myFile;
    String myFile;
    
    public PengelolaUser() throws FileNotFoundException, IOException{
        
        //mengambil data usrnm
        mencarifile m = new mencarifile();
        myFile = "C:\\srnmnama.xlsx";
        //myFile = m.findFile("C:\\", "srnmnama.xlsx");
        FileInputStream fis = new FileInputStream(myFile);
        
        // Finds the workbook instance for XLSX file
        setmyWorkBook(fis);
        
        // Return first sheet from the XLSX workbook
        setmySheet(0);
    }
    
    public boolean Daftar(String nama, String Username, String Pass){
        
        //kalau namanya tidak ketemu, maka masukan ke daftar baru
        if(this.cariNAMA(Username, 1 ,"no") == false){
            Row row = this.mySheet.createRow(this.mySheet.getLastRowNum()+1);
            row.createCell(0).setCellValue(nama);
            row.createCell(1).setCellValue(Username);
            row.createCell(2).setCellValue(Pass);
            boolean save = saveFile();
            return save; 
        }else{
            return false;
        }
    }
    
    public boolean saveFile(){
        try {
            FileOutputStream outputStream = new FileOutputStream(myFile);
            this.myWorkBook.write(outputStream);
            this.myWorkBook.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean cariNAMA(String nama, int pilihan, String getvar){
        //pilihan 0 : nama //pilihan 1: username //pilihan 2: password
        //getvar untuk memutuskan apa akan mengambil data atau tidak
        //loop tiap row
        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            XSSFRow row1 = mySheet.getRow(rowIndex);
            if (row1 != null) {
                XSSFCell cell = row1.getCell(pilihan);
                if (cell != null) {
                    if(cell.getStringCellValue().equals(nama)){
                        if(getvar.equals("yes")){
                            this.nama = row1.getCell(0).getStringCellValue();
                            this.usrnm = row1.getCell(1).getStringCellValue();
                            this.pass =  row1.getCell(2).getStringCellValue();
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public boolean Login(String username, String pass){
        if(cariNAMA(username,1, "yes") == true && cariNAMA(pass,2,"no")==true){
            return true;
        }else{
            return false;
        }
    }
    
    public void ganti(String namal, String namab, String userl, String userb, String passl, String passb) {
        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            XSSFRow row1 = mySheet.getRow(rowIndex);
            if (row1 != null) {
                XSSFCell cell = row1.getCell(1);
                if (cell != null) {
                    if(cell.getStringCellValue().equals(namal)){
                        row1.getCell(0).setCellValue((String) namab);
                        row1.getCell(1).setCellValue((String) userb);
                        row1.getCell(2).setCellValue((String) passb);
                        this.nama = namab; this.pass=passb; this.usrnm = userb;
                        saveFile();
                    }
                }
            }
        }
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public String getUsrnm() {
        return usrnm;
    }

    public void setUsrnm(String usrnm) {
        this.usrnm = usrnm;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
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
