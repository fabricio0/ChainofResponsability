package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Ovo extends Adicional{
	
	public Ovo(Pao pao) {
		super(pao);
	}

	public double preco() {
		return 1.72+ pao.preco();
	}
	
	public String getDescricao() {
		return  pao.getDescricao() + ", ovo";
	}
}
