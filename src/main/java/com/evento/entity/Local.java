package com.evento.entity;

public class Local {
	
	public Local() {
		super();
	}
	public Local(String id_local, String correo_local, String telefono_local, String direccion, String distrito,
			String provincia, String departamento) {
		super();
		this.id_local = id_local;
		this.correo_local = correo_local;
		this.telefono_local = telefono_local;
		this.direccion = direccion;
		this.distrito = distrito;
		this.provincia = provincia;
		this.departamento = departamento;
	}
	public String getId_local() {
		return id_local;
	}
	public void setId_local(String id_local) {
		this.id_local = id_local;
	}
	public String getCorreo_local() {
		return correo_local;
	}
	public void setCorreo_local(String correo_local) {
		this.correo_local = correo_local;
	}
	public String getTelefono_local() {
		return telefono_local;
	}
	public void setTelefono_local(String telefono_local) {
		this.telefono_local = telefono_local;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getCodpk() {
		return codpk;
	}
	public void setCodpk(int codpk) {
		this.codpk = codpk;
	}
	private String id_local;
	private String correo_local;
	private String telefono_local;
	private String direccion;
	private String distrito;
	private String provincia;
	private String departamento;
	private int codpk;
}
