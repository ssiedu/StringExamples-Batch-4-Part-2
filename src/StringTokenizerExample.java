
import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        /*
        String s="java python oracle linux";
        StringTokenizer st=new StringTokenizer(s);
        */
        String s="java,python,oracle,linux";
        StringTokenizer st=new StringTokenizer(s, ",");
        
        while(true){
            
            boolean found=st.hasMoreTokens();
            if(found==false)break;
            
            String s1=st.nextToken();
            System.out.println(s1);
        }
            
}
}

/*
    Constructor
    --------------

    StringTokenizer(String)         //white-spaces
    StringTokenizer(String,String)

    Methods

    String nextToken()              //to fetch next token
    boolean hasMoreTokens()         //to check availability of next token






*/