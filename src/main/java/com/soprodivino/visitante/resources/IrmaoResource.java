package com.soprodivino.visitante.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soprodivino.visitante.domain.Irmao;
import com.soprodivino.visitante.services.IrmaoService;

@RestController	
@RequestMapping(value="/irmaos")
public class IrmaoResource {
		
		@Autowired
		private IrmaoService irmaoService;
		
		@GetMapping("")
		public ResponseEntity<?> getAll() {
			List<Irmao> all = irmaoService.getAll();		
			
			return ResponseEntity.ok().body(all);
		}	
		
		
		@PostMapping("/save")
		public ResponseEntity<?> save(@RequestBody List<Irmao> irmaos){
			boolean result = irmaoService.save(irmaos);		
			
			return ResponseEntity.ok().body(result);			
		}
		
		@PostMapping("/saveOne")
		public ResponseEntity<?> saveOne(@RequestBody Irmao irmao){
			boolean result = irmaoService.saveOne(irmao);		
			
			return ResponseEntity.ok().body(result);			
		}
}
