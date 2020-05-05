package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;


@Service
public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	EstudanteRepository repository;

	
	@Override
	public void cadastrarEstudante(@Valid Estudante estudante) {

	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {

	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return repository.findAll();
	}

	@Override
	public Estudante buscarEstudante(long id) {
		throw new IllegalArgumentException("Identificador inválido:" + id);
	}

}
