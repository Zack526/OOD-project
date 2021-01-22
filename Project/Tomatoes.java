

public class Tomatoes extends ManushDec
{
  public Tomatoes (Manush m)
  {
    super(m);
  }

  public String makeManush()
  {
    //super.makeManush();
    return super.makeManush() + " with Tomatoes";
  }
}
