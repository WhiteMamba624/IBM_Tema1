
public abstract class Laptop
{

  public String motherboard;
  public String ram;
  public Procesor procesor;

    public String getMotherboard()
    {
        return motherboard;
    }

    public String getRam()
    {
        return ram;
    }

    public Procesor getProcesor()
    {
        return procesor;
    }

    public Laptop(String motherboard, String ram, Procesor procesor)
  {
      this.motherboard=motherboard;
      this.ram=ram;
      this.procesor=procesor;
  }

  public abstract void powerUp();
  public abstract void biosMenu();
  public abstract void windows();



}
