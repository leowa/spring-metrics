package com.example.spring.metrics.springmetrics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HotKeywordController {

    private final Keywords keywords;

    public HotKeywordController(Keywords keywords) {
        this.keywords = keywords;
    }

    @PostMapping("/keywords/{key}")
    public HotKeyword addKeyword(@PathVariable("key") String key) {
        return this.keywords.put(key);
    }

    @GetMapping("/keywords/{key}")
    public HotKeyword getKeyword(@PathVariable("key") String key) {
        return this.keywords.get(key);
    }

    @GetMapping("/keywords")
    public String[] listKeywords() {
        return this.keywords.list();
    }
}
