package com.mila.jenkins;

public class Calculadora {
    private int a;
    private int b;
    private Suma suma = new Suma();
    private Resta resta = new Resta();
    private Multiplicacion multiplicacion = new Multiplicacion();
    private Division division = new Division();


    public void setA(int i) {
        this.a = i;
    }


    public void setB(int i) {
        b=i;
    }

    public int sumar() {
        return suma.sum(a,b);
    }

    public int restar() {
        return resta.resta(a,b);
    }

    public int multiplicar() {
        return multiplicacion.multplicar(a,b);
    }

    public double dividir() {
        return division.dividir(a,b);
    }
}
