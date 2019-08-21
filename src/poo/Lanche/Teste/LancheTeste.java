package poo.Lanche.Teste;

import poo.Acompanhamento.Adicional;
import poo.Acompanhamento.Alface;
import poo.Acompanhamento.Mussarela;
import poo.Lanchonete.PaoBranco;

public class LancheTeste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adicional l1 = new Alface(new PaoBranco());
		System.out.println(l1);
		
		Adicional l2 = new Mussarela(new PaoBranco());
		System.out.println(l2);
	}

}
