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
public class Stroka {
    public  ChisloCl  chisloLev;
    public  ChisloCl  chisloPrav;
    public  char operator;
    public  String oper_deystv()
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
                  break;
              case ('*'):
                  rez=chisloLev.znach* chisloPrav.znach;
                  break;
              case ('/'):
//                  double prom_rez=0;
//                  int tsel_chast=0;                
//                  prom_rez=(double)chisloLev.znach/(double) chisloPrav.znach; 
//                  
//                  if((prom_rez-(int)prom_rez)>0)
//                    {
//                       System.out.println("Результат дробный ошибка деления");
//                       System.exit(0);    
//                    }
                  rez=chisloLev.znach/chisloPrav.znach;
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
    
    public Stroka (String str_vvod)
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
 
    
}
