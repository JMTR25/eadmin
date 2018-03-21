package es.fpdual.eadmin.eadmin.modelo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Date;

public class TestDocumento {
	private static final Date FECHA_CREACION = new Date();
	private static final String NOMBRE_DOCUMENTO = "Nombre";
	private static final boolean DOCUMENTO_PUBLICO = true;
	private static final Integer CODIGO_DOCUMENTO = 1;

	Documento doc;
	@Before
	public void inicializar() {
		doc = new Documento(CODIGO_DOCUMENTO, "nombre", FECHA_CREACION, true, EstadoDocumento.ACTIVO);
	}
	@Test
	public void deberiaComprobarGetter() {
		assertEquals(CODIGO_DOCUMENTO, doc.getCodigo());
		assertEquals(NOMBRE_DOCUMENTO, doc.getNombre());
		assertEquals(FECHA_CREACION, doc.getFechaCreacion());
		assertEquals(DOCUMENTO_PUBLICO, doc.getPublico());
		assertEquals(EstadoDocumento.ACTIVO, doc.getEstado());
	}
	@Test
	public void deberiaDevolverTrueSiTienenIgualCodigo() {
		final Documento documento2 = new Documento(CODIGO_DOCUMENTO, null, null, null, null);
		final Boolean resultado = documento2.equals(doc);
		assertFalse(resultado); 
	}

}
