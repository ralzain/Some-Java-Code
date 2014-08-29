import java.util.*;

public class stringReverseAndWordCounter {

    //Function which reverses a string
    public static void reverseS(String s){
    
    char[] c=s.toCharArray();
    String rev="";
       int len=s.length();
       if(len==1)
           System.out.println("This string is only one letter long, so the reverse of it is the same, which is: "+s);
       else{
       for(int i=len-1;i>=0;i--)
       rev+=c[i];
       System.out.println("Orignial String: "+s+" Reversed String: "+rev);
        
        
       
    }
    }
    
    //Function that counts the number of occerances of a word in a phrase using a HashMap
    public static void counter(String s,String v){
    HashMap<String,Integer> m = new HashMap<String,Integer>();
    String st=s.toLowerCase();
    String y=v.toLowerCase();
    Integer c=0;
    String[] a= st.split(" ");
    
    for(int i=0; i<a.length;i++){
       if(m.containsKey(a[i])){
           c=m.get(a[i])+1;
           m.put(a[i],c);
       }
       else{
       m.put(a[i],1);
       }
    }
    System.out.print("The Word:\""+ v + "\" Appeared "+m.get(y)+" time(s)");
        //m.add(a[i],);
    
    
    }
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testing the reverseS function
      reverseS("Hello World!");

      // Testing the counter function by counting the number of oocurances the word "my" appears in the string 'test'
       String test="My name is REDWAN and my major is CSE";
       counter(test,"my");
       }
            }
       
