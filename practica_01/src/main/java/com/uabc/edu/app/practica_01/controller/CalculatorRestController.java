package com.uabc.edu.app.practica_01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pablo.alejos
 */
@RestController
public class CalculatorRestController {

    @GetMapping("/suma")
    public String suma(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=red>" + numA + " mas " + numB + " <b>[" + String.valueOf(calculator.suma()) + "]</b></font>";
    }

    @GetMapping("/resta")
    public String resta(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=orange>" + numA + " menos " + numB + " <b>[" + String.valueOf(calculator.resta()) + "]</b></font>";
    }

    @GetMapping("/multiplicacion")
    public String multiplicacion(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=pink>" + numA + " multiplicado por " + numB + " <b>[" + String.valueOf(calculator.multiplicacion()) + "]</b></font>";
    }

    @GetMapping("/division")
    public String division(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=blue>" + numA + " dividido entre " + numB + " <b>[" + String.valueOf(calculator.division()) + "]</b></font>";
    }

    @GetMapping("/porcentaje")
    public String porcentaje(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=yellow>El " + numA + " porciento de " + numB + " es <b>[" + String.valueOf(calculator.porcentaje()) + "]</b></font>";
    }

    @GetMapping("/potencia")
    public String potencia(@RequestParam(value = "numA", defaultValue = "-1") Integer numA,
            @RequestParam(value = "numB", defaultValue = "-1    ") Integer numB) {
        Calculator calculator = new Calculator(numA, numB);
        return "<font size=32pt color=green>" + numA + " elevado a la " + numB + " potencia es <b>[" + String.valueOf(calculator.potencia()) + "]</b></font>";
    }
}
