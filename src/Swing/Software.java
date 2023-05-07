package Swing;

import java.awt.CardLayout;

public class Software extends javax.swing.JFrame {

    CardLayout cardLayout;
    
    public Software() {
        initComponents();
        
        cardLayout = (CardLayout)(CardTab.getLayout());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        CardTab = new javax.swing.JPanel();
        SynchroCard = new javax.swing.JPanel();
        TimerCard = new javax.swing.JPanel();
        ZipCard = new javax.swing.JPanel();
        HistoryCard = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SynchronizationBtn = new javax.swing.JButton();
        TimerBtn = new javax.swing.JButton();
        HistoryBtn = new javax.swing.JButton();
        ZipBtn = new javax.swing.JButton();
        OSicon = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        CardTab.setLayout(new java.awt.CardLayout());

        SynchroCard.setBackground(new java.awt.Color(255, 0, 204));
        SynchroCard.setName(""); // NOI18N

        javax.swing.GroupLayout SynchroCardLayout = new javax.swing.GroupLayout(SynchroCard);
        SynchroCard.setLayout(SynchroCardLayout);
        SynchroCardLayout.setHorizontalGroup(
            SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        SynchroCardLayout.setVerticalGroup(
            SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        CardTab.add(SynchroCard, "SynchroCard");

        TimerCard.setBackground(new java.awt.Color(255, 255, 0));

        javax.swing.GroupLayout TimerCardLayout = new javax.swing.GroupLayout(TimerCard);
        TimerCard.setLayout(TimerCardLayout);
        TimerCardLayout.setHorizontalGroup(
            TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        TimerCardLayout.setVerticalGroup(
            TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        CardTab.add(TimerCard, "TimerCard");

        ZipCard.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout ZipCardLayout = new javax.swing.GroupLayout(ZipCard);
        ZipCard.setLayout(ZipCardLayout);
        ZipCardLayout.setHorizontalGroup(
            ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        ZipCardLayout.setVerticalGroup(
            ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        CardTab.add(ZipCard, "ZipCard");

        HistoryCard.setBackground(new java.awt.Color(0, 255, 204));

        javax.swing.GroupLayout HistoryCardLayout = new javax.swing.GroupLayout(HistoryCard);
        HistoryCard.setLayout(HistoryCardLayout);
        HistoryCardLayout.setHorizontalGroup(
            HistoryCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 529, Short.MAX_VALUE)
        );
        HistoryCardLayout.setVerticalGroup(
            HistoryCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        CardTab.add(HistoryCard, "HistoryCard");

        jSplitPane2.setRightComponent(CardTab);

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));

        SynchronizationBtn.setBackground(new java.awt.Color(74, 31, 61));
        SynchronizationBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        SynchronizationBtn.setForeground(new java.awt.Color(255, 255, 255));
        SynchronizationBtn.setText("Synchronization");
        SynchronizationBtn.setToolTipText("");
        SynchronizationBtn.setBorder(null);
        SynchronizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SynchronizationBtnActionPerformed(evt);
            }
        });

        TimerBtn.setBackground(new java.awt.Color(74, 31, 61));
        TimerBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        TimerBtn.setForeground(new java.awt.Color(255, 255, 255));
        TimerBtn.setText("Timer");
        TimerBtn.setToolTipText("");
        TimerBtn.setBorder(null);
        TimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimerBtnActionPerformed(evt);
            }
        });

        HistoryBtn.setBackground(new java.awt.Color(74, 31, 61));
        HistoryBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        HistoryBtn.setForeground(new java.awt.Color(255, 255, 255));
        HistoryBtn.setText("History");
        HistoryBtn.setToolTipText("");
        HistoryBtn.setBorder(null);
        HistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HistoryBtnActionPerformed(evt);
            }
        });

        ZipBtn.setBackground(new java.awt.Color(74, 31, 61));
        ZipBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        ZipBtn.setForeground(new java.awt.Color(255, 255, 255));
        ZipBtn.setText("Zip");
        ZipBtn.setToolTipText("");
        ZipBtn.setBorder(null);
        ZipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipBtnActionPerformed(evt);
            }
        });

        String SE = System.getProperty("os.name").toLowerCase();
        if((SE.indexOf("win") + SE.indexOf("mac") + SE.indexOf("nux")) == -3){
            OSicon.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\Swing\\icons\\pc.png"));
        }
        else {
            OSicon.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\main\\java\\Swing\\icons\\" + SE.substring(0,3) + ".png"));
        }

        Exit.setBackground(new java.awt.Color(74, 31, 61));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12));
        Exit.setForeground(new java.awt.Color(186, 79, 84));
        Exit.setText("Quit");
        Exit.setToolTipText("");
        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SynchronizationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TimerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ZipBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(HistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OSicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(OSicon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(SynchronizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ZipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(HistoryBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane2.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void SynchronizationBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "SynchroCard");
    }

    private void TimerBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "TimerCard");
    }

    private void HistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "HistoryCard");
    }

    private void ZipBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "ZipCard");
    }
    
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Software.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Software().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardTab;
    private javax.swing.JButton Exit;
    private javax.swing.JButton HistoryBtn;
    private javax.swing.JPanel HistoryCard;
    private javax.swing.JLabel OSicon;
    private javax.swing.JPanel SynchroCard;
    private javax.swing.JButton SynchronizationBtn;
    private javax.swing.JButton TimerBtn;
    private javax.swing.JPanel TimerCard;
    private javax.swing.JButton ZipBtn;
    private javax.swing.JPanel ZipCard;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    // End of variables declaration//GEN-END:variables
}
