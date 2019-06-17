package com.mycompany.app;

import com.google.cloud.translate.Detection;
import com.google.cloud.translate.Translate;
import com.google.cloud.translate.Translate.TranslateOption;
import com.google.cloud.translate.TranslateOptions;
import com.google.cloud.translate.Translation;
import com.google.cloud.translate.Language;
import java.util.List;

public class Translator
{


    public Translate translate;

    private static final String key = "AIzaSyBJ01MsImGXDFSe2WdGMdTe-CvevbTUPoc";

    public Translator()
    {
        translate = TranslateOptions.newBuilder().setApiKey(key).build().getService();
    }
    private String languageDetected(String text)
    {
        Detection detection = translate.detect(text);
        return detection.getLanguage();
    }

    public void showChoices()
    {
      List<Language> languages = translate.listSupportedLanguages();
      System.out.println("Choose 1 code of a language");
      for (Language language : languages) {
        System.out.printf("Name: %s, Code: %s\n", language.getName(), language.getCode());
      }
    }

    public void printTranslation(String inputText, String lang)
    {
        String origin = languageDetected(inputText);

        Translation translation = translate.translate(
            inputText,
            TranslateOption.sourceLanguage(origin),
            TranslateOption.targetLanguage(lang));
        System.out.println(translation.getTranslatedText());
    }

}
