package br.com.fiap.tds.dao;

import java.sql.SQLException;

import br.com.fiap.tds.entity.Veiculo;

public interface VeiculoDao {
	
	void cadastrar(Veiculo veiculo) throws SQLException;
	
	void atualizar(Veiculo veiculo) throws SQLException;
	
	void remover(int codigo) throws SQLException;

}
