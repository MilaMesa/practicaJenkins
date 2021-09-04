package com.mila.jenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SumaTest {

    @Test
    void sum() {
        Suma suma = new Suma();
        int sum = suma.sum(2, 2);
        Assert.assertEquals("se espera que 2 +2 sea 4", 4, sum);
    }
}