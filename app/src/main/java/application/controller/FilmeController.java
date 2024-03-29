package application.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import application.repository.FilmeRepository;

@RestController
public class FilmeController {

    @Autowired
    FilmeRepository filmeRepo;

    @GetMapping("/filme")
    public List<Filme> listarFilmes(){
        return filmeRepo.findAll();
    }
    
}