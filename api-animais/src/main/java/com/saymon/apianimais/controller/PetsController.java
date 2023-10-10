package com.saymon.apianimais.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.saymon.apianimais.model.Animal;
import com.saymon.apianimais.repository.PetRepository;

@RestController
@RequestMapping("/animais")
public class PetsController {

    @Autowired
    private PetRepository repository;
    
    @GetMapping()
    public List<Animal> getAnimais(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Animal getOne(@PathVariable("id") Integer id){
        return repository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(Integer id){
        repository.deleteById(id);
    }

    @PostMapping()
    public void postPet(@RequestBody Animal animal){
        repository.save(animal);
    }
}
