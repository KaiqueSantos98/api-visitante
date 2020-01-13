package com.soprodivino.visitante.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soprodivino.visitante.domain.Irmao;
import com.soprodivino.visitante.services.IrmaoService;

@RestController	
@RequestMapping(value="/irmaos")
public class IrmaoResource {
		
		@Autowired
		private IrmaoService irmaoService;
		
		@RequestMapping(value="/{id}", method = RequestMethod.GET)
		public ResponseEntity<?> buscaCategoriaPorId(@PathVariable Integer id) {
			
			Irmao irmao = irmaoService.buscaIrmaoPorId(id);
			
			return ResponseEntity.ok().body(irmao);
		}	
}
