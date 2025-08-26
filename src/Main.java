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

        // Pergunta se o usuário deseja ver as notas
        System.out.print("\nDeseja ver as notas do aluno? (s/n): ");
        scanner.nextLine(); // Limpa o buffer
        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase"s")) {
            System.out.println("\nNotas da aluna(o) " + nomeAluno + ":");
            for (int i = 0; i < materias.length; i++) {
                System.out.println(materias[i] + ": " + notas[i]);
            }
        } else {
            System.out.println("\nObrigado.");
        }
    }
}