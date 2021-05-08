package br.com.fiap.tds.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="TB_CLIENTE")
@SequenceGenerator(name="cli", sequenceName = "SQ_TB_CLIENTE", allocationSize = 1)
public class Cliente {
			
		@Id
		@Column(name="cd_cliente")
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cli")
		private int codigo;
		
		@Column(name="nm_cliente", length = 50, nullable = false)
		private String nome;
		
		@Column(name="nr_cpf", length = 22)
		private String cpf;
		
		@Column(name="st_ativo")
		private boolean ativo;

		public Cliente() {}
		
		public Cliente(int codigo, String nome, String cpf, boolean ativo) {
			super();
			this.codigo = codigo;
			this.nome = nome;
			this.cpf = cpf;
			this.ativo = ativo;
		}

		public Cliente(String nome, String cpf, boolean ativo) {
			super();
			this.nome = nome;
			this.cpf = cpf;
			this.ativo = ativo;
		}


		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}

		public boolean isAtivo() {
			return ativo;
		}

		public void setAtivo(boolean ativo) {
			this.ativo = ativo;
		}
		
		


}
