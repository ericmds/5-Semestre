package example.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/cachorro")
    public String mostraCachorro() {
        return "cachorro";
    }
}