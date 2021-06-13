package com.tales.magalhaes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.tales.magalhaes.model.Veiculo;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long>{
	
	//Query para buscar entre as datas
	@Query(value ="SELECT (FLOOR(year(v.criado) / 10) * 10) AS Decada, COUNT(id) AS Quantidade FROM Veiculo v GROUP BY FLOOR(year(v.criado)/ 10)", nativeQuery = true)
	public List<String> findDecada();
	
	//Query para checar veiculos nao vendidos
	@Query(value = "SELECT COUNT(vendido) FROM Veiculo v WHERE v.vendido = 0", nativeQuery = true)
	public int naoVendidos();
	
	//Query para buscar veiculos adicionados recentemente
	@Query(value = "SELECT * FROM Veiculo v WHERE v.criado >= curdate() - INTERVAL DAYOFWEEK(curdate())+6 DAY", nativeQuery = true)
	public List<Veiculo> ultimaSemana();
	
	//Buscar quantidade de veiculos por marca
	@Query(value = "SELECT v.marca as Marca, COUNT(v.id) AS Quantidade FROM Veiculo v GROUP BY v.marca", nativeQuery = true)
	public List<String> findQtdMarca();
}
