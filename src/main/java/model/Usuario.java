package model;

import javax.persistence.Entity;

import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "tb_usuarios")
@Data
public class Usuario {
	@Id
	private int cod_usua;
	private String nom_usua;
	private String ape_usua;
	private String usr_usua;
	private String cla_usua;
	private String fna_usua;
	private int idtipo;
	private int est_usua;
	@ManyToOne
	@JoinColumn(name="idtipo", insertable = false, updatable = false)
	private Tipo objTipo;
	
	@Override
	public String toString() {
		return "Usuario [cod_usua=" + cod_usua + ", nom_usua=" + nom_usua + ", ape_usua=" + ape_usua + ", usr_usua="
				+ usr_usua + ", cla_usua=" + cla_usua + ", fna_usua=" + fna_usua + ", idtipo=" + idtipo + ", est_usua="
				+ est_usua + "]";
	}
	public Usuario() {
		super();
	}
	public Usuario(int cod_usua, String nom_usua, String ape_usua, String usr_usua, String cla_usua, String fna_usua,
			int idtipo, int est_usua) {
		super();
		this.cod_usua = cod_usua;
		this.nom_usua = nom_usua;
		this.ape_usua = ape_usua;
		this.usr_usua = usr_usua;
		this.cla_usua = cla_usua;
		this.fna_usua = fna_usua;
		this.idtipo = idtipo;
		this.est_usua = est_usua;
	}
	public int getCod_usua() {
		return cod_usua;
	}
	public void setCod_usua(int cod_usua) {
		this.cod_usua = cod_usua;
	}
	public String getNom_usua() {
		return nom_usua;
	}
	public void setNom_usua(String nom_usua) {
		this.nom_usua = nom_usua;
	}
	public String getApe_usua() {
		return ape_usua;
	}
	public void setApe_usua(String ape_usua) {
		this.ape_usua = ape_usua;
	}
	public String getUsr_usua() {
		return usr_usua;
	}
	public void setUsr_usua(String usr_usua) {
		this.usr_usua = usr_usua;
	}
	public String getCla_usua() {
		return cla_usua;
	}
	public void setCla_usua(String cla_usua) {
		this.cla_usua = cla_usua;
	}
	public String getFna_usua() {
		return fna_usua;
	}
	public void setFna_usua(String fna_usua) {
		this.fna_usua = fna_usua;
	}
	public int getIdtipo() {
		return idtipo;
	}
	public void setIdtipo(int idtipo) {
		this.idtipo = idtipo;
	}
	public int getEst_usua() {
		return est_usua;
	}
	public void setEst_usua(int est_usua) {
		this.est_usua = est_usua;
	}
}
