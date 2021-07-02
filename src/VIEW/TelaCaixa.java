package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.JDesktopPane;
import javax.swing.JButton;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class TelaCaixa extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCaixa frame = new TelaCaixa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCaixa() {
		pegarResolucao();
		setTitle("Controle caixa e recebimento");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.ORANGE, null, null, null));
		setContentPane(contentPane);
		componetes();
		setVisible(true);
		repaint();
	}
	public void componetes() {
		
		JLabel lblNewLabel = new JLabel("GERENCIAMENTO DO CAIXA");
		lblNewLabel.setForeground(new Color(255, 200, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Rockwell Condensed", Font.BOLD, 35));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBorder(new TitledBorder(null, "Controle do Caixa", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Controle de Recebimentos", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		panel_1.setBackground(Color.DARK_GRAY);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Recebimento e Pagamentos no Balcao", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		panel_2.setBackground(Color.DARK_GRAY);
		
		JButton btnPagamentosAvulso = new JButton("Recebimento Avulso");
		btnPagamentosAvulso.setHorizontalAlignment(SwingConstants.LEFT);
		btnPagamentosAvulso.setForeground(Color.DARK_GRAY);
		btnPagamentosAvulso.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		JButton btnSangriaretirada = new JButton("Sangria/Retirada");
		btnSangriaretirada.setHorizontalAlignment(SwingConstants.LEFT);
		btnSangriaretirada.setForeground(Color.DARK_GRAY);
		btnSangriaretirada.setFont(new Font("Tahoma", Font.BOLD, 14));
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnSangriaretirada, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnPagamentosAvulso, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_2.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSangriaretirada, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPagamentosAvulso, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(65, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Posi\u00E7\u00E3o do Caixa", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		panel_3.setBackground(Color.DARK_GRAY);
		
		JButton btnPosioEmA = new JButton("Posi\u00E7\u00E3o em A4");
		btnPosioEmA.setHorizontalAlignment(SwingConstants.LEFT);
		btnPosioEmA.setForeground(Color.DARK_GRAY);
		btnPosioEmA.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton btnPosioEmRolo = new JButton("Posi\u00E7\u00E3o em Rolo");
		btnPosioEmRolo.setHorizontalAlignment(SwingConstants.LEFT);
		btnPosioEmRolo.setForeground(Color.DARK_GRAY);
		btnPosioEmRolo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JButton button_1 = new JButton("Posi\u00E7\u00E3o em Rolo");
		button_1.setHorizontalAlignment(SwingConstants.LEFT);
		button_1.setForeground(Color.DARK_GRAY);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(33)
					.addComponent(btnPosioEmA, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addGap(35)
					.addComponent(btnPosioEmRolo, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
					.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addGap(52))
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_3.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPosioEmA, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnPosioEmRolo, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE)
										.addComponent(panel, GroupLayout.PREFERRED_SIZE, 377, GroupLayout.PREFERRED_SIZE))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE))
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(46)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 604, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(25)
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 298, GroupLayout.PREFERRED_SIZE)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 173, GroupLayout.PREFERRED_SIZE))
						.addComponent(panel_2, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
					.addComponent(panel_3, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
					.addGap(27))
		);
		
		JButton btnReceberDoCliente = new JButton("Receber do Cliente");
		btnReceberDoCliente.setHorizontalAlignment(SwingConstants.LEFT);
		btnReceberDoCliente.setForeground(Color.DARK_GRAY);
		btnReceberDoCliente.setFont(new Font("Tahoma", Font.BOLD, 23));
		
		JButton btnReciboAvulso = new JButton("Receita a Receber");
		btnReciboAvulso.setHorizontalAlignment(SwingConstants.LEFT);
		btnReciboAvulso.setForeground(Color.DARK_GRAY);
		btnReciboAvulso.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnBoletoAPagar = new JButton("Boletos a Pagar");
		btnBoletoAPagar.setHorizontalAlignment(SwingConstants.LEFT);
		btnBoletoAPagar.setForeground(Color.DARK_GRAY);
		btnBoletoAPagar.setFont(new Font("Tahoma", Font.BOLD, 24));
		
		JButton btnReciboAvulso_1 = new JButton("Recibo Avulso");
		btnReciboAvulso_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnReciboAvulso_1.setForeground(Color.DARK_GRAY);
		btnReciboAvulso_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnReceberDoCliente, GroupLayout.PREFERRED_SIZE, 259, GroupLayout.PREFERRED_SIZE)
							.addGap(10))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnBoletoAPagar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addGap(16))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnReciboAvulso, 0, 0, Short.MAX_VALUE)
							.addGap(16))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addComponent(btnReciboAvulso_1, 0, 0, Short.MAX_VALUE)
							.addGap(16))))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnReceberDoCliente, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnBoletoAPagar, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReciboAvulso, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnReciboAvulso_1, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnNewButton = new JButton("Abertura do Caixa");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 26));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"));
		
		JButton btnFechamentoDoCaixa = new JButton("Fechamento do Caixa");
		btnFechamentoDoCaixa.setIcon(new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"));
		btnFechamentoDoCaixa.setHorizontalAlignment(SwingConstants.LEFT);
		btnFechamentoDoCaixa.setForeground(Color.DARK_GRAY);
		btnFechamentoDoCaixa.setFont(new Font("Tahoma", Font.BOLD, 25));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnFechamentoDoCaixa, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
						.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addGap(27)
					.addComponent(btnFechamentoDoCaixa, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
	public void pegarResolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimensao = t.getScreenSize();
		this.setSize((dimensao.width - 650), (dimensao.height - 200));

	}
}
