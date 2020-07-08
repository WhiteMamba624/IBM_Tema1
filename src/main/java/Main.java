import de.vandermeer.asciitable.AsciiTable;

public class Main
{
    public static void main(String[] args)
    {
       /* AsciiTable tabel=new AsciiTable();
        tabel.addRule();
        tabel.addRow("coloana 1 rand 1","coloana 2 rand 1");
        tabel.addRule();
        tabel.addRow("coloana 1 rand 2","coloana 2 rand 2");
        tabel.addRule();
        String citire=tabel.render();
        System.out.println(citire);
        */
       Procesor proc=new Procesor("Intel","i5-8300H",3500);
       Lenovo legion=new Lenovo("Legion","Asus","DDR4",proc);
       legion.laptopBoot();
    }
}
