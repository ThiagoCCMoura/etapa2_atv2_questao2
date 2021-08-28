import com.sun.javaws.exceptions.InvalidArgumentException;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        try {
            Conta conta1 = new Conta(EstadoConta.POSITIVO);
            conta1.depositar(new BigDecimal(10));
            System.out.println(conta1);
            conta1.sacar(new BigDecimal(5));
            System.out.println(conta1);

            Conta conta2 = new Conta(EstadoConta.NEGATIVO);
            conta2.depositar(new BigDecimal(10));
            System.out.println(conta2);
            conta2.sacar(new BigDecimal(5));
            System.out.println(conta2);

        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }
}

