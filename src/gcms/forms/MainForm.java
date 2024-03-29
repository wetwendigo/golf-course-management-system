/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcms.forms;

import gcms.database.Database;
import gcms.forms.panels.*;
import gcms.rdms.RDMS;
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FileUtils;

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
public class MainForm extends javax.swing.JFrame {
    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        initFields();
    } // end MainForm

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFormPanel = new javax.swing.JPanel();
        versionLabel = new javax.swing.JLabel();
        gcmsScrollPane = new javax.swing.JScrollPane();
        gcmsTable = new javax.swing.JTable();
        tableComboBox = new javax.swing.JComboBox<>();
        createBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        readBtn = new javax.swing.JButton();
        newRowBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        mainMenuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        exitMenuItem = new javax.swing.JMenuItem();
        dataMenu = new javax.swing.JMenu();
        exportMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        howToMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Golf Course Management System");

        versionLabel.setText("Version 1.0");

        gcmsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gcmsScrollPane.setViewportView(gcmsTable);

        tableComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a table...", "Employees", "Members", "Purchase", "Rates", "JobList", "Calendar", "PurchaseLine", "EmplSchedule", "TeeSchedule", "TeeTimes" }));
        tableComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableComboBoxActionPerformed(evt);
            }
        });

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        readBtn.setText("Read");
        readBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readBtnActionPerformed(evt);
            }
        });

        newRowBtn.setText("New row");
        newRowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newRowBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFormPanelLayout = new javax.swing.GroupLayout(mainFormPanel);
        mainFormPanel.setLayout(mainFormPanelLayout);
        mainFormPanelLayout.setHorizontalGroup(
            mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gcmsScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 776, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(versionLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormPanelLayout.createSequentialGroup()
                        .addComponent(tableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newRowBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(readBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteBtn)))
                .addContainerGap())
        );
        mainFormPanelLayout.setVerticalGroup(
            mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFormPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainFormPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn)
                    .addComponent(readBtn)
                    .addComponent(newRowBtn)
                    .addComponent(updateBtn)
                    .addComponent(createBtn))
                .addGap(18, 18, 18)
                .addComponent(gcmsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(versionLabel)
                .addContainerGap())
        );

        fileMenu.setText("File");

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        mainMenuBar.add(fileMenu);

        dataMenu.setText("Data");

        exportMenuItem.setText("Export...");
        exportMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportMenuItemActionPerformed(evt);
            }
        });
        dataMenu.add(exportMenuItem);

        mainMenuBar.add(dataMenu);

        helpMenu.setText("Help");

        howToMenuItem.setText("How to");
        howToMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                howToMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(howToMenuItem);

        aboutMenuItem.setText("About");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        mainMenuBar.add(helpMenu);

        setJMenuBar(mainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainFormPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Initializes all the JFrames (forms) and other fields utilized by the
     * GCMS. JPanels stored in separate files are added to their respective
     * forms.
     */
    private void initFields() {
        AboutForm = new JFrame();
        AboutPanel = new AboutPanel();
        AboutForm.setSize(new Dimension(600, 400));
        AboutForm.setTitle("About the GCMS");
        AboutForm.add(AboutPanel);
        
        HowToForm = new JFrame();
        HowToPanel = new HowToPanel();
        HowToForm.setSize(new Dimension(600, 400));
        HowToForm.setTitle("How to Use the GCMS");
        HowToForm.add(HowToPanel);
        
        fileChooser = new JFileChooser();
        fileChooser.setApproveButtonText("Export...");
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        database = new Database();
    } // end initFields
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        AboutForm.setVisible(true);
    }//GEN-LAST:event_aboutMenuItemActionPerformed

    private void tableComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableComboBoxActionPerformed
        checkDatabase();

        // read the selected database table's records into the table
        if (tableComboBox.getSelectedIndex() != 0) {
            gcmsTable.setName((String) tableComboBox.getSelectedItem());
            RDMS.read(tableComboBox.getSelectedItem(), gcmsTable);
        } // end if-else
    }//GEN-LAST:event_tableComboBoxActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        checkDatabase();

        // prompts the user to confirm the create action
        int reply = JOptionPane.showConfirmDialog(null, CREATE_CONFIRM_MSG,
            "Dialog", JOptionPane.YES_NO_OPTION);
        
        // insert the selected records in the table to the db
        if (reply == JOptionPane.YES_OPTION) {
            gcmsTable.setName((String) tableComboBox.getSelectedItem());
            RDMS.create(tableComboBox.getSelectedItem().toString(), gcmsTable);
        } // end if-else
    }//GEN-LAST:event_createBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        checkDatabase();

        // prompts the user to confirm the delete action
        int reply = JOptionPane.showConfirmDialog(null, DELETE_CONFIRM_MSG,
            "Dialog", JOptionPane.YES_NO_OPTION);

        // delete any and all selected records from the table
        if (reply == JOptionPane.YES_OPTION) {
            gcmsTable.setName((String) tableComboBox.getSelectedItem());
            RDMS.delete(tableComboBox.getSelectedItem(), gcmsTable);
        } // end if-else
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void readBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readBtnActionPerformed
        checkDatabase();

        // read the selected database table's records into the table
        if (tableComboBox.getSelectedIndex() != 0) {
            gcmsTable.setName((String) tableComboBox.getSelectedItem());
            RDMS.read(tableComboBox.getSelectedItem(), gcmsTable);
        } // end if-else
    }//GEN-LAST:event_readBtnActionPerformed

    private void newRowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newRowBtnActionPerformed
        // add an empty row to the end of the table
        DefaultTableModel tableModel = (DefaultTableModel) gcmsTable.getModel();
        tableModel.addRow(new Object[] {});
    }//GEN-LAST:event_newRowBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        checkDatabase();

        // prompts the user to confirm the delete action
        int reply = JOptionPane.showConfirmDialog(null, UPDATE_CONFIRM_MSG,
            "Dialog", JOptionPane.YES_NO_OPTION);

        // delete any and all selected records from the table
        if (reply == JOptionPane.YES_OPTION) {
            gcmsTable.setName((String) tableComboBox.getSelectedItem());
            RDMS.update(tableComboBox.getSelectedItem().toString(), gcmsTable);
        } // end if-else
    }//GEN-LAST:event_updateBtnActionPerformed

    private void howToMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_howToMenuItemActionPerformed
        HowToForm.setVisible(true);
    }//GEN-LAST:event_howToMenuItemActionPerformed

    private void exportMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportMenuItemActionPerformed
        checkDatabase();
        
        int returnValue = fileChooser.showSaveDialog(this);
        
        // if the user confirms the export operation
        // move the database file to the specified folder
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                File srcFile = database.getWorkingDatabaseFile();
                File destDir = fileChooser.getSelectedFile();
                FileUtils.copyFileToDirectory(srcFile, destDir, true);
            } catch (IOException ex) {
                JOptionPane.showConfirmDialog(null, MOVE_ERROR_MSG,
                    "Dialog", JOptionPane.ERROR_MESSAGE);
            } // end try-catch
        } // end if-else
    }//GEN-LAST:event_exportMenuItemActionPerformed
    
    /**
     * Checks to see if the GCMS database exists in its working directory
     * 'data'. If it does not exist, then an empty backup of the database
     * is copied to the 'data' working directory.
     */
    private void checkDatabase() {
        if (database.exists() == false)
            database.copyBackupDatabase(); // end if-else
    } // end checkDatabase
    
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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    } // end main

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton createBtn;
    private javax.swing.JMenu dataMenu;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuItem exportMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JScrollPane gcmsScrollPane;
    private javax.swing.JTable gcmsTable;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenuItem howToMenuItem;
    private javax.swing.JPanel mainFormPanel;
    private javax.swing.JMenuBar mainMenuBar;
    private javax.swing.JButton newRowBtn;
    private javax.swing.JButton readBtn;
    private javax.swing.JComboBox<String> tableComboBox;
    private javax.swing.JButton updateBtn;
    private javax.swing.JLabel versionLabel;
    // End of variables declaration//GEN-END:variables

    // Additional variables declaration
    // JFrames and JPanels used in MVC system structure
    private static final String CREATE_CONFIRM_MSG =
        "Are you sure you want to create the selected record(s)?";
    private static final String DELETE_CONFIRM_MSG =
        "Are you sure you want to delete the selected record(s)?";
    private static final String UPDATE_CONFIRM_MSG =
        "Are you sure you want to update the selected record(s)?";
    private static final String MOVE_ERROR_MSG =
        "Could not save the database file to the specified folder.";
    
    private JFrame AboutForm, HowToForm;
    private JPanel AboutPanel, HowToPanel;
    private JFileChooser fileChooser;
    
    private Database database;
    // End of additional variables declaration
} // end MainForm
