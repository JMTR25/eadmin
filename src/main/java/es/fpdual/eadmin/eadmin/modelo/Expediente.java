package es.fpdual.eadmin.eadmin.modelo;

import java.util.Date;
import java.util.List;

public class Expediente {
	private Integer codigo;
	private String nombre;
	private Date fechaCreacion;
	private Date fechaArchivado;
	private Boolean publico;
	private EstadoExpediente estado;

	private List<Documento> documentos;
      }
