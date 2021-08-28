import com.sun.javaws.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public class Conta {

    private EstadoConta estadoConta;
    private BigDecimal saldo = new BigDecimal(0);

    public Conta(EstadoConta estadoConta){
        this.estadoConta = estadoConta;
    }

    public void sacar(BigDecimal valor) throws InvalidArgumentException {
        saldo = estadoConta.sacar(saldo, valor);
    }

    public void depositar(BigDecimal valor) {
        saldo = estadoConta.depositar(saldo, valor);
    }

    @Override
    public String toString() {
        return "Conta{" +
                "estadoConta=" + estadoConta +
                ", saldo=" + saldo +
                '}';
    }
}
