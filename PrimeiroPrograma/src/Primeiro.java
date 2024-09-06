import javax.swing.*;

public class Primeiro {
    public static void main(String[] args) {
        System.out.println("Ola mundo!");
        int idade = 18;
        String nome = "Tiburso";
        Double salario = 1.99;
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);

        /*
            Crie variaveis que receberá as notas
            dos dois bimestres de alunos, e
            exiba a média deste aluno

         */
        Double nota1 = 5.0;
        Double nota2 = 7.8;
        Double media = (nota1 + nota2) / 2;
        System.out.println(media);

        /*
        armazene as informações de nome
        e telefone de uma pessoa, e imprima
        as duas na mesma linha
        (use concatenacao)
        ex: Tiburso - (46)98854-05132
         */
        System.out.println(salario + " - " + idade);
    }
}
