import java.io.*;
class Program446
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");
    
            fobj.createNewFile();
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured..."+eobj);
        }
    }
}