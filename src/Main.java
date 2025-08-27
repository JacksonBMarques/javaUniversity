import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nomeAluno = scanner.nextLine();

        // Define as matérias
        String[] materias = {"Matemática", "Física", "Química"};
        int[] notas = new int[materias.length];

        // Solicita as notas para cada matéria
        for (int i = 0; i < materias.length; i++) {
            System.out.print("Digite a nota de " + materias[i] + ": ");
            notas[i] = scanner.nextInt();
        }

        // Pergunta se o usuário deseja ver o resumo do aluno
        System.out.print("\nDeseja ver o resumo do aluno? (s/n): ");
        scanner.nextLine(); // Limpa o buffer
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("s")) {
            // Calcula a média
            int soma = 0;
            int maior = notas[0];
            int menor = notas[0];
            for (int i = 0; i < notas.length; i++) {
                soma += notas[i];
                if (notas[i] > maior) maior = notas[i];
                if (notas[i] < menor) menor = notas[i];
            }
            double media = (double) soma / notas.length;

            // Verifica aprovação
            String status;
            if (media >=60 ){
                status = "Aprovado";
            } else {
                status = "Reprovado";
            }

            // Exibe o resumo
            System.out.println("\nResumo do " + nomeAluno + ":");
            for (int i = 0; i < materias.length; i++) {
                System.out.println(materias[i] + ": " + notas[i]);
            }
            System.out.printf("Média: %.2f\n", media);
            System.out.println("Status: " + status);
            System.out.println("Nota mais alta: " + maior);
            System.out.println("Nota mais baixa: " + menor);
        } else {
            System.out.println("\nObrigado.");
        }

        scanner.close();
    }

}