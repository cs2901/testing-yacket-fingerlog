package com.mycompany.app;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;

public class Translator
{

    public Translate translate;
    
    public Translator()
    {
        translate = TranslateOptions.getDefaultInstance().getService();
    }
    private String languageDetected(String text)
    {
        Detection detection = translate.detect(text);
        return detection.getLanguage();
    }
    
    public void printTranslation(String inputText)
    {
        String origin = languageDetected(inputText);
        Translation translation = translate.translate(
            inputText,
            TranslateOption.sourceLanguage(origin),
            TranslateOption.targetLanguage("en"));
        System.out.println(translation.getTranslatedText());
    }
    
}
