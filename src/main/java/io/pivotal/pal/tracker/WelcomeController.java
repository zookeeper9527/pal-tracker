package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {


    private final String msg;

    public WelcomeController(@Value("${welcome.message}") String msg) {
        this.msg = msg;

    }

    @GetMapping("/")
    public String sayHello() {
        return msg;
    }
}