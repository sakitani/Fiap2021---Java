package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "T_MOTORISTA")
public class Motorista {
	
	@Id
	@Column(name = "nr_carteira")
	private int carteira;
	
	@Column(name = "nm_motorista", nullable = false, length = 150)
	private String nome;
	
	@CreationTimestamp
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_nascimento")
	private Calendar dataNascimento;
	
	@Column(name = "fl_carteira")
	private byte[] foto;
	
	@Column(name = "ds_genero")
	private String genero;
	
	
	//CRTL + 3 = gcuf
	
	public Motorista() {}
	
	public Motorista(int carteira, String nome, Calendar dataNascimento, byte[] foto, String genero) {
		this.carteira = carteira;
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;		
	}

	public Motorista(String nome, Calendar dataNascimento, byte[] foto, String genero) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.foto = foto;
		this.genero = genero;
	}// sem codigo pois vai ser gerado automaticamente

	
	
	//CTRL + 3 = ggas

	public int getCarteira() {
		return carteira;
	}

	public void setCarteira(int carteira) {
		this.carteira = carteira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public byte[] getFoto() {
		return foto;
	}

	public void setFoto(byte[] foto) {
		this.foto = foto;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
	
}
