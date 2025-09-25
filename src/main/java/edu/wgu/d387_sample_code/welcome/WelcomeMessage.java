package edu.wgu.d387_sample_code.welcome;
import org.springframework.http.ReactiveHttpOutputMessage;

import java.util.Locale;
import java.util.ResourceBundle;


public class WelcomeMessage  implements Runnable {
    private String language;
    private String[] messages;
    private int index;

    public WelcomeMessage(String language, String[] messages, int index) {
        this.language = language;
        this.messages = messages;
        this.index = index;
    }

    @Override
    public void run() {
        if (language.equals("en")) {
            ResourceBundle bundle = ResourceBundle.getBundle("translation", Locale.US);
            messages[index] = bundle.getString("welcome");
        } else if (language.equals("fr")) {
            ResourceBundle bundle = ResourceBundle.getBundle("translation", Locale.CANADA_FRENCH);
            messages[index] = bundle.getString("welcome");
        }
    }
}
