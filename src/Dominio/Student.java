package Dominio;

public class Student {
    private String nome;
    private int[] notas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
    public int[] getNotas(){
        return this.notas;
    }

    public double calculaMedia(){
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return (double) soma / notas.length;
    }

    public String aprovação(){
      double media = calculaMedia();
      String status;
        if (media >=60) {
            status = "Aprovado";
        }else {
            status = "reprovado";
        }
        return status;
    }

    public int notaMaisAlta(){
        int maior = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] > maior) {
                maior = notas[i];

            }
        }
        return maior;
    }

    public int notaMaisBaixa(){
        int menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }
        return menor;
    }


    public void imprime(){
        System.out.println("=====================================");
        System.out.println("========= RESUMO DO ALUNO  ==========");
        System.out.println("=====================================");
        System.out.println("NOME: " + this.nome);
        System.out.println("Media: " + calculaMedia());
        System.out.println("Status: " + aprovação());
        System.out.println("NOTA MAIS ALTA: " + notaMaisAlta());
        System.out.println("NOTA MAIS BAIXA: " + notaMaisBaixa());
        System.out.println("=====================================");

    }


}
