package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		List<Funcionario> funcionarios = new ArrayList<>();
		
		Funcionario f;
		
		System.out.print("Digite a qtde de funcionários que serão cadastrados: ");
		int qtde = sc.nextInt();
		
		for (int i = 0; i < qtde; i ++) {
			
			System.out.print("Digite o id: ");
			int id = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Digite o nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Digite o salario: ");
			double salario = sc.nextDouble();
			
			funcionarios.add(new Funcionario(id, nome, salario));
		}
		
		System.out.println();
		System.out.print("Digite o id do funcionario que recebrá aumento de salario: ");
		int id_aumento = sc.nextInt();
		
		f = funcionarios.stream().filter(x -> x.getId() == id_aumento).findFirst().orElse(null);
		
		if (f == null) {
			System.out.println("Id " + Integer.toString(id_aumento) + " não foi econtrado");
			sc.close();
			return;
		}
		
		System.out.print("Digite a porcentagem do automento: ");
		f.aumentarSalario(sc.nextDouble());
		
		for (Funcionario func : funcionarios) {
			
			System.out.println(func.toString());
		}
		
	}

}
