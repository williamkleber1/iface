package sistema;
import java.util.ArrayList;
import java.util.Scanner;

public class Pessoa 
{
	public int id;
	public String nome;
	public String email;
	public String senha;
	ArrayList<Pessoa> amigos = new ArrayList<Pessoa> ();
	ArrayList<String> menssagens = new ArrayList<String> ();
	ArrayList<Comunidade> comunidades = new ArrayList<Comunidade> ();
	
	public Pessoa(int id,String nome,String email,String senha)
	{
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getNome() 
	{
		return nome;
	}
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
	public String getSenha() 
	{
		return senha;
	}
	public void setSenha(String senha) 
	{
		this.senha = senha;
	}
	
	public void adicionarAmigo(Pessoa pessoa) 
	{
		this.amigos.add(pessoa);
		pessoa.amigos.add(this);
	}
	public void enviarMenssagem(String msg, Pessoa pessoa) 
	{
		pessoa.menssagens.add(msg + "\n recebido de :" + this.nome +"\n" );
	}
	public void verMenssagens() 
	{
		for (int i = 0; i < this.menssagens.size(); i++)
		{
			System.out.println( this.menssagens.indexOf(i)) );
		}
	}
	
	public void removerAmigo(Pessoa pessoa)
	{
		this.amigos.remove(pessoa);
		pessoa.amigos.remove(this);
	}

}
