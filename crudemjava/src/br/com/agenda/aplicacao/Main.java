package br.com.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		//Todas as fun��es est�o dispon�veis, apenas precisa remover // para habilitar a fun��o desejada
		//Criar o contato
		ContatoDAO contatoDao = new ContatoDAO();
		
		Contato contato = new Contato();
		contato.setNome("Jo�o D�as");
		contato.setIdade(20);
		contato.setDataCadastro(new Date());
		
		//contatoDao.save(contato);
		
		//Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Jo�o D�as Machado");
		c1.setIdade(20);
		c1.setDataCadastro(new Date());
		c1.setId(7);//� o n�mero que est� no banco de dados da PK
		
		//contatoDao.update(c1);
		
		//Deletar o contato pelo seu n�mero de ID
		
		//contatoDao.deleteByID();
		
		//Visualiza��o dos registros do banco de dados TODOS
	
		for(Contato c : contatoDao.getContatos()) {
			System.out.println("Contato:"+c.getNome());
		}
	}

}
