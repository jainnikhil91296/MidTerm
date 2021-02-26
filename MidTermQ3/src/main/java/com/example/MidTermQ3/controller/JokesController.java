package com.example.MidTermQ3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/joke")
public class JokesController {

    public String JokesController(@ModelAttribute("joke") Model model)

    {
        return "index";}


}
