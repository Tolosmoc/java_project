package Swing;

import file.*;

import java.awt.CardLayout;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

import static Swing.file.Zip.zipFile;

public class Software extends javax.swing.JFrame {

    CardLayout cardLayout;
    JFileChooser chooser;
    String chooserTitle;
    int duration;
    
    public Software(String User, String IPadress) {
        this.setUndecorated(true);
        initComponents();
        username.setText(User);
        ipadress.setText(IPadress);
        cardLayout = (CardLayout)(CardTab.getLayout());
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        timeChooser = new javax.swing.ButtonGroup();
        jSplitPane2 = new javax.swing.JSplitPane();
        CardTab = new javax.swing.JPanel();
        SynchroCard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sourcePathSynchro = new javax.swing.JTextField();
        targetPathSynchro = new javax.swing.JTextField();
        targetBtnSynchro = new javax.swing.JButton();
        sourceBtnSynchro = new javax.swing.JButton();
        launchSynchro = new javax.swing.JButton();
        TimerCard = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sourcePathTimer = new javax.swing.JTextField();
        sourceBtnTimer = new javax.swing.JButton();
        targetBtnTimer = new javax.swing.JButton();
        targetPathTimer = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        launchTimingSynchro = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        timerBtnED = new javax.swing.JRadioButton();
        timerBtnST = new javax.swing.JRadioButton();
        timerBtnCO = new javax.swing.JRadioButton();
        specificTimeChooser = new javax.swing.JPanel();
        hour = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        minute = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        second = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        ZipCard = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sourcePathZip = new javax.swing.JTextField();
        sourceBtnZip = new javax.swing.JButton();
        launchZip = new javax.swing.JButton();
        targetBtnZip = new javax.swing.JButton();
        targetPathZip = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JavaCloudCard = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        ipadress = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        SynchronizationBtn = new javax.swing.JButton();
        TimerBtn = new javax.swing.JButton();
        JavaCloudBtn = new javax.swing.JButton();
        ZipBtn = new javax.swing.JButton();
        OSicon = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        reduce = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                Software.this.windowClosing(evt);
            }
        });

        CardTab.setLayout(new java.awt.CardLayout());

        SynchroCard.setBackground(new java.awt.Color(204, 204, 204));
        SynchroCard.setName("");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel1.setText("Synchronization");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel2.setText("Target Path:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel3.setText("Source Path:");

        sourcePathSynchro.setEditable(false);
        sourcePathSynchro.setMaximumSize(new java.awt.Dimension(64, 22));

        targetPathSynchro.setEditable(false);
        targetPathSynchro.setMaximumSize(new java.awt.Dimension(64, 22));

        targetBtnSynchro.setText("Choose...");
        targetBtnSynchro.setActionCommand("targetPathChooserSynchro");
        targetBtnSynchro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        targetBtnSynchro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetBtnSynchroActionPerformed(evt);
            }
        });

        sourceBtnSynchro.setText("Choose...");
        sourceBtnSynchro.setActionCommand("sourcePathChooserSynchro");
        sourceBtnSynchro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sourceBtnSynchro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceBtnSynchroActionPerformed(evt);
            }
        });

        launchSynchro.setBackground(new java.awt.Color(186, 79, 84));
        launchSynchro.setFont(new java.awt.Font("Segoe UI", 1, 18));
        launchSynchro.setForeground(new java.awt.Color(204, 204, 204));
        launchSynchro.setText("LAUNCH");
        launchSynchro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        launchSynchro.setBorderPainted(false);
        launchSynchro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchSynchroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SynchroCardLayout = new javax.swing.GroupLayout(SynchroCard);
        SynchroCard.setLayout(SynchroCardLayout);
        SynchroCardLayout.setHorizontalGroup(
            SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SynchroCardLayout.createSequentialGroup()
                .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SynchroCardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1))
                    .addGroup(SynchroCardLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sourcePathSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(targetPathSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(targetBtnSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sourceBtnSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SynchroCardLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(launchSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(178, Short.MAX_VALUE))
        );
        SynchroCardLayout.setVerticalGroup(
            SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SynchroCardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(103, 103, 103)
                .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourcePathSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceBtnSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(SynchroCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetPathSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetBtnSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(launchSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );

        CardTab.add(SynchroCard, "SynchroCard");

        TimerCard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel4.setText("Target Path:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel5.setText("Source Path:");

        sourcePathTimer.setEditable(false);
        sourcePathTimer.setMaximumSize(new java.awt.Dimension(64, 22));

        sourceBtnTimer.setText("Choose...");
        sourceBtnTimer.setActionCommand("sourcePathChooserTimer");
        sourceBtnTimer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sourceBtnTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceBtnTimerActionPerformed(evt);
            }
        });

        targetBtnTimer.setText("Choose...");
        targetBtnTimer.setActionCommand("targetPathChooserTimer");
        targetBtnTimer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        targetBtnTimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetBtnTimerActionPerformed(evt);
            }
        });

        targetPathTimer.setEditable(false);
        targetPathTimer.setMaximumSize(new java.awt.Dimension(64, 22));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel6.setText("Timing synchronization");

        launchTimingSynchro.setBackground(new java.awt.Color(186, 79, 84));
        launchTimingSynchro.setFont(new java.awt.Font("Segoe UI", 1, 18));
        launchTimingSynchro.setForeground(new java.awt.Color(204, 204, 204));
        launchTimingSynchro.setText("LAUNCH");
        launchTimingSynchro.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        launchTimingSynchro.setBorderPainted(false);
        launchTimingSynchro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchTimingSynchroActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel7.setText("Timer:");

        timeChooser.add(timerBtnED);
        timerBtnED.setText("Every day");
        timerBtnED.setActionCommand("disableTimeChooser");
        timerBtnED.setContentAreaFilled(false);
        timerBtnED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBtnEDActionPerformed(evt);
            }
        });

        timeChooser.add(timerBtnST);
        timerBtnST.setSelected(true);
        timerBtnST.setText("Specific timing");
        timerBtnST.setActionCommand("enableTimeChooser");
        timerBtnST.setContentAreaFilled(false);
        timerBtnST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBtnSTActionPerformed(evt);
            }
        });

        timeChooser.add(timerBtnCO);
        timerBtnCO.setText("Clone once");
        timerBtnCO.setActionCommand("disableTimeChooser");
        timerBtnCO.setContentAreaFilled(false);
        timerBtnCO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timerBtnCOActionPerformed(evt);
            }
        });

        specificTimeChooser.setBackground(new java.awt.Color(204, 204, 204));

        hour.setModel(new javax.swing.SpinnerNumberModel(0, 0, 23, 1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel11.setText("hr");

        minute.setModel(new javax.swing.SpinnerNumberModel(0, 0, 59, 1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel12.setText("min");

        second.setModel(new javax.swing.SpinnerNumberModel(1, 0, 59, 1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14));
        jLabel13.setText("sec");

        javax.swing.GroupLayout specificTimeChooserLayout = new javax.swing.GroupLayout(specificTimeChooser);
        specificTimeChooser.setLayout(specificTimeChooserLayout);
        specificTimeChooserLayout.setHorizontalGroup(
            specificTimeChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(specificTimeChooserLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        specificTimeChooserLayout.setVerticalGroup(
            specificTimeChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, specificTimeChooserLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addGroup(specificTimeChooserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(minute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(second, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        javax.swing.GroupLayout TimerCardLayout = new javax.swing.GroupLayout(TimerCard);
        TimerCard.setLayout(TimerCardLayout);
        TimerCardLayout.setHorizontalGroup(
            TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimerCardLayout.createSequentialGroup()
                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TimerCardLayout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TimerCardLayout.createSequentialGroup()
                                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(TimerCardLayout.createSequentialGroup()
                                        .addComponent(sourcePathTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(targetBtnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(sourceBtnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, TimerCardLayout.createSequentialGroup()
                                            .addComponent(timerBtnED, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(timerBtnST)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(timerBtnCO, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(specificTimeChooser, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(TimerCardLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(targetPathTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(TimerCardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TimerCardLayout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(launchTimingSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        TimerCardLayout.setVerticalGroup(
            TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TimerCardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel6)
                .addGap(113, 113, 113)
                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourcePathTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceBtnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetPathTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetBtnTimer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(TimerCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timerBtnED)
                    .addComponent(timerBtnST)
                    .addComponent(timerBtnCO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(specificTimeChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(launchTimingSynchro, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );

        CardTab.add(TimerCard, "TimerCard");

        ZipCard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel8.setText("Source Path:");

        sourcePathZip.setEditable(false);

        sourceBtnZip.setText("Choose...");
        sourceBtnZip.setActionCommand("sourcePathChooserSynchro");
        sourceBtnZip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sourceBtnZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceBtnZipActionPerformed(evt);
            }
        });

        launchZip.setBackground(new java.awt.Color(186, 79, 84));
        launchZip.setFont(new java.awt.Font("Segoe UI", 1, 18));
        launchZip.setForeground(new java.awt.Color(204, 204, 204));
        launchZip.setText("LAUNCH");
        launchZip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        launchZip.setBorderPainted(false);
        launchZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                launchZipActionPerformed(evt);
            }
        });

        targetBtnZip.setText("Choose...");
        targetBtnZip.setActionCommand("targetPathChooserSynchro");
        targetBtnZip.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        targetBtnZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetBtnZipActionPerformed(evt);
            }
        });

        targetPathZip.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14));
        jLabel9.setText("Zip Path:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel10.setText("Zip");

        javax.swing.GroupLayout ZipCardLayout = new javax.swing.GroupLayout(ZipCard);
        ZipCard.setLayout(ZipCardLayout);
        ZipCardLayout.setHorizontalGroup(
            ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZipCardLayout.createSequentialGroup()
                .addGroup(ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ZipCardLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel10))
                    .addGroup(ZipCardLayout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(launchZip, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ZipCardLayout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ZipCardLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(targetPathZip))
                            .addGroup(ZipCardLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(sourcePathZip, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)
                        .addGroup(ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sourceBtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(targetBtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(182, Short.MAX_VALUE))
        );
        ZipCardLayout.setVerticalGroup(
            ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ZipCardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10)
                .addGap(111, 111, 111)
                .addGroup(ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourcePathZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceBtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(ZipCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(targetPathZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetBtnZip, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72)
                .addComponent(launchZip, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(222, Short.MAX_VALUE))
        );



        CardTab.add(ZipCard, "ZipCard");

        JavaCloudCard.setBackground(new java.awt.Color(204, 204, 204));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel15.setText("User:");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 24));
        jLabel16.setText("JavaCloud");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 18));
        jLabel17.setText("IP:");

        username.setEditable(false);

        ipadress.setEditable(false);

        javax.swing.GroupLayout JavaCloudCardLayout = new javax.swing.GroupLayout(JavaCloudCard);
        JavaCloudCard.setLayout(JavaCloudCardLayout);
        JavaCloudCardLayout.setHorizontalGroup(
            JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JavaCloudCardLayout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel15))
                .addGap(94, 94, 94)
                .addGroup(JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(ipadress))
                .addGap(191, 191, 191))
            .addGroup(JavaCloudCardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addGap(90, 90, 90))
        );
        JavaCloudCardLayout.setVerticalGroup(
            JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JavaCloudCardLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel16)
                .addGap(88, 88, 88)
                .addGroup(JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addGroup(JavaCloudCardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ipadress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(331, 331, 331))
        );

        CardTab.add(JavaCloudCard, "HistoryCard");

        jSplitPane2.setRightComponent(CardTab);

        jPanel1.setBackground(new java.awt.Color(74, 31, 61));
        jPanel1.setPreferredSize(new java.awt.Dimension(180, 614));

        SynchronizationBtn.setBackground(new java.awt.Color(74, 31, 61));
        SynchronizationBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        SynchronizationBtn.setForeground(new java.awt.Color(255, 255, 255));
        SynchronizationBtn.setText("Synchronization");
        SynchronizationBtn.setToolTipText("");
        SynchronizationBtn.setBorder(null);
        SynchronizationBtn.setBorderPainted(false);
        SynchronizationBtn.setContentAreaFilled(false);
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
        TimerBtn.setBorderPainted(false);
        TimerBtn.setContentAreaFilled(false);
        TimerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimerBtnActionPerformed(evt);
            }
        });

        JavaCloudBtn.setBackground(new java.awt.Color(74, 31, 61));
        JavaCloudBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        JavaCloudBtn.setForeground(new java.awt.Color(255, 255, 255));
        JavaCloudBtn.setText("JavaCloud");
        JavaCloudBtn.setToolTipText("");
        JavaCloudBtn.setBorder(null);
        JavaCloudBtn.setBorderPainted(false);
        JavaCloudBtn.setContentAreaFilled(false);
        JavaCloudBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JavaCloudBtnActionPerformed(evt);
            }
        });

        ZipBtn.setBackground(new java.awt.Color(74, 31, 61));
        ZipBtn.setFont(new java.awt.Font("Segoe UI", 1, 12));
        ZipBtn.setForeground(new java.awt.Color(255, 255, 255));
        ZipBtn.setText("Zip");
        ZipBtn.setToolTipText("");
        ZipBtn.setBorder(null);
        ZipBtn.setBorderPainted(false);
        ZipBtn.setContentAreaFilled(false);
        ZipBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZipBtnActionPerformed(evt);
            }
        });

        String SE = System.getProperty("os.name").toLowerCase();
        if((SE.indexOf("win") + SE.indexOf("mac") + SE.indexOf("nux")) == -3){
            OSicon.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\Swing\\icons\\pc.png"));
        }
        else {
            OSicon.setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\src\\Swing\\icons\\" + SE.substring(0,3) + ".png"));
        }

        Exit.setBackground(new java.awt.Color(74, 31, 61));
        Exit.setFont(new java.awt.Font("Segoe UI", 1, 12));
        Exit.setForeground(new java.awt.Color(186, 79, 84));
        Exit.setText("Quit");
        Exit.setToolTipText("");
        Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Exit.setContentAreaFilled(false);
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        reduce.setBackground(new java.awt.Color(74, 31, 61));
        reduce.setFont(new java.awt.Font("Segoe UI", 1, 12));
        reduce.setForeground(new java.awt.Color(186, 79, 84));
        reduce.setText("Reduce");
        reduce.setToolTipText("");
        reduce.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reduce.setContentAreaFilled(false);
        reduce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reduceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SynchronizationBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(TimerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(OSicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JavaCloudBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reduce, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(ZipBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(OSicon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(JavaCloudBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(SynchronizationBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TimerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ZipBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(162, 162, 162)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reduce, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        jSplitPane2.setLeftComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
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

    private void JavaCloudBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "HistoryCard");
    }

    private void ZipBtnActionPerformed(java.awt.event.ActionEvent evt) {
        cardLayout.show(CardTab, "ZipCard");
    }

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the app ? It will stop the synchronization.", "Exit Program Message Box", JOptionPane.YES_NO_OPTION);
        
        if(confirmExit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    private void targetBtnSynchroActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser targetPath = chooseFolder();
    
        if (targetPath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            targetPathSynchro.setText((targetPath.getSelectedFile()).toString());
        }
    }

    private void sourceBtnSynchroActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser sourcePath = chooseFolder();
    
        if (sourcePath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sourcePathSynchro.setText((sourcePath.getSelectedFile()).toString());
        }
    }

    private void launchSynchroActionPerformed(java.awt.event.ActionEvent evt) {
        String target = targetPathSynchro.getText();
        String source = sourcePathSynchro.getText();
        if(!(target.equals("") || target.equals(source) || source.equals(""))){
            Synchronize sync1 = new Synchronize(source, target);
            Synchronize sync2 = sync1.inverse();
            if(launchSynchro.getText() == "LAUNCH"){
                sync1.init();
                sync2.init();
                sync1.start();
                sync2.start();

                sourceBtnSynchro.setVisible(false);
                targetBtnSynchro.setVisible(false);
                launchSynchro.setText("PAUSE");
            }
            else {
                sync1.interrupt();
                sync2.interrupt();
                sourceBtnSynchro.setVisible(true);
                targetBtnSynchro.setVisible(true);
                launchSynchro.setText("LAUNCH");
            }
        }
    }

    private void timerBtnSTActionPerformed(java.awt.event.ActionEvent evt) {
       specificTimeChooser.setVisible(true);
    }

    private void timerBtnEDActionPerformed(java.awt.event.ActionEvent evt) {
        specificTimeChooser.setVisible(false);
    }

    private void launchTimingSynchroActionPerformed(java.awt.event.ActionEvent evt) {
        String target = targetPathTimer.getText();
        String source = sourcePathTimer.getText();
        if(!(target.equals("") || target.equals(source) || source.equals(""))) {
            if(timerBtnCO.isSelected()){ // Clone Once
                if (launchTimingSynchro.getText() == "LAUNCH") {
                    new Clone(source, target).doOnce();
                }
            }
            else {
                if (timerBtnED.isSelected()) { // Every day
                    duration = 86400000;
                }
                else{ // Timer
                    duration = ((Integer) hour.getValue() * 3600 + (Integer) minute.getValue() * 60 + (Integer) second.getValue()) * 1000;
                }
                Clone clone = new Clone(duration, source, target);
                if (launchTimingSynchro.getText() == "LAUNCH") {
                    clone.start();
                    sourceBtnTimer.setVisible(false);
                    targetBtnTimer.setVisible(false);
                    launchTimingSynchro.setText("PAUSE");
                }
                else {
                    clone.interrupt();
                    sourceBtnTimer.setVisible(true);
                    targetBtnTimer.setVisible(true);
                    launchTimingSynchro.setText("LAUNCH");
                }
            }
        }

    }

    private void targetBtnTimerActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser targetPath = chooseFolder();
    
        if (targetPath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            targetPathTimer.setText((targetPath.getSelectedFile()).toString());
        }
    }

    private void sourceBtnTimerActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser sourcePath = chooseFolder();
    
        if (sourcePath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sourcePathTimer.setText((sourcePath.getSelectedFile()).toString());
        }
    }

    private void sourceBtnZipActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser targetPath = chooseFolder();
    
        if (targetPath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            sourcePathZip.setText((targetPath.getSelectedFile()).toString());
        }
    }

    private void launchZipActionPerformed(java.awt.event.ActionEvent evt) {
        String target = targetPathZip.getText();
        String source = sourcePathZip.getText();
        if(!(target.equals("") || target.equals(source) || source.equals(""))){
            try {
                zipFile(target, source);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void targetBtnZipActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser targetPath = chooseFolder();
    
        if (targetPath.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            targetPathZip.setText((targetPath.getSelectedFile()).toString());
        }
    }

    private void windowClosing(java.awt.event.WindowEvent evt) {
        int confirmExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit the app ? It will stop the synchronization.", "Exit Program Message Box", JOptionPane.YES_NO_OPTION);
        
        if(confirmExit == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    private void reduceActionPerformed(java.awt.event.ActionEvent evt) {
        int confirmExit = JOptionPane.showConfirmDialog(null, "Are you sure you want to reduce the app ? The synchronization will continue in the background.", "Exit Program Message Box", JOptionPane.YES_NO_OPTION);
        
        if(confirmExit == JOptionPane.YES_OPTION){
            this.setVisible(false);
        }
    }

    private void timerBtnCOActionPerformed(java.awt.event.ActionEvent evt) {
        specificTimeChooser.setVisible(false);
    }
    
    private JFileChooser chooseFolder(){
        chooser = new JFileChooser(); 
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle(chooserTitle);
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        chooser.setAcceptAllFileFilterUsed(false);
        
        return chooser;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CardTab;
    private javax.swing.JButton Exit;
    private javax.swing.JButton JavaCloudBtn;
    private javax.swing.JPanel JavaCloudCard;
    private javax.swing.JLabel OSicon;
    private javax.swing.JPanel SynchroCard;
    private javax.swing.JButton SynchronizationBtn;
    private javax.swing.JButton TimerBtn;
    private javax.swing.JPanel TimerCard;
    private javax.swing.JButton ZipBtn;
    private javax.swing.JPanel ZipCard;
    private javax.swing.JSpinner hour;
    private javax.swing.JTextField ipadress;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JButton launchSynchro;
    private javax.swing.JButton launchTimingSynchro;
    private javax.swing.JButton launchZip;
    private javax.swing.JSpinner minute;
    private javax.swing.JButton reduce;
    private javax.swing.JSpinner second;
    private javax.swing.JButton sourceBtnSynchro;
    private javax.swing.JButton sourceBtnTimer;
    private javax.swing.JButton sourceBtnZip;
    private javax.swing.JTextField sourcePathSynchro;
    private javax.swing.JTextField sourcePathTimer;
    private javax.swing.JTextField sourcePathZip;
    private javax.swing.JPanel specificTimeChooser;
    private javax.swing.JButton targetBtnSynchro;
    private javax.swing.JButton targetBtnTimer;
    private javax.swing.JButton targetBtnZip;
    private javax.swing.JTextField targetPathSynchro;
    private javax.swing.JTextField targetPathTimer;
    private javax.swing.JTextField targetPathZip;
    private javax.swing.ButtonGroup timeChooser;
    private javax.swing.JRadioButton timerBtnCO;
    private javax.swing.JRadioButton timerBtnED;
    private javax.swing.JRadioButton timerBtnST;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
