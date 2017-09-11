package com.example.korotaevas.testforrom.Services;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by korotaevas on 11.09.17.
 */

public class Translater {

    static Map<String, String> dictTranslate;

    public Translater(){
        dictTranslate = new HashMap<String, String>();
        dictTranslate.put("а","a");
        dictTranslate.put("б","b");
        dictTranslate.put("в","v");
        dictTranslate.put("г","g");
        dictTranslate.put("д","d");
        dictTranslate.put("е","e");
        dictTranslate.put("ё","jo");
        dictTranslate.put("ж","zh");
        dictTranslate.put("з","z");
        dictTranslate.put("и","i");
        dictTranslate.put("й","j");
        dictTranslate.put("к","k");
        dictTranslate.put("л","l");
        dictTranslate.put("м","m");
        dictTranslate.put("н","n");
        dictTranslate.put("о","o");
        dictTranslate.put("п","p");
        dictTranslate.put("р","r");
        dictTranslate.put("с","s");
        dictTranslate.put("т","t");
        dictTranslate.put("у","u");
        dictTranslate.put("ф","f");
        dictTranslate.put("х","h");
        dictTranslate.put("ц","c");
        dictTranslate.put("ч","ch");
        dictTranslate.put("ш","sh");
        dictTranslate.put("щ","shh");
        dictTranslate.put("ъ","#");
        dictTranslate.put("ы","y");
        dictTranslate.put("ь","'");
        dictTranslate.put("э","je");
        dictTranslate.put("ю","ju");
        dictTranslate.put("я","ja");
    }

    public String translate(String russianText){
        StringBuilder transcriptionText = new StringBuilder();
        int len = russianText.length();
        for(int i = 0; i<len; i++){
            String symbol = russianText.substring(i, i+1);
            String symbolTranslate = dictTranslate.get(symbol);
            transcriptionText.append(symbolTranslate);
        }
        return transcriptionText.toString();
    }

}
