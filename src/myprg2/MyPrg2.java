
package myprg2;


import java.util.Scanner;
import myprg2.sub.ChisloCl;
import myprg2.sub.Convert_a_to_rim;
import myprg2.sub.Stroka;

public class MyPrg2 
{
    public static void main(String[] args) 
    {
      Scanner input=new Scanner (System.in);
   
      Stroka str_in;
      int i=1;
      while (i==1){
        String vrStrIn=input.nextLine();
        str_in=new Stroka (vrStrIn);
        str_in.oper_deystv();
        str_in=null;
      }
      
     // System.out.println(vrStrIn);
    }
    
}
