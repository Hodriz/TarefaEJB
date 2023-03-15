/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.model;

import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data
@Named(value = "usuario")
@RequestScoped
public class Usuario {
    private String nome;
    private int palpite;
    private List<String> nomes= new ArrayList<>();
    
    public String addNome(){
    nomes.add(nome);
    return "";
    }
    
    
}
