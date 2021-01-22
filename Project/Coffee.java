/*
 * --Zachary lazkani--
 */

public class Coffee
{
//instance variables for size, type(tradtional arabic or American), sugar, milk
  private String size;
  private double sugar;
  private String milk;
  private String type;

// private constructor that takes Builder object as parameter
  public static class Builder
  {
    private String size;
    private double sugar;
    private String milk;
    private String type;


    public Builder(String t, String s)
    {
      type = t;
      size = s;

    }

    public Builder Sugar(double s)
    {
      sugar = s;
      return this;
    }

    public Builder Milk(String m)
    {
      milk = m;
      return this;
    }

    public Coffee Build()
    {
      return new Coffee(this);
    }
  }

  private Coffee(Builder c)
  {
    type = c.type;
    size = c.size;
    sugar = c.sugar;
    milk = c.milk;
  }
  public String toString()
  {
		return " " + type  + " coffee size " + size + " " + (milk != null ?
      		"with "+ milk + " milk " : "  ") + (sugar != 0 ? "and " + sugar + " spoons of sugar "  : "");
  }

}
