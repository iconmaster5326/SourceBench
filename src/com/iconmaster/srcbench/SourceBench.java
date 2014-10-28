package com.iconmaster.srcbench;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author iconmaster
 */
public class SourceBench {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		try {
			LibraryLoader.addFile("./Source.jar");
		} catch (Exception ex) {
			Logger.getLogger(SourceBench.class.getName()).log(Level.SEVERE, null, ex);
			JOptionPane.showMessageDialog(null, "Source.jar was not sucsessfully loaded! Please make sure it's in the same directory as SourceBench.jar.", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(1);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new MainGui().setVisible(true);
		});
	}
	
}
