import com.sun.javaws.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public enum EstadoConta {
    POSITIVO{
        public BigDecimal sacar(BigDecimal saldo, BigDecimal valor) throws InvalidArgumentException {
            if(saldo.compareTo(valor)>=0){
                return saldo.subtract(valor);
            }else {
                throw new InvalidArgumentException(new String[]{"Não é possivel fazer saques desse valor"});
            }
        }

        public BigDecimal depositar(BigDecimal saldo, BigDecimal valor) {
            return saldo.add(valor.multiply(new BigDecimal("0.98")));
        }
    },
    NEGATIVO{
        public BigDecimal sacar(BigDecimal saldo, BigDecimal valor) throws InvalidArgumentException {
            throw new InvalidArgumentException(new String[]{"Não é possivel fazer saques nesse estado"});
        }

        public BigDecimal depositar(BigDecimal saldo, BigDecimal valor) {
            return saldo.add(valor.multiply(new BigDecimal("0.95")));
        }
    };

    public abstract BigDecimal sacar(BigDecimal saldo, BigDecimal valor) throws InvalidArgumentException;
    public abstract BigDecimal depositar(BigDecimal saldo, BigDecimal valor);
}
