public class numfmtexp {  
    public static void main(String args[]){  
     try{  
        String s="abc";  
        int i=Integer.parseInt(s);//NumberFormatException  
     }catch(NumberFormatException   e){System.out.println(e);}  
     //rest code of the program   
     System.out.println("running");  
    }  
  }  
