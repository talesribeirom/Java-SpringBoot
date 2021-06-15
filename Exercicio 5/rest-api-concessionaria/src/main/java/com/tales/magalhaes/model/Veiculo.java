package com.tales.magalhaes.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Veiculo {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	Long Id;
	
	@Column(name="veiculo", nullable = false, length = 20)
	@JsonProperty(value = "veiculo")
	String Veiculo;
	
	@Column(name="marca", nullable = false, length = 20)
	@JsonProperty(value = "marca")
	String Marca;
	
	@Column(name="ano", nullable = false, length = 4)
	@JsonProperty(value = "ano")
	Integer Ano;
	
	@Column(name="descricao", nullable = true, length = 100)
	@JsonProperty(value = "descricao")
	String Descricao;
	
	@Column(name="vendido", nullable = false)
	@JsonProperty(value = "vendido")
	Boolean Vendido;
	
	@Column(name="criado")
	@JsonProperty(value = "criado", access = JsonProperty.Access.READ_ONLY)
	@CreationTimestamp
	Date Criado;
	
	@Column(name="atualizado")
	@JsonProperty(value = "atualizado", access = JsonProperty.Access.READ_ONLY)
	@UpdateTimestamp
	Date Atualizado;
}
