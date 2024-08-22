package ci.digitalacademy.monetab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

    @Controller
    @RequestMapping("/professeur")

        public class professeurController {
        @GetMapping
        public String professeur() {

            return "professeur";
        }

        @GetMapping("/ajouterunprofesseur")
        public String ajouterunuprofesseur() {
            return "ajouterunprofesseur/list";

        }

        @GetMapping("/modifierunprofesseur")
        public String modifierunprofesseur() {
            return "modifierunprofesseur/list";


        }
    }