package sistema;

import java.util.ArrayList;
import java.util.Scanner;


public class Main 
{
	
	
	public static  void logar(ArrayList<Pessoa> usuarios) 
	{
		Scanner ler= new Scanner(System.in);
		System.out.println("digite seu email\n");
		String emailLogar = ler.nextLine();
		System.out.println("digite sua senha\n");
		String senhaLogar = ler.nextLine();
		Pessoa usuarioLogado = null;
		for(int i = 0; i < usuarios.size(); i++)
		{	
			//Pessoa aux = usuarios.indexOf(i);
			if(usuarios.get(i).getEmail().equals(emailLogar) && usuarios.get(i).getSenha().equals(senhaLogar))
			{
				System.out.println("---------------------ok---------------");
			}
		}
		
	}

	public static void criarConta(int id,ArrayList<Pessoa> usuarios) 
	{
		Scanner ler= new Scanner(System.in);
		System.out.println("digite seu nome\n");
		String novoNome = ler.nextLine();
		System.out.println("digite seu email\n");
		String novoEmail = ler.nextLine();
		System.out.println("digite sua senha\n");
		String novaSenha = ler.nextLine();
		
		Pessoa novaPessoa = new Pessoa(id,novoNome,novoEmail,novaSenha);
		usuarios.add(novaPessoa);
		System.out.println("seja bem vindo "+ novoNome +", agora vc pode logar na sua conta\n\n\n");
		
		
		
	}
	
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
