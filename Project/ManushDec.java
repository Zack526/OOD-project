


public abstract class ManushDec implements Manush
{
  Manush manush;

  public ManushDec(Manush m)
  {
    manush = m;
  }
  public String makeManush()
  {
    return manush.makeManush();
  }

}
