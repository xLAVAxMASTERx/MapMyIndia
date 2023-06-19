import java.io.*;
public class problem1
{
    public static void main(String[] args)throws IOException
    { int i,d;String str = "";char c;
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        System.out.println("Enter a word");
        String s = br.readLine();
        int l = s.length();
        for(i=l-1;i>=0;i=i-1)
        {  d=s.charAt(i);
            if(d < 97)
            {
                d=d+32;
                c=(char)d;
                
            }
            else
            {
                d=d-32;
                c=(char)d;
            }
            str = str + c ;
        }
        System.out.println( str);
    }
    }
