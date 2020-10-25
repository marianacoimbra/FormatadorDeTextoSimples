package formatacoes;

import Interface.Programa;

public class Negrito implements Programa {

	@Override
	public String formataTexto(String texto) {
		return "\033[1m" + texto + "\033[1m";

	}

}
