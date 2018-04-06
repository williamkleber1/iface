package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class GerirConta 
{

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
	
	public static  void logar(ArrayList<Pessoa> usuarios) 
	{
		Scanner ler= new Scanner(System.in);
		System.out.println("digite seu email\n");
		String emailLogar = ler.nextLine();
		Pessoa usuarioLogado = null;
		for(int i = 0; i < usuarios.size(); i++)
		{	
			
			if(usuarios.get(i).getEmail().equals(emailLogar)  )
			{
				System.out.println("---------conta existente----------");
				System.out.println("digite sua senha\n");
				String senhaLogar = ler.nextLine();
				
				if(usuarios.get(i).getSenha().equals(senhaLogar))
				{
					iface(usuarios.get(i));
					break;
				}
				else
				{
					System.out.println("erro na senha, tente novamente");
					logar( usuarios );
				}
					
			 }
			
		 }
		
	}
	

	private static void logo_out(Pessoa usuario) 
	{
		
	}

	private static void ver_comunidades(Pessoa usuario) 
	{
		for (int i = 0; i < usuario.comunidades.size(); i++) 
		{
			System.out.println(usuario.comunidades.indexOf(i));
		}
		
	}

	private static void editar_dados(Pessoa usuario) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void procurar_pessoas(Pessoa usuario) 
	{
		// TODO Auto-generated method stub
		
	}

	private static void listar_amigos(Pessoa usuario) 
	{
		// TODO Auto-generated method stub
		
	}
	
	
	public static void iface(Pessoa usuario) 
	{
		while(true)
		{
			Scanner ler= new Scanner(System.in);
			System.out.println("-------------------------------SEJA BEM VINDO AO IFACE-------------------------------------");
			
			System.out.println("1 - amigos");
			System.out.println("2 - procurar pessoas");
			System.out.println("3 - seus dados");
			System.out.println("4 - comunidades");
			System.out.println("5 - logo out");
			int opcao = ler.nextInt();
			
			switch( opcao)
			 {
			    case 1:
			            listar_amigos(usuario);
			            break;
			    
			    case 2:
			            procurar_pessoas(usuario);
			            break;
			    
			    case 3:
			            editar_dados(usuario);
			            break;
			    case 4:
		            ver_comunidades(usuario);
		            break;
			            
			    default:
			           logo_out(usuario);
			           break;
			 }
		}
	}

	
	
}
