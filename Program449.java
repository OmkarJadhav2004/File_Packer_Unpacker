import java.io.*;
import java.util.*;

class Program449
{
    public static void main(String A[])
    {
        try
        {
            boolean bret = false;
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the File Name that you want to create : ");
            String name = sobj.nextLine();

            File fobj = new File(name);

            if(fobj.exists())
            {
                System.out.println("File is already exixting in the folder");
            }
            else
            {    
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
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured..."+eobj);
        }
    }
}