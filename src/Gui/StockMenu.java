/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import exceptions.PrescriptionNotValid;
import files.AbstractFileReader;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import onlinepharmacy.Customer;
import onlinepharmacy.Order;
import onlinepharmacy.Pharmacy;
import onlinepharmacy.Product;

/**
 *
 * @author Abdelrahman
 */
public class StockMenu extends javax.swing.JFrame {

    private Order order;
    private Customer newCustomer;
    public String Recepit;
    /**
     * Creates new form StockMenu
     */
    public StockMenu() {
        initComponents();
   
        this.jRadioButton1.setSelected(true);
        addRowtoTable();
        order = new Order();
        WelcomScreen s = new WelcomScreen();
        newCustomer = s.getCustomer();
        order.setCustomer(newCustomer);
        Recepit="null";
    }
    

    //JtRowData = newShow_Jtable_row_data ();
            
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton8 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jRadioButton8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Prescription Products");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Products Menu");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/onlinepharmacy/mini.png"))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Code", "Category", "Price"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText(" All Produts");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Cosmetic Products");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Off Shelf Products");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Prescription Products");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 153, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 153, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Recepit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(43, 43, 43)
                .addComponent(jRadioButton2)
                .addGap(31, 31, 31)
                .addComponent(jRadioButton3)
                .addGap(33, 33, 33)
                .addComponent(jRadioButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTextField1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 153, 153));
        jTextField1.setText("Search For Object");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void addRowtoTable(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        Object rowData[] = new Object[30];
        int rows = model.getRowCount(); 
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                model.addRow(rowData);
        }
        jTable2.setDefaultEditor(Object.class, null);
    }
    public void addCosmeticToTable() {
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="cosmetic"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                model.addRow(rowData);     
            }
        }
        jTable2.setDefaultEditor(Object.class, null);
    }
    public void addDrugstoTable(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();       
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        }
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="drug"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                model.addRow(rowData);
            }
        }
        jTable2.setDefaultEditor(Object.class, null);
    }
    public void addprescription(){
        Pharmacy pharmacy = new Pharmacy();
        Product newProduct = new Product();
        
        AbstractFileReader reader = new AbstractFileReader();
        DefaultTableModel model = (DefaultTableModel) this.jTable2.getModel();
        Object rowData[] = new Object[30]; 
        int rows = model.getRowCount();       
        for(int i = rows - 1; i >=0; i--)
        {
            model.removeRow(i); 
        } 
        for(Map.Entry<String,Product> entry:reader.getProduct().entrySet() ) {
            newProduct = entry.getValue();
            String categoryCheck = newProduct.getCategory();
            if(categoryCheck=="prescription"){
                newProduct = entry.getValue();
                rowData[0]= newProduct.getName();
                rowData[1]= newProduct.getProductCode();
                rowData[2]= newProduct.getCategory();
                rowData[3]= newProduct.getPrice();
                model.addRow(rowData);
            }
        }
        jTable2.setDefaultEditor(Object.class, null);
    }
    public void Search(String name)  {
        Pharmacy pharmacy = new Pharmacy();
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        String status = pharmacy.SearchProduct(name);
        System.out.print(name);
        JOptionPane.showMessageDialog(null, status+"  ", "Status",JOptionPane.PLAIN_MESSAGE);
        
        

    }
    public void ValidatePrescriptio(String code)throws PrescriptionNotValid{
        if(code.length()<8){
            throw new PrescriptionNotValid();
        }
    }
    public void checkOut(String name,int quantity){
        
        Pharmacy pharmacy =new Pharmacy();
        AbstractFileReader reader = new AbstractFileReader();
        pharmacy.setProduct(reader.getProduct());
        String selectProduct = name ;
        
        
        Product p;
        if(pharmacy.getProduct(selectProduct).getCategory()=="prescription") {
            
            String code = JOptionPane.showInputDialog( null,"Please Enter 8 digits Prescreption");
            boolean valid = false;
            
            while (!valid) {
                try{
                    ValidatePrescriptio(code);
                    valid = true;
                }catch(PrescriptionNotValid e){
                    JOptionPane.showMessageDialog(null,"Error:  "+e.getMessage(),"Inane error",JOptionPane.ERROR_MESSAGE);
                    code = JOptionPane.showInputDialog( null,"Please Enter 8 digits Prescreption");
                }
            }

            pharmacy.getPrescription(selectProduct).setPrescription(code);
            p = pharmacy.getPrescription(selectProduct);
            p.setSingleOrderQuantity(quantity);
            order.addProduct(p); 
        }
       else    {
            p = pharmacy.getProduct(selectProduct);
            p.setSingleOrderQuantity(quantity);
           order.addProduct(p);                        
        }

    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        
        addRowtoTable();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed

        addCosmeticToTable();      
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
       addDrugstoTable();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        addprescription();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        
        int index = this.jTable2.getSelectedRow();
        TableModel model =  this.jTable2.getModel();
        String name = (String) model.getValueAt(index, 0);
     
        ImageIcon ico = new ImageIcon("mini.PNG");
        Frame frame = new Frame();
        Object[] options = {"1", "2", "3", "4", "5", "6", "8","9"};
        String quantity = (String) JOptionPane.showInputDialog(frame,name+" Was Selected Please Slect quantity   ","Quantity",JOptionPane.ERROR_MESSAGE,ico,options,options[0]);
         
        Integer quant = null;
        try{
           quant = Integer.valueOf(quantity);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error:You did'nt Select quantity","Inane error",JOptionPane.ERROR_MESSAGE); 
        }
        try{
            checkOut(name,quant);
        }catch(Exception e){
            
        }
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new CustomerOperations().setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ImageIcon ico = new ImageIcon("mini.PNG");
        Frame frame = new Frame();
        Object[] options = {"Cash on Delivery","Credit card"};
        JOptionPane.showInputDialog(frame," Select Payment Method   ","Payment",JOptionPane.ERROR_MESSAGE,ico,options,options[0]);

        Pharmacy pharmacy = new Pharmacy();
        Recepit = order.displayrecepit();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        order.setDate(dtf.format(localDate));
        
        AbstractFileReader reader = new AbstractFileReader();
        newCustomer.addPreviousOrder(order);
        
        for (Customer tmp : pharmacy.getCustomerRecords()) {
            if (tmp.getEmailAddress().equals(newCustomer.getEmailAddress())) {
                tmp.addPreviousOrder(order);
            }
        }
        
        reader.saveCustomer(pharmacy.getCustomerRecords());
        pharmacy.seOrders(reader.getAllOrders());
        pharmacy.addToOrder(order);
        reader.saveOrders(pharmacy.getOrdersRecords());
        JOptionPane.showMessageDialog(null, Recepit+"\nThank You","Recpepit", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
          String Status = this.jTextField1.getText();
          Search(Status);
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
