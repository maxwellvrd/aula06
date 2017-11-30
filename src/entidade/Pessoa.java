package entidade;

public  abstract class Pessoa {

	private String nome;
	private String email;
	private String telefone;
	
	// CTRL + ESPAÇO
	public Pessoa() {
		
	}
	
	// ALT + SHIFT + S + O
	public Pessoa(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	// ALT + SHIFT + S + S
	@Override
	public String toString() {
		return "Nome: " + nome + "\t\tEmail: " + email + "\tTelefone: " + telefone;
	}
	
	// ALT + SHIFT + S + R
	public String getNome() {
	return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
