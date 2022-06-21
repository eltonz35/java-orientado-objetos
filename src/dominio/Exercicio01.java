/*
Escreva uma classe cujos objetos representam alunos matriculados em uma disciplina. Cada objeto
dessa classe deve guardar os seguintes dados do aluno: matrícula, nome, 2 notas de prova e 1 nota de
trabalho. Escreva os seguintes métodos para esta classe:

media: calcula a média final do aluno (cada prova tem peso 2,5 e o trabalho tem peso 2).
final: calcula quanto o aluno precisa para a prova final (retorna zero se ele não for para a final).
 */
package dominio;

public class Exercicio01 {
    public int matricula;
    public String nome;
    public float nota1;
    public float nota2;
    public float notaTrabalho;


    public void calculaMedia() {
        float media = ((nota1 * 2.50f) + (nota2 * 2.50f) + (notaTrabalho * 2.00f)) / 7.00f;
        System.out.println("A media do aluno(a) " + nome + " é " + media);
        System.out.println();

        float notaFinal = 7.00f - media;

        if (media >= 7.00) {
            System.out.println("O aluno não vai pra final");
        } else {
            System.out.println("O aluno está na final e precisa de " + notaFinal + " para ser aprovado");
        }

    }

}
