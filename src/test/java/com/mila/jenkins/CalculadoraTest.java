package com.mila.jenkins;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
    private static Calculadora calculadora = new Calculadora();

    @BeforeAll
    static void before() {
        calculadora = new Calculadora();
        calculadora.setA(2);
        calculadora.setB(2);
    }

    @Test
    void sumar() {
        Assert.assertEquals("se espera que la suma retorne 4", 4, calculadora.sumar());
    }

    @Test
    void restar() {
        Assert.assertEquals("se espera que la resta retorne 0", 0, calculadora.restar());
    }

    @Test
    void multiplicar() {
        Assert.assertEquals("se espera que la multiplicacion retorne 4", 4, calculadora.multiplicar());
    }
}