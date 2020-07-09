public class Lenovo extends Laptop
{
    private String model;
    public Lenovo(String model,String motherboard, String ram, Procesor procesor)
    {
        super(motherboard, ram, procesor);
        this.model=model;
    }

    public String getModel()
    {
        return model;
    }

    @Override
    public void powerUp()
    {
        System.out.println("Legion logo");
    }

    public void biosMenu()
    {
        System.out.println("Lenovo legion bios menu");
    }

    public void windows()
    {
        System.out.println("Windows 10 is starting");
    }
}
