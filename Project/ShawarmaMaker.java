/*
 * --Zack lazkani--
 */


public class ShawarmaMaker implements SandwhichMaker
{
  public Sandwhich makeSandwhich(String meat, String bread)
  {
    return new Shawarma(meat, bread);
  }
}
