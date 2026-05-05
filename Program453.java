import java.io.*;
import java.util.*;

class Program453
{
    public static void main(String A[])
    {
        try
        {
            boolean bret = false;
            int iRet = 0;
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

                    FileOutputStream foobj = new FileOutputStream(fobj);

                    String str = "Jay Ganesh...";

                    iRet = foobj.write(str.getBytes());
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