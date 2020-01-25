package com.soprodivino.visitante.services;

import java.util.List;
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
	
	public List<Irmao> getAll() {
		List<Irmao> irmaos = irmaoRepository.findAll();
		return irmaos;
	}
	
	public boolean save(List<Irmao> irmaos) {
		try {
			irmaoRepository.saveAll(irmaos);			
			return Boolean.TRUE;
		}catch(Exception e) {
			return Boolean.FALSE;
		}	
		
	}
	
	public boolean saveOne(Irmao irmao) {
		try {
			irmaoRepository.save(irmao);			
			return Boolean.TRUE;
		}catch(Exception e) {
			return Boolean.FALSE;
		}	
		
	}
}
