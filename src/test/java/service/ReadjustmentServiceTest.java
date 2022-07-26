package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Functionary;
import br.com.alura.tdd.modelo.Performance;
import br.com.alura.tdd.service.ReadjustmentService;

public class ReadjustmentServiceTest {
    @Test
    public void threePercentReadjustment(){
        ReadjustmentService readjustmentService = new ReadjustmentService();
        Functionary functionary = new Functionary("Marcelo", LocalDate.now(), new BigDecimal("1000.00"));

        readjustmentService.makeReadjustment(functionary, Performance.A_DESEJAR);

        assertEquals(new BigDecimal("1030.00"), functionary.getSalary());
    }

    @Test
    public void fifteenPercentReadjustment(){
        ReadjustmentService readjustmentService = new ReadjustmentService();
        Functionary functionary = new Functionary("Marcelo", LocalDate.now(), new BigDecimal("1000.00"));

        readjustmentService.makeReadjustment(functionary, Performance.BOM);

        assertEquals(new BigDecimal("1150.00"), functionary.getSalary());
    }

    @Test
    public void twentyPercentReadjustment(){
        ReadjustmentService readjustmentService = new ReadjustmentService();
        Functionary functionary = new Functionary("Marcelo", LocalDate.now(), new BigDecimal("1000.00"));

        readjustmentService.makeReadjustment(functionary, Performance.OTIMO);

        assertEquals(new BigDecimal("1200.00"), functionary.getSalary());
    }
}
