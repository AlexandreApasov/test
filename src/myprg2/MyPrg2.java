
package myprg2;

import java.util.Scanner;

class Convert_a_to_rim
{
   String RimChislo;
   Convert_a_to_rim (int in)
  {
            
        StringBuffer a = new StringBuffer("");
        if (in<0)
        {
            a.append("-");
            in=-1*in;
        }
        // Выделяем тысячи
        int m1 = in / 1000;
        a.append(M(m1));
        // то что осталось после тысяч
        int m2 = in % 1000;

        // Выделяем пятьсот из остатка от тысячи
        int d1 = m2 / 500;
        a.append(D(d1));
        // остаток после выделения полтысячи
        int d2 = m2 % 500;

        // Выделяем сотни из остатка
        int c1 = d2 / 100;
        a.append(C(c1));
        // остаток из сотен
        int c2 = d2 % 100;

        // Выделяем полсотни
        int l1 = c2 / 50;
        a.append(L(l1));
        // остаток
        int l2 = c2 % 50;

        // Выделяем десятки
        int x1 = l2 / 10;
        a.append(X(x1));
        // остаток
        int x2 = l2 % 10;

        // Выделяем то что осталось
        a.append(basic(x2));
        RimChislo=a.toString();
  //      return a.toString();
   
  }        
 
    // преобразовываем целые тысячи
    // с значениями,кратными десяти, но не 5,всё просто
    private static String M(int in) {
        StringBuffer a = new StringBuffer("");
        int i = 0;
        while (i < in) {
            a.append("M");
            i++;
        }
        return a.toString();
    }
    // преобразовываем целые сотни
    private static String C(int in) {
        if (in == 4) return "CD"; //если 400, то 500-100
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("C");
                i++;
            }
            return a.toString();
        }
        else return "";
    }

// целые десятки

    private static String X(int in) {
        if (in == 4) return "XL"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("X");
                i++;
            }
            return a.toString();
        }
        else return "";
    }
    // преобразовываем пол тысячи
     private static String D(int in) {

    //    if (in == 4) return "CM"; // если 900, то 1000-100
   //     else  return "D";
        
             if (in == 4) return "CM"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("D");
                i++;
            }
            return a.toString();
        }
        else return "";   
        
        
        
    }


    private static String L(int in) {
  //      if (in == 4) return "XC"; // / если90 то100 - 10
  //               return "L";
          if (in == 4) return "XC"; // если 40, то 50-10
        else if ((in != 0) && (in < 4)) {
            StringBuffer a = new StringBuffer("");
            int i = 0;
            while (i < in) {
                a.append("L");
                i++;
            }
            return a.toString();
        }
        else return "";

            }
            // От 1 до 9, то что осталось
            private static String basic(int in) {
                String[] a = {
                    "",
                    "I",
                    "II",
                    "III",
                    "IV",
                    "V",
                    "VI",
                    "VII",
                    "VIII",
                    "IX"
                };
                return a[in];
            }
  
}
 class ChisloCl {
    int znach;
    String String_Znach;
    char tip;
    ChisloCl(String inp_chislo)
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
 class Stroka {
    ChisloCl  chisloLev;
    ChisloCl  chisloPrav;
    char operator;
    String oper_deystv()
    {
        int rez;
        rez=0;
        if (chisloLev.tip==chisloPrav.tip) 
      {
          switch (operator)
          {
              case ('+'):
                rez=chisloLev.znach+ chisloPrav.znach; 
                  break;
              case('-'):
                  rez=chisloLev.znach-chisloPrav.znach; 
  //                if (rez<=0)
  //                {
  //                  System.out.println("Результат ушел в отрицательные значения");
  //                  System.exit(0);    
  //                }
                  break;
              case ('*'):
                  rez=chisloLev.znach* chisloPrav.znach;
                  break;
              case ('/'):
                  double prom_rez=0;
                  int tsel_chast=0;                
                  prom_rez=(double)chisloLev.znach/(double) chisloPrav.znach;          
                  if((prom_rez-(int)prom_rez)>0)
                    {
                       System.out.println("Результат дробный ошибка деления");
                       System.exit(0);    
                    }
                  rez=(int)prom_rez;
                 break;
                      
          }
 
       if (chisloLev.tip=='R')
       {
          Convert_a_to_rim rim_chislo= new Convert_a_to_rim (rez);
           System.out.println(rim_chislo.RimChislo);
       }
       else
      {
         System.out.println(rez); 
      }
      }
       else
       {
          System.out.println("Не соответствие типов чисел. Одно римское, другое арабское");
          System.exit(0);  
       }; 
        return ("sssss");
    };
    
    Stroka (String str_vvod)
    {
      //  System.out.println(str_vvod);
        int i=0;
        String vr_str="";
        char tk_sim;
        String oper="";
        boolean flag_lev=true;
        int flag_kol_oper=0;
        String lev_chast="";
        String prav_chast="";
        
       
        while (i<=str_vvod.length()-1)
        {
            tk_sim=str_vvod.charAt(i);
          
            
            if (tk_sim=='+' || tk_sim=='-' || tk_sim=='*' || tk_sim=='/')
            {
                oper=oper+tk_sim;  
                operator=tk_sim;
                flag_lev=false; 
                flag_kol_oper=flag_kol_oper+1;
                i++;
            }
             else 
             {
               if (flag_lev==true)
                {
                lev_chast=lev_chast+str_vvod.charAt(i);
                }
               else
                {
                prav_chast=prav_chast+str_vvod.charAt(i);
                }
               i++;
            } 
  //          vr_str=vr_str+str_vvod.charAt(i);
                       
        }
        if (flag_kol_oper>1)
        {
         System.out.println( "Количество оперторов больше одного, ОШИБКА!!23" );
         System.exit(0);
        }
        if (flag_kol_oper==0)
        {
         System.out.println( "Не найдено ни одного оператора, ОШИБКА!!23" );
         System.exit(0);
        }

        
        chisloLev= new ChisloCl (lev_chast);
        chisloPrav= new ChisloCl (prav_chast);
        
    }
           
}      public class MyPrg2 {

    
    public static void main(String[] args) {
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
