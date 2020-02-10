package com.soprodivino.visitante.resources.config;

import com.soprodivino.visitante.domain.Irmao;
import com.soprodivino.visitante.services.IrmaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PainelResource {

    @Autowired
    private IrmaoService irmaoService;

    @GetMapping("/painel")
    public ModelAndView lista(){
        List<Irmao> irmaos = irmaoService.getAll();
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("eventos", irmaos);

        return mv;
    }
}
