package sistema;

import java.util.ArrayList;
import java.util.Scanner;


public class Main extends GerirConta 
{
	
	
	
	public static void main(String[] args) 
	{	
		Scanner ler= new Scanner(System.in);
		ArrayList<Pessoa> usuarios = new ArrayList<Pessoa> ();
		Pessoa pessoa1 = new Pessoa(0,"pessoa1","pessoa1@mail.com","12345678");
		usuarios.add(pessoa1);

				
		while(true)
		{
			System.out.println("selecione uma das opcoes\n");
			System.out.println("1 - para logar\n");
			System.out.println("2 - para criar uma conta\n");
			int opcao = ler.nextInt();
			if(opcao == 1) 
				logar(usuarios);
			else
				criarConta(usuarios.size() , usuarios);
			
			
		}	
	
	}

}
