public class ContaPoupanca extends Conta {

    private Double juros;

    public ContaPoupanca(Integer numero, String titular, Double saldo, Double juros) {
        super(numero, titular, saldo);
        this.juros = juros;
    }

    public Double getJuros() {
        return juros;
    }

    public void setJuros(Double juros) {
        this.juros = juros;
    }

    public void atualizaSaldo() {
        saldo += saldo * juros;
    }

    @Override
    public void saque(double valor) {
        saldo -= valor;
    }
}
