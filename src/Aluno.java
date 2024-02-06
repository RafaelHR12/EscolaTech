
public class Aluno {

	//Atributos:
	String nome;
	String senha;
	String email; //@
	String serie;

	//Métodos (funções):
	public String MostrarDados() {
		
		String dados = "Nome: " + nome +
				"\nE-mail: " + email;
		
		return dados;
	}
	
	public boolean VerificaEmail (String email) {
		if(email.contains("@"))
			this.email = email;
		else
			return false;
		return true;
	}
	
	public boolean VerificaSenha(String senha) {
		
		
		if ( senha.length() >= 6 )
			if (senha.matches("[a-zA-Z0-9]*") )
				return true;
		return false;
			
	}
	
}
