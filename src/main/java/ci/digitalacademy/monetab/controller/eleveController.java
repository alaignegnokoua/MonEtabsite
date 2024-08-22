package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.Eleve;
import ci.digitalacademy.monetab.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/eleve")
public class eleveController {
    @GetMapping
    public String eleve(){
        return "eleve/list";
    }

    @GetMapping("/ajouteruneleve")
    public String ajouteruneleve() {
        return "ajouteruneleve/list";
    }
    @GetMapping("/modifieruneleve")
    public String modifierunelve() {
        return "modifieruneleve/list";
    }

}
