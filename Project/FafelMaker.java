/*
 * --Zack lazkani--
 */


public class FafelMaker implements SandwhichMaker
{
  public Sandwhich makeSandwhich(String filling, String bread)
  {
    return new Fafel(filling, bread);
  }
}
