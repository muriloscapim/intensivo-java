public class Veiculo {
    int passageiros;
    double combustivel;
    double consumo;
    String marca;

    public Veiculo(int passageiros, double combustivel, double consumo, String marca) {
        this.passageiros = passageiros;
        this.combustivel = combustivel;
        this.consumo = consumo;
        this.marca = marca;
    }

    double autonomia() {
        return consumo * combustivel;
    }

    double calculaCombustivel(double distancia){
        return distancia / consumo;
    }
}
