import java.util.Scanner;

public class Principal {

	public static void main (String[] args ) {
		
		System.out.println( "\n Informe o nome do aluno: " );
		Scanner teclado = new Scanner (System.in);
		
		//Criar um objeto da classe Aluno:
		Aluno aluno1 = new Aluno();
		
		//Atribuindo o dado ao nome, senha, email:
		aluno1.nome = teclado.nextLine();
		//Mais de 6 caracteres, números, maiúscula, minúscula
		System.out.println( " Informe a senha: " );
		
		while (!aluno1.VerificaSenha(teclado.nextLine())) {
			System.out.println( " Informe a senha novamente: " );
		}
		
		aluno1.senha = teclado.nextLine();
		System.out.println( " Informe o E-mail: " );
		// aluno1.email = teclado.nextLine();
		//Perguntar e-mail novamente

		while (!aluno1.VerificaEmail(teclado.nextLine())) {
			System.out.println( " Informe o E-mail novamente: " );
		}
		
		
		System.out.println(aluno1.MostrarDados());
		
		
	}
}
