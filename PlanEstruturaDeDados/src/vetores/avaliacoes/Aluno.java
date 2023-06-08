package vetores.avaliacoes;

public class Aluno {
	private String nome;
	private double media;
	
	public Aluno() {
	}
	
	public Aluno(String nome, double media) {
		this.nome = nome;
		this.media = media;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
}

