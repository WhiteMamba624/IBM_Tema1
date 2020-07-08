

public class Procesor
{
    private String producator;
    private String seria;
    private int viteza;

    public String getProducator()
    {
        return producator;
    }

    public String getSeria()
    {
        return seria;
    }

    public int getViteza()
    {
        return viteza;
    }

    public Procesor(String producator, String seria, int viteza)
    {
        this.producator=producator;
        this.seria=seria;
        this.viteza=viteza;
    }
}
