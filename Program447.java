import java.io.*;
class Program447
{
    public static void main(String A[])
    {
        try
        {
            boolean bret = false;
            File fobj = new File("Demo.txt");
    
            bret = fobj.createNewFile();

            if(bret == true)
            {
                System.out.println("File Successfully created");
            }
            else
            {
                System.out.println("Unable to create the file");
            }
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured..."+eobj);
        }
    }
}