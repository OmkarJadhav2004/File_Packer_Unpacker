import java.io.*;
import java.util.*;

class Program490
{
    public static void main(String Arg[])
    {
        String PackName = null;
        Scanner sobj = null;

        try
        {
            sobj = new Scanner(System.in);

            System.out.println("---------------------------------------------------------------------");
            System.out.println("-------------- Marvellous Packer Unpacker CUI Module ----------------");
            System.out.println("---------------------------------------------------------------------");
            

            System.out.println("---------------------------- Unpacking Activity ---------------------");


            System.out.println("Enter the name of packed file that you want to unpack: ");
            PackName = sobj.nextLine();
            
            System.out.println("---------------------------------------------------------------------");
            System.out.println("--------- Thank you for using Marvellous Packer-Unpacker ------------");
            System.out.println("---------------------------------------------------------------------");

        } // End of try
        catch(Exception eobj)
        {
            System.out.println("Exception occured : "+eobj);
        }
    }
}