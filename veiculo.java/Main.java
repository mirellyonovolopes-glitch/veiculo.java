import java.util.Scanner;

class veiculo {

    String marca;
    String modelo;
    int ano;
    int velocidade;

    public void exibirDados() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    public void acelerar() {
        velocidade = velocidade + 10;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        // VEÍCULO 1
        veiculo carro1 = new veiculo();

        System.out.println("=== VEÍCULO 1 ===");

        System.out.print("Digite a marca: ");
        carro1.marca = leitor.nextLine();

        System.out.print("Digite o modelo: ");
        carro1.modelo = leitor.nextLine();

        System.out.print("Digite o ano: ");
        carro1.ano = leitor.nextInt();

        System.out.print("Digite a velocidade atual: ");
        carro1.velocidade = leitor.nextInt();

        leitor.nextLine();

        // VEÍCULO 2
        veiculo carro2 = new veiculo();

        System.out.println("\n=== VEÍCULO 2 ===");

        System.out.print("Digite a marca: ");
        carro2.marca = leitor.nextLine();

        System.out.print("Digite o modelo: ");
        carro2.modelo = leitor.nextLine();

        System.out.print("Digite o ano: ");
        carro2.ano = leitor.nextInt();

        System.out.print("Digite a velocidade atual: ");
        carro2.velocidade = leitor.nextInt();

        // DADOS ANTES DE ACELERAR
        System.out.println("\n=== DADOS ANTES DE ACELERAR ===");

        System.out.println("\n--- Veículo 1 ---");
        carro1.exibirDados();

        System.out.println("\n--- Veículo 2 ---");
        carro2.exibirDados();

        // ACELERA O VEÍCULO 1
        carro1.acelerar();

        // DADOS DEPOIS DE ACELERAR
        System.out.println("\n=== DADOS DEPOIS DE ACELERAR ===");

        System.out.println("\n--- Veículo 1 ---");
        carro1.exibirDados();

        System.out.println("\n--- Veículo 2 ---");
        carro2.exibirDados();

        leitor.close();
    }
}
