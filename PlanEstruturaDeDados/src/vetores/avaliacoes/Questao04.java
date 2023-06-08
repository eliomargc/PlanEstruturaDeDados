package vetores.avaliacoes;

import java.util.ArrayList;

public class Questao04 {

	public static void main(String[] args) {
		ArrayList<Aluno> lista = new ArrayList<>();
		Aluno a1 = new Aluno("Chaves", 10);
		Aluno a2 = new Aluno("Quico", 5);
		Aluno a3 = new Aluno("Seu Madruga", 8);
		
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);

		double somaTurma = 0;
		
		for(Aluno a : lista) {
			System.out.println(a.getNome() + " - " + a.getMedia());
			somaTurma += a.getMedia();
		}
		
		double mediaTurma = somaTurma / lista.size();
		System.out.println("\nMédia da turma: " + mediaTurma);
		
	}

}
