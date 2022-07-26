package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Functionary;
import br.com.alura.tdd.modelo.Performance;

public class ReadjustmentService {

    public void makeReadjustment(Functionary functionary, Performance performance) {
        //using strategy
        BigDecimal percentage = performance.percentageReadjustment();
        BigDecimal readjustment = functionary.getSalary().multiply(percentage);
        
        functionary.salaryReadjustment(readjustment);
    }

}
