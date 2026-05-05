import java.io.*;
import java.util.*;

class Program464
{
    public static void main(String Arg[])   throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of directory that you want to open: ");
        String DirName = sobj.nextLine();

        File fobj = new File(DirName);

        if(fobj.exists())
        {
            System.out.println("Directory is Present");
        }
        else
        {
            System.out.println("There is no such diresctory");
        }

    }
}