package br.com.projeto.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.projeto.api.model.People;

@RestController
public class Controller {

    @GetMapping("/")
    public String message() {
        return "Hello World!";
    }

    @GetMapping("/welcome/{name}")
    public String welcome(@PathVariable String name) {
        return "welcome " + name;
    }

    @PostMapping("/people")
    public People people(@RequestBody People people) {
        /*
         * People people = new People();
         * people.setName("John");
         * people.setAge("20");
         */
        return people;
    }
}
