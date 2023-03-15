/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package br.jsf;

import br.ejb.UsuarioBean;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Rodrigo
 */
@Named(value = "jsfUsuario")
@SessionScoped
public class JsfUsuario implements Serializable {

    /**
     * Creates a new instance of JsfUsuario
     */
    private UsuarioBean usuarioBean;
    
    public JsfUsuario() {
    
    }

    public UsuarioBean getUsuarioBean() {
        return usuarioBean;
    }

    public void setUsuarioBean(UsuarioBean usuarioBean) {
        this.usuarioBean = usuarioBean;
    }
    
       
    public String informarUsuario(){
    return "index";
    }
    
    
    
}
