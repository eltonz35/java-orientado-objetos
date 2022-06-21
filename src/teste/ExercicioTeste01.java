package teste;

import dominio.Exercicio01;

public class ExercicioTeste01 {
    public static void main(String[] args) {
        Exercicio01 estudante01 = new Exercicio01();
        Exercicio01 estudante02 = new Exercicio01();

        estudante01.matricula = 903840;
        estudante01.nome = "Elton";
        estudante01.nota1 = 7.00f;
        estudante01.nota2 = 7.00f;
        estudante01.notaTrabalho = 8.00f;


        estudante02.matricula = 904663;
        estudante02.nome = "João";
        estudante02.nota1 = 3.00f;
        estudante02.nota2 = 9.00f;
        estudante02.notaTrabalho = 4.00f;

        estudante01.calculaMedia();


        System.out.println();

        estudante02.calculaMedia();



    }
}
