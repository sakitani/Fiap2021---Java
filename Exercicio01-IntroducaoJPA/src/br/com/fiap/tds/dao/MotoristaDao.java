package br.com.fiap.tds.dao;

import java.sql.SQLException;

import br.com.fiap.tds.entity.Motorista;

public interface MotoristaDao {
	
	void cadastrar(Motorista motorista) throws SQLException;
	
	void atualizar(Motorista motorista) throws SQLException;
	
	void remover(int codigo) throws SQLException;

}
