package com.example.demo;

import com.example.demo.service.CocomoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/rest")
@AllArgsConstructor
public class RestControllerTest {
    private CocomoService cocomoService;

    @PostMapping(value = "/light")
    public String light(@RequestBody RequestLight requestLight) {
        return cocomoService.calculateCocomoBasic(requestLight.getSize(), requestLight.getProjectTypeLight());
    }
    @PostMapping(value = "/hard")
    public String hard(@RequestBody RequestHard requestLight) {
        return cocomoService.calculateCoComoHard(requestLight.getSize(), requestLight.getEaf(), requestLight.getProjectTypeLight());
    }
}
