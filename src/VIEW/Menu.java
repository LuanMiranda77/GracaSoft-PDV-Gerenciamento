package VIEW;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import CONTROL.ControlCentral;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;


public class Menu extends Principal {


	private JMenuItem item,item1,item2,item3,item4,item5,item6;
	JLabel data1=  new JLabel();
	private JLabel emitente;
	JPopupMenu popupMenu = new JPopupMenu();

	private static final long serialVersionUID = 1L;
	public Menu(String cargo) {
		pegarResolucao();
		setTitle("MENU PRINCIPAL");
	   getContentPane().setLayout(null);
	   setLocationRelativeTo(null);
	   setResizable(false);
	   adicionarlogo(this);
	   adicionarbutton(cargo);
	   bcl();
	   blackgroud();
	   setVisible(true);
	   repaint();
	   
	   

	}
	public void bcl() {
		
		
		JLabel barra = new JLabel();
		barra.setBounds(1,-20,1700,150);
		barra.setBackground(Color.DARK_GRAY);
		barra.setOpaque(isBackgroundSet());
		getContentPane().add(barra);
		
		
		
	}
	public class ouvinteLinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
		 String op = e.getActionCommand();
		 
		 if(op.equals("Fazer Backup")) {
			 
			
			
		 }
		 else if(op.equals("Cadastar tipo de Imovel")) {
			
			
		}
		 else if(op.equals("Cadastar Cliente")) {
			 
		}
		 
