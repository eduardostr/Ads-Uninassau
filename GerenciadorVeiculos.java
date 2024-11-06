import java.util.ArrayList;

// Classe abstrata Veiculo
abstract class Veiculo {
    protected String placa;
    protected int ano;

    public Veiculo(String placa, int ano) {
        this.placa = placa;
        this.ano = ano;
    }

    public abstract double calcularValorSeguro();

    public void exibirDetalhes() {
        System.out.println("Placa: " + placa + ", Ano: " + ano);
    }
}

// Interface Manutencao
interface Manutencao {
    String realizarManutencao();
}

// Subclasse Carro
class Carro extends Veiculo implements Manutencao {
    private int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas) {
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularValorSeguro() {
        return 500 + (numeroPortas * 100); // Exemplo: R$500 fixo + R$100 por porta
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção do carro realizada!";
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + numeroPortas);
    }
}

// Subclasse Moto
class Moto extends Veiculo implements Manutencao {
    private int cilindrada;

    public Moto(String placa, int ano, int cilindrada) {
        super(placa, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularValorSeguro() {
        return 300 + (cilindrada * 0.05); // Exemplo: R$300 fixo + R$0.05 por cilindrada
    }

    @Override
    public String realizarManutencao() {
        return "Manutenção da moto realizada!";
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindrada: " + cilindrada);
    }
}

// Classe principal GerenciadorVeiculos
public class GerenciadorVeiculos {
    public static void main(String[] args) {
        // Criando uma lista de veículos
        ArrayList<Veiculo> frota = new ArrayList<>();

        // Adicionando veículos à lista
        frota.add(new Carro("ABC-1234", 2020, 4));
        frota.add(new Moto("XYZ-5678", 2019, 600));

        // Percorrendo a lista de veículos
        for (Veiculo veiculo : frota) {
            veiculo.exibirDetalhes();
            System.out.println("Valor do seguro: R$" + veiculo.calcularValorSeguro());
            
            // Realizando a manutenção com base no tipo de veículo
            if (veiculo instanceof Manutencao) {
                System.out.println(((Manutencao) veiculo).realizarManutencao());
            }
            System.out.println("-------------------------");
        }
    }
}
