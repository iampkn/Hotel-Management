
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.sql.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import project.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author USER
 */
public class CustomerDetailsBill extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetailsBill
     */
    public CustomerDetailsBill() {
        initComponents();
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal = Calendar.getInstance();
        jTextField1.setText(myFormat.format(cal.getTime()));
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable(){
            @Override
            public boolean isCellEditable(int row, int column) {
                //all cells false
                return false;
            }
        };
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Details Bill.png"))); // NOI18N
        jLabel1.setText("Customer Details Bill");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 260, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1213, 18, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Tìm kiếm theo ngày trả phòng");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 216, -1));

        jButton2.setBackground(new java.awt.Color(102, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 80, 120, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ tên", "SĐT", "Quốc gia", "Giới tính", "Email", "CMND/CCCD", "Địa chỉ", "Ngày nhận phòng", "Số phòng", "Loại giường", "Loại phòng", "Giá/ngày", "Số ngày ở", "Tổng tiền", "Ngày trả phòng"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(90);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(80);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 1240, -1));

        jButton3.setBackground(new java.awt.Color(102, 0, 0));
        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thống kê");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 80, 130, -1));

        jButton4.setBackground(new java.awt.Color(102, 0, 0));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Xóa");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 80, 120, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/check.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, -80, 1290, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs = Select.getData("Select *from customer where checkout is not NULL");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        try{
            while (rs.next()){
                model.addRow(new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)});
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String checkoutDate = jTextField1.getText();
        ResultSet rs = Select.getData("Select *from customer where checkout ='"+checkoutDate+"'");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        try{
            while (rs.next()){
                model.addRow(new Object[] {rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12), rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16)});
                
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        if (evt.getClickCount() == 2 && !evt.isConsumed()) {
            evt.consume();
            int index = jTable1.getSelectedRow();
        TableModel model = jTable1.getModel();
        String filename = model.getValueAt(index, 1).toString();
        try{
            if ((new File("D:\\" + filename +".pdf")).exists()){
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler D:\\"+filename+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null,"File này không tồn tại");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Document document = new Document(PageSize.A4);
            String filename = "Thống kê doanh thu";
            String path = "D:\\";
            try {
                PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path+""+filename+".pdf"));
                document.open();
                document.addAuthor("Nhóm 8");
                document.addCreationDate();
                document.addCreator("QLKS");
                document.addTitle("Hóa đơn thống kê");
                document.addSubject("Hóa đơn thống kê");
                
                //Định dạng Font Tiêu đề
                File filefontTieuDe = new File("fonts/vuArialBold.ttf");
                BaseFont bfTieuDe = BaseFont.createFont(filefontTieuDe.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                Font fontTieuDe1 = new Font(bfTieuDe,16);
                fontTieuDe1.setColor(BaseColor.BLUE);
                Font fontTieuDe2 = new Font(bfTieuDe, 13);
                fontTieuDe2.setColor(BaseColor.BLUE);
                Font fontTieuDe3 = new Font(bfTieuDe, 13);
                Font fontTieuDe4 = new Font(bfTieuDe, 12);
                
                //Định dạng Font Nội dung
                File filefontNoiDung = new File("fonts/vuArial.ttf");
                BaseFont bfNoiDung = BaseFont.createFont(filefontNoiDung.getAbsolutePath(), BaseFont.IDENTITY_H, BaseFont.EMBEDDED);
                Font fontNoiDung1 = new Font(bfNoiDung, 13);
                Font fontNoiDung2 = new Font(bfNoiDung, 12);
                Font fontNoiDung3 = new Font(bfNoiDung, 11);
                
                
                //Chèn logo
                Image logo = Image.getInstance("images/2.jpg");
                logo.setAbsolutePosition(80, 750);
                logo.scaleAbsolute(50, 50);
                document.add(logo);
                
                //Chèn tên phòng khám
                Paragraph prgTenKS = new Paragraph("KHÁCH SẠN ABC", fontTieuDe2);
                prgTenKS.setIndentationLeft(100);
                document.add(prgTenKS);
                
                //Chèn địa chỉ phòng khám
                Paragraph prgDiaChiKS = new Paragraph("Khu phố 6, phường Linh Trung, Tp.Thủ Đức, Tp. Hồ Chí Minh", fontNoiDung2);
                prgDiaChiKS.setIndentationLeft(100);
                document.add(prgDiaChiKS);
                
                //Chèn số DDT phòng khám
                Paragraph prgSoDTKS = new Paragraph("Số Điện thoại: 012 345 6789", fontNoiDung2);
                prgSoDTKS.setIndentationLeft(100);
                document.add(prgSoDTKS);
                
                //Chèn Tiêu đề pdf
                Paragraph prgTieuDe = new Paragraph("TỔNG DOANH THU", fontTieuDe1);
                prgTieuDe.setAlignment(Element.ALIGN_CENTER);
                prgTieuDe.setSpacingBefore(10);
                prgTieuDe.setSpacingAfter(10);
                document.add(prgTieuDe);
                
                
                //Định nghĩa số côt, chiều rộng bảng
                PdfPTable tableDV = new PdfPTable(6); //6 cột
                tableDV.setWidthPercentage(80);
                tableDV.setSpacingBefore(10);
                tableDV.setSpacingAfter(10);
                
                //Set Column widths
                float[] tableDV_columnWidths = {80, 120, 120, 100, 80, 100};
                tableDV.setWidths(tableDV_columnWidths);
                
                PdfPCell cellTDSP = new PdfPCell(new Paragraph("Số phòng", fontTieuDe4));
                cellTDSP.setBorderColor(BaseColor.BLACK);
                cellTDSP.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDSP.setVerticalAlignment(Element.ALIGN_MIDDLE);
                cellTDSP.setMinimumHeight(30);
                tableDV.addCell(cellTDSP);
                
                PdfPCell cellTDLoaiPhong = new PdfPCell(new Paragraph("Loại phòng", fontTieuDe4));
                cellTDLoaiPhong.setBorderColor(BaseColor.BLACK);
                cellTDLoaiPhong.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDLoaiPhong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDLoaiPhong);
                
                PdfPCell cellTDBed = new PdfPCell(new Paragraph("Loại giường", fontTieuDe4));
                cellTDBed.setBorderColor(BaseColor.BLACK);
                cellTDBed.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDBed.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDBed);
                
                PdfPCell cellTDGia = new PdfPCell(new Paragraph("Giá/ngày", fontTieuDe4));
                cellTDGia.setBorderColor(BaseColor.BLACK);
                cellTDGia.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDGia.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDGia);
                
                PdfPCell cellTDSL = new PdfPCell(new Paragraph("Số ngày ở", fontTieuDe4));
                cellTDSL.setBorderColor(BaseColor.BLACK);
                cellTDSL.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDSL.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDSL);
                
                PdfPCell cellTDThanhTien = new PdfPCell(new Paragraph("Thành tiền", fontTieuDe4));
                cellTDThanhTien.setBorderColor(BaseColor.BLACK);
                cellTDThanhTien.setHorizontalAlignment(Element.ALIGN_CENTER);
                cellTDThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                tableDV.addCell(cellTDThanhTien);
           
                 
                 try {
                    int TongTien = 0;
                    
                    ResultSet rs = Select.getData("Select * from customer");
                    
                    while(rs.next()) {
                    
                    PdfPCell cellRoomNo = new PdfPCell (new Paragraph(rs.getString(10),fontNoiDung3));
                    cellRoomNo.setPaddingLeft(10);
                    cellRoomNo.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellRoomNo.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellRoomNo);
                    
                    PdfPCell cellRoom = new PdfPCell (new Paragraph(rs.getString(12),fontNoiDung3));
                    cellRoom.setPaddingLeft(10);
                    cellRoom.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellRoom.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellRoom);
                    
                    PdfPCell cellBed = new PdfPCell (new Paragraph(rs.getString(11),fontNoiDung3));
                    cellBed.setPaddingLeft(10);
                    cellBed.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellBed.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellBed);
                    
                 
                    PdfPCell cellGia = new PdfPCell (new Paragraph(DinhDangTienTe (rs.getInt(13)),fontNoiDung3));
                    cellGia.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellGia.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellGia);
                    
                    PdfPCell cellSoNgay = new PdfPCell (new Paragraph(rs.getString(14),fontNoiDung3));
                    cellSoNgay.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellSoNgay.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellSoNgay);
                    
                    PdfPCell cellThanhTien = new PdfPCell (new Paragraph(DinhDangTienTe(rs.getInt(15)),fontNoiDung3));
                    cellThanhTien.setPaddingLeft(10);
                    cellThanhTien.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellThanhTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellThanhTien);
                    TongTien = TongTien + rs.getInt("totalAmount");
                   
                    }
                    PdfPCell cellTongCong = new PdfPCell(new Paragraph("TỔNG CỘNG: ", fontTieuDe4));
                    cellTongCong.setColspan(5);
                    cellTongCong.setHorizontalAlignment(Element.ALIGN_CENTER);
                    cellTongCong.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    cellTongCong.setMinimumHeight(20);
                    tableDV.addCell(cellTongCong);
                    
                    PdfPCell cellTongTien = new PdfPCell(new Paragraph(DinhDangTienTe(TongTien), fontTieuDe4));
                    cellTongTien.setHorizontalAlignment(Element.ALIGN_RIGHT);
                    cellTongTien.setVerticalAlignment(Element.ALIGN_MIDDLE);
                    tableDV.addCell(cellTongTien);
                    
                } catch(Exception e) {
                    System.out.println(e);
                    System.out.println("Lỗi");
                }
                document.add(tableDV);
                Paragraph prgKetThuc = new Paragraph("CẢM ƠN QUÝ KHÁCH, HẸN GẶP LẠI!", fontTieuDe1);
                prgKetThuc.setAlignment(Element.ALIGN_CENTER);
                prgKetThuc.setSpacingBefore(10);
                prgKetThuc.setSpacingAfter(10);
                document.add(prgKetThuc);
                 
             // Đóng document sau khi định dạng 
                document.close();
                // Đóng writer sau khi ghi file pdf
                writer.close();
            } catch (Exception e) {
                    e.printStackTrace();
            }
            // Mở file pdf sau khi định dạng và write
            try {
                File file = new File("D:\\" + filename +".pdf");
                if(!Desktop.isDesktopSupported()) {
                    System.out.println("not supported");
                    return;
                }
                Desktop desktop = Desktop.getDesktop();
                if(file.exists()) {
                    desktop.open(file);
                }
            } catch(Exception e) {
                e.printStackTrace();
            }
           
        
        int a=JOptionPane.showConfirmDialog(null, "Bạn có muốn in hóa đơn","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {
            try 
            {
                if((new File("D:\\" + filename +".pdf")).exists())  
                {
                    Process p=Runtime
                            .getRuntime()
                            .exec("rundll32 url.dll,FileProtocolHandler D:\\"+filename+".pdf");
                }
                else
                    System.out.println("File này không tồn tại");
            } 
            catch (Exception e) 
            { 
                JOptionPane.showMessageDialog(null, e);
            }
        }
        setVisible(false);
        new CustomerCheckOut().setVisible(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
         int ret = JOptionPane.showConfirmDialog(null,"Bạn có muốn xóa", "Xóa dữ liệu", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
        {
            int row = jTable1.getSelectedRow();
            String id = (String)jTable1.getValueAt(row, 0);
            String Query = "Delete from customer where id = '"+id+"'";
            InsertUpdateDelete.setData(Query, "Xóa thành công");
            setVisible(false);
            new CustomerDetailsBill().setVisible(true);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

     public String DinhDangTienTe(int SoTien) {
        // tạo 1 NumberFormat để định dạng số theo tiêu chuẩn EN
        Locale localeEN = new Locale("en", "EN");
        NumberFormat en = NumberFormat.getInstance(localeEN);
        
        //phần ngàn của số được phân cách bằng dấu phẩy
        String str = en.format(SoTien);
        return str;
    }
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
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetailsBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetailsBill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
