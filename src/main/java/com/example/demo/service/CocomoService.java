package com.example.demo.service;

import com.example.demo.ProjectTypeHard;
import com.example.demo.ProjectTypeLight;
import org.springframework.stereotype.Service;

@Service
public class CocomoService {

    public String calculateCocomoBasic(Long size, ProjectTypeLight projectTypeLight) {
        Double pm = projectTypeLight.getA()*Math.pow(size, projectTypeLight.getB());
        Double tm = projectTypeLight.getC()+Math.pow(pm, projectTypeLight.getD());
        Double h = pm/tm;
        return String.format("Расчёт закончен: PM = %s (трудоёмкость чел. х мес.) , " +
                "TM = %s (время разработки в календарных месяцах) Разработчики: %s человек", pm.longValue(), tm.longValue(), h.longValue());
    }

    public String calculateCoComoHard(Long size, Double eaf, ProjectTypeHard projectTypeHard){
        Double pm = eaf * projectTypeHard.getA() * Math.pow(size, projectTypeHard.getB());
        Double tm = projectTypeHard.getC()+Math.pow(pm, projectTypeHard.getD());
        Double h = pm/tm;
        return String.format("Расчёт закончен: PM = %s (трудоёмкость чел. х мес.) , " +
                "TM = %s (время разработки в календарных месяцах) Разработчики: %s человек", pm.longValue(), tm.longValue(), h.longValue());
    }
}
