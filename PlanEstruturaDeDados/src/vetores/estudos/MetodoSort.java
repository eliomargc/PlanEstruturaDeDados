package vetores.estudos;

import java.util.*;

import vetores.model.Aluno;


/*
 * treinando o método sort com objetos
 */
public class MetodoSort {

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Maria");
		nomes.add("João");
		nomes.add("Ana");
		nomes.add("Pedro");
		nomes.add("Lucas");

		//Para ordenar string é simplesmente invocar o método sort
		Collections.sort(nomes);
		System.out.println(nomes);
		
		Aluno a1 = new Aluno("Maria");
		Aluno a2 = new Aluno("João");
		Aluno a3 = new Aluno("Ana");
		Aluno a4 = new Aluno("Pedro");
		Aluno a5 = new Aluno("Lucas");
		
		ArrayList<Aluno> alunos = new ArrayList<>(Arrays.asList(a1,a2,a3,a4,a5));
		
		//Já para ordenar seus objetos, tem que implementar a interface Comparable na classe, e adaptar o método compareTo 
		//Collections.sort(alunos);
		//System.out.println(alunos);
		
		//ou implementar um compatator e invocar o método sort passando o comparator
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
