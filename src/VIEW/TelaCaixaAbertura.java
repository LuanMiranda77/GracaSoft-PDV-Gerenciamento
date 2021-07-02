package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.Timer;

import CONTROL.ControlCaixa;
import DTO.CaixaDTO;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;

public class TelaCaixaAbertura extends JFrame {
	private JTextField txtValor;
	private String hoje;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCaixaAbertura frame = new TelaCaixaAbertura();
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
	public TelaCaixaAbertura() {
		setBackground(Color.DARK_GRAY);
		getContentPane().setBackground(Color.DARK_GRAY);
		setSize(400,300);
		setIconImage(Toolkit.getDefaultToolkit().getImage("icon/produtoFundo.jpg"));
		setTitle("Pagamento Cartao");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(java.awt.Window.Type.UTILITY);
		
		txtValor = new JTextField();
		txtValor.setText("15,00");
		txtValor.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtValor.setBackground(Color.WHITE);
		txtValor.setColumns(10);
		
		JLabel titulo = new JLabel("Abertura do caixa");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setForeground(Color.ORANGE);
		titulo.setBackground(Color.GRAY);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		titulo.setOpaque(true);
		
		 Date d = new Date();
         hoje = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
         
         long time =  System.currentTimeMillis();
         GregorianCalendar cal = new GregorianCalendar();
         cal.setTimeInMillis(time);
         System.out.println(cal.toString());
		
		JLabel lblData = new JLabel("Data: "+hoje+" "+cal.HOUR_OF_DAY);
		lblData.setForeground(Color.LIGHT_GRAY);
		lblData.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JButton botOK = new JButton("OK");
		botOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtValor.getText().equals(""))
					JOptionPane.showMessageDialog(null, "Digite uma valor pra abrir o caixa");
				else {
					CaixaDTO caixa = new CaixaDTO();
					double v =Double.parseDouble(txtValor.getText());
					caixa.setData(d);
					caixa.setHora(timer);
					caixa.setSaldoTotal(v);
					ControlCaixa.salvar(caixa);
				}
			}
		});
		
		JButton botCancelar = new JButton("CANCELAR");
		
		JLabel lblValor = new JLabel("VALOR:");
		lblValor.setForeground(Color.LIGHT_GRAY);
		lblValor.setFont(new Font("Tahoma", Font.BOLD, 17));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(16)
					.addComponent(lblValor, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblData)
						.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(139, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addComponent(botOK, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(botCancelar)
					.addGap(17))
				.addComponent(titulo, GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(titulo, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblData, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(txtValor, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblValor, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(botOK)
						.addComponent(botCancelar))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		componets();
		setVisible(true);
		repaint();
	}
	public void componets() {
		 Timer timer = new Timer(1000, null);
		 timer.start();
		
	}

}
