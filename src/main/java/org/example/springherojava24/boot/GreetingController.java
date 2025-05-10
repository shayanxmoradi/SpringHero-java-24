package org.example.springherojava24.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hi")
    public String sayHi(@RequestParam(value = "name", defaultValue = "defualt") String name) {
        return "Hi " + name+"welcome to Spring Hero Java 24!";
    }
}
