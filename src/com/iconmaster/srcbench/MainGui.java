package com.iconmaster.srcbench;

import com.iconmaster.source.assemble.Assembler;
import com.iconmaster.source.compile.SourceCompiler;
import com.iconmaster.source.compile.TypeChecker;
import com.iconmaster.source.element.Element;
import com.iconmaster.source.exception.SourceException;
import com.iconmaster.source.link.Linker;
import com.iconmaster.source.parse.Parser;
import com.iconmaster.source.prototype.Prototyper;
import com.iconmaster.source.tokenize.Tokenizer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author iconmaster
 */
public class MainGui extends javax.swing.JFrame {

	/**
	 * Creates new form MainGui
	 */
	public MainGui() {
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

        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        choicePlatofrm = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        buttonCompile = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        fieldInput = new javax.swing.JTextPane();
        fieldLoad = new javax.swing.JTextField();
        buttonLoad = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        fieldOutput = new javax.swing.JTextPane();
        fieldSave = new javax.swing.JTextField();
        buttonSave = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        fieldLog = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuExit = new javax.swing.JMenuItem();
        menuHelp = new javax.swing.JMenu();
        menuAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SourceBench");
        setResizable(false);

        jTabbedPane2.setPreferredSize(new java.awt.Dimension(749, 472));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Options"));
        jPanel3.setMaximumSize(new java.awt.Dimension(236, 425));
        jPanel3.setMinimumSize(new java.awt.Dimension(236, 425));

        choicePlatofrm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "HPPL" }));

        jLabel1.setText("Platform:");

        buttonCompile.setText("Compile!");
        buttonCompile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCompileMouseClicked(evt);
            }
        });
        buttonCompile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCompileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonCompile, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(choicePlatofrm, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choicePlatofrm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 336, Short.MAX_VALUE)
                .addComponent(buttonCompile)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Input"));
        jPanel4.setMaximumSize(new java.awt.Dimension(236, 425));
        jPanel4.setMinimumSize(new java.awt.Dimension(236, 425));

        fieldInput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(fieldInput);

        fieldLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldLoadActionPerformed(evt);
            }
        });

        buttonLoad.setText("Load File");
        buttonLoad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonLoadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(fieldLoad, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonLoad))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldLoad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonLoad)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Output"));
        jPanel6.setMaximumSize(new java.awt.Dimension(236, 425));
        jPanel6.setMinimumSize(new java.awt.Dimension(236, 425));

        fieldOutput.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane4.setViewportView(fieldOutput);

        fieldSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldSaveActionPerformed(evt);
            }
        });

        buttonSave.setText("Save File");
        buttonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(fieldSave, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonSave))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSave)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel3, jPanel4, jPanel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel3, jPanel4, jPanel6});

        jTabbedPane2.addTab("Compiler", jPanel1);

        jScrollPane1.setEnabled(false);

        fieldLog.setEditable(false);
        fieldLog.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jScrollPane1.setViewportView(fieldLog);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane2.addTab("Output Log", jPanel2);

        menuFile.setText("File");

        menuExit.setText("Exit");
        menuExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExitActionPerformed(evt);
            }
        });
        menuFile.add(menuExit);

        jMenuBar1.add(menuFile);

        menuHelp.setText("Help");

        menuAbout.setText("About...");
        menuAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAboutActionPerformed(evt);
            }
        });
        menuHelp.add(menuAbout);

        jMenuBar1.add(menuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldLoadActionPerformed

    }//GEN-LAST:event_fieldLoadActionPerformed

    private void fieldSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldSaveActionPerformed
		
    }//GEN-LAST:event_fieldSaveActionPerformed

    private void menuExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExitActionPerformed
		System.exit(0);
    }//GEN-LAST:event_menuExitActionPerformed

    private void buttonCompileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCompileMouseClicked
		//whoops
    }//GEN-LAST:event_buttonCompileMouseClicked

    private void buttonCompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCompileActionPerformed
		String phase = "tokenization";
		try {
			ArrayList<SourceException> errs = new ArrayList<>();
			String input = fieldInput.getText();
			printLog("Got input. Compiling...");
			printLog("");
			printLog("Tokenizing...");
			ArrayList<Element> a;
			try {
				a = Tokenizer.tokenize(input);
				printLog(a);
			} catch (SourceException ex) {
				printLog("Got an error in tokenization:");
				printLog("\t"+ex.getMessage());
				errs.add(ex);
				return;
			}
			printLog("Tokenization complete.");
			printLog("Parsing...");
			phase = "parsing";
			try {
				a = Parser.parse(a);
				printLog(a);
			} catch (SourceException ex) {
				printLog("Got an error in parsing:");
				printLog("\t"+ex.getMessage());
				errs.add(ex);
				printErrors(errs);
				return;
			}
			printLog("Parsing complete.");
			printLog("Prototyping...");
			phase = "prototyping";
			Prototyper.PrototypeResult ret = Prototyper.prototype(a);
			printLog(ret.result);
			if (!ret.errors.isEmpty()) {
				printLog("Got some errors in prototyping:");
				for (SourceException err : ret.errors) {
					printLog("\t"+err.getMessage());
				}
				errs.addAll(ret.errors);
				printErrors(errs);
				return;
			}
			printLog("Prototyping complete.");
			printLog("Linking...");
			phase = "linking";
			Linker linker = Linker.link("HPPL", ret.result);
			printLog(linker);
			if (!linker.unresolvedImports.isEmpty()) {
				printLog("Got some errors in linking:");
				for (String err : linker.unresolvedImports) {
					printLog("\tUnresloved import "+err);
				}
				printErrors(errs);
				return;
			}
			printLog("Linking complete.");
			printLog("Compiling...");
			phase = "compiling";
			ArrayList<SourceException> errs2 = SourceCompiler.compile(linker.pkg);
			printLog(linker);
			if (!errs2.isEmpty()) {
				printLog("Got some errors in compiling:");
				for (SourceException err : errs2) {
					printLog("\t"+err.getMessage());
				}
				errs.addAll(errs2);
				printErrors(errs);
				return;
			}
			printLog("Compiling complete.");
			printLog("Checking types...");
			phase = "checking";
			errs2 = TypeChecker.check(linker.pkg);
			printLog(linker);
			if (!errs2.isEmpty()) {
				printLog("Got some errors in checking:");
				for (SourceException err : errs2) {
					printLog("\t"+err.getMessage());
				}
				errs.addAll(errs2);
				printErrors(errs);
				return;
			}
			printLog("Types checked.");
			printLog("Assembling...");
			phase = "assembly";
			String output = Assembler.assemble("HPPL", linker.pkg);
			printLog(output);
			fieldOutput.setText(output);
			printLog("");
		} catch (Exception ex) {
			fieldOutput.setText("An unknown error occured in "+phase+".");
		}
    }//GEN-LAST:event_buttonCompileActionPerformed

    private void menuAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAboutActionPerformed
        JOptionPane.showMessageDialog(getRootPane(), "SourceBench, written by iconmaster.", "About", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuAboutActionPerformed

    private void buttonLoadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonLoadActionPerformed
		String input = fieldLoad.getText();
		File f = new File(input);
		input = "";
		try {
			Scanner fileScanner = new Scanner(f);
			while (fileScanner.hasNext()){
				input+=fileScanner.nextLine()+"\n";
			}
			fieldInput.setText(input);
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getRootPane(), "The file was not found.", "Error", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_buttonLoadActionPerformed

    private void buttonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSaveActionPerformed
		String input = fieldSave.getText();
		File f = new File(input);
		input = fieldOutput.getText();
		try {
			PrintWriter pw = new PrintWriter(f);
			pw.print(input);
			pw.flush();
			pw.close();
		} catch (FileNotFoundException ex) {
			JOptionPane.showMessageDialog(getRootPane(), "The file could not be written to.", "Error", JOptionPane.ERROR_MESSAGE);
		}
    }//GEN-LAST:event_buttonSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCompile;
    private javax.swing.JButton buttonLoad;
    private javax.swing.JButton buttonSave;
    private javax.swing.JComboBox choicePlatofrm;
    private javax.swing.JTextPane fieldInput;
    private javax.swing.JTextField fieldLoad;
    private javax.swing.JTextPane fieldLog;
    private javax.swing.JTextPane fieldOutput;
    private javax.swing.JTextField fieldSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JMenuItem menuAbout;
    private javax.swing.JMenuItem menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    // End of variables declaration//GEN-END:variables

	public void printLog(Object text) {
		fieldLog.setText(fieldLog.getText()+text+"\n");
	}

	public void printErrors(ArrayList<SourceException> a) {
		StringBuilder sb = new StringBuilder();
		sb.append("There were errors in compiling:\n");
		for (SourceException ex : a) {
			sb.append("\t");
			sb.append(ex.getMessage());
			sb.append("\n");
		}
		fieldOutput.setText(sb.toString());
	}
}
