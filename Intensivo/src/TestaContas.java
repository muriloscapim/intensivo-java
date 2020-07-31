public class TestaContas {

    public static void main(String[] args) {

        Conta conta = new Conta(100, "Alex", 1000.0);
        conta.saque(200.0);
        System.out.println(conta.getSaldo());

        Conta conta2 = new ContaPoupanca(101, "Maria", 1000.0, 0.01);
        conta2.saque(200.0);
        System.out.println(conta2.getSaldo());

        Conta conta3 = new ContaEmpresa(102,"Bob",1000.0,500.0);
        conta3.saque(200.0);
        System.out.println(conta3.getSaldo());
    }
}
