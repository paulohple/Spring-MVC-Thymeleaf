package br.edu.iftm.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {
    
    @RequestMapping("/alo")
    public String master(Model modelo) {
        modelo.addAttribute("nro1",Math.round(Math.random()*60+1));
        modelo.addAttribute("nro2",Math.round(Math.random()*60+1));
        modelo.addAttribute("nro3",Math.round(Math.random()*60+1));
        modelo.addAttribute("nro4",Math.round(Math.random()*60+1));
        modelo.addAttribute("nro5",Math.round(Math.random()*60+1));
        modelo.addAttribute("nro6",Math.round(Math.random()*60+1));
        return "view1";
    }
}