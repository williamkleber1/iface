package sistema;

import java.util.ArrayList;
public class Comunidade 
{
	public String nome;
	public String descricao;
	public Pessoa gerenciador;
	ArrayList<Pessoa> participantes = new ArrayList<Pessoa> ();
	
	public String getNome() 
	{
		return nome;
	}

	public void setNome(String nome) 
	{
		this.nome = nome;
	}

	public String getDescricao() 
	{
		return descricao;
	}

	public void setDescricao(String descricao) 
	{
		this.descricao = descricao;
	}

	

	public Comunidade(String nome,String descricao,Pessoa gerenciador) 
	{
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.gerenciador = gerenciador;
	}
	
	public void adicionar_membro(Pessoa gerenciador,Pessoa participante) 
	{
		if(gerenciador.nome.equals(this.gerenciador.nome) && gerenciador.senha.equals(this.gerenciador.senha))
		{
			this.participantes.add(participante);
			participante.comunidades.add(this);
		}
		
		else
			System.out.println("voce nao é o gerenciador");
		
			
	}
	

	

}
