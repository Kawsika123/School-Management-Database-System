//import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Wethum Kawsika
 */
public class student extends javax.swing.JFrame {
//      Connection con=null;
//      Statement stmt=null;
      //ResultSet rs=null;
    /**
     * Creates new form student
     */
    public student() {
        initComponents();
        //con=databaseConnection.connection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        stuid = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        co = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        addmisiondate = new javax.swing.JTextField();
        gardiansname = new javax.swing.JTextField();
        contactno = new javax.swing.JTextField();
        grade = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        submit = new javax.swing.JButton();
        search = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        addyear = new javax.swing.JTextField();
        leaveyear = new javax.swing.JTextField();
        gaddno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        syaddno = new javax.swing.JTextField();
        syname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sygrade = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        mainmenu = new javax.swing.JButton();
        back = new javax.swing.JButton();
        extra = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1610, 585));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Bauhaus 93", 1, 56)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENTS");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(500, 40, 279, 68);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 51));
        jLabel2.setText("NAME");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(28, 218, 60, 40);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setText("ADDRESS");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(28, 264, 100, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setText("Extra -curricular Activities");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 450, 220, 40);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 51));
        jLabel4.setText("GRADE");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 320, 75, 40);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setText("BIRTHDAY");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 370, 120, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setText("ADDMISION DATE");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(390, 210, 190, 40);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setText("STU.ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 160, 80, 40);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setText("GENDER");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(390, 160, 124, 40);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("CONTACT NO");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(390, 310, 146, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 51));
        jLabel11.setText("GUARDIAN'S NAME");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(390, 260, 200, 40);

        stuid.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        stuid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stuidActionPerformed(evt);
            }
        });
        jPanel1.add(stuid);
        stuid.setBounds(140, 170, 160, 30);

        name.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(140, 220, 160, 28);

        co.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        co.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coActionPerformed(evt);
            }
        });
        jPanel1.add(co);
        co.setBounds(240, 420, 260, 28);

        address.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(address);
        address.setBounds(140, 270, 160, 28);

        birthday.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        birthday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birthdayActionPerformed(evt);
            }
        });
        jPanel1.add(birthday);
        birthday.setBounds(140, 370, 160, 30);

        addmisiondate.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(addmisiondate);
        addmisiondate.setBounds(570, 220, 166, 28);

        gardiansname.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        gardiansname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gardiansnameActionPerformed(evt);
            }
        });
        jPanel1.add(gardiansname);
        gardiansname.setBounds(570, 270, 166, 30);

        contactno.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        contactno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactnoActionPerformed(evt);
            }
        });
        jPanel1.add(contactno);
        contactno.setBounds(570, 320, 166, 28);

        grade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        grade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-A", "1-B", "1-C", "1-D", " ", "2-A", "2-B", "2-C", "2-D", " ", "3-A", "3-B", "3-C", "3-D", " ", "4-A", "4-B", "4-C", "4-D", " ", "5-A", "5-B", "5-C", "5-D", " ", "6-A", "6-B", "6-C", "6-D", " ", "7-A", "7-B", "7-C", "7-D", " ", "8-A", "8-B", "8-C", "8-D", " ", "9-A", "9-B", "9-C", "9-D", " ", "10-A", "10-B", "10-C", "10-D", " ", "11-A", "11-B", "11-C", "11-D", " ", "12-A", "12-B", "12-C", "12-D", " ", "13-A", "13-B", "13-C", "13-D" }));
        grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gradeActionPerformed(evt);
            }
        });
        jPanel1.add(grade);
        grade.setBounds(140, 320, 160, 28);

        gender.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(570, 170, 165, 28);

        submit.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        submit.setText("SUBMIT");
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        jPanel1.add(submit);
        submit.setBounds(560, 540, 140, 30);

        search.setFont(new java.awt.Font("Cambria", 1, 24)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(150, 130, 140, 29);

        reset.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        reset.setText("NEW");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel1.add(reset);
        reset.setBounds(570, 390, 120, 30);

        update.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(570, 490, 120, 29);

        delete.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(570, 440, 120, 30);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("G.ADDMISSION  NO:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(818, 185, 189, 21);

        addyear.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(addyear);
        addyear.setBounds(1052, 231, 158, 30);

        leaveyear.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(leaveyear);
        leaveyear.setBounds(1052, 283, 158, 30);

        gaddno.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(gaddno);
        gaddno.setBounds(1052, 181, 158, 30);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("G.ADDMISSION  YEAR:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(818, 240, 202, 21);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("G.LEAVE YEAR:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(818, 292, 189, 21);

        syaddno.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(syaddno);
        syaddno.setBounds(1050, 410, 158, 30);

        syname.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        jPanel1.add(syname);
        syname.setBounds(1050, 510, 158, 30);

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("SY.ADDMISSION  NO:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(820, 410, 189, 21);

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("SY.GRADE:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(820, 460, 189, 21);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 0));
        jLabel18.setText("SY.NAME:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(820, 510, 189, 21);

        sygrade.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        sygrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1-A", "1-B", "1-C", "1-D", " ", "2-A", "2-B", "2-C", "2-D", " ", "3-A", "3-B", "3-C", "3-D", " ", "4-A", "4-B", "4-C", "4-D", " ", "5-A", "5-B", "5-C", "5-D", " ", "6-A", "6-B", "6-C", "6-D", " ", "7-A", "7-B", "7-C", "7-D", " ", "8-A", "8-B", "8-C", "8-D", " ", "9-A", "9-B", "9-C", "9-D", " ", "10-A", "10-B", "10-C", "10-D", " ", "11-A", "11-B", "11-C", "11-D", " ", "12-A", "12-B", "12-C", "12-D", " ", "13-A", "13-B", "13-C", "13-D" }));
        sygrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sygradeActionPerformed(evt);
            }
        });
        jPanel1.add(sygrade);
        sygrade.setBounds(1050, 460, 158, 28);

        jLabel19.setFont(new java.awt.Font("Theola Kids", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Sibling's Details");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(930, 360, 189, 29);

        jLabel20.setFont(new java.awt.Font("Theola Kids", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Gardian's Details");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(920, 130, 240, 29);

        jLabel21.setFont(new java.awt.Font("Theola Kids", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Student's Details");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(30, 90, 177, 29);

        mainmenu.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        mainmenu.setText("MAIN MENU");
        mainmenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainmenuActionPerformed(evt);
            }
        });
        jPanel1.add(mainmenu);
        mainmenu.setBounds(1060, 570, 140, 27);

        back.setFont(new java.awt.Font("Lucida Bright", 1, 16)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 570, 90, 27);

        extra.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraActionPerformed(evt);
            }
        });
        jPanel1.add(extra);
        extra.setBounds(240, 460, 260, 28);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/study2.jpg"))); // NOI18N
        jPanel1.add(jLabel12);
        jLabel12.setBounds(140, -30, 1350, 670);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 51));
        jLabel23.setText("Co-Curicular Activities");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(20, 410, 190, 40);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/study2.jpg"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(0, 0, 1290, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gradeActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void birthdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birthdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birthdayActionPerformed

    private void gardiansnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gardiansnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gardiansnameActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       // TODO add your handling code here:
       try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:MySQL://172.20.10.2:3306/schoolmanagement2","root","pass");
      
            Statement stmt=con.createStatement();
            
            int sid=Integer.parseInt(stuid.getText());
            String sname=name.getText();
            String saddress=address.getText();
            String sgrade=(String) grade.getSelectedItem();
            //int sage=Integer.parseInt(co.getText());
            long sbday=Date.parse(birthday.getText());
            String coac=co.getText();
            String extrac=extra.getText();
            java.sql.Date bday=new java.sql.Date(sbday);
            String sgender=(String)gender.getSelectedItem();
            long addmission=Date.parse(addmisiondate.getText());
            java.sql.Date sadd=new java.sql.Date(addmission);
            String sgardian=gardiansname.getText();
            int scontact=Integer.parseInt(contactno.getText());
            int Gaddno=Integer.parseInt(gaddno.getText());
            int Gaddyear=Integer.parseInt(addyear.getText());
            int Leaveyear=Integer.parseInt(leaveyear.getText());
            int Syaddno=Integer.parseInt(syaddno.getText());
            String Sygrade=(String) sygrade.getSelectedItem();
            String Syname=syname.getText();
//tttvhvgu
            String query="INSERT INTO student(ID,Name,Address,Grade,Birthday,Co-Activities,Extra-Activities,Gender,Admission,Gurdian,ContactNo,G_AddNo,G_AddYear,G_LeaveYear,SY_AddNo,SY_Grade,SY_Name)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
       
            PreparedStatement preparedStmt=(PreparedStatement) con.prepareStatement(query);
            preparedStmt.setInt(1,sid);
            preparedStmt.setString(2,sname);
            preparedStmt.setString(3,saddress);
            preparedStmt.setString(4,sgrade);
            preparedStmt.setString(5,coac);
            preparedStmt.setString(6,extrac);
            //preparedStmt.setInt(5, sage);
            preparedStmt.setDate(7,bday);
            preparedStmt.setString(8,sgender);
            preparedStmt.setDate(9,sadd);
            preparedStmt.setString(10,sgardian);
            preparedStmt.setInt(11, scontact); 
            preparedStmt.setInt(12,Gaddno);
            preparedStmt.setInt(13,Gaddyear);
            preparedStmt.setInt(14,Leaveyear);
            preparedStmt.setInt(15,Syaddno);
            preparedStmt.setString(16,Sygrade);
            preparedStmt.setString(17,Syname);
            
            preparedStmt.execute();
            JOptionPane.showMessageDialog(null,"DATA IS ADDED");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_submitActionPerformed
        
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
     try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:MySQL://172.20.10.2:3306/schoolmanagement2","root","pass");
      
            Statement stmt = con.createStatement();
        int sid = Integer.parseInt(stuid.getText());

        String query = "SELECT * FROM student WHERE ID=?";
        PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);
        preparedStmt.setInt(1, sid);

        ResultSet rs = preparedStmt.executeQuery();

        while (rs.next()) {
            addmisiondate.setText(rs.getDate("Admission").toString());
            birthday.setText(rs.getDate("Birthday").toString());
            gardiansname.setText(rs.getString("Gurdian"));
            name.setText(rs.getString("Name"));
            address.setText(rs.getString("Address"));
            grade.setSelectedItem(rs.getString("Grade"));
           // co.setText(Integer.toString(rs.getInt("Co-Activities")));
            co.setText(rs.getString("Co_Activities"));
            extra.setText(rs.getString("Extra_Activities"));
            gender.setSelectedItem(rs.getString("Gender"));
             contactno.setText(Integer.toString(rs.getInt("ContactNo")));
            gaddno.setText(Integer.toString(rs.getInt("G_AddNo")));
            addyear.setText(Integer.toString(rs.getInt("G_AddYear")));
            leaveyear.setText(Integer.toString(rs.getInt("G_LeaveYear")));
            syaddno.setText(Integer.toString(rs.getInt("SY_AddNo")));
            sygrade.setSelectedItem(rs.getString("SY_Grade"));
            syname.setText(rs.getString("SY_Name"));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    }//GEN-LAST:event_searchActionPerformed
    private void reset(){
       stuid.setText("");
       name.setText("");
       address.setText("");
       grade.setSelectedItem("");
       co.setText("");
       extra.setText("");
       birthday.setText("");
       gender.setSelectedItem("");
       addmisiondate.setText("");
       gardiansname.setText("");
       contactno.setText("");
       gaddno.setText("");
       addyear.setText("");
       leaveyear.setText("");
       syaddno.setText("");
       sygrade.setSelectedItem("");
       syname.setText("");
    }
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       reset();
    }//GEN-LAST:event_resetActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
                                              
    try {
         Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:MySQL://172.20.10.2:3306/schoolmanagement2","root","pass");
      
            Statement stmt = con.createStatement();

        int sid=Integer.parseInt(stuid.getText());
            String sname=name.getText();
            String saddress=address.getText();
            String sgrade=(String) grade.getSelectedItem();
            //int sage=Integer.parseInt(co.getText());
            long sbday=Date.parse(birthday.getText());
            String coac=co.getText();
            String extrac=extra.getText();
            java.sql.Date bday=new java.sql.Date(sbday);
            String sgender=(String)gender.getSelectedItem();
            long addmission=Date.parse(addmisiondate.getText());
            java.sql.Date sadd=new java.sql.Date(addmission);
            String sgardian=gardiansname.getText();
            int scontact=Integer.parseInt(contactno.getText());
            int Gaddno=Integer.parseInt(gaddno.getText());
            int Gaddyear=Integer.parseInt(addyear.getText());
            int Leaveyear=Integer.parseInt(leaveyear.getText());
            int Syaddno=Integer.parseInt(syaddno.getText());
            String Sygrade=(String) sygrade.getSelectedItem();
            String Syname=syname.getText();
        String query = "UPDATE student SET Name=?, Address=?, Grade=?, Co-Activities=?,Extra-Activities=?, Birthday=?, Gender=?, Admission=?, Gurdian=?, ContactNo=?, G_AddNo=?, G_AddYear=?, G_LeaveYear=?, SY_AddNo=?, SY_Grade=?, SY_Name=? WHERE ID=?";

        PreparedStatement preparedStmt = (PreparedStatement) con.prepareStatement(query);

        preparedStmt.setInt(1,sid);
            preparedStmt.setString(2,sname);
            preparedStmt.setString(3,saddress);
            preparedStmt.setString(4,sgrade);
            preparedStmt.setString(5,coac);
            preparedStmt.setString(6,extrac);
            //preparedStmt.setInt(5, sage);
            preparedStmt.setDate(7,bday);
            preparedStmt.setString(8,sgender);
            preparedStmt.setDate(9,sadd);
            preparedStmt.setString(10,sgardian);
            preparedStmt.setInt(11, scontact); 
            preparedStmt.setInt(12,Gaddno);
            preparedStmt.setInt(13,Gaddyear);
            preparedStmt.setInt(14,Leaveyear);
            preparedStmt.setInt(15,Syaddno);
            preparedStmt.setString(16,Sygrade);
            preparedStmt.setString(17,Syname);
        preparedStmt.executeUpdate();
        JOptionPane.showConfirmDialog(null, "DATA IS UPDATED");
    } catch (Exception e) {
        System.out.println(e);
    }
}

      

    private void jButton2ActionPerformed() {                                         
       try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:MySQL://172.20.10.2:3306/schoolmanagement2","root","pass");
      
            Statement stmt=con.createStatement();
           int sid=Integer.parseInt(stuid.getText());
           
           String query="SELECT * FROM student";
           ResultSet rs = stmt.executeQuery(query);
           
           while(rs.next()){
               if(sid==rs.getInt("S.ID"));
               {
               addmisiondate.setText(rs.getDate("admission").toString());
               birthday.setText(rs.getDate("birthday").toString());
             
               gardiansname.setText(rs.getString("gu rdian"));
               name.setText(rs.getString("name"));
               address.setText(rs.getString("address"));
               grade.setSelectedItem(rs.getString("grade"));
               //co.setText(String.format("%s",rs.getInt("age")));
                co.setText(rs.getString("Co-Activities"));
                 extra.setText(rs.getString("Extra-Activities"));
               gender.setSelectedItem(rs.getString("gender"));
               contactno.setText(String.format(0 + "%s",rs.getInt("contact")));
               addmisiondate.setText(String.format("%d",rs.getDate("admission")));
               //gender.setSelectedItem(rs.getString("gender"));
              // gardiansname.setText(rs.getString("guardian"));
               birthday.setText(String.format("%d",rs.getInt("birthday")));
               //contactno.setText(String.format(0 + "%s",rs.getInt("contactno")));
               
           } 
           }
           
       }
       catch(Exception e){
           System.out.println(e);
       }
    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
             Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:MySQL://172.20.10.2:3306/schoolmanagement2","root","pass");
      
            Statement stmt =con.createStatement();
            int sid=Integer.parseInt(stuid.getText());
            
            String query="DELETE FROM student WHERE ID="+sid+"";
            
            stmt.executeUpdate(query);
            reset();
            JOptionPane.showMessageDialog(null,"DELETED THIS DATA");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void stuidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stuidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stuidActionPerformed

    private void contactnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactnoActionPerformed

    private void sygradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sygradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sygradeActionPerformed

    private void mainmenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainmenuActionPerformed
          setVisible(false);
         Home view=new Home();
         view.setVisible(true);
        // TODO add your handling code here:
                // TODO add your handling code here:
    }//GEN-LAST:event_mainmenuActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
         setVisible(false);
         allstudent view=new allstudent();
         view.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_backActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void coActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_coActionPerformed

    private void extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraActionPerformed

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
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addmisiondate;
    private javax.swing.JTextField address;
    private javax.swing.JTextField addyear;
    private javax.swing.JButton back;
    private javax.swing.JTextField birthday;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JTextField co;
    private javax.swing.JTextField contactno;
    private javax.swing.JButton delete;
    private javax.swing.JTextField extra;
    private javax.swing.JTextField gaddno;
    private javax.swing.JTextField gardiansname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> grade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField leaveyear;
    private javax.swing.JButton mainmenu;
    private javax.swing.JTextField name;
    private javax.swing.JButton reset;
    private javax.swing.JButton search;
    private javax.swing.JTextField stuid;
    private javax.swing.JButton submit;
    private javax.swing.JTextField syaddno;
    private javax.swing.JComboBox<String> sygrade;
    private javax.swing.JTextField syname;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
 private Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}