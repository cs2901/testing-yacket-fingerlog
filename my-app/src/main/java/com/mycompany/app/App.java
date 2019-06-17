package com.mycompany.app;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
      Scanner in = new Scanner(System.in);
      Translator trans = new Translator();
      System.out.println("Write the text :");
      String text =  in.nextLine();

      //trans.showChoices();
      //String code = in.nextLine();
      String code = "";
      code = valid(code);
      trans.printTranslation(text, code);
    }
}
