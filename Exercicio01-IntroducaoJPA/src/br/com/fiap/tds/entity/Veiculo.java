package br.com.fiap.tds.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_VEICULO")
@SequenceGenerator(name = "veic", sequenceName = "SQ_T_VEICULO", allocationSize = 1)
//allicationSize ? o incremento da sequencia de 1 em 1
public class Veiculo {
	
	@Id
	@Column(name = "cd_veiculo")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "veic")
	private int codigo;
	
	@Column(name = "ds_placa", nullable = false, length = 9)
	private String placa;
	
	@Column(name = "ds_cor", nullable = false, length = 20)
	private String cor;
	
	@Column(name = "nr_ano")
	private int ano;


	//CTRL + 3 = gcuf
	
	public Veiculo() {}
	
	public Veiculo(String placa, String cor, int ano) {
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}// sem codigo pois vai ser gerado automaticamente

	public Veiculo(int codigo, String placa, String cor, int ano) {
		super();
		this.codigo = codigo;
		this.placa = placa;
		this.cor = cor;
		this.ano = ano;
	}
	
	//CRTL + 3 = ggas

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}



	
	
	


	
}
