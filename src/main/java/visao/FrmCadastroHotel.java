package visao;

import dao.hotel.HotelDAOMySQL;
import modelo.Hotel;
import dao.hotel.HotelDAO;

public class FrmCadastroHotel extends javax.swing.JFrame {

    public FrmCadastroHotel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jTFCidade = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFQuartos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTFValorDiaria = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        JBTSair = new javax.swing.JButton();
        JBTLimpar = new javax.swing.JButton();
        jBTSalvar = new javax.swing.JButton();
        jBTExcluir = new javax.swing.JButton();
        JBTAlterar = new javax.swing.JButton();
        JBTListar = new javax.swing.JButton();
        jTFEstrelas = new javax.swing.JTextField();
        JBTReajustar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Dados de Hotel");

        jLabel2.setText("Nome:");

        jTFNome.setName("JTFNome"); // NOI18N

        jTFCidade.setName("JTFNome"); // NOI18N

        jLabel3.setText("Cidade:");

        jLabel4.setText("Número de Quartos:");

        jTFQuartos.setName("JTFNome"); // NOI18N

        jLabel5.setText("Valor diária:");

        jTFValorDiaria.setName("JTFNome"); // NOI18N

        jLabel6.setText("Número estrelas:");

        JBTSair.setText("Sair");
        JBTSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTSairActionPerformed(evt);
            }
        });

        JBTLimpar.setText("Limpar");
        JBTLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTLimparActionPerformed(evt);
            }
        });

        jBTSalvar.setText("Salvar");
        jBTSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTSalvarActionPerformed(evt);
            }
        });

        jBTExcluir.setText("Excluir");
        jBTExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTExcluirActionPerformed(evt);
            }
        });

        JBTAlterar.setText("Alterar");
        JBTAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTAlterarActionPerformed(evt);
            }
        });

        JBTListar.setText("Listar");
        JBTListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTListarActionPerformed(evt);
            }
        });

        jTFEstrelas.setName("JTFNome"); // NOI18N

        JBTReajustar.setText("Reajustar");
        JBTReajustar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTReajustarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTFCidade, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(JBTAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                                .addComponent(JBTListar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBTSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                                .addComponent(JBTReajustar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(JBTLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(JBTSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(jBTExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {JBTAlterar, JBTLimpar, JBTListar, JBTSair, jBTExcluir, jBTSalvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jBTSalvar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(JBTListar)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBTAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBTExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTReajustar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jTFCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBTLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JBTSair))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTFQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFValorDiaria, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEstrelas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_JBTSairActionPerformed

    private void JBTLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTLimparActionPerformed
        hotelid = -1;
        jTFQuartos.setText("");
        jTFCidade.setText("");
        jTFValorDiaria.setText("");
        jTFEstrelas.setText("");
        jTFNome.setText("");
    }//GEN-LAST:event_JBTLimparActionPerformed

    private void jBTSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTSalvarActionPerformed
        if (!jTFNome.getText().equals("")) {
            Hotel hotel = new Hotel();
            if (hotelid != -1) {
                hotel.setHotelId(hotelid);
            }
            hotel.setNome(jTFNome.getText());
            hotel.setCidade(jTFCidade.getText());
            hotel.setQuartos(Integer.parseInt(jTFQuartos.getText()));
            hotel.setValorDiaria(Double.parseDouble(jTFValorDiaria.getText()));
            hotel.setEstrelas(Integer.parseInt(jTFEstrelas.getText()));

            HotelDAO hoteldao = new HotelDAOMySQL();
            if (hoteldao.salvar(hotel)) {
                javax.swing.JOptionPane.showMessageDialog(null, "Hotel cadastrado com suscesso!");
            } else {
                javax.swing.JOptionPane.showMessageDialog(null, "Hotel não cadastrado!");
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "O Nome deve ser preenchido!");
            jTFNome.requestFocus();
        }
    }//GEN-LAST:event_jBTSalvarActionPerformed

    private void JBTListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTListarActionPerformed
        //this.setVisible(false);
        new FrmHotelListar().setVisible(true);
    }//GEN-LAST:event_JBTListarActionPerformed

    private void jBTExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTExcluirActionPerformed
        String id = javax.swing.JOptionPane.showInputDialog("Digite o id a ser excluído");
        HotelDAO hoteldao = new HotelDAOMySQL();
        Hotel hotel = hoteldao.consultarPK(Integer.parseInt(id));
        if (hotel != null) {
            jTFNome.setText(hotel.getNome());
            jTFCidade.setText(hotel.getCidade());
            jTFQuartos.setText(hotel.getQuartos() + "");
            jTFValorDiaria.setText(hotel.getValorDiaria() + "");
            jTFEstrelas.setText(hotel.getEstrelas() + "");
            Object[] opcoes = {"Sim", "Não"};
            int resposta = javax.swing.JOptionPane.showOptionDialog(null, "Confirma a exclusão do Hotel?", "Exclusão", 0, javax.swing.JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[1]);
            if (resposta == 0) {
                if (hoteldao.apagarPK(Integer.parseInt(id))) {
                    javax.swing.JOptionPane.showMessageDialog(null, "Hotel excluído com suscesso!");
                    jTFQuartos.setText("");
                    jTFCidade.setText("");
                    jTFValorDiaria.setText("");
                    jTFEstrelas.setText("");
                    jTFNome.setText("");
                } else {
                    javax.swing.JOptionPane.showMessageDialog(null, "Hotel não excluído!");
                }
            }
        }
    }//GEN-LAST:event_jBTExcluirActionPerformed

    private void JBTAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTAlterarActionPerformed
        String id = javax.swing.JOptionPane.showInputDialog("Digite o id a ser alterado");
        HotelDAO hoteldao = new HotelDAOMySQL();
        Hotel hotel = hoteldao.consultarPK(Integer.parseInt(id));
        if (hotel != null) {
            hotelid = hotel.getHotelId();
            jTFNome.setText(hotel.getNome());
            jTFCidade.setText(hotel.getCidade());
            jTFQuartos.setText(hotel.getQuartos() + "");
            jTFValorDiaria.setText(hotel.getValorDiaria() + "");
            jTFEstrelas.setText(hotel.getEstrelas() + "");
        }
    }//GEN-LAST:event_JBTAlterarActionPerformed

    private void JBTReajustarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTReajustarActionPerformed
        double percentual = Double.parseDouble(javax.swing.JOptionPane.showInputDialog("Digite o percentual de reajuste do \nvalor da diária"));
        HotelDAO hoteldao = new HotelDAOMySQL();
        int resultado = hoteldao.reajuste(percentual);
        if (resultado != 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Foram reajustados o valor da diária de " + resultado + " Hoteis(s)!");
        } else {
            javax.swing.JOptionPane.showMessageDialog(null, "Nenhum Hotel foi reajustado!");
        }
    }//GEN-LAST:event_JBTReajustarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroHotel().setVisible(true);
            }
        });
    }
    private int hotelid = -1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTAlterar;
    private javax.swing.JButton JBTLimpar;
    private javax.swing.JButton JBTListar;
    private javax.swing.JButton JBTReajustar;
    private javax.swing.JButton JBTSair;
    private javax.swing.JButton jBTExcluir;
    private javax.swing.JButton jBTSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTFCidade;
    private javax.swing.JTextField jTFEstrelas;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFQuartos;
    private javax.swing.JTextField jTFValorDiaria;
    // End of variables declaration//GEN-END:variables
}
