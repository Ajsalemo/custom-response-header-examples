package com.listheaders.azure.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeadersController {
    @GetMapping("/api/headers")
    public ResponseEntity<String> addCustomerHeader() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Foo", "Bar");
        ResponseEntity<String> responseEntity = new ResponseEntity<String>("Adding a custom header..", responseHeaders,
                HttpStatus.OK);
        return responseEntity;
    }
}
