package com.listheaders.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "custom-response-header-examples";
    @GetMapping("/")
    public String index() {
        return message;
    }
}
