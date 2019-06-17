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

      List<Language> languages = translate.listSupportedLanguages();
      boolean valid = True;

      while(valid)
      {
        trans.showChoices();
        String code = in.nextLine();

        for (Language language : languages) {
          
          if ((language.getCode()).equals(code) ) {
            valid=False;
            
          }
        }

      }


      trans.printTranslation(text, code);
    }
}



      System.out.println("Choose 1 code of a language");
      for (Language language : languages) {
        System.out.printf("Name: %s, Code: %s\n", language.getName(), language.getCode());