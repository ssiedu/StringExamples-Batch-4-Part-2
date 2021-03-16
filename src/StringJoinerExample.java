
import java.util.StringJoiner;


public class StringJoinerExample {

    public static void main(String[] args) {

        String s1="indore";
        String s2="bhopal";
        String s3="mumbai";
        
        //suppose want to join s1,s2,s3 using '#'
        StringJoiner joiner=new StringJoiner("==","[","]");
        joiner.add(s1); joiner.add(s2); joiner.add(s3);
        String res=joiner.toString();
        System.out.println(res);
        
        
        
        
    }
}
/*
    StringJoiner(String)
    StringJoiner(String,String,String)  //prefix,suffix
*/
