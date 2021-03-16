
public class StringBufferExample {

    public static void main(String[] args) {

        //StringBuilder sb=new StringBuilder("abcdefgh");
        
        StringBuffer sb = new StringBuffer("abcdefgh");
        String s=sb.toString();
        String s1=s.toUpperCase();
        System.out.println(s1);
        //System.out.println(sb);
        //sb.delete(2, 5);    //2,3,4
        //sb.reverse();
        //sb.deleteCharAt(3);
        //sb.setCharAt(3, 'Z');
        //sb.replace(1, 5, "XYZ");
        //sb.append("XYZ");
        //sb.insert(5, "XYZ");
        //System.out.println(sb);
    }
}
/*  
    StringBuffer Methods
    ---------------------
    append  //add additional chars at the end.
    insert  //add additional chars on given index
    replace //replace a range of chars with new chars
    setCharAt   //for replacing a single char on an index
    deleteCharAt    //removes a single char on given index
    delete          //to delete the entire range
    reverse         //to reverse the order of chars 
    toString        //to convert StringBuffer to String




 */
