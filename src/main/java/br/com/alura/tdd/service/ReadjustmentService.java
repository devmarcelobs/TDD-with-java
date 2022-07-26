package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Functionary;
import br.com.alura.tdd.modelo.Performance;

public class ReadjustmentService {

    public void makeReadjustment(Functionary functionary, Performance performance) {
        if(performance == Performance.A_DESEJAR){
            BigDecimal readjustment = functionary.getSalary().multiply(new BigDecimal("0.03"));

            functionary.salaryReadjustment(readjustment);
        }
        else if(performance == Performance.BOM){
            BigDecimal readjustment = functionary.getSalary().multiply(new BigDecimal("0.15"));
            
            functionary.salaryReadjustment(readjustment);
        }
        else if(performance == Performance.OTIMO){
            BigDecimal readjustment = functionary.getSalary().multiply(new BigDecimal("0.20"));
            
            functionary.salaryReadjustment(readjustment);
        }
    }

}
