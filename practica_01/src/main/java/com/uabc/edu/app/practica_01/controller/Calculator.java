package com.uabc.edu.app.practica_01.controller;

/**
 *
 * @author pablo.alejos
 */
public class Calculator {

    private final double numA;
    private final double numB;

    public Calculator(double numA, double numB) {
        this.numA = numA;
        this.numB = numB;
    }

    public double suma() {
        return this.numA + this.numB;
    }

    public double resta() {
        return this.numA - this.numB;
    }

    public double multiplicacion() {
        return this.numA * this.numB;
    }

    public double division() {
        return this.numA / this.numB;
    }

    public double porcentaje() {
        return (this.numA * 100) / this.numB;
    }

    public double potencia() {
        return Math.pow(this.numA,this.numB);
    }
}
