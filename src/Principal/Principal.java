package Principal;

import java.util.Locale;
import java.util.Scanner;
import Produto.Produto;

public class Principal {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        float soma = 0f;

        Produto[] vetor = new Produto[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o nome do %dº produto:", i + 1);
            String nomeProd = sc.next();
            System.out.printf("Digite o preço do %dº produto: ", i + 1);
            double precoProd = sc.nextDouble();
            sc.nextLine();

            vetor[i] = new Produto(nomeProd, precoProd);
            soma += vetor[i].getPrecoProd();
        }

        float media = soma/n;
        System.out.printf("A média dos preços é de R$%.2f", media);

        sc.close();
    }

}
