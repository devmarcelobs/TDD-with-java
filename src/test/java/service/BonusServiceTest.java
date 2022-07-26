package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Functionary;
import br.com.alura.tdd.service.BonusService;

public class BonusServiceTest {
    @Test
    void zeroFunctionaryWithHighSalary(){
        BonusService bonusService = new BonusService();

        assertThrows(IllegalArgumentException.class, () -> bonusService.calculateBonus(new Functionary("Marcelo", LocalDate.now(), new BigDecimal("25000"))));

        /* try{
            bonusService.calculateBonus(new Functionary("Marcelo", LocalDate.now(), new BigDecimal("25000")));

            fail("Nao deu a exception!"); //forçar a falha do teste
        } catch (Exception e){
            assertEquals("Funcionario com salario maior do que R$10000 nao pode receber bonus!", e.getMessage());
        } */
    }

    @Test
    void tenPercentFunctionarySalary(){
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calculateBonus(new Functionary("Marcelo", LocalDate.now(), new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusTenPercentTenThousandSalary(){
        BonusService bonusService = new BonusService();

        BigDecimal bonus = bonusService.calculateBonus(new Functionary("Marcelo", LocalDate.now(), new BigDecimal("10000")));

        assertEquals(new BigDecimal("1000.00"), bonus);
    }
}
