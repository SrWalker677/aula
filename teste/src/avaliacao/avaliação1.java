package avaliacao;

import java.util.Scanner;

public class avaliação1 {

	


	    public static void main(String[] args) {

	        Scanner aula = new Scanner(System.in);

	        Double mediaMelhor = 0.0;
	        String nomeMelhor = "";
	        Double mediaPior = 10.0;
	        String nomePior = "";

	        System.out.print("Quantos alunos deseja avaliar? ");   // atribuir um variavel que da quantidade de aluno
	        int quantidadeAlunos = aula.nextInt();
	        aula.nextLine(); // Limpa o buffer após nextInt()

	        for (int i = 1; i <= quantidadeAlunos; i++) {
	            System.out.println("--- Aluno " + i + " ---");

	            System.out.print("Qual o nome do aluno(a): ");
	            String nomeDoAluno = aula.nextLine();

	            System.out.print("Nota 1: ");
	            double nota1 = aula.nextDouble();

	            System.out.print("Nota 2: ");
	            double nota2 = aula.nextDouble();

	            System.out.print("Nota 3: ");
	            double nota3 = aula.nextDouble();

	            System.out.print("Nota 4: ");
	            double nota4 = aula.nextDouble();

	            aula.nextLine(); // Limpa o buffer depois de ler números

	            double media = (nota1 + nota2 + nota3 + nota4) / 4;

	            if (media >= 7) {
	                System.out.println("Situação: Aprovado (" + media + ")");
	            } else if (media >= 5) {
	                System.out.println("Situação: Recuperação (" + media + ")");
	            } else {
	                System.out.println("Situação: Reprovado (" + media + ")");
	            }

	            if (media > mediaMelhor) {                // indicar o melhor aluno
	                mediaMelhor = media;
	                nomeMelhor = nomeDoAluno;
	            }

	            if (media < mediaPior) {                  // indicar o pior aluno
	                mediaPior = media;
	                nomePior = nomeDoAluno;
	            }
	        }

	           
	        System.out.println("Melhor aluno(a): " + nomeMelhor + " com média " + mediaMelhor);            // resultado final, o 'print' é só para visualizar os resultador finais
	        System.out.println("Pior aluno(a): " + nomePior + " com média " + mediaPior);

	        aula.close();
	    }
	
}

