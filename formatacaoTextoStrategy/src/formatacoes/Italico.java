package formatacoes;

import Interface.Programa;

public class Italico implements Programa {

	@Override
	public String formataTexto(String texto) {
		return "\033[3m" + texto + "\033[0m";

	}

}
