
public class Curso {

	//Atributos:
	String nome;
	String periodo;
	String area;
	String responsavel;
	
	//Métodos (funções):
	public String RetornarDados() {
		
		String dadosCurso = "Nome do Curso: " + nome + 
		"\nPeríodo de duração: " + periodo +
				"\nÁrea de conhecimento: " + area + 
				"\nResponsável pelo Curso: " + responsavel;
		
		return dadosCurso;
	}

	
	
}
