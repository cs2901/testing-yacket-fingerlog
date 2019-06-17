package com.mycompany.app;


/**
 * Hello world!
 *
 */
public class App 
{
    
    public static void main( String[] args )
    {
        Translator trans = new Translator();
        String text =  "Hola, mundo!";
        trans.printTranslation(text);
    }
}
