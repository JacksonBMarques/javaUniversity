import Dominio.Student;



public class Main {
    public static void main(String[] args) {

        Student aluno = new Student();
        aluno.setNome("breno");
        aluno.setNotas(new int[]{80,80,90});

        aluno.imprime();


    }

}