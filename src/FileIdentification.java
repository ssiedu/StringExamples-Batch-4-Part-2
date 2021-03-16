
import java.util.Scanner;


public class FileIdentification {

    public static String identifyType(String name){
        String type="";
        //.jpg-image,.docx-word,.xlsx-excel,other-othertype
        if(name.endsWith(".jpg")){
            type="Image File";
        }else if(name.endsWith(".docx")){
            type="Word File";
        }else if(name.endsWith(".xlsx")){
            type="Excel File";
        }else{
            type="Unknown Type";
        }
        return type;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Complete File Name : ");
        String name=sc.next();
        String type=identifyType(name);
        System.out.println("File Type : "+type);
        
        
    }
}
