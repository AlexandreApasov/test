/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package myprg2.sub;

/**
 *
 * @author Alexandre
 */
 public class ChisloCl {
   public int znach;
    public String String_Znach;
    public char tip;
    public ChisloCl(String inp_chislo)
    {
        int flag_preobr=0;      
        inp_chislo=inp_chislo.toUpperCase();
        String_Znach=inp_chislo;
        switch (inp_chislo)
        {
            case("I"):
                znach=1;
                flag_preobr=1;
                tip='R';
               break;
            case ("II"):
                znach=2;
                flag_preobr=1;
                tip='R';
                break;
            case ("III"):
                znach=3;
                flag_preobr=1;
                tip='R';
                break;
            case ("IV"):
                znach=4;
                flag_preobr=1;
                tip='R';
                break;
            case ("V"):
                 znach=5;
                flag_preobr=1;
                tip='R';               
                break;
            case ("VI"):
                znach=6;
                flag_preobr=1;
                tip='R';                
                break;
            case ("VII"):
                znach=7;
                flag_preobr=1;
                tip='R';
                break;
            case ("VIII"):
                 znach=8;
                flag_preobr=1;
                tip='R';
                break;
            case ("IX"):
                 znach=9;
                flag_preobr=1;
                tip='R';               
                break;
            case ("X"):
                 znach=10;
                flag_preobr=1;
                tip='R';               
                break;            
        }  
        if  (flag_preobr==0)
        {
           try 
           {
            znach=Integer.parseInt(inp_chislo);
           }
           catch (NumberFormatException e) 
           {
             System.out.println( "не корректное число, ОШИБКА!!25" );
             System.exit(0);  
           }
           tip='L';
        }
        if (znach==0 || znach>10)
        {
        System.out.println("Введеное число выхоодить за заданные границы--> ошибочка");
        System.exit(0);  

        }
     //  System.out.println( znach);      
    }
}

    
