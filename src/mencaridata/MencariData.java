package mencaridata;

import java.io.IOException;
import java.util.Scanner;

public class MencariData {

    public static void main(String[] args) throws IOException {
        /*
        //untuk mencari nama
        Scanner user_input = new Scanner(System.in);
        String name;
        
        Name_Searcher Function1 = new Name_Searcher();
        
        //System.out.println("Masukan nama yang akan dicari: ");
        //name = user_input.next();
        
        String[][] b = Function1.Search_by_name(Function1.getmySheet(), Function1.getmyWorkBook(), "Batu");
        for(int row=0; row<=9; row++){
            int column=0;
            if(b[row][column]!=null){
            System.out.println(b[row][column]); column++;
            System.out.println(b[row][column]); column++;
            System.out.println(b[row][column]); column++;
            System.out.println("");
            }
        }*/
        
                    String stringValue = "1,000";

            String cleanedStringValue = stringValue.replace(",", "");
            int intValue = Integer.parseInt(cleanedStringValue);
            System.out.println(intValue);
        //pikirin GUInya sekarang
    }
    
}
