package com.mycompany.gilsonleonel220566.telas;

public class TelaComputador extends javax.swing.JFrame {

    public TelaComputador() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoDescricao = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        codigoTxt = new javax.swing.JLabel();
        polegadaTxt = new javax.swing.JLabel();
        campoPreco = new javax.swing.JTextField();
        campoPolegadas = new javax.swing.JTextField();
        campoCodigoP = new javax.swing.JTextField();
        tamanhoTxt = new javax.swing.JLabel();
        qtdTxt = new javax.swing.JLabel();
        btnCalcular = new javax.swing.JButton();
        nomeTxt = new javax.swing.JLabel();
        campoTamanho = new javax.swing.JTextField();
        campoQtd = new javax.swing.JTextField();
        precoTxt = new javax.swing.JLabel();
        campoNomeP = new javax.swing.JTextField();
        resultadoText_2 = new javax.swing.JScrollPane();
        campoResultado = new javax.swing.JTextArea();
        descricaoTxt = new javax.swing.JLabel();
        marcaTxt = new javax.swing.JLabel();
        computadorTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoDescricao.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        campoMarca.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        campoMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMarcaActionPerformed(evt);
            }
        });

        codigoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigoTxt.setText("Código do Produto:");
        codigoTxt.setMaximumSize(new java.awt.Dimension(100, 20));
        codigoTxt.setMinimumSize(new java.awt.Dimension(100, 20));

        polegadaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        polegadaTxt.setText("Polegadas:");

        campoPreco.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        campoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoPrecoActionPerformed(evt);
            }
        });

        campoPolegadas.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        campoCodigoP.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N
        campoCodigoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoPActionPerformed(evt);
            }
        });

        tamanhoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tamanhoTxt.setText("Tamanho:");

        qtdTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        qtdTxt.setText("Quantidade:");

        btnCalcular.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalcular.setText("CALCULAR");
        btnCalcular.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        nomeTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nomeTxt.setText("Nome do Produto:");

        campoTamanho.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        campoQtd.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        precoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precoTxt.setText("Preço:");

        campoNomeP.setFont(new java.awt.Font("SansSerif", 0, 17)); // NOI18N

        campoResultado.setBackground(new java.awt.Color(240, 240, 240));
        campoResultado.setColumns(20);
        campoResultado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        campoResultado.setRows(5);
        resultadoText_2.setViewportView(campoResultado);

        descricaoTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        descricaoTxt.setText("Descrição:");

        marcaTxt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        marcaTxt.setText("Marca:");

        computadorTxt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        computadorTxt.setText("COMPUTADOR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addComponent(campoNomeP)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(precoTxt)
                                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(128, 128, 128)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(qtdTxt)
                                    .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(campoDescricao)
                            .addComponent(resultadoText_2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(descricaoTxt)
                                .addGap(72, 72, 72))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(marcaTxt)
                                        .addGap(122, 122, 122))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(campoMarca)
                                        .addGap(34, 34, 34)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(polegadaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoPolegadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tamanhoTxt)
                                    .addComponent(campoTamanho)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(btnCalcular))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(computadorTxt)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(computadorTxt)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeTxt)
                    .addComponent(codigoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNomeP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodigoP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(polegadaTxt)
                    .addComponent(tamanhoTxt)
                    .addComponent(marcaTxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPolegadas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(precoTxt))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(qtdTxt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(descricaoTxt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(resultadoText_2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoMarcaActionPerformed
        
    }//GEN-LAST:event_campoMarcaActionPerformed

    private void campoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoPrecoActionPerformed
        
    }//GEN-LAST:event_campoPrecoActionPerformed

    private void campoCodigoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoPActionPerformed
        
    }//GEN-LAST:event_campoCodigoPActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int codigo = Integer.parseInt(campoCodigoP.getText());
        String nome = campoNomeP.getText();
        String marca = campoMarca.getText();
        int polegadas = Integer.parseInt(campoPolegadas.getText());
        String tamanho = campoTamanho.getText();
        double preco = Double.parseDouble(campoPreco.getText());
        int quantidade = Integer.parseInt(campoQtd.getText());
        String descricao = campoDescricao.getText();

        double total = preco * quantidade;

        String resultado = String.format("Código do produto: %d\nNome: %s\nMarca: %s\nPolegadas: %d\nTamanho: %s\nPreço: %.2f\nQtd: %d\nDescrição: %s\nTotal: %.2f kz",
            codigo, nome, marca, polegadas, tamanho, preco, quantidade, descricao, total);

        campoResultado.setText(resultado);
    }//GEN-LAST:event_btnCalcularActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new TelaComputador().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoCodigoP;
    private javax.swing.JTextField campoDescricao;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoNomeP;
    private javax.swing.JTextField campoPolegadas;
    private javax.swing.JTextField campoPreco;
    private javax.swing.JTextField campoQtd;
    private javax.swing.JTextArea campoResultado;
    private javax.swing.JTextField campoTamanho;
    private javax.swing.JLabel codigoTxt;
    private javax.swing.JLabel computadorTxt;
    private javax.swing.JLabel descricaoTxt;
    private javax.swing.JLabel marcaTxt;
    private javax.swing.JLabel nomeTxt;
    private javax.swing.JLabel polegadaTxt;
    private javax.swing.JLabel precoTxt;
    private javax.swing.JLabel qtdTxt;
    private javax.swing.JScrollPane resultadoText_2;
    private javax.swing.JLabel tamanhoTxt;
    // End of variables declaration//GEN-END:variables
}
