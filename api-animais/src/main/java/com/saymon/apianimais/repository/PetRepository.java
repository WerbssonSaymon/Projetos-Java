package com.saymon.apianimais.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.saymon.apianimais.model.Animal;

@Repository
public class PetRepository {
    
    public void save(Animal animal){
        if(animal.getId()==null)
            System.out.println("Salvo no repositorio");
        else 
            System.out.println("Atualizado no repositorio");     
        System.out.println(animal);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("Deletado/id - recebi o id: %d para excluir"));
        System.out.println(id);
    }

    public List<Animal> findAll(){
        System.out.println("Lista - listando os animais");
        List<Animal> animais = new ArrayList<Animal>();
        animais.add(new Animal(1, "Cachorro", "Rufus"));
        animais.add(new Animal(2, "Cachorro", "Scooby"));
        animais.add(new Animal(3, "Cachorro", "Lecy"));
        animais.add(new Animal(4, "Gato", "Garfield"));
        animais.add(new Animal(5, "Gato", "Tom"));
        animais.add(new Animal(6, "Papagaio", "Louro Jose"));
        return animais;
    }

    public Animal findById(Integer id){
        System.out.println(String.format("Pesquisando/id - recebi o id: %d para consulta"));
        return new Animal(id, "Cachorro", "Rufus");
    }
}
