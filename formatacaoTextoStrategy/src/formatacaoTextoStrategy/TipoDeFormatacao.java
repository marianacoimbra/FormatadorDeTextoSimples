package formatacaoTextoStrategy;

import Interface.Programa;
import formatacoes.CaixaAlta;
import formatacoes.CaixaBaixa;
import formatacoes.Italico;
import formatacoes.Negrito;

public enum TipoDeFormatacao {
	NEGRITO {

		@Override
		public Programa escolheFormato() {
			return new Negrito();
		}
	},

	ITALICO {

		@Override
		public Programa escolheFormato() {
			return new Italico();
		}
	},
	CAIXA_ALTA {
		@Override
		public Programa escolheFormato() {
			return new CaixaAlta();
		}
	},

	CAIXA_BAIXA {

		@Override
		public Programa escolheFormato() {
			return new CaixaBaixa();
		}

	};

	public abstract Programa escolheFormato();
}
