package ci.digitalacademy.monetab.controller;

import ci.digitalacademy.monetab.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")

public class indexController {

    @GetMapping
    public String index(){

       /* User user= new User(1,"Gonkoua","alaigne");
        User user1=null;
        model.addAttribute("user1",user1);
        model.addAttribute("user",user);

        */
        return "index/lis";
    }

}
