public class Lenovo extends Laptop
{
    private String model;
    public Lenovo(String model,String motherboard, String ram, Procesor procesor)
    {
        super(motherboard, ram, procesor);
        this.model=model;
    }

    @Override
    public void laptopBoot()
    {
        System.out.println("Legion BIOS Booting");
    }
}
