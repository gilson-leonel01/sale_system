package com.mycompany.gilsonleonel220566.telas.login;

import com.mycompany.gilsonleonel220566.telas.TelaPrincipal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class TelaLogin implements ActionListener {
    JFrame frame = new JFrame();
    JButton btnLogin = new JButton("Login");
    JTextField campoUsuario = new JTextField();
    JPasswordField campoSenha = new JPasswordField();
    JLabel usuarioLbl = new JLabel("Usuário: ");
    JLabel senhaLbl = new JLabel("Senha: ");
    JLabel alertaLbl = new JLabel();

    HashMap<String, String> loginInfo = new HashMap<String, String>();

    TelaLogin(HashMap<String, String> loginInfoOriginal) {
        loginInfo = loginInfoOriginal;

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

        usuarioLbl.setBounds(50,100,75,25);
        senhaLbl.setBounds(50,150,75,25);

        campoUsuario.setBounds(125,100,200,25);
        campoSenha.setBounds(125,150,200,25);

        btnLogin.setBounds(125,200,200,25);
        btnLogin.setFocusable(false);

        alertaLbl.setBounds(125,250,250,35);
        alertaLbl.setFont(new Font(null));

        frame.add(usuarioLbl);
        frame.add(senhaLbl);
        frame.add(alertaLbl);
        frame.add(campoUsuario);
        frame.add(campoSenha);
        frame.add(btnLogin);

        btnLogin.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnLogin){
            String usuario = campoUsuario.getText();
            String senha = String.valueOf(campoSenha.getPassword());
            
            String success = "Login efectuado com sucesso";
            String failed = "Falha no login";
            String emptyField = "Preencha todos campos";

            if(usuario.isEmpty() || senha.isEmpty()) {
                alertaLbl.setForeground(Color.RED);
                alertaLbl.setText(emptyField);
                return;
            }

            if(loginInfo.containsKey(usuario)){
                if(loginInfo.get(usuario).equals(senha)){
                    alertaLbl.setForeground(Color.GREEN);
                    alertaLbl.setText(success);
                    frame.dispose();
                    TelaPrincipal tp = new TelaPrincipal();
                    tp.setVisible(true);
                } else {
                    alertaLbl.setForeground(Color.RED);
                    alertaLbl.setText(failed);
                }
            } else{
                alertaLbl.setForeground(Color.RED);
                alertaLbl.setText("Usuário não encontrado!");
            }
        }
    }
}
