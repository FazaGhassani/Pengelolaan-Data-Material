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
    private final File myFile;
    
    public PengelolaUser() throws FileNotFoundException, IOException{
        
        //mengambil data usrnm
        mencarifile m = new mencarifile();
        myFile = m.findFile("C:\\", "USERNAME.xlsx");
        FileInputStream fis = new FileInputStream(myFile);
        
        // Finds the workbook instance for XLSX file
        setmyWorkBook(fis);
        
        // Return first sheet from the XLSX workbook
        setmySheet(0);
    }
    
    public boolean Daftar(String nama, String Username, String Pass){
        Row row = this.mySheet.createRow(this.mySheet.getLastRowNum()+1);
        row.createCell(0).setCellValue(nama);
        row.createCell(1).setCellValue(Username);
        row.createCell(2).setCellValue(Pass);
        System.out.println(this.cariNAMA(Username, 1));
        
        //kalau namanya tidak ketemu, maka masukan ke daftar baru
        if(this.cariNAMA(Username, 1) == false){
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
    
    public boolean cariNAMA(String nama, int pilihan){
        //pilihan 0 : nama //pilihan 1: username //pilihan 2: password
        //loop tiap row
        boolean hasil = false;
        for (int rowIndex = 1; rowIndex <= mySheet.getLastRowNum(); rowIndex++) {
            XSSFRow row = mySheet.getRow(rowIndex);
            if (row != null) {
                XSSFCell cell = row.getCell(pilihan);
                if (cell != null) {
                    if(cell.getStringCellValue().equals(nama)){
                        hasil = true;
                    }else{
                        hasil = false;
                    }
                }
            }
        }
        return hasil;
    }
    
    public boolean Login(String username, String pass){
        if(cariNAMA(username,1) == true && cariNAMA(pass,2)==true){
            return true;
        }else{
            return false;
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
