package br.com.alura.tdd.modelo;

import java.math.BigDecimal;

public enum Performance {
    A_DESEJAR {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.03");
        }
    },
    BOM {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.15");
        }
    }, 
    OTIMO {
        @Override
        public BigDecimal percentageReadjustment() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal percentageReadjustment();
}
