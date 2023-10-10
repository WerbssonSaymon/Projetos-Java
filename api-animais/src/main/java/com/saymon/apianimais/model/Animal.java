package com.saymon.apianimais.model;

public class Animal {

    private Integer id;
    private String especie;
    private String nome;
    
    public Animal(){}
    public Animal(Integer id, String especie, String nome){
        this.id = id;
        this.especie = especie;
        this.nome = nome;
    }

    public String toString(){
        return "Pet{" +
                "especie='" + especie + '\'' +
                ", nome='" + nome + '\'' +
                 '}';
    }
    
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getEspecie(){
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    
}
