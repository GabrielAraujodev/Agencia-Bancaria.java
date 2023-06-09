public class PESSOA {
    private static int counter = 1;
	
	
	private  String nome;
	private  String cpf;
	private  String email;
	public Pessoa(String nome, String cpf, String email) {
		counter +=1;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		
		return "\nNOME :" + this.getNome() +
				"\nCPF :" + this.getCpf() +
				"nEMAIL:"+  this.getEmail();
	}
	
}
