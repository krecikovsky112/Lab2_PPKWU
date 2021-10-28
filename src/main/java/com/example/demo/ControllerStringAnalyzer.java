package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("string_analyzer/")
public class ControllerStringAnalyzer {

    @GetMapping("upper_case/{text}")
    public int counterUpperCaseLetters(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            counter += Character.isUpperCase(c) ? 1 : 0;
        }
        return counter;
    }

    @GetMapping("lower_case/{text}")
    public int counterLowerCaseLetters(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            counter += Character.isLowerCase(c) ? 1 : 0;
        }
        return counter;
    }


}
