package com.austin.recipe;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/about")
    public String about() {
        return "about";
    }

    @RequestMapping("/recipes")
    public String recipes() {
        return "recipes";
    }

    @RequestMapping("/pasta")
    public String pasta() {
        return "pasta";
    }

    @RequestMapping("/noodles")
    public String noodles() {
        return "noodles";
    }

    @RequestMapping("/fried-egg")
    public String friedEgg() {
        return "fried-egg";
    }

    @RequestMapping("/curry")
    public String curry() {
        return "curry";
    }

    @RequestMapping("/croissant")
    public String croissant() {
        return "croissant";
    }
}
