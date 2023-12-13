package br.inatel.labs.padraomvc.controller.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloMvcController {

    @GetMapping("/hello")
    public String getHello(Model model){
        model.addAttribute("usuario", "Vitor");
        return "hello-mvc"; //nao precisa de.html
    }
}
