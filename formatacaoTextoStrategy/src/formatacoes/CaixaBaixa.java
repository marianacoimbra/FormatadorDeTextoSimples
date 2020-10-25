package formatacoes;

import Interface.Programa;

public class CaixaBaixa implements Programa {

	@Override
	public String formataTexto(String texto) {
		return ("" + texto).toLowerCase();

	}

}
