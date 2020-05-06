package br.com.tokiomarine.seguradora.avaliacao.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nelioalves.cursomc.domain.Cliente;

import br.com.tokiomarine.seguradora.avaliacao.entidade.Estudante;
import br.com.tokiomarine.seguradora.avaliacao.repository.EstudanteRepository;


@Service
public class EstudanteServiceImpl implements EstudanteService {

	@Autowired
	EstudanteRepository repository;

	
	@Override
	@Transactional
	public void cadastrarEstudante(@Valid Estudante estudante) {

		repository.save(estudante);

	}

	@Override
	public void atualizarEstudante(@Valid Estudante estudante) {
		
		System.out.println(estudante);
		Estudante newObj = buscarEstudante(estudante.getId());
		updateData(newObj, estudante);
		System.out.println(newObj);

		repository.save(newObj);

	}

	@Override
	public List<Estudante> buscarEstudantes() {
		return repository.findAll();
	}

	@Override
	public Estudante buscarEstudante(long id) {
		
		Optional<Estudante> obj = repository.findById(id);
		
		return obj.orElseThrow(() -> 
		new IllegalArgumentException("Identificador inválido: " + id + ", Tipo: " + Estudante.class.getName()));

	}

	private void updateData(Estudante newObj, Estudante obj) {
		newObj.setNome(obj.getNome());
		newObj.setEmail(obj.getEmail());
		newObj.setTelefone(obj.getTelefone());
	}
	
}
