package com.dvj.groupTodoBackend;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/check")
public class CheckController {
    @GetMapping
    public String justTest() {
        return "<h1>Just Checking</h1>";
    }
}
