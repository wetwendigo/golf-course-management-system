/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcms.forms.panels;

/**
 * The Golf Course Management System (GCMS) enables employees of a golf course
 * to perform daily tasks such as completing transactions, storing employee and
 * member information, and scheduling grounds work.
 * 
 * This project has been designed and developed for course CIS4810 Systems
 * Development Project taught by Professor Mary Garrett. Project Team 1 consists
 * of the following team members: Michael Abbotts, Baron Amman, Ryan Cipullo,
 * Solomon Colley, and David Ward.
 * 
 * @author Solomon Colley
 * @see SDD for more information on system design and documentation
 * @since 9/23/2019
 * @version 1.0
 */
public class PurchasePanel extends javax.swing.JPanel {

    /**
     * Creates new form PurchasePanel
     */
    public PurchasePanel() {
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

        transNumLabel = new javax.swing.JLabel();
        transNumTextField = new javax.swing.JTextField();
        datLabel = new javax.swing.JLabel();
        datTextField = new javax.swing.JTextField();
        memIDLabel = new javax.swing.JLabel();
        memIDTextField = new javax.swing.JTextField();
        memNameLabel = new javax.swing.JLabel();
        memFNameTextField = new javax.swing.JTextField();
        memLNameTextField = new javax.swing.JTextField();
        totalAmountLabel = new javax.swing.JLabel();
        totalAmountTextField = new javax.swing.JTextField();
        newBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        firstBtn = new javax.swing.JButton();
        previousBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        lastBtn = new javax.swing.JButton();

        transNumLabel.setText("Transaction number");

        transNumTextField.setEditable(false);
        transNumTextField.setToolTipText("Transaction number");

        datLabel.setText("Day");

        datTextField.setToolTipText("Day");

        memIDLabel.setText("Member ID");

        memIDTextField.setToolTipText("Member ID");

        memNameLabel.setText("Member name");

        memFNameTextField.setToolTipText("First name");

        memLNameTextField.setToolTipText("Last name");

        totalAmountLabel.setText("Total amount");

        totalAmountTextField.setToolTipText("Total amount");

        newBtn.setText("New...");

        updateBtn.setText("Update");

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        firstBtn.setText("First");

        previousBtn.setText("Previous");

        nextBtn.setText("Next");

        lastBtn.setText("Last");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newBtn)
                        .addGap(18, 18, 18)
                        .addComponent(updateBtn)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn)
                        .addGap(18, 18, 18)
                        .addComponent(firstBtn)
                        .addGap(18, 18, 18)
                        .addComponent(previousBtn)
                        .addGap(18, 18, 18)
                        .addComponent(nextBtn)
                        .addGap(18, 18, 18)
                        .addComponent(lastBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(transNumLabel)
                            .addComponent(datLabel)
                            .addComponent(memIDLabel)
                            .addComponent(memNameLabel)
                            .addComponent(totalAmountLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(transNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(memFNameTextField)
                                .addGap(18, 18, 18)
                                .addComponent(memLNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {datTextField, memFNameTextField, memIDTextField, memLNameTextField, totalAmountTextField, transNumTextField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(transNumLabel)
                    .addComponent(transNumTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datLabel)
                    .addComponent(datTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memIDLabel)
                    .addComponent(memIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(memNameLabel)
                    .addComponent(memFNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memLNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAmountLabel)
                    .addComponent(totalAmountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newBtn)
                    .addComponent(updateBtn)
                    .addComponent(deleteBtn)
                    .addComponent(firstBtn)
                    .addComponent(previousBtn)
                    .addComponent(nextBtn)
                    .addComponent(lastBtn))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel datLabel;
    private javax.swing.JTextField datTextField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton firstBtn;
    private javax.swing.JButton lastBtn;
    private javax.swing.JTextField memFNameTextField;
    private javax.swing.JLabel memIDLabel;
    private javax.swing.JTextField memIDTextField;
    private javax.swing.JTextField memLNameTextField;
    private javax.swing.JLabel memNameLabel;
    private javax.swing.JButton newBtn;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton previousBtn;
    private javax.swing.JLabel totalAmountLabel;
    private javax.swing.JTextField totalAmountTextField;
    private javax.swing.JLabel transNumLabel;
    private javax.swing.JTextField transNumTextField;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}