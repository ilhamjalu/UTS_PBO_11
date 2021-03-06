
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ILHAM
 */
public class rental extends javax.swing.JFrame {

    /**
     * Creates new form rental
     */
    public rental() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Nama = new javax.swing.JTextField();
        Nos = new javax.swing.JTextField();
        Nop = new javax.swing.JTextField();
        Harga = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Alamat = new javax.swing.JTextArea();
        Kembali = new com.toedter.calendar.JDateChooser();
        Pinjam = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Data = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("RENTAL MOTOR");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(460, 20, 290, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1170, 80);

        jPanel2.setBackground(new java.awt.Color(0, 204, 204));
        jPanel2.setLayout(null);

        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        jPanel2.add(Nama);
        Nama.setBounds(110, 20, 190, 40);

        Nos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NosActionPerformed(evt);
            }
        });
        jPanel2.add(Nos);
        Nos.setBounds(110, 80, 190, 40);

        Nop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NopActionPerformed(evt);
            }
        });
        jPanel2.add(Nop);
        Nop.setBounds(110, 140, 190, 40);

        Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HargaActionPerformed(evt);
            }
        });
        jPanel2.add(Harga);
        Harga.setBounds(110, 200, 190, 40);

        Alamat.setColumns(20);
        Alamat.setRows(5);
        jScrollPane1.setViewportView(Alamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(110, 380, 190, 96);
        jPanel2.add(Kembali);
        Kembali.setBounds(110, 320, 190, 40);
        jPanel2.add(Pinjam);
        Pinjam.setBounds(110, 260, 190, 40);

        jLabel2.setText("Alamat");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 380, 60, 30);

        jLabel3.setText("NAMA");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 20, 60, 40);

        jLabel4.setText("No. Struk");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 80, 60, 40);

        jLabel5.setText("No.Pol");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 140, 60, 40);

        jLabel6.setText("Harga");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 200, 60, 40);

        jLabel7.setText("Tanggal Pinjam");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 260, 80, 40);

        jLabel8.setText("Tanggal Kembali");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 320, 100, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 90, 310, 500);

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jPanel3.setLayout(null);

        Data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nama", "Nomor Struk", "Nomor Polisi", "Harga", "Tanggal Pinjam", "Tanggal Kembali", "Alamat"
            }
        ));
        Data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DataMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Data);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 10, 680, 480);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(470, 90, 700, 500);

        jPanel4.setBackground(new java.awt.Color(0, 204, 204));
        jPanel4.setLayout(null);

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(10, 20, 120, 50);

        jButton2.setText("CLEAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(10, 140, 120, 50);

        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(10, 260, 120, 50);

        jButton4.setText("PRINT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(10, 390, 120, 50);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(320, 90, 140, 500);

        setBounds(0, 0, 1188, 632);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void NosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NosActionPerformed

    private void NopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NopActionPerformed

    private void HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HargaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String pinjam = dateFormat.format(Pinjam.getDate());
        String kembali = dateFormat.format(Kembali.getDate());
        
        if("".equals(Nama.getText())|| "".equals(Nos.getText())|| "".equals(Nop.getText())|| "".equals(Harga.getText())|| Pinjam.equals("")|| Kembali.equals("")|| "".equals(Alamat.getText()))
        { 
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);}
        else {
                String SQL = "INSERT INTO tb_rental VALUES('"+Nama.getText()+"','"+Nos.getText()+"','"+Nop.getText()+"','"+Harga.getText()+"','"+pinjam+"','"+kembali+"','"+Alamat.getText()+"')";
                int status = koneksi.execute(SQL);
                if (status == 1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Di Tambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();}
                else{
                JOptionPane.showMessageDialog(this, "Data Gagal Ditambahkan","Sukses",JOptionPane.WARNING_MESSAGE);
                }
                    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void selectData() {
        String kolom[] = {"Nama","NomorStruk","NomorPolisi","Harga","Pinjam","Kembali","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM tb_rental";
        ResultSet rs = koneksi.executeQuery(SQL);
        try{
            while (rs.next()){
                String Nama = rs.getString(1);
                String NomorStruk = rs.getString(2);
                String NomorPolisi = rs.getString(3);
                String Harga = rs.getString(4);
                String Pinjam = rs.getString(5);
                String Kembali = rs.getString(6);
                String Alamat = rs.getString(7);
                String data[] = {Nama,NomorStruk,NomorPolisi,Harga,Pinjam,Kembali,Alamat};
                dtm.addRow(data);
            }
        }catch(SQLException ex){
            Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void DataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DataMouseClicked
        // TODO add your handling code here:
        int baris = Data.getSelectedRow();
        if (baris != -1){
            Nama.setText(Data.getValueAt(baris, 0).toString());
            Nos.setText(Data.getValueAt(baris, 1).toString());
            Nop.setText(Data.getValueAt(baris, 2).toString());
            Harga.setText(Data.getValueAt(baris, 3).toString());
            SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFormat = null;
            try 
            {
                dateFormat = date.parse(Data.getValueAt(baris, 4).toString());
            }
            catch (ParseException ex)
            {
                Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
            }
            Pinjam.setDate(dateFormat);
            try 
            {
                dateFormat = date.parse(Data.getValueAt(baris, 5).toString());
            }
            catch (ParseException ex)
            {
                Logger.getLogger(rental.class.getName()).log(Level.SEVERE, null, ex);
            }
            Kembali.setDate(dateFormat);
            Alamat.setText(Data.getValueAt(baris, 6).toString());
        }
    }//GEN-LAST:event_DataMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Nama.setText("");
        Nos.setText("");
        Nop.setText("");
        Harga.setText("");
        Alamat.setText("");
        Pinjam.setDate(null);
        Kembali.setDate(null);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Peminjaman Motor Malang");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        try{
        Data.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true,null);
        }catch(java.awt.print.PrinterException e){
            System.err.format("cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int confirm = JOptionPane.showConfirmDialog(this, "Anda yakin Menghapus Data!","",JOptionPane.YES_NO_OPTION);
        int baris = Data.getSelectedRow();
        if(baris != -1){
            String Nama = Data.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM tb_rental WHERE Nama='"+Nama+"'";
            int status = koneksi.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus","Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal Dihapus","Gagal",JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu","Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rental.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rental().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Alamat;
    private javax.swing.JTable Data;
    private javax.swing.JTextField Harga;
    private com.toedter.calendar.JDateChooser Kembali;
    private javax.swing.JTextField Nama;
    private javax.swing.JTextField Nop;
    private javax.swing.JTextField Nos;
    private com.toedter.calendar.JDateChooser Pinjam;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    
}
