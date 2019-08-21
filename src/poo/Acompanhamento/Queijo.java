package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Queijo extends Adicional{
	
	public Queijo(Pao pao) {
		super(pao);
	}

	public double preco() {
		return 8.90 + pao.preco();
	}
	
	public String getDescricao() {
		return  pao.getDescricao() + ", queijo";
	}
}
