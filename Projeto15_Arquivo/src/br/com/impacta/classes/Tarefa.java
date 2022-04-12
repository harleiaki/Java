package br.com.impacta.classes;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class Tarefa {
	
	private Date date;
	private String descricao;
	private int duracao;
	
	public Tarefa(Date date, String descricao, int duracao) {
		super();
		this.setDate(date);
		this.setDescricao(descricao);
		this.setDuracao(duracao);
	}
	
	
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}


	@Override
	public String toString() {
		
		String data = new SimpleDateFormat("dd/MM/yyyy").format(this.getDate());
		
		
		Formatter fmt = new Formatter();
		String resposta = fmt.format("%10s %-30s %8d%n", 
				data, 
				this.getDescricao(), 
				this.getDuracao()).toString();
		
		fmt.close();
		
		return resposta;
	}
	
	
	
	
	

}
