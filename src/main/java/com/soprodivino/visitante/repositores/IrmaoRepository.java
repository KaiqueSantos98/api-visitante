package com.soprodivino.visitante.repositores;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.soprodivino.visitante.domain.Irmao;

@Repository
public interface IrmaoRepository extends JpaRepository<Irmao, Integer>{

}
