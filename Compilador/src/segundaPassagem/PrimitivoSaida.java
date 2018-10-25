package segundaPassagem;

import semantico.TipoDado;

public class PrimitivoSaida extends ComandoPrimitivo{
	
	private String expDestinoAssembler;
	TipoDado tipo;
	
	public PrimitivoSaida(TipoDado _tipo, String _expDestinoAssembler) {
		this.tipo=_tipo;
		this.expDestinoAssembler=_expDestinoAssembler;		
	}
	
	public String geraCodigoDestino() {
		String saida="";
		saida += "getstatic java/lang/System/out Ljava/io/PrintStream;\r\n";
		saida += this.expDestinoAssembler;
		saida += "invokevirtual java/io/PrintStream/println(D)V\r\n";
		return saida;
	}

	public String toString() {
		return "Comando Saida : " + "-" + this.tipo + "-" + this.expDestinoAssembler;
	}

}
