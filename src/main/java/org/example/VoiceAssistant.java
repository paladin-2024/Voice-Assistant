package org.example;

import java.lang.module.Configuration;
import edu.cmu.sphinx.api.Configuration;

public class VoiceAssistant {
    public static void main(String[] args) {
        Configuration config=new Configuration();
        config.setAccousticModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us");
        config.setDictionaryPath("resource:/edu/cmu/sphinx/models/en-us/cmudict-en-us.dict");
        config.setLanguageModelPath("resource:/edu/cmu/sphinx/models/en-us/en-us.lm.bin");

    }

}
