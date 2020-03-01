package br.com.caelum.jdbc.teste;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteProcuraContato {
	public static void main(String[] args) {
		
		ContatoDao dao = new ContatoDao();
		
		Contato contato = dao.pesquisaContato(1);
		System.out.println(contato.getNome()+" "+contato.getEmail());
	}
}
