package com.tales.magalhaes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tales.magalhaes.model.Veiculo;
import com.tales.magalhaes.service.VeiculoService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping
@RequiredArgsConstructor
@Validated
public class VeiculoController {
  
    @Autowired
    private VeiculoService veiculoService;
    
    //Retorna todos os veiculos cadastrados
	@GetMapping(path = "/veiculos")
	public ResponseEntity<List<Veiculo>> listar() {
	    return new ResponseEntity<>(veiculoService.findAll(), HttpStatus.OK);
	}
	
	//Retorna a quantidade de veiculos nao vendidos
	@GetMapping(path = "/veiculos/naovendidos")
	public int naoVendidos() {
	    return veiculoService.naoVendidos();
	}
	
	//Retorna um veiculo por ID
	@GetMapping(path = "/veiculos/{id}")
	public ResponseEntity<Veiculo> buscar(@PathVariable("id") Long id) {
	    return new ResponseEntity<>(veiculoService.findById(id), HttpStatus.OK);
	}
	
	//Retorna os veiculos cadastratos entre duas datas
	@GetMapping(path = "/veiculos/decada")
	@ResponseBody
	public ResponseEntity<List<String>> findDecada() {
	    return new ResponseEntity<>(veiculoService.findDecada(), HttpStatus.OK);
	}
	
	//Retorna a quantidade de veiculos por marca
	@GetMapping(path = "/veiculos/marca")
	@ResponseBody
	public ResponseEntity<List<String>> findQtdMarca() {
		return new ResponseEntity<>(veiculoService.findQtdMarca(), HttpStatus.OK);
	}
	
	//Retorna os veiculos cadastrados na ultima semana
	@GetMapping(path = "/veiculos/ultimasemana")
	public ResponseEntity<List<Veiculo>> ultimaSemana() {
	    return new ResponseEntity<>(veiculoService.ultimaSemana(), HttpStatus.OK);
	}

	//Cria novos veiculos
    @PostMapping(path="/veiculos")
    public ResponseEntity<Veiculo> adicionar(@Validated @RequestBody Veiculo veiculo) {
        return new ResponseEntity<>(veiculoService.salvar(veiculo), HttpStatus.CREATED);
    }

    //Remove veiculos da lista
    @DeleteMapping(path = "/veiculos/{id}")
      public ResponseEntity<Veiculo> deletar(@PathVariable("id") Long id) {
	    veiculoService.deletar(id);
      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    
    //Atualiza TODOS os dados de um veiculo
    @PutMapping(path = "/veiculos/{id}")
    public ResponseEntity<Veiculo> editar(@Validated @RequestBody Veiculo veiculo, @PathVariable("id") Long id) {
      return new ResponseEntity<>(veiculoService.editar(veiculo), HttpStatus.OK);
    }
    
   
}
