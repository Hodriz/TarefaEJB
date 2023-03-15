/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.model;

import java.util.Random;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Data;

/**
 *
 * @author Rodrigo
 */
@Data
@Named(value = "randomNum")
@RequestScoped
public class RandomNum {
    
   Random gerador=new Random();
   private int numA=gerador.nextInt(5000);
   private int numB=gerador.nextInt(5000);
   private int total;
    
    public int total(){
    int total=numA+numB;

    return total;
    }
    
}
