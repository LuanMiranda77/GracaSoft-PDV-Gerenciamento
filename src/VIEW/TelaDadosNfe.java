package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.SystemColor;

public class TelaDadosNfe extends Principal {

	private JPanel contentPane;
	private JTextField destina;
	private JComboBox tipo;
	private JTextField textField_1;
	private JTextField transport;
	private JTextField vFrete;
	private JTextField cfop;
	private JTextField placa;
	private JTextField pesoSem;
	private JTextField pesoEmb;
	private JTextField uf;
	private JButton ok;
	private JButton cancelar;
	private JTextField volume;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TelaDadosNfe();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaDadosNfe() {
		pegarResolucao();
		setTitle("Dados da Nota Fiscais NF-e");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//setType(java.awt.Window.Type.UTILITY);// nao minimizar
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		componetes();
		fundo();
		setVisible(true);
		repaint();
		
	}
	public void pegarResolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimensao = t.getScreenSize();
		this.setSize((dimensao.width - 700), (dimensao.height - 300));

	}
	public void componetes() {
		JLabel infor = new JLabel(
				"F1-PESQUISAR PRODUTO   F3-FECHAR COM CART\u00C3O    F8-FECHAR COM TROCO    F10-FECHAR AVISTA    F11-PESQUISA PRE\u00C7O");
		infor.setHorizontalAlignment(SwingConstants.CENTER);
		infor.setForeground(Color.ORANGE);
		infor.setBackground(Color.WHITE);
		infor.setFont(new Font("Tahoma", Font.PLAIN, 20));
		infor.setToolTipText("");
		infor.setBounds(10, 616, 1335, 74);
		infor.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.ORANGE));
		
		destina = new JTextField();
		destina.setBounds(10, 146, 345, 45);
		destina.setOpaque(false);
		destina.setForeground(Color.WHITE);
		destina.setFont(new Font("Tahoma", Font.BOLD, 20));
		destina.setCaretColor(Color.WHITE);
		destina.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Destinatario", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		destina.setBackground(Color.DARK_GRAY);
		
		String [] lista= {"Venda de mercadoria","Devoluções de mercadoria recebida"};
		
		tipo = new JComboBox<Object>(lista);
		tipo.setBackground(SystemColor.inactiveCaption);
		tipo.setBounds(10, 71, 259, 45);
		tipo.setBorder(new TitledBorder(new CompoundBorder(null, UIManager.getBorder("CheckBoxMenuItem.border")), "Tipo da NF-e", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		
		Date d = new Date();
	    String hoje = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setText(hoje);
		textField_1.setOpaque(false);
		textField_1.setForeground(Color.WHITE);
		textField_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField_1.setCaretColor(Color.WHITE);
		textField_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Data saida", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		textField_1.setBackground(Color.DARK_GRAY);
		textField_1.setBounds(10, 9, 146, 45);
		
		transport = new JTextField();
		transport.setOpaque(false);
		transport.setForeground(Color.WHITE);
		transport.setFont(new Font("Tahoma", Font.BOLD, 20));
		transport.setCaretColor(Color.WHITE);
		transport.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Transportadora", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		transport.setBackground(Color.DARK_GRAY);
		transport.setBounds(10, 227, 345, 45);
		
		JComboBox<Object> tipoFrete = new JComboBox<Object>(new Object[]{});
		tipoFrete.setBackground(SystemColor.inactiveCaption);
		tipoFrete.setModel(new DefaultComboBoxModel(new String[] {"CIF", "FOB", "SEM"}));
		tipoFrete.setBorder(new TitledBorder(UIManager.getBorder("CheckBoxMenuItem.border"), "CIF/FOB/SEM", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		tipoFrete.setBounds(10, 305, 112, 45);
		
		vFrete = new JTextField();
		vFrete.setOpaque(false);
		vFrete.setForeground(Color.WHITE);
		vFrete.setFont(new Font("Tahoma", Font.BOLD, 18));
		vFrete.setCaretColor(Color.WHITE);
		vFrete.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "VALOR DO FRETE", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		vFrete.setBackground(Color.DARK_GRAY);
		vFrete.setBounds(151, 304, 146, 45);
		
		cfop = new JTextField();
		cfop.setText("5360");
		cfop.setOpaque(false);
		cfop.setForeground(Color.WHITE);
		cfop.setFont(new Font("Tahoma", Font.BOLD, 18));
		cfop.setCaretColor(Color.WHITE);
		cfop.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "CFOP", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		cfop.setBackground(Color.DARK_GRAY);
		cfop.setBounds(10, 374, 129, 45);
		
		placa = new JTextField();
		placa.setOpaque(false);
		placa.setForeground(Color.WHITE);
		placa.setFont(new Font("Tahoma", Font.BOLD, 18));
		placa.setCaretColor(Color.WHITE);
		placa.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PLACA VEICULO", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		placa.setBackground(Color.DARK_GRAY);
		placa.setBounds(151, 374, 164, 45);
		
		pesoSem = new JTextField();
		pesoSem.setOpaque(false);
		pesoSem.setForeground(Color.WHITE);
		pesoSem.setFont(new Font("Tahoma", Font.BOLD, 18));
		pesoSem.setCaretColor(Color.WHITE);
		pesoSem.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PESO SEM EMBALAGEM", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		pesoSem.setBackground(Color.DARK_GRAY);
		pesoSem.setBounds(10, 442, 177, 45);
		
		pesoEmb = new JTextField();
		pesoEmb.setOpaque(false);
		pesoEmb.setForeground(Color.WHITE);
		pesoEmb.setFont(new Font("Tahoma", Font.BOLD, 18));
		pesoEmb.setCaretColor(Color.WHITE);
		pesoEmb.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "PESO COM EMBALAGEM", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		pesoEmb.setBackground(Color.DARK_GRAY);
		pesoEmb.setBounds(197, 442, 177, 45);
		
		uf = new JTextField();
		uf.setOpaque(false);
		uf.setForeground(Color.WHITE);
		uf.setFont(new Font("Tahoma", Font.BOLD, 18));
		uf.setCaretColor(Color.WHITE);
		uf.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "UF da Placa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		uf.setBackground(Color.DARK_GRAY);
		
		ok = new JButton("OK");
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
					new TelaCadNfe();
				
			}
		});
		
		cancelar = new JButton("CANCELAR");
		
		volume = new JTextField();
		volume.setOpaque(false);
		volume.setForeground(Color.WHITE);
		volume.setFont(new Font("Tahoma", Font.BOLD, 18));
		volume.setCaretColor(Color.WHITE);
		volume.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Volumes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		volume.setBackground(Color.DARK_GRAY);
		
		JButton pesq1 = new JButton("");
		pesq1.setIcon(new ImageIcon("icon/pesquisaP.png"));
		
		JButton pesq2 = new JButton("");
		pesq2.setIcon(new ImageIcon("icon/pesquisaP.png"));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(infor, GroupLayout.PREFERRED_SIZE, 1335, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(27)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addGap(27)
									.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(tipoFrete, GroupLayout.PREFERRED_SIZE, 112, GroupLayout.PREFERRED_SIZE)
									.addGap(26)
									.addComponent(vFrete, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(placa, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(uf, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(ok)
											.addGap(18)
											.addComponent(cancelar)
											.addGap(10))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(cfop, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(pesoSem, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(pesoEmb, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(volume, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(destina, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(pesq1))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(transport, GroupLayout.PREFERRED_SIZE, 345, GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(pesq2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
					.addGap(44))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(tipo, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(destina, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(pesq1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(transport, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(pesq2, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(tipoFrete, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(vFrete, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(placa, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(uf, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cfop, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoSem, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(pesoEmb, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(cancelar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
								.addComponent(ok, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)))
						.addComponent(volume, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE))
					.addGap(203)
					.addComponent(infor, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
		);
		contentPane.setLayout(gl_contentPane);

	}
	public void fundo() {
		
		
		  ///fundo da tela
		JLabel logo = new JLabel(new ImageIcon("icon/logoPequenaPP.png"));
		logo.setText("");
		logo.setBounds(500,30,150,150);
		getContentPane().add(logo);
		
		JLabel fundo = new JLabel("icon/fundoGeral.png");
		fundo.setText("");
		fundo.setBounds(0,0,866,468);
		getContentPane().add(fundo);
		
		
	}
}
