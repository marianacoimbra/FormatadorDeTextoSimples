package formatacaoTextoStrategy;

import Interface.Programa;

public class Formatador {

	public Formatador() {
	}

	public String formata(String texto, Programa tipo) {
		return tipo.formataTexto(texto);
	}
}
