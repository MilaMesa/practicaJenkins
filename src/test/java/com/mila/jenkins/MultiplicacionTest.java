package com.mila.jenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MultiplicacionTest {

    @Test
    void multplicar() {
        Multiplicacion multiplicacion = new Multiplicacion();
        int resultado = multiplicacion.multplicar(2, 2);
        Assert.assertEquals("se espera que multiplicar 2 por 2 de 4", 4, resultado);
    }
}