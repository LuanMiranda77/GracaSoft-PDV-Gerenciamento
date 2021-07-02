package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.demo.JCalendarDemo;

import View.LabelPadrao;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JDayChooser;

public class TelaCadCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoTipoCadastro;
	private JTextField campoTelefone;
	private JTextField campoCidade;
	private JTextField campoRua;
	private JTextField campoNumero;
	private JTextField campoBairro;
	private JButton botaoCadastrar;
	private JButton botaoVoltar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCadCliente frame = new TelaCadCliente();
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
	public TelaCadCliente() {
		contentPane = new JPanel();
		setTitle("Cadastro de Cliente");
		setSize(750, 650);
		setResizable(false);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(240, 240, 220));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setType(java.awt.Window.Type.UTILITY);//nao minimizar
	
		JLabel titulo = new LabelPadrao("CADASTRO DE CLIENTE", 200, -5,500, 50);
		titulo.setFont(new Font("Masque",Font.BOLD,25));
		titulo.setForeground(Color.darkGray);
		getContentPane().add(titulo);
				
		JLabel barra = new JLabel();
		barra.setBounds(1,-20,800,60);
		barra.setBackground(Color.GRAY);
		barra.setOpaque(isBackgroundSet());
		getContentPane().add(barra);
		
		JLabel tipoPessoa = new LabelPadrao("Tipo Pessoa", 30, 40, 80, 30);
		getContentPane().add(tipoPessoa);
		JLabel tipoPessoa2 = new LabelPadrao("CPF ou CNPJ", 130, 40, 80, 30);
		getContentPane().add(tipoPessoa2);
		JLabel nome = new LabelPadrao("NOME", 20, 120, 50, 30);
		getContentPane().add(nome);
		JLabel telefone = new LabelPadrao("TELEFONE", 20, 280, 70, 30);
		getContentPane().add(telefone);		
		JLabel cidade = new LabelPadrao("CIDADE", 350, 200, 80, 30);
		getContentPane().add(cidade);	
		JLabel rua = new LabelPadrao("RUA / AVENIDA", 350, 120, 100, 30);
		getContentPane().add(rua);	
		JLabel numero = new LabelPadrao("NÚMERO", 670, 120, 110, 30);
		getContentPane().add(numero);	
		JLabel bairro = new LabelPadrao("BAIRRO", 20, 200, 50, 30);
		getContentPane().add(bairro);	
		JLabel imagem = new JLabel(new ImageIcon("icon/casa.png"));
		imagem.setBounds(0, 323, 512, 512);
		getContentPane().add(imagem);
		JLabel logo = new JLabel(new ImageIcon("Icon/logo.png"));
        logo.setBounds(480, 400, 250, 200);
        getContentPane().add(logo);
		JLabel quadro = new JLabel(new ImageIcon("icon/quadro.png"));
		quadro.setBounds(22, 44, 86, 67);
		getContentPane().add(quadro);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		JCalendarDemo demo = new JCalendarDemo();
		
		setContentPane(contentPane);
		
		JDayChooser dayChooser = new JDayChooser();
		contentPane.add(dayChooser, BorderLayout.NORTH);
		this.setVisible(true);
	}
public void labels() {
		
		
		
	}

}
