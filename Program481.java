import java.io.*;
import java.util.*;

class Program481
{
    public static void main(String Arg[])
    {
        try
        {
        Scanner sobj = new Scanner(System.in);
        boolean bret = false;

        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------Marvellous Packer Unpacker CUI Module-----------");
        System.out.println("-----------------------------------------------------------");
        
        
        System.out.println("------------------Packing Activity-------------------------");
        System.out.println("Enter the name of directory that you want to open for packing: ");
        
        String DirName = sobj.nextLine();

        System.out.println("Enter the name of packed file that you want to open for packing:");
        String PackName = sobj.nextLine();

        File Packobj = new File(PackName);

        bret = Packobj.createNewFile();
        if(bret == true)
        {
            System.out.println("Packer file gets successfully created with the name : "+PackName);
        }
        else
        {
            System.out.println("Unable to proceed as pack file is not created");
            return;
        }
        
        FileOutputStream fopackobj = new FileOutputStream(Packobj);

        File fobj = new File(DirName);
        
        if(fobj.exists())
        {
            System.out.println("Directory is successfully opened");
            
            File Arr[] = fobj.listFiles();
            
            System.out.println("Total Number of Files in the Directory are : "+Arr.length);
            
            int i = 0, j = 0;
            
            String Header = "";
            FileInputStream fiobj = null;
            byte Buffer[] = new byte[1024];
            int iRet = 0;

            
            for(i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName()+" "+Arr[i].length();
                
                for(j = Header.length(); j < 100; j++)
                {
                    Header = Header + " ";
                }

                //Header Writing
                fopackobj.write(Header.getBytes(),0,100);

                fiobj = new FileInputStream(Arr[i]);

                //File data writing
                while((iRet = fiobj.read(Buffer))!=-1)
                {
                    fopackobj.write(Buffer,0,iRet);
                }

                fiobj.close();
                Header = "";
            }           
        }
        else
        {
            System.out.println("There is no such directory");
        }
        System.out.println("-----------------------------------------------------------");
        }
        catch(Exception eobj)
        {
            System.out.println("Exception occured:"+eobj);
        }

    }
}