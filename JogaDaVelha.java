package calculadora;

public final class JogaDaVelha extends javax.swing.JFrame {

    boolean block0 = true;
    boolean block1 = true;
    boolean block2 = true;
    boolean block3 = true;
    boolean block4 = true;
    boolean block5 = true;
    boolean block6 = true;
    boolean block7 = true;
    boolean block8 = true;
    boolean jogador1 = true;
    boolean jogador2 = false;
    
    String Linha1, Linha2, Linha13, Coluna1, Coluna2, Coluna3, Diagonal1, Diagonal2;
    
    int a, b, ganhador, cont;
    
    int[][] matriz = new int[3][3];
    
    void velha(){
        
        if (jogador1){
            matriz[a][b] = 1;
            jogador1 = false;
            jogador2 = true;
        }else if (jogador2){
            matriz[a][b] = 2;
            jogador2 = false;
            jogador1 = true;
        }
    }
    
    void vencedor(){
        for(int x = 0; x < matriz.length; x++){
            if (matriz[x][0] == matriz[x][1] && matriz[x][0] == matriz[x][2] && matriz[x][0] != 0){
                ganhador = matriz[x][0];
                break;
            }    
        }
        for(int x = 0; x < matriz.length; x++){
            if (matriz[0][x] == matriz[1][x] && matriz[0][x] == matriz[2][x] && matriz[0][x] != 0){
                ganhador = matriz[0][x];
                break;
            }    
        }
        if (matriz[0][0] == matriz[1][1] && matriz[0][0] == matriz[2][2] && matriz[0][0] != 0){
                ganhador = matriz[0][0];
        }
        if (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0){
                ganhador = matriz[1][1];
        }
        
        if (ganhador == 1){
            System.out.println("Jogador 1 ganhou");
            jogador2 = false;
            jogador1 = false;
        }else if (ganhador == 2){
            System.out.println("Jogador 2 ganhou");
            jogador2 = false;
            jogador1 = false;
        }else if (cont == 9){
            System.out.println("Empate!");
            jogador2 = false;
            jogador1 = false;
        }
    }
    
    public JogaDaVelha() {
        initComponents();
        System.out.println("--Jogo da Velha--");
        Jogador.setText("Jogador 1"); 
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN0 = new javax.swing.JButton();
        BTN1 = new javax.swing.JButton();
        BTN2 = new javax.swing.JButton();
        BTN3 = new javax.swing.JButton();
        BTN4 = new javax.swing.JButton();
        BTN5 = new javax.swing.JButton();
        BTN6 = new javax.swing.JButton();
        BTN7 = new javax.swing.JButton();
        BTN8 = new javax.swing.JButton();
        Jogador = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN0ActionPerformed(evt);
            }
        });

        BTN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN1ActionPerformed(evt);
            }
        });

        BTN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN2ActionPerformed(evt);
            }
        });

        BTN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN3ActionPerformed(evt);
            }
        });

        BTN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN4ActionPerformed(evt);
            }
        });

        BTN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN5ActionPerformed(evt);
            }
        });

        BTN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN6ActionPerformed(evt);
            }
        });

        BTN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN7ActionPerformed(evt);
            }
        });

        BTN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN8ActionPerformed(evt);
            }
        });

        Jogador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogadorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN0, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(Jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTN6, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN7, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTN8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(Jogador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN0ActionPerformed
        
        if (block0){
            a = 0;
            b = 0;
            if (jogador1){
                BTN0.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN0.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block0 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN0ActionPerformed

    private void BTN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN1ActionPerformed
        if (block1){
            a = 0;
            b = 1;
            if (jogador1){
                BTN1.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN1.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block1 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN1ActionPerformed

    private void BTN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN2ActionPerformed
        if (block2){
            a = 0;
            b = 2;
            if (jogador1){
                BTN2.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN2.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block2 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN2ActionPerformed

    private void BTN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN3ActionPerformed
       if (block3){
            a = 1;
            b = 0;
            if (jogador1){
                BTN3.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN3.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block3 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN3ActionPerformed

    private void BTN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN4ActionPerformed
        if (block4){
            a = 1;
            b = 1;
            if (jogador1){
                BTN4.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN4.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block4 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN4ActionPerformed

    private void BTN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN5ActionPerformed
        if (block5){
            a = 1;
            b = 2;
            if (jogador1){
                BTN5.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN5.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block5 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN5ActionPerformed

    private void BTN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN6ActionPerformed
        if (block6){
            a = 2;
            b = 0;
            if (jogador1){
                BTN6.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN6.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block6 = false;
            cont += 1;
            vencedor();
            
        }
    }//GEN-LAST:event_BTN6ActionPerformed

    private void BTN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN7ActionPerformed
        if (block7){
            a = 2;
            b = 1;
            if (jogador1){
                BTN7.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN7.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block7 = false;
            cont += 1;
            vencedor();
            
        }    
    }//GEN-LAST:event_BTN7ActionPerformed

    private void BTN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN8ActionPerformed
        if (block8){
            a = 2;
            b = 2;
            if (jogador1){
                BTN8.setText("X");
                Jogador.setText("Jogador 2");
            }else if (jogador2){
                BTN8.setText("O");
                Jogador.setText("Jogador 1");
            }
            velha();
            block8 = false;
            cont += 1;
            vencedor();
            
        }  
    }//GEN-LAST:event_BTN8ActionPerformed

    private void JogadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogadorActionPerformed
        
        
        
        
    }//GEN-LAST:event_JogadorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JogaDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogaDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogaDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogaDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogaDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN0;
    private javax.swing.JButton BTN1;
    private javax.swing.JButton BTN2;
    private javax.swing.JButton BTN3;
    private javax.swing.JButton BTN4;
    private javax.swing.JButton BTN5;
    private javax.swing.JButton BTN6;
    private javax.swing.JButton BTN7;
    private javax.swing.JButton BTN8;
    private javax.swing.JTextField Jogador;
    // End of variables declaration//GEN-END:variables
}
