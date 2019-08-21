package poo.Acompanhamento;

import poo.Lanchonete.Pao;

public class Azeitona extends Adicional{
	public Azeitona(Pao pao) {
		super(pao);
	}

	@Override
	public double preco() {
		return 3.15+ pao.preco();
	}
	public String getDescricao() {
		return  pao.getDescricao() + ", azeitona";
	}
}
