package com.example.demo.service;

import com.example.demo.ProjectType;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class CocomoService {

    public String calculateCocomoBasic(Long size, ProjectType projectType) {
        double pm = projectType.getA()*Math.pow(size, projectType.getB());
        double tm = projectType.getC()+Math.pow(pm, projectType.getD());
        return String.format("Расчёт закончен: PM = %s, TM = %s", pm, tm);
    }


}
