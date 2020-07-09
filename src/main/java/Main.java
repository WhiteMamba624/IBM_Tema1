import de.vandermeer.asciitable.AsciiTable;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
       Procesor proc=new Procesor("Intel","i5-8300H",3500);
       Lenovo legion=new Lenovo("Legion","Asus","DDR4",proc);
       legion.powerUp();
       Scanner citire=new Scanner(System.in);
       String combinatie=citire.nextLine();
       if(combinatie.equals("fn f10"))
       {
           legion.biosMenu();
       }
       else
           {
               legion.windows();
           }
       AsciiTable tabel=new AsciiTable();
        tabel.addRule();
        tabel.addRow(legion.getModel(),legion.getMotherboard());
        tabel.addRule();
        tabel.addRow(legion.getProcesor().getSeria(),legion.getRam());
        tabel.addRule();
        String afisare=tabel.render();
        System.out.println(afisare);


    }
}
