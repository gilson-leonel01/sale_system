package com.mycompany.gilsonleonel220566.classes;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Usuario {
    int idUsuario;
    String usuario = "123", senha = "senha";
    
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    
    Usuario(){
        loginInfo.put(usuario, senha);
    }

    protected HashMap<String, String> getLoginInfo(){
        return loginInfo;
    }
    
    public void login() {
        if((usuario.equals(usuario) && (senha.equals(senha)))){
            JOptionPane.showMessageDialog(null, "Usuario: " + usuario + "\nLogado com sucesso!");
        }
    }    
}
