package comandoPrimitivo;

import semantico.TipoDado;

public class PrimitivoAtribuicao extends ComandoPrimitivo{
	int referencia;
	TipoDado tipo;
	String expDestinoAssembler;
	
	public PrimitivoAtribuicao(int referencia, TipoDado tipo, String expDestinoAssembler){
		this.referencia = referencia;
		this.tipo = tipo;
		this.expDestinoAssembler = expDestinoAssembler;
	}
	
	public String geraCodigoDestino() {
		return this.expDestinoAssembler;
	}
	
	 public String toString() {
		 return "Atribuicao: ref "+this.referencia+" tipo "+this.tipo+" expDestinoAssembler "+this.expDestinoAssembler+"\n";
		 
	 }
	
}
