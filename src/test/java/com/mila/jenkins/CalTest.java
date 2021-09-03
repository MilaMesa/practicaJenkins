package com.mila.jenkins;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalTest {

    @Test
    void sum() {
        Cal cal = new Cal();
        int sum = cal.sum(2, 2);
        Assert.assertEquals("se espera que 2 +2 sea 4", 4, sum);
    }
}