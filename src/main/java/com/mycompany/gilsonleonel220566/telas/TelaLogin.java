package com.mycompany.gilsonleonel220566.telas;

import java.awt.Color;

public class TelaLogin extends javax.swing.JPanel {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        usuarioTxt = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        senhaTxt = new javax.swing.JLabel();
        campoSenha = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        alerta = new javax.swing.JLabel();

        usuarioTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        usuarioTxt.setText("Usuário:");

        senhaTxt.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        senhaTxt.setText("Senha:");

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(senhaTxt)
                            .addComponent(usuarioTxt)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoUsuario)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(alerta)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(usuarioTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(senhaTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(alerta)
                .addContainerGap(53, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        if(evt.getSource() == btnLogin){
            String nomeUsuario = campoUsuario.getText();
            String senhaUsuario = campoSenha.getText();
            
            String success = "Logado com sucesso";
            String failed = "Falhou o login";
            String emptyField = "Por favor, preenche todos os campos";

            if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
                alerta.setForeground(Color.RED);
                alerta.setText(emptyField);
                return;
            }

            if(1 == 1){
                alerta.setForeground(Color.RED);
                alerta.setText("Usuario inexistente!");
            } else{
                if(nomeUsuario.equals(senhaUsuario)){
                    alerta.setForeground(Color.GREEN);
                    alerta.setText(success);
                    
                    TelaPrincipal tp = new TelaPrincipal();
                    tp.setVisible(true);
                } else {
                    alerta.setForeground(Color.RED);
                    alerta.setText(failed);
                }
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed

public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaLogin().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alerta;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel senhaTxt;
    private javax.swing.JLabel usuarioTxt;
    // End of variables declaration//GEN-END:variables
}
