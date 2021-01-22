/*
 * --Zachary Lazkani--
 */

 public abstract class Sandwhich
 {

   // instance variables
   public String filling;
   public String bread;

   public  void setFilling(String filling)
   {
     this.filling = filling;
   }

   public  void setBread(String bread)
   {
     this.bread = bread;
   }

   public String getFilling()
   {
     return filling;
   }

   public String getBread()
   {
     return bread;
   }

   public String toString()
    {
        return ( filling + " sandwhich on " + bread + " pita ");
    }


}
