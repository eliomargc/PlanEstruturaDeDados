package vetores.estudos;

import java.util.*;

import vetores.model.Aluno;


/*
 * treinando o m�todo sort com objetos
 */
public class MetodoSort {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("Jo�o");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Lucas");

		//Para ordenar string � simplesmente invocar o m�todo sort
		Collections.sort(nomes);
		System.out.println(nomes);
		
		Aluno a1 = new Aluno("Maria");
		Aluno a2 = new Aluno("Jo�o");
		Aluno a3 = new Aluno("Ana");
		Aluno a4 = new Aluno("Pedro");
		Aluno a5 = new Aluno("Lucas");
		
		ArrayList<Aluno> alunos = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5));
		
		//J� para ordenar seus objetos, tem que implementar a interface Comparable na classe, e adaptar o m�todo compareTo 
		//Collections.sort(alunos);
		//System.out.println(alunos);
		
		//ou implementar um compatator e invocar o m�todo sort passando o comparator
		Comparator<Aluno> comp = new Comparator<Aluno>() {
			@Override
			public int compare(Aluno o1, Aluno o2) {
				return o1.getNome().compareToIgnoreCase(o2.getNome());
			}
		};
		
		Collections.sort(alunos, comp);
		System.out.println(alunos);
		
		
	}

}
