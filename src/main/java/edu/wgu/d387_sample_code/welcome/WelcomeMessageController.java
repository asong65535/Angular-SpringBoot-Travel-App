package edu.wgu.d387_sample_code.welcome;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class WelcomeMessageController {
    @GetMapping("/welcome")
    public String[] getWelcomeMessages() {
        String[] messages = new String[2];

        Thread englishThread = new Thread(new WelcomeMessage("en", messages, 0));
        Thread frenchThread = new Thread(new WelcomeMessage("fr", messages, 1));

        englishThread.start();
        frenchThread.start();

        try {
            englishThread.join();
            frenchThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return messages;
    }
}
