package es.fpdual.eadmin.eadmin.modelo;

import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

public class TestDocumentoContable {
	private static final Date FECHA_CREACION = new Date();
	private static final String NOMBRE_DOCUMENTO = "Nombre";
	private static final Boolean DOCUMENTO_PUBLICO = true;
	private static final Integer CODIGO_DOCUMENTO = 1;
	private static final BigDecimal IMPORTE_DOCUMENTO_CONTABLE = new BigDecimal(1.25);
	private static final String DNI_INTERESADO = "15404162-G";
	
	DocumentoContable doc;

	@Before
	public void inicializar() {
		doc = new DocumentoContable(CODIGO_DOCUMENTO, "nombre", FECHA_CREACION, true, EstadoDocumento.ACTIVO, IMPORTE_DOCUMENTO_CONTABLE,DNI_INTERESADO);
	}

	@Test
	public void deberiaComprobarGetter() {
		assertEquals(IMPORTE_DOCUMENTO_CONTABLE, doc.getImporte());
		assertEquals(DNI_INTERESADO, doc.getdniInteresado());
		
	}
	
	
}
