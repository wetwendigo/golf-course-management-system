/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcms.rdms;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
public class RDMS {
    private static final String CONNECTION_STR =
        "jdbc:sqlite:data/gcms_db.db";
    private static final String READ_ERROR_MSG =
        "Cannot populate the table with records.";
    
    /* to be added
    public static void create() {
        
    }
    */
    
    /**
     * Operation READ of the GCMS's CRUD design. Connects to the internal
     * database, selects a user-specified table, and reads that table's
     * information into the destination JTable. The JTable will reflect the
     * corresponding database table.
     * @param dbTable the user-selected database table (read from)
     * @param formTable the form's table to be populated with records (read to)
     */
    public static void read(Object dbTable, JTable formTable) {
        try {
            Connection.connect(CONNECTION_STR);
            Statement statement = Connection.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM [" + dbTable + "];");
            
            // get information about the table's columns
            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
            int columnCount = resultSetMetaData.getColumnCount();
            
            // table model helps with changing the column and row model
            DefaultTableModel tableModel = (DefaultTableModel) formTable.getModel();
            
            // reset the table's column count
            tableModel.setColumnCount(0);
            
            // add the source table's columns to the destination table
            for (int i = 1; i <= columnCount; i++)
                tableModel.addColumn(resultSetMetaData.getColumnName(i)); // end for
            
            // reset the table's row count
            tableModel.setRowCount(0);
            
            // while there are rows to add, populate the table with information
            while (resultSet.next()) {
                String[] a = new String[columnCount];
                
                for (int i = 0; i < columnCount; i++)
                    a[i] = resultSet.getString(i + 1); // end for
                
                tableModel.addRow(a);
            } // end while
            
            tableModel.fireTableDataChanged();
            
            resultSet.close();
            statement.close();
            Connection.disconnect();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), READ_ERROR_MSG,
                "Dialog", JOptionPane.ERROR_MESSAGE);
        } // end try-catch
    } // end read
    
    /* to be added
    public static void update() {
        
    }
    
    public static void delete() {
        
    }
    */
} // end RDMS