		 else if(op.equals("Cadastar Funcionario")) {
			 
		}
		 else if(op.equals("Cadastar Imovel")) {
			
		}
		 else if(op.equals("Consultar compra")) {
			 
		}
		 else if(op.equals("Dividas de Clientes")) {
			
		}
		
	}
	}
	public void blackgroud() {
		JLabel contabil = new JLabel(new ImageIcon("icon/fundo.jpg"));
		contabil.setText("Gra\u00E7a soft");
		contabil.setBounds(1,1,1380,730);
		getContentPane().add(contabil);
		
		
		
	}
	public void adicionarbutton(String cargo) {
		
		JMenuBar barraMenu = new JMenuBar();
		setJMenuBar(barraMenu);
		
		JMenu menu = new JMenu("Operacional");
		barraMenu.add(menu);
		
		JMenu cad = new JMenu("Cadastro");
		barraMenu.add(cad);
		
		JMenu rel = new JMenu("Relatorio");
		barraMenu.add(rel);
		
		item = new JMenuItem("Fazer Backup");
		menu.add(item);
		
		item5 = new JMenuItem("Consultar compra");
		menu.add(item5);
		
		 item1 = new JMenuItem("Cadastar tipo de Imovel");
		cad.add(item1);
		
		item2 = new JMenuItem("Cadastar Cliente");
		cad.add(item2);
		
		item3 = new JMenuItem("Cadastar Funcionario");
		cad.add(item3);
		
		item4 = new JMenuItem("Cadastar Imovel");
		cad.add(item4);
		
		item6 = new JMenuItem("Dividas de Clientes");
		rel.add(item6);
		
		
		ouvinteLinter ouvi = new ouvinteLinter();
		item.addActionListener(ouvi);
		item1.addActionListener(ouvi);
		item2.addActionListener(ouvi);
		item3.addActionListener(ouvi);
		item4.addActionListener(ouvi);
		item5.addActionListener(ouvi);
		item6.addActionListener(ouvi);
		
		
		/*
		 * switch (cargo) {
		 * 
		 * case "Corretor": estoque.setEnabled(false); cadastro.setEnabled(false);
		 * caixa.setEnabled(false); relatorio.setEnabled(false);
		 * confg.setEnabled(false); item1.setEnabled(false); item3.setEnabled(false);
		 * item4.setEnabled(false); item6.setEnabled(false);
		 * 
		 * break;
		 * 
		 * case "Secretaria": nfc.setEnabled(false); caixa.setEnabled(false);
		 * relatorio.setEnabled(false); item1.setEnabled(false);
		 * item3.setEnabled(false); item4.setEnabled(false); item5.setEnabled(false);
		 * 
		 * break;
		 * 
		 * default: break;
		 */
		//}
	}
	public void adicionarlogo(JFrame frame) {
		
		
		 Date d = new Date();
	         String hoje = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		
	  //  Timer timer = new Timer(1000, new hora());
	    //timer.start();
	    
		JLabel data=  new JLabel("Data: "+hoje);
		data.setBounds(1100,580,400,100);
		data.setFont(new Font("Magneto",Font.BOLD,25));
		data.setForeground(Color.WHITE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(1, 1, 1364, 129);
		getContentPane().add(panel);
		
				
				BotoesGeral sair = new BotoesGeral("<html>Sair<html>",new ImageIcon("Icon/sair.png"),730,20,100,100);
				sair.setForeground(Color.WHITE);
				
				BotoesGeral confg = new BotoesGeral("<html>Config<html>",new ImageIcon("Icon/config.png"),625,20,100,100);
				confg.setTamanho(10);
				confg.setToolTipText("configura\u00E7\u00E3o");
				confg.setForeground(Color.WHITE);
				
				BotoesGeral relatorio = new BotoesGeral("<html>Relatorio<html>",new ImageIcon("Icon/rela2.png"),515,20,100,100);
				relatorio.setToolTipText("relatorio geral");
				relatorio.setForeground(Color.WHITE);
				
				
				BotoesGeral cadastro = new BotoesGeral("Cadastro",new ImageIcon("Icon/cad.png"), 415,20,100,100);
				cadastro.setToolTipText("cadastro geral");
				cadastro.setText("Cadastro");
				cadastro.setForeground(Color.WHITE);
				
				BotoesGeral estoque = new BotoesGeral("<html>Estoque<html>",new ImageIcon("Icon/produto.png"),313,20,100,100);
				estoque.setToolTipText("Estoque");
				estoque.setForeground(Color.WHITE);
				
				BotoesGeral xml = new BotoesGeral("<html>Estoque<html>", new ImageIcon("Icon/xml.png"), 313, 20, 100, 100);
				xml.setText("Entrada");
				xml.setToolTipText("Entrada/xml");
				xml.setForeground(Color.WHITE);
				
				
				BotoesGeral caixa = new BotoesGeral("Caixa",new ImageIcon("Icon/imovel.png"), 202,20,100,100);
				caixa.setForeground(Color.WHITE);
				caixa.setIcon(new ImageIcon("icon/caixa.png"));
				caixa.setToolTipText("Caixa registro");
				
				BotoesGeral nfe = new BotoesGeral("<html>NF-e<html>",new ImageIcon("Icon/nfe.png"),101,20,100,100);
				nfe.setFont(new Font("Century Gothic", Font.BOLD, 13));
				nfe.setForeground(Color.WHITE);
				nfe.setToolTipText("danfe nf-e");
				
				// botao menu
				
				BotoesGeral nfc = new BotoesGeral("<html>PDV-NFC-e<html>",new ImageIcon("Icon/nfce.png"),2,20,100,100);
				nfc.setFont(new Font("Century Gothic", Font.BOLD, 13));
				nfc.setForeground(Color.WHITE);
				nfc.setTamanho(15);
				GroupLayout gl_panel = new GroupLayout(panel);
				gl_panel.setHorizontalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addComponent(nfc, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(nfe, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(caixa, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(xml, GroupLayout.PREFERRED_SIZE, 94, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(estoque, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(cadastro, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(relatorio, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(confg, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(sair, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
				);
				gl_panel.setVerticalGroup(
					gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(7)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(nfc, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(nfe, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(caixa, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(xml, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(estoque, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(cadastro, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(relatorio, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(confg, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)
								.addComponent(sair, GroupLayout.PREFERRED_SIZE, 113, GroupLayout.PREFERRED_SIZE)))
				);
				panel.setLayout(gl_panel);
				nfc.repaint();
				nfc.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						nfc.setIcon(new ImageIcon("Icon/nfce.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						nfc.setIcon(new ImageIcon("Icon/nfce_2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						new TelaPDV();
						
					}
				});
				nfe.repaint();
				nfe.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						nfe.setIcon(new ImageIcon("Icon/nfe.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						nfe.setIcon(new ImageIcon("Icon/nfe_2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
					       new TelaGerenciaNFE();
						
					}
				});
				caixa.repaint();
				caixa.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						caixa.setIcon(new ImageIcon("Icon/caixa.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						caixa.setIcon(new ImageIcon("Icon/caixa_2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						new TelaCaixa();
						
					}
				});
				xml.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						xml.setIcon(new ImageIcon("Icon/xml.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						xml.setIcon(new ImageIcon("Icon/xml2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						new TelaGerenciaCompra();
						
					}
				});
				estoque.repaint();
				estoque.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						estoque.setIcon(new ImageIcon("Icon/produto.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						estoque.setIcon(new ImageIcon("Icon/produto2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						new TelaProduto();
						
					}
				});
				cadastro.repaint();
				cadastro.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						cadastro.setIcon(new ImageIcon("Icon/cad.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						cadastro.setIcon(new ImageIcon("Icon/cad2.png"));
						
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						new GerenciaCad();
						
						
					}
				});
				relatorio.repaint();
				relatorio.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					relatorio.setIcon(new ImageIcon("Icon/rela2.png"));
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					relatorio.setIcon(new ImageIcon("Icon/rela.png"));
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
		});
				confg.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					confg.setIcon(new ImageIcon("Icon/config.png"));
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					confg.setIcon(new ImageIcon("Icon/config2.png"));
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					
					
				}
		});
				sair.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						sair.setIcon(new ImageIcon("Icon/sair.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						sair.setIcon(new ImageIcon("Icon/sair2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
				});
				sair.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
					dispose();
					new TelaLogin();
					}
					});
		//frame.getContentPane().add(data);
		
		
		data1.setBounds(1100,615,400,100);
		data1.setFont(new Font("Magneto",Font.BOLD,25));
		data1.setForeground(Color.WHITE);
		frame.getContentPane().add(data1);
		
		
		JLabel user=  new JLabel("Usuario Logado: "+ControlCentral.getLogado().getNome());
		user.setBounds(20,549,400,100);
		user.setFont(new Font("Masque",Font.BOLD,20));
		user.setForeground(Color.WHITE);
		frame.getContentPane().add(user);
		
		JLabel user1=  new JLabel("Cargo: "+ControlCentral.getLogado().getCargo());
		user1.setBounds(20,589,400,100);
		user1.setFont(new Font("Magneto",Font.BOLD,20));
		user1.setForeground(Color.WHITE);
		frame.getContentPane().add(user1);
		
		
		JLabel fantasia=  new JLabel("GraçaSoft"+ControlCentral.getLogado().getCargo());
		fantasia.setBounds(20,141,400,50);
		fantasia.setFont(new Font("Magneto",Font.BOLD,25));
		fantasia.setForeground(Color.WHITE);
		frame.getContentPane().add(fantasia);
		
		JLabel razao=  new JLabel("Sistema de automação"+ControlCentral.getLogado().getCargo());
		razao.setBounds(20,170,400,50);
		razao.setFont(new Font("Century Gothic", Font.BOLD, 15));
		razao.setForeground(Color.WHITE);
		frame.getContentPane().add(razao);
		
		
		
	}
	class hora implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			Calendar now = Calendar.getInstance();
			data1.setText(String.format("Hora: "+"%1$tH:%1$tM:%1$tS", now));
		}
	}
	
	public void pegarResolucao() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width +5), (dimensao.height - 38));

 }
	public void menuSup() {
		
	}
	public static void main(String[] args) {
		/*FuncionarioDTO gerente = new FuncionarioDTO();
		 gerente.setId(1);
		 gerente.setNome("lmb");
		 gerente.setCargo("Administrador");
		 gerente.setSenha("1");
		 FuncionarioControl.cadastrarFuncionario(gerente);*/
		new Menu("Administrador");
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
