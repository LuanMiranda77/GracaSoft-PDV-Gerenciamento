package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GerenciaCad extends Principal {

	private JPanel contentPane;
	private BotoesGeral fornec;
	private BotoesGeral func;
	private BotoesGeral etiqueta;
	private BotoesGeral transp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GerenciaCad frame = new GerenciaCad();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GerenciaCad() {
		getContentPane().setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setTitle("Gerenciamento de Cadastro");
		setResizable(false);//seuJFrame
		setType(java.awt.Window.Type.UTILITY);//nao minimizar
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);
		botton();
		blackgroud();
		setVisible(true);
		repaint();
		
	
	}
	public void botton() {
		BotoesGeral novo = new BotoesGeral("CLIENTE",new ImageIcon("Icon/cliente.png"),10,50,120,120);
		novo.setToolTipText("cadastrar novo cliente");
		novo.setFont(new Font("Century Gothic", Font.BOLD, 13));
		novo.setForeground(Color.DARK_GRAY);
		novo.setTamanho(15);
		getContentPane().add(novo);
		novo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/cliente.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/cliente2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaCliente();
				dispose();
				
			}
		});
		
		
		BotoesGeral preco = new BotoesGeral("PREÇO",new ImageIcon("Icon/preco.png"),10,150,120,120);
		preco.setLocation(174, 200);
		preco.setToolTipText("cadastrar novo cliente");
		preco.setFont(new Font("Century Gothic", Font.BOLD, 13));
		preco.setForeground(Color.DARK_GRAY);
		preco.setTamanho(15);
		getContentPane().add(preco);
		preco.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				preco.setIcon(new ImageIcon("Icon/preco.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				preco.setIcon(new ImageIcon("Icon/preco2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		

		fornec = new BotoesGeral("<html>FORNECEDOR<html>",new ImageIcon("Icon/fornec.png"),10,250,120,120);
		fornec.setLocation(174, 50);
		fornec.setToolTipText("cadastrar novo cliente");
		fornec.setFont(new Font("Century Gothic", Font.BOLD, 12));
		fornec.setForeground(Color.DARK_GRAY);
		fornec.setTamanho(15);
		getContentPane().add(fornec);
		fornec.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				fornec.setIcon(new ImageIcon("Icon/fornec.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fornec.setIcon(new ImageIcon("Icon/fornec2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaFornecedor();
				dispose();
			}
		});
		

		func = new BotoesGeral("<html>FUNCIONARIO<html>",new ImageIcon("Icon/func.png"),10,350,120,120);
		func.setLocation(336, 51);
		func.setToolTipText("cadastrar novo cliente");
		func.setFont(new Font("Century Gothic", Font.BOLD, 11));
		func.setForeground(Color.DARK_GRAY);
		func.setTamanho(15);
		getContentPane().add(func);
		func.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				func.setIcon(new ImageIcon("Icon/func.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				func.setIcon(new ImageIcon("Icon/func2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaFuncionario();
				dispose();
				
			}
		});
		
		
		etiqueta = new BotoesGeral("",new ImageIcon("Icon/etiqueta.png"),100,150,120,120);
		etiqueta.setText("ETIQUETA");
		etiqueta.setLocation(10, 200);
		etiqueta.setToolTipText("cadastrar novo cliente");
		etiqueta.setFont(new Font("Century Gothic", Font.BOLD, 13));
		etiqueta.setForeground(Color.DARK_GRAY);
		etiqueta.setTamanho(15);
		getContentPane().add(etiqueta);
		etiqueta.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				etiqueta.setIcon(new ImageIcon("Icon/etiqueta.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				etiqueta.setIcon(new ImageIcon("Icon/etiqueta2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		transp = new BotoesGeral("",new ImageIcon("Icon/transport.png"),10,150,120,120);
		transp.setText("<HTML>TRANSPORT<HTML>");
		transp.setLocation(336, 200);
		transp.setToolTipText("cadastrar novo cliente");
		transp.setFont(new Font("Century Gothic", Font.BOLD, 13));
		transp.setForeground(Color.DARK_GRAY);
		transp.setTamanho(15);
		getContentPane().add(transp);
		transp.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				transp.setIcon(new ImageIcon("Icon/transport.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				transp.setIcon(new ImageIcon("Icon/transport2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				new TelaTransport();
				dispose();
				
			}
		});
	}
	
	public void blackgroud() {
		JLabel contabil = new JLabel(new ImageIcon("icon/fundoCad.jpg"));
		contabil.setBounds(1,1,500,400);
		getContentPane().add(contabil);
		
		
		
	}

}
