
public class TheERScheduler extends javax.swing.JFrame {

      static String name;
        static String condition;
        LinkedPriorityQueue ER = new LinkedPriorityQueue(3);
    public TheERScheduler() {
        initComponents();
       
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnschedule = new javax.swing.JButton();
        btntreatnext = new javax.swing.JButton();
        btntreatall = new javax.swing.JButton();
        rbfc = new javax.swing.JRadioButton();
        rbsc = new javax.swing.JRadioButton();
        rbcc = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtresults = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient Name:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnschedule.setText("Schedule");
        btnschedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnscheduleActionPerformed(evt);
            }
        });

        btntreatnext.setText("Treat Next");
        btntreatnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatnextActionPerformed(evt);
            }
        });

        btntreatall.setText("Treat All");
        btntreatall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntreatallActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbfc);
        rbfc.setText("Fair Condition");
        rbfc.setActionCommand("FC");

        buttonGroup1.add(rbsc);
        rbsc.setText("Serious Condition");
        rbsc.setActionCommand("SC");
        rbsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbscActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbcc);
        rbcc.setText("Critical Condition ");
        rbcc.setActionCommand("CC");
        rbcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbccActionPerformed(evt);
            }
        });

        txtresults.setColumns(20);
        txtresults.setRows(5);
        jScrollPane1.setViewportView(txtresults);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbfc)
                            .addComponent(rbsc)
                            .addComponent(rbcc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btntreatall, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btntreatnext, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnschedule, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(btnschedule))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(rbfc)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbsc)
                    .addComponent(btntreatnext))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(rbcc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btntreatall)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnscheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnscheduleActionPerformed
         name = txtname.getText();
        condition = buttonGroup1.getSelection().getActionCommand();
        
        if(condition.equals("CC")){
            ER.enqueue(name, 0);
            txtresults.append( name + "    " + "Critical      Waiting...." + "\n");
            
        }
        else if(condition.equals("SC")){
             ER.enqueue(name, 1);
             txtresults.append(  name + "    " + "Serious      Waiting.... " + "\n");
            
        }
        else {
             ER.enqueue(name, 2);
             txtresults.append( name + "    " + "Fair      Waiting...."  + "\n");
              
        }
        
        txtname.setText("");
        buttonGroup1.clearSelection();
        
        
        
    }//GEN-LAST:event_btnscheduleActionPerformed

    private void rbccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbccActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbccActionPerformed

    private void rbscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbscActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbscActionPerformed

    private void btntreatnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatnextActionPerformed
         txtresults.append(ER.dequeue() + " has been treated" + "\n");
    }//GEN-LAST:event_btntreatnextActionPerformed

    private void btntreatallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntreatallActionPerformed
         for (int i = 0; i < ER.size(); i++) {
             txtresults.append("Treating patient " + ER.dequeue() + "\n");
        }
    }//GEN-LAST:event_btntreatallActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

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
            java.util.logging.Logger.getLogger(TheERScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TheERScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TheERScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TheERScheduler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TheERScheduler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnschedule;
    private javax.swing.JButton btntreatall;
    private javax.swing.JButton btntreatnext;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbcc;
    private javax.swing.JRadioButton rbfc;
    private javax.swing.JRadioButton rbsc;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextArea txtresults;
    // End of variables declaration//GEN-END:variables
}
