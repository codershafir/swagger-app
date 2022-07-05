package com.example.swaggerapp.swaggerapp;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {
    @PostMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    ResponseEntity<String> getFile(@Parameter(description = "Api", schema = @Schema(type = "object")) @RequestPart("map") Map<String, Object> valueMap) {
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/call")
    ResponseEntity<String> testMethod(){
        return ResponseEntity.ok("Success");
    }

}
