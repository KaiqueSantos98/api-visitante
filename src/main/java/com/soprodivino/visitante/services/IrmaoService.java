package com.soprodivino.visitante.services;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soprodivino.visitante.domain.Irmao;
import com.soprodivino.visitante.repositores.IrmaoRepository;

@Service
public class IrmaoService {
	
	@Autowired
	private IrmaoRepository irmaoRepository;
	
	public Irmao buscaIrmaoPorId(Integer id) {
		Optional<Irmao> irmao = irmaoRepository.findById(id);
		
		return irmao.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Irmao.class.getName(), null));
	}
}
