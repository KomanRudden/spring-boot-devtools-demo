package com.komanrudden.springbootdevtools.live.reload;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import static java.lang.String.format;

@RestController
public class ClassToBeChanged {

    @GetMapping("/hello/{name}")
    public String changeMe(@PathVariable String name) {
        return format("Hello there %s", name);
    }
}
