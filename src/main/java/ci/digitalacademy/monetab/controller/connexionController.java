package ci.digitalacademy.monetab.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/connexion")

public class connexionController {

    @GetMapping
    public String connexion(){
        return "connexion/list";
    }
}
