package vetores.model;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{ 
    private String nome;

    public Aluno() {
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{"+nome+"}";
    }

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome);
	}

	@Override
	public int compareTo(Aluno outro) {
		return nome.compareToIgnoreCase(outro.getNome());
		
	}
    
    
    
}
