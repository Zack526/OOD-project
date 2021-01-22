/*
* In theory runs program for the leb resturant
*/
import java.util.Scanner;
import java.io.*;
import java.util.*;


public class LebaneseFood
{
  public static void main(String[] args)
  {
    List<Object> order = new ArrayList<Object>();
    Scanner input = new Scanner(System.in);
    int i = 1;
    int k = 1;
    int j = 1;
    String answer;
    String choice;

    //welcome to the place
    System.out.println("\nWelcome to our little Lebanese resturant ");

    System.out.println("Would you like our fast option with little choice or a full look? say either fast or full"); // to paths one will use facade
    choice = input.next();
    choice = choice.toLowerCase();
    if(choice.equals("full"))
    {
      while (i != 0) // so you can go through and order more food
      {
        System.out.println("What type of coffe would you like?, We have Arabic, American, and Decafe ");
      // coffe frist maybe to many user questions but oh well
        System.out.println("If you dont want any please enter no: ");
        String type = input.next();
        type = type.toLowerCase(); // just so their is no confusion

        if(type.equals("no")||type.equals("nah"))
        {
          i = 0; // freedom
        }

        if (type.equals("arabic") || type.equals("american") || type.equals("decafe")) // they want coffe yay
        {
          System.out.println("\nWhat size would you like? Choices are small, medium, large ");
          String size = input.next();
          size = size.toLowerCase();

          // not needed for creation of coffe
            System.out.println("\nWould you like milk? (yes/no)");
            answer = input.next();
            answer = answer.toLowerCase();
            if(answer.equals("yes") ||answer.equals("sure") || answer.equals("yeah") )
            {
              System.out.println("\nWe have goat, oat, and dairy, What type? (goat, oat, dairy) ");
              String milk = input.next();
              System.out.println("\nWould you like Sugar? (yes/no)");
              answer = input.next();
              answer = answer.toLowerCase();
              if(answer.equals("yes") ||answer.equals("sure") || answer.equals("yeah") )
              {
                System.out.println("\nHow many spoons of sugar would you like? (1,2,2.5 etc )");
                Double sugar = input.nextDouble();; // not needed for creation of coffe
                Coffee  cup = new Coffee.Builder(type , size).Milk(milk).Sugar(sugar).Build();
                order.add(cup);
                System.out.println("You Ordered an" + cup);

              }
              else
              {
                Coffee  cup = new Coffee.Builder(type , size).Milk(milk).Build();
                order.add(cup);
                System.out.println("You Ordered an" + cup);
              }
            }
            else
            {
              System.out.println("\nWould you like Sugar? (yes/no)");
              answer = input.next();
              answer = answer.toLowerCase();
              if(answer.equals("yes") ||answer.equals("sure") || answer.equals("yeah") )
              {
                System.out.println("\nHow many sppons of sugar would you like? (1,2,2.5 etc )");
                int sugar = input.nextInt(); // not needed for creation of coffe

                Coffee cup = new Coffee.Builder(type , size).Sugar(sugar).Build();
                order.add(cup);
                System.out.println("You Ordered an" + cup);

              }
              else
              {
                Coffee cup = new Coffee.Builder(type , size).Build();
                order.add(cup);
                System.out.println("You Ordered an" + cup);

              }
            }
            System.out.println("Would you like to order another cup? (yes/no)");
            answer = input.next();
            answer = answer.toLowerCase();
            if(answer.equals("no") ||answer.equals("nah"))
            {
              i = 0;
            }
          }
        }
        System.out.println("\n Ok, so far you have " + order);
      //OK done with coffe yay
    // now lets talk sandwhichs going to make it simpler to many choices before
    // factory method but a Simple one
    System.out.print("\n Ok, now lets talk food, Here is our Sandwhichs");
    while(k !=0)
    {
      System.out.print("\nWe have Chicken Shawarma, Beef Shawarma, and a Fafel on white or whole wheat pita ");
      System.out.println("\nWhat would you like to Order (please say Shawarma or Fafel for the type you want or no)? ");
      answer = input.next();
      answer = answer.toLowerCase();
      if(answer.equals("no")||answer.equals("nah"))
      {
        System.out.println("\nThank you for stoping by, here is your order" + order );
        k = 0;
      }
      if(answer.equals("shawarma") ||answer.equals("shw"))
      {
          System.out.println("\nGreat what type of meat would you like? (chicken or beef)");
          String meat = input.next();
          System.out.println("Sounds good and what type of bread? (whole or white)");
          String bread = input.next();

          SandwhichMaker sm = new ShawarmaMaker();
          Sandwhich sw = sm.makeSandwhich(meat, bread);
          order.add(sw);
          System.out.println("It's a " + sw);
      }
      if(answer.equals("fafel"))
      {
        String fafel = "fafel";
        System.out.println("\nGreat what type of bread? (whole or white) ");
        String bread = input.next();

        SandwhichMaker fm = new FafelMaker();
        Sandwhich swV = fm.makeSandwhich(fafel, bread);
        order.add(swV);
        System.out.println("It's a " + swV);
      }
      if(answer.equals("fafel") || answer.equals("shawarma"))
      {
        System.out.println("Would you like to order another Sandwhich? (yes/no)");
        answer = input.next();
        answer = answer.toLowerCase();
        if(answer.equals("no") ||answer.equals("nah"))
        {
          System.out.println("\n Thank you for stopping by, here is your order" + order );
          k = 0;
        }
      }
    }
    System.out.println(" ");
    System.out.println(" Oh my I almsot forgot would you like to order a Manush" );
    System.out.println(" Its a tradtional breakest/lunch item kinda like a bagel" );
    System.out.println(" You can get one with just Zaatar or you can add Tomatoes and Onions" );
    System.out.println(" Want to order one? (yes/no)" );
    answer = input.next();
    answer = answer.toLowerCase();
    if(answer.equals("yes") ||answer.equals("sure") || answer.equals("yeah") )
    {
      i = 1;
      while(i != 0)
      {
        System.out.println("\nGreat, enter Z if you want one with just Zaatar" );
        System.out.println("\nT for Zaatar with Tomatoes " );
        System.out.println("\nO for Zaatar with Onions " );
        System.out.println("\nTO for Zaatar with Tomatoes and Onions " );
        answer = input.next();
        answer = answer.toLowerCase();
        if(answer.equals("z") )
        {
          Manush m = new PlainManush();
          String a = m.makeManush();
          order.add(a);
          System.out.println("You ordered a " + a);
        }
        if(answer.equals("t") || answer.equals("tz") || answer.equals("zt"))
        {
          Manush m = new Tomatoes(new PlainManush());
          String a = m.makeManush();
          order.add(a);
          System.out.println("You ordered a " + a);
        }
        if(answer.equals("o") || answer.equals("zo") || answer.equals("oz"))
        {
          Manush m = new Onions(new PlainManush());
          String a = m.makeManush();
          order.add(a);
          System.out.println("You ordered a " + a);
        }
        if(answer.equals("ot") || answer.equals("to") || answer.equals("toz") || answer.equals("tzo"))
        {
          Manush m = new Tomatoes(new Onions(new PlainManush()));
          String a = m.makeManush();
          order.add(a);
          System.out.println("You ordered a " + a);
        }
        System.out.println("Would you like to order another one? ");
        answer = input.next();
        answer = answer.toLowerCase();
        if(answer.equals("no") ||answer.equals("nah"))
        {
          i = 0;
        }
      }
    }
    System.out.println("\nThank you for stoping by, here is your order" + order );
  }


  if (choice.equals("fast")) // THIS IS THE quick menu aka Facade patteran simlar to a fast cash option
  {
    System.out.println("\n Welcome to our fast menu" );
    System.out.println("\n choice 1: Small arabic coffe with a chicken Shawarma sandwhich on white" );
    System.out.println("\n choice 2: Small arabic coffe with a Beef Shawarma sandwhich on white" );
    System.out.println("\n choice 3: Small arabic coffe with a Fafel Shawarma sandwhich on white" );
    System.out.println("\n Would you like to order? (yes/no) " );
    answer = input.next();
    answer = answer.toLowerCase();
    if(answer.equals("no") ||answer.equals("nah"))
    {
        j = 0;
    }
    while (j != 0)
    {
      System.out.println("\n Please enter a 1, 2, or 3 for the choice you want" );
      int ans = input.nextInt();
      if(ans == 1)
      {
        Coffee cup = new Coffee.Builder("arabic" , "small").Build();
        order.add(cup);

        SandwhichMaker sm = new ShawarmaMaker();
        Sandwhich sw = sm.makeSandwhich("Chicken", "white");
        order.add(sw);
      }
      if(ans == 2)
      {
        Coffee cup = new Coffee.Builder("arabic" , "small").Build();
        order.add(cup);

        SandwhichMaker sm = new ShawarmaMaker();
        Sandwhich sw = sm.makeSandwhich("beef", "white");
        order.add(sw);
      }
      if(ans == 3)
      {
        Coffee cup = new Coffee.Builder("arabic" , "small").Build();
        order.add(cup);

        SandwhichMaker sm = new ShawarmaMaker();
        Sandwhich sw = sm.makeSandwhich("Fafel", "white");
        order.add(sw);
      }

      System.out.println("Would you like to order another one? ");
      answer = input.next();
      answer = answer.toLowerCase();
      if(answer.equals("no") ||answer.equals("nah"))
      {
        j = 0;
      }
    }
    System.out.println(" Thank you for stoping by, here is your order" + order + "\n");
  }
  System.out.println("\n Bye see you soon" );
  }
}
