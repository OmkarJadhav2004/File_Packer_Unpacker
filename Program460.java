import java.io.*;
import java.util.*;

class Program459
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the File Name that you want to open : ");
            String name = sobj.nextLine();

            File fobj = new File(name);

            if(fobj.exists())
            {
                int iRet = 0;
                FileInputStream fiobj = new FileInputStream(fobj);

                byte arr[] = new byte[1024];

                while((iRet = fiobj.read(arr))!=-1)
                {
                    String str = new String(arr);
                    System.out.println(str);
                }
                
            }
            else
            {    

                System.out.println("There is no such File"); 
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured..."+eobj);
        }
    }
}