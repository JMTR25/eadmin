package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;

public class DocumentoRegistro extends Documento {
	private String dniInteresado;
	private String codigoRegistro;
	public DocumentoRegistro(Integer codigo, String nombre, Date fechaCreacion, Boolean publico,
			EstadoDocumento estado) {
		super(codigo, nombre, fechaCreacion, publico, estado);
		
		this.dniInteresado = dniInteresado;
		this.codigoRegistro = codigoRegistro;
		
		
	}

}
