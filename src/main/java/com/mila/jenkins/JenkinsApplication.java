package com.mila.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsApplication.class, args);
        System.out.println("test");
        Calculadora calculadora = new Calculadora();
        calculadora.setA(1);
        calculadora.setB(5);
        int sumado = calculadora.sumar();
        int restado = calculadora.restar();
        int multiplicado = calculadora.multiplicar();
        double dividido = calculadora.dividir();
        System.out.println(sumado);
        System.out.println(restado);
        System.out.println(multiplicado);
        System.out.println(dividido);
    }

}
