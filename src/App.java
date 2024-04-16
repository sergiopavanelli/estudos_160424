import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do primeiro produto
        System.out.println("Informe o nome do primeiro produto:");
        String nome1 = scanner.nextLine();
        System.out.println("Informe o preço do primeiro produto:");
        double preco1 = scanner.nextDouble();
        Produto produto1 = new Produto(nome1, preco1);

        // Criação do segundo produto
        scanner.nextLine(); // Limpa o buffer do scanner
        System.out.println("Informe o nome do segundo produto:");
        String nome2 = scanner.nextLine();
        System.out.println("Informe o preço do segundo produto:");
        double preco2 = scanner.nextDouble();
        Produto produto2 = new Produto(nome2, preco2);

        // Reajuste de preço para os produtos
        System.out.println("Informe o valor do reajuste em percentual:");
        double percentual = scanner.nextDouble();
        produto1.reajustaPreco(percentual);
        produto2.reajustaPreco(percentual);

        // Exibição das informações dos produtos
        produto1.exibe();
        produto2.exibe();

        scanner.close();
    }
}
