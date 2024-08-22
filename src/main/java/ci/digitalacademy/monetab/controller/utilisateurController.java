package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/utilisateur")

public class utilisateurController {

    @GetMapping
    public String utlisateur(){

        return "utilisateur/list";
    }

    @GetMapping("/ajouterunutilisateur")
    public String ajouterunutilisateur(){
        return "ajouterunutilisateur/list";

    }

    @GetMapping("/modifierunutilisateur")
    public String modifierunutilisateur(){
        return "modifierunutilisateur/list";

    }
}
