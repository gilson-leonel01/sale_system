package com.mycompany.gilsonleonel220566.telas.login;

import java.util.HashMap;

public class UsuarioSenha {
    HashMap<String, String> loginInfo = new HashMap<String, String>();
    UsuarioSenha(){
        loginInfo.put("usuario", "senha");
        loginInfo.put("joao", "123");
    }

    public HashMap<String, String> getLoginInfo(){
        return loginInfo;
    }
}
