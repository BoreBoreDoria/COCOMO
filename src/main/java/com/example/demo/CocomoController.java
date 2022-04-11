package com.example.demo;

import com.example.demo.service.CocomoService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
@AllArgsConstructor
public class CocomoController {
    private CocomoService cocomoService;


    @GetMapping
    public ModelAndView load() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("index");
        modelAndView.addObject("typeLight", ProjectTypeLight.values());
        modelAndView.addObject("typeHard", ProjectTypeHard.values());
        modelAndView.addObject("attrs", AttributeType.values());
        return modelAndView;
    }
}
