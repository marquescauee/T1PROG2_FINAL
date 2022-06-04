/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.acg.t1prog2.Views.Ginasio;

import com.acg.t1prog2.DAO.EsporteDAO;
import com.acg.t1prog2.DAO.GinasioDAO;
import com.acg.t1prog2.Exceptions.CampoVazioException;
import com.acg.t1prog2.Models.Esporte;
import com.acg.t1prog2.Models.Esportes.Basquete;
import com.acg.t1prog2.Models.Esportes.Futebol;
import com.acg.t1prog2.Models.Esportes.Natacao;
import com.acg.t1prog2.Models.Esportes.Volei;
import com.acg.t1prog2.Models.Ginasio;
import com.acg.t1prog2.Models.Mensalidade;
import com.acg.t1prog2.Models.Mensalidades.Mensal;
import com.acg.t1prog2.Models.Mensalidades.Semestral;
import com.acg.t1prog2.Models.Mensalidades.Trimestral;
import com.acg.t1prog2.Views.App;
import javax.swing.JOptionPane;

public class CadastrarGinasioView extends javax.swing.JFrame {

    private GinasioDAO ginasioDAO = new GinasioDAO();
    private EsporteDAO esporteDAO = new EsporteDAO();

    public CadastrarGinasioView() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNomeGinasio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfAnoCriacaoGinasio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTamanhoGinasio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEnderecoGinasio = new javax.swing.JTextField();
        btCadastrarGinasio = new java.awt.Button();
        jpEsportes = new javax.swing.JPanel();
        checkFutebol = new javax.swing.JCheckBox();
        checkBasquete = new javax.swing.JCheckBox();
        checkVolei = new javax.swing.JCheckBox();
        checkNatacao = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jpMensalidade = new javax.swing.JPanel();
        checkMensal = new javax.swing.JCheckBox();
        checkTrimestral = new javax.swing.JCheckBox();
        checkSemestral = new javax.swing.JCheckBox();
        checkAnual = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Ginásio");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Ano de criação:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tamanho:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Endereço:");

        btCadastrarGinasio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrarGinasio.setLabel("Cadastrar Ginásio");
        btCadastrarGinasio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarGinasio(evt);
            }
        });

        jpEsportes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        checkFutebol.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkFutebol.setText("Futebol");

        checkBasquete.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkBasquete.setText("Basquete");

        checkVolei.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkVolei.setText("Vôlei");

        checkNatacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkNatacao.setText("Natação");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Esportes:");

        javax.swing.GroupLayout jpEsportesLayout = new javax.swing.GroupLayout(jpEsportes);
        jpEsportes.setLayout(jpEsportesLayout);
        jpEsportesLayout.setHorizontalGroup(
            jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEsportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEsportesLayout.createSequentialGroup()
                        .addGroup(jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkVolei)
                            .addComponent(checkFutebol))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpEsportesLayout.createSequentialGroup()
                                .addComponent(checkNatacao)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(checkBasquete, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jpEsportesLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpEsportesLayout.setVerticalGroup(
            jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEsportesLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkFutebol)
                    .addComponent(checkBasquete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEsportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkVolei)
                    .addComponent(checkNatacao))
                .addContainerGap())
        );

        jpMensalidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpMensalidade.setPreferredSize(new java.awt.Dimension(186, 89));

        checkMensal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkMensal.setText("Mensal");

        checkTrimestral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkTrimestral.setText("Trimestral");

        checkSemestral.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkSemestral.setText("Semestral");

        checkAnual.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        checkAnual.setText("Anual");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mensalidade:");

        javax.swing.GroupLayout jpMensalidadeLayout = new javax.swing.GroupLayout(jpMensalidade);
        jpMensalidade.setLayout(jpMensalidadeLayout);
        jpMensalidadeLayout.setHorizontalGroup(
            jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMensalidadeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkSemestral)
                    .addComponent(checkMensal)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAnual)
                    .addComponent(checkTrimestral))
                .addGap(20, 20, 20))
        );
        jpMensalidadeLayout.setVerticalGroup(
            jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpMensalidadeLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkMensal)
                    .addComponent(checkTrimestral))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpMensalidadeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkAnual)
                    .addComponent(checkSemestral))
                .addContainerGap(7, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfNomeGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfEnderecoGinasio)
                                        .addComponent(tfAnoCriacaoGinasio, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
                                        .addComponent(tfTamanhoGinasio, javax.swing.GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jpEsportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jpMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btCadastrarGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(tfNomeGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfAnoCriacaoGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfTamanhoGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(tfEnderecoGinasio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpEsportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpMensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btCadastrarGinasio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarGinasio(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarGinasio
        String nome = tfNomeGinasio.getText();
        String endereco = tfEnderecoGinasio.getText();

        Ginasio ginasio = new Ginasio();
        
        
        try {
            double tamanho = Double.parseDouble(tfTamanhoGinasio.getText());
            int anoCriacao = Integer.parseInt(tfAnoCriacaoGinasio.getText());
            ginasio.setNome(nome);
            ginasio.setAnoCriacao(anoCriacao);
            ginasio.setEndereco(endereco);
            ginasio.setTamanho(tamanho);

            verificarSeAlgumMarcado();
            
            this.addGinasio(ginasio);
            this.registrarEsporte(ginasio);

            JOptionPane.showMessageDialog(null, "Ginásio cadastrado com sucesso!");
            limparTela();
        } catch (CampoVazioException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo vazio.");
        }
    }//GEN-LAST:event_cadastrarGinasio

    private void addGinasio(Ginasio ginasio) {
        ginasioDAO.salvarGinasio(ginasio);
    }

    private boolean verificarSeAlgumMarcado() throws CampoVazioException {
        boolean nenhumMarcado = false;
        
        if(!this.checkFutebol.isSelected() && !this.checkBasquete.isSelected() && !this.checkNatacao.isSelected() && !this.checkVolei.isSelected()) {
            nenhumMarcado = true;
        }
        
        if(!this.checkMensal.isSelected() && !this.checkTrimestral.isSelected() && !this.checkSemestral.isSelected() && !this.checkAnual.isSelected()) {
            nenhumMarcado = true;   
        }
        
        if(nenhumMarcado) {
            throw new CampoVazioException();
        }
        
        return nenhumMarcado;
    }
    
    private void limparTela() {
        tfNomeGinasio.setText("");
        tfAnoCriacaoGinasio.setText("");
        tfTamanhoGinasio.setText("");
        tfEnderecoGinasio.setText("");
        checkAnual.setSelected(false);
        checkMensal.setSelected(false);
        checkTrimestral.setSelected(false);
        checkSemestral.setSelected(false);
        checkBasquete.setSelected(false);
        checkVolei.setSelected(false);
        checkFutebol.setSelected(false);
        checkNatacao.setSelected(false);
    }

    private void registrarEsporte(Ginasio ginasio) {
        if (this.checkFutebol.isSelected()) {
            Esporte fut = new Futebol(22);
            ginasio.getListaEsportes().add(fut);
            esporteDAO.salvarEsporte(fut);

            registrarMensalidade(fut);
        }

        if (this.checkBasquete.isSelected()) {
            Esporte basq = new Basquete(10);
            ginasio.getListaEsportes().add(basq);
            esporteDAO.salvarEsporte(basq);

            registrarMensalidade(basq);
        }

        if (this.checkVolei.isSelected()) {
            Esporte volei = new Volei(12);
            ginasio.getListaEsportes().add(volei);
            esporteDAO.salvarEsporte(volei);

            registrarMensalidade(volei);
        }

        if (this.checkNatacao.isSelected()) {
            Esporte natacao = new Natacao(8);
            ginasio.getListaEsportes().add(natacao);
            esporteDAO.salvarEsporte(natacao);

            registrarMensalidade(natacao);
        }
    }

    private void registrarMensalidade(Esporte esporte) {
        if (this.checkMensal.isSelected()) {
            Mensalidade mensal = new Mensal(100);
            esporte.getListaMensalidades().add(mensal);
        }

        if (this.checkTrimestral.isSelected()) {
            Mensalidade trimestral = new Trimestral(270);
            esporte.getListaMensalidades().add(trimestral);
        }

        if (this.checkSemestral.isSelected()) {
            Mensalidade semestral = new Semestral(550);
            esporte.getListaMensalidades().add(semestral);
        }

        if (this.checkAnual.isSelected()) {
            Mensalidade anual = new Mensalidade(900);
            esporte.getListaMensalidades().add(anual);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btCadastrarGinasio;
    private javax.swing.JCheckBox checkAnual;
    private javax.swing.JCheckBox checkBasquete;
    private javax.swing.JCheckBox checkFutebol;
    private javax.swing.JCheckBox checkMensal;
    private javax.swing.JCheckBox checkNatacao;
    private javax.swing.JCheckBox checkSemestral;
    private javax.swing.JCheckBox checkTrimestral;
    private javax.swing.JCheckBox checkVolei;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jpEsportes;
    private javax.swing.JPanel jpMensalidade;
    private javax.swing.JTextField tfAnoCriacaoGinasio;
    private javax.swing.JTextField tfEnderecoGinasio;
    private javax.swing.JTextField tfNomeGinasio;
    private javax.swing.JTextField tfTamanhoGinasio;
    // End of variables declaration//GEN-END:variables
}
