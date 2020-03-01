package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TesteAltera {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setNome("Alura");
		contato.setEmail("alura@gmail.com");
		contato.setEndereco("Rua Jacinto manto");
		contato.setDataNascimento(Calendar.getInstance());
		contato.setId((long) 1);
		
		ContatoDao dao = new ContatoDao();
		dao.altera(contato);
		System.out.println("Contato alterado com sucesso!!!!!");
		
	}
}
