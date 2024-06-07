package com.mycompany.gilsonleonel220566.telas.login;

public class Login {
    public static void main(String[] args) {
        UsuarioSenha usuarioSenha = new UsuarioSenha();
        TelaLogin tl = new TelaLogin(usuarioSenha.getLoginInfo());
    }
}
