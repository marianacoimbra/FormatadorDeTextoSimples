package formatacoes;

import Interface.Programa;

public class CaixaAlta implements Programa {

	@Override
	public String formataTexto(String texto) {
		return ("" + texto).toUpperCase();

	}

}
