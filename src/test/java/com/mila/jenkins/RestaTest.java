package com.mila.jenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class RestaTest {

    @Test
    void resta() {
        Resta resta = new Resta();
        int resultado = resta.resta(5, 1);
        Assert.assertEquals("Se espera que restar 1 de 5 de 4", 4, resultado);
    }
}