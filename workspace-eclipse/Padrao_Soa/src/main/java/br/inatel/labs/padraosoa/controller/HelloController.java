<<<<<<< HEAD
package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public MyMessage processarGetHello(){
        return new MyMessage("Olá, mundo SOA");
    }
}
=======
package br.inatel.labs.padraosoa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping
    public MyMessage processarGetHello(){
        return new MyMessage("Olá, mundo SOA");
    }
}
>>>>>>> c17b67154066372b0d93a1c33ab5f0ad1ae08856
