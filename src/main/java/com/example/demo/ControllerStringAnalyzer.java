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

    @GetMapping("white_spaces/{text}")
    public int counterWhiteSpaces(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            counter += Character.isWhitespace(c) ? 1 : 0;
        }
        return counter;
    }

    @GetMapping("numbers/{text}")
    public int counterNumbers(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            counter += Character.isDigit(c) ? 1 : 0;
        }
        return counter;
    }

    @GetMapping("special_characters/{text}")
    public int counterSpecialCharacters(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            if(!((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')))
            {
                counter++;
            }
        }
        return counter;
    }

    @GetMapping("letters/{text}")
    public int counterLetters(@PathVariable String text) {
        int counter = 0;
        for (char c : text.toCharArray()) {
            counter += Character.isLetter(c) ? 1 : 0;
        }
        return counter;
    }

    @GetMapping("is_contain/{text1}/{text2}")
    public boolean isCombinationPresentInString(@PathVariable String text1,
                                                @PathVariable String text2) {
        return text2.contains(text1);
    }

}
