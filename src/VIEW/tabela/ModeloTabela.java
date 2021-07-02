package VIEW.tabela;

import javax.swing.JTable;

public class ModeloTabela {
	
	
	public static void modelogeral(JTable tabela) {
    try {
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Nimbus".equals(info.getName())) {
				javax.swing.UIManager.setLookAndFeel(info.getClassName());
				break;
				
			}
		}
	} catch (ClassNotFoundException ex) {
		ex.printStackTrace();
	} catch (InstantiationException ex) {
		ex.printStackTrace();
	} catch (IllegalAccessException ex) {
		ex.printStackTrace();
				
	} catch (javax.swing.UnsupportedLookAndFeelException ex) {
		ex.printStackTrace();
	}
	
	java.awt.EventQueue.invokeLater(new Runnable() {
		public void run() {
			tabela.getClass();
		}
	});
	}
	public static void destivar(JTable tabela) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows Classic".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
					
				}
			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
					
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		}
		
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				tabela.getClass();
			}
		});
		
		
	}

}
