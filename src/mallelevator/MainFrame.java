package mallelevator;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Asansörlerdeki Talep Yoğunluğunun Multithread ile Kontrolü");
        jPanel1.setVisible(true);
        jPanel2.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        btnStartApplication = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblMallQueue0 = new javax.swing.JLabel();
        lblMallQueue1 = new javax.swing.JLabel();
        lblMallQueue2 = new javax.swing.JLabel();
        lblMallQueue3 = new javax.swing.JLabel();
        lblMallQueue4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaElevator1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaElevator3 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaElevator2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaElevator4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaElevator5 = new javax.swing.JTextArea();
        lblMallCustomers0 = new javax.swing.JLabel();
        lblMallCustomers1 = new javax.swing.JLabel();
        lblMallCustomers2 = new javax.swing.JLabel();
        lblMallCustomers3 = new javax.swing.JLabel();
        lblMallCustomers4 = new javax.swing.JLabel();
        lblMallExitCount = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLayeredPane1.setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(35, 43, 56));

        btnStartApplication.setBackground(new java.awt.Color(35, 43, 56));
        btnStartApplication.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        btnStartApplication.setForeground(new java.awt.Color(255, 255, 255));
        btnStartApplication.setText("Start Application!");
        btnStartApplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartApplicationActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Poyraz Aktaş - 180201109");

        jLabel2.setFont(new java.awt.Font("Ubuntu Mono", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("      Emre Alphan  - 180201052");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStartApplication, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE))
                .addGap(413, 413, 413))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(btnStartApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel1, "card2");

        jPanel2.setBackground(new java.awt.Color(35, 43, 56));

        lblMallQueue0.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallQueue0.setForeground(new java.awt.Color(255, 255, 255));
        lblMallQueue0.setText("lblMallQueue0");

        lblMallQueue1.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallQueue1.setForeground(new java.awt.Color(255, 255, 255));
        lblMallQueue1.setText("lblMallQueue1");

        lblMallQueue2.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallQueue2.setForeground(new java.awt.Color(255, 255, 255));
        lblMallQueue2.setText("lblMallQueue2");

        lblMallQueue3.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallQueue3.setForeground(new java.awt.Color(255, 255, 255));
        lblMallQueue3.setText("lblMallQueue3");

        lblMallQueue4.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallQueue4.setForeground(new java.awt.Color(255, 255, 255));
        lblMallQueue4.setText("lblMallQueue4");

        txtAreaElevator1.setBackground(new java.awt.Color(35, 43, 56));
        txtAreaElevator1.setColumns(20);
        txtAreaElevator1.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        txtAreaElevator1.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaElevator1.setRows(5);
        jScrollPane1.setViewportView(txtAreaElevator1);

        txtAreaElevator3.setBackground(new java.awt.Color(35, 43, 56));
        txtAreaElevator3.setColumns(20);
        txtAreaElevator3.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        txtAreaElevator3.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaElevator3.setRows(5);
        jScrollPane2.setViewportView(txtAreaElevator3);

        txtAreaElevator2.setBackground(new java.awt.Color(35, 43, 56));
        txtAreaElevator2.setColumns(20);
        txtAreaElevator2.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        txtAreaElevator2.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaElevator2.setRows(5);
        jScrollPane3.setViewportView(txtAreaElevator2);

        txtAreaElevator4.setBackground(new java.awt.Color(35, 43, 56));
        txtAreaElevator4.setColumns(20);
        txtAreaElevator4.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        txtAreaElevator4.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaElevator4.setRows(5);
        jScrollPane4.setViewportView(txtAreaElevator4);

        txtAreaElevator5.setBackground(new java.awt.Color(35, 43, 56));
        txtAreaElevator5.setColumns(20);
        txtAreaElevator5.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        txtAreaElevator5.setForeground(new java.awt.Color(255, 255, 255));
        txtAreaElevator5.setRows(5);
        jScrollPane5.setViewportView(txtAreaElevator5);

        lblMallCustomers0.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallCustomers0.setForeground(new java.awt.Color(255, 255, 255));
        lblMallCustomers0.setText("lblMallCustomers0");

        lblMallCustomers1.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallCustomers1.setForeground(new java.awt.Color(255, 255, 255));
        lblMallCustomers1.setText("lblMallCustomers1");

        lblMallCustomers2.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallCustomers2.setForeground(new java.awt.Color(255, 255, 255));
        lblMallCustomers2.setText("lblMallCustomers2");

        lblMallCustomers3.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallCustomers3.setForeground(new java.awt.Color(255, 255, 255));
        lblMallCustomers3.setText("lblMallCustomers3");

        lblMallCustomers4.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallCustomers4.setForeground(new java.awt.Color(255, 255, 255));
        lblMallCustomers4.setText("lblMallCustomers4");

        lblMallExitCount.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        lblMallExitCount.setForeground(new java.awt.Color(255, 255, 255));
        lblMallExitCount.setText("lblMallExitCount");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMallCustomers3, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMallCustomers4, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMallExitCount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMallQueue2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMallQueue1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMallCustomers0, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMallCustomers1, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMallCustomers2, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblMallQueue0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMallQueue3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMallQueue4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(lblMallQueue0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallQueue1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallQueue2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallQueue3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallQueue4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallExitCount)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblMallCustomers0)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallCustomers1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallCustomers2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallCustomers3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblMallCustomers4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        jLayeredPane1.add(jPanel2, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartApplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartApplicationActionPerformed
        jPanel1.setVisible(false);
        jPanel2.setVisible(true);

        JLabel[] labels = new JLabel[20];
        JTextArea[] textAreas = new JTextArea[20];

        labels[0] = lblMallQueue0;
        labels[1] = lblMallQueue1;
        labels[2] = lblMallQueue2;
        labels[3] = lblMallQueue3;
        labels[4] = lblMallQueue4;

        labels[5] = lblMallCustomers0;
        labels[6] = lblMallCustomers1;
        labels[7] = lblMallCustomers2;
        labels[8] = lblMallCustomers3;
        labels[9] = lblMallCustomers4;
        labels[10] = lblMallExitCount;

        textAreas[0] = txtAreaElevator1;
        textAreas[1] = txtAreaElevator2;
        textAreas[2] = txtAreaElevator3;
        textAreas[3] = txtAreaElevator4;
        textAreas[4] = txtAreaElevator5;

        Mall[] mall = new Mall[5];
        mall[0] = new Mall("0. floor");
        mall[1] = new Mall("1. floor");
        mall[2] = new Mall("2. floor");
        mall[3] = new Mall("3. floor");
        mall[4] = new Mall("4. floor");

        ThreadAvmLogin threadAvmLogin = new ThreadAvmLogin("Avm Login Thread", mall);
        ThreadElevator threadFirstElevator = new ThreadElevator("Elevator-1", mall);
        ThreadElevator threadSecondElevator = new ThreadElevator("Elevator-2", mall);
        ThreadElevator threadThirdElevator = new ThreadElevator("Elevator-3", mall);
        ThreadElevator threadFourthElevator = new ThreadElevator("Elevator-4", mall);
        ThreadElevator threadFifthElevator = new ThreadElevator("Elevator-5", mall);
        ThreadAvmExit threadAvmExit = new ThreadAvmExit("Avm Exit Thread", mall);
        ThreadFloorController threadFloorController = new ThreadFloorController(mall, labels, textAreas, threadFirstElevator,
                threadSecondElevator, threadThirdElevator, threadFourthElevator, threadFifthElevator);

        Thread t = new Thread(threadFloorController);
        threadAvmLogin.start();
        threadAvmExit.start();
        t.start(); // bu controller için
    }//GEN-LAST:event_btnStartApplicationActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnStartApplication;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblMallCustomers0;
    private javax.swing.JLabel lblMallCustomers1;
    private javax.swing.JLabel lblMallCustomers2;
    private javax.swing.JLabel lblMallCustomers3;
    private javax.swing.JLabel lblMallCustomers4;
    private javax.swing.JLabel lblMallExitCount;
    private javax.swing.JLabel lblMallQueue0;
    private javax.swing.JLabel lblMallQueue1;
    private javax.swing.JLabel lblMallQueue2;
    private javax.swing.JLabel lblMallQueue3;
    private javax.swing.JLabel lblMallQueue4;
    private javax.swing.JTextArea txtAreaElevator1;
    private javax.swing.JTextArea txtAreaElevator2;
    private javax.swing.JTextArea txtAreaElevator3;
    private javax.swing.JTextArea txtAreaElevator4;
    private javax.swing.JTextArea txtAreaElevator5;
    // End of variables declaration//GEN-END:variables
}
