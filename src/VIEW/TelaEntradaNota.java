package VIEW;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import CONTROL.ControlProduto;
import DTO.ProdutoDTO;
import VIEW.tabela.ModelEntrada;
import VIEW.tabela.ModeloTabela;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.JRadioButton;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class TelaEntradaNota extends Principal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private BotoesGeral novo;
	private BotoesGeral apagar;
	private BotoesGeral alterar;
	private BotoesGeral pesq;
	private BotoesGeral relator;
	private JTable table;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;
	private JRadioButton rdbtnNewRadioButton_2;
	private JRadioButton rdbtnNewRadioButton_3;
	private BotoesGeral convt;
	private BotoesGeral assoc;
	private JPanel panel;
	private BotoesGeral fina;
	private JLabel valor;
	private ModelEntrada model;
	private JScrollPane paine;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaEntradaNota frame = new TelaEntradaNota();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaEntradaNota() {
		this.setTitle("Entrada de notas fiscais");
		pegarResolucao();
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);//seuJFrame
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setOpaque(true);
		setContentPane(contentPane);
		getContentPane().setBackground(Color.GRAY);
		componetes();
		table();
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				ModeloTabela.destivar(table);
			    
			    } 
			    
			   
			});
		
		
		
		JLabel barra = new JLabel("");
		barra.setBounds(5, 5, 1360, 110);
		barra.setBackground(Color.DARK_GRAY);
		barra.setOpaque(true);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(rdbtnNewRadioButton_1, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
						.addComponent(rdbtnNewRadioButton, GroupLayout.PREFERRED_SIZE, 232, GroupLayout.PREFERRED_SIZE))
					.addGap(2)
					.addComponent(rdbtnNewRadioButton_3, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE))
				.addComponent(rdbtnNewRadioButton_2, GroupLayout.PREFERRED_SIZE, 268, GroupLayout.PREFERRED_SIZE)
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(2)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(22)
							.addComponent(rdbtnNewRadioButton_1))
						.addComponent(rdbtnNewRadioButton)
						.addComponent(rdbtnNewRadioButton_3))
					.addGap(1)
					.addComponent(rdbtnNewRadioButton_2))
		);
		panel.setLayout(gl_panel);
		
		JLabel fornec = new JLabel("fornecedor");
		fornec.setBounds(15, 551, 412, 56);
		fornec.setFont(new Font("Tahoma", Font.BOLD, 30));
		fornec.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "FORNECEDOR", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		
		JLabel num = new JLabel("151554");
		num.setBounds(15, 613, 188, 56);
		num.setFont(new Font("Tahoma", Font.BOLD, 30));
		num.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "NUMERO DA NFe", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		
		JLabel data = new JLabel("15/12/2019");
		data.setBounds(221, 613, 206, 56);
		data.setFont(new Font("Tahoma", Font.BOLD, 30));
		data.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DATA COMPRA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		
		valor = new JLabel("R$  0,00");
		valor.setBounds(437, 551, 343, 117);
		valor.setHorizontalAlignment(SwingConstants.CENTER);
		valor.setToolTipText("R$ 0,00");
		valor.setFont(new Font("Tahoma", Font.BOLD, 40));
		valor.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "TOTAL DA NOTA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		contentPane.setLayout(null);
		contentPane.add(paine);
		contentPane.add(novo);
		contentPane.add(apagar);
		contentPane.add(alterar);
		contentPane.add(relator);
		contentPane.add(pesq);
		contentPane.add(convt);
		contentPane.add(assoc);
		contentPane.add(panel);
		contentPane.add(barra);
		contentPane.add(num);
		contentPane.add(data);
		contentPane.add(fornec);
		contentPane.add(valor);
		contentPane.add(fina);
		
		
		setVisible(true);
		repaint();
	}
	public void componetes() {
		novo = new BotoesGeral("NOVO",new ImageIcon("Icon/novo.png"),8,-5,100,100);
		novo.setBounds(15, 10, 100, 100);
		novo.setText("Ins-NOVO");
		novo.setToolTipText("cadastrar novo produto");
		novo.setFont(new Font("Century Gothic", Font.BOLD, 12));
		novo.setForeground(Color.WHITE);
		novo.setTamanho(15);
		novo.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/novo.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				novo.setIcon(new ImageIcon("Icon/novo2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				ModeloTabela.destivar(table);
				
			}
		});
		
		apagar = new BotoesGeral("APAGAR",new ImageIcon("Icon/apagar.png"),120,-5,100,100);
		apagar.setBounds(123, 10, 100, 100);
		apagar.setText("<html>Del-APAGAR<html>");
		apagar.setToolTipText("apagar o produto associação do produto");
		apagar.setFont(new Font("Century Gothic", Font.BOLD, 12));
		apagar.setForeground(Color.WHITE);
		apagar.setTamanho(12);
		apagar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				apagar.setIcon(new ImageIcon("Icon/apagar.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				apagar.setIcon(new ImageIcon("Icon/apagar2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});

		alterar = new BotoesGeral("",new ImageIcon("Icon/editar.png"),8,-5,100,100);
		alterar.setBounds(233, 10, 100, 100);
		alterar.setText("A-ALTERAR");
		alterar.setToolTipText("editar produto");
		alterar.setFont(new Font("Century Gothic", Font.BOLD, 12));
		alterar.setForeground(Color.WHITE);
		alterar.setTamanho(15);
		alterar.repaint();
		alterar.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				alterar.setIcon(new ImageIcon("Icon/editar.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				alterar.setIcon(new ImageIcon("Icon/editar2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		pesq = new BotoesGeral("<html>PESQUISAR<html>",new ImageIcon("Icon/pesquisa.png"),8,-5,100,100);
		pesq.setBounds(453, 10, 100, 100);
		pesq.setText("<html>P-PESQUISAR<html>");
		pesq.setToolTipText("pesquisar o produto");
		pesq.setFont(new Font("Century Gothic", Font.BOLD, 12));
		pesq.setForeground(Color.WHITE);
		pesq.setTamanho(15);
		pesq.repaint();
		pesq.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				pesq.setIcon(new ImageIcon("Icon/pesquisa.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				pesq.setIcon(new ImageIcon("Icon/pesquisa2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		
		relator = new BotoesGeral("",new ImageIcon("Icon/impressora.png"),8,-5,100,100);
		relator.setBounds(343, 10, 100, 100);
		relator.setText("<html>bar-CAD.TODOS<html>");
		relator.setToolTipText("cadastra todos os produtos de uma vez");
		relator.setFont(new Font("Century Gothic", Font.BOLD, 10));
		relator.setForeground(Color.WHITE);
		relator.setTamanho(15);
		relator.repaint();
		relator.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				relator.setIcon(new ImageIcon("Icon/impressora.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				relator.setIcon(new ImageIcon("Icon/impressora2.png"));
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		convt = new BotoesGeral("", new ImageIcon("Icon/novo.png"), 8, -5, 100, 100);
		convt.setBounds(563, 11, 100, 100);
		convt.setToolTipText("converte as unidades dos produtos cx a un");
		convt.setText("<html>F2-CONVERTER<html>");
		convt.setTamanho(15);
		convt.setForeground(Color.WHITE);
		convt.setFont(new Font("Century Gothic", Font.BOLD, 11));
		convt.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						convt.setIcon(new ImageIcon("Icon/pesquisa.png"));
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						convt.setIcon(new ImageIcon("Icon/pesquisa2.png"));
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						
						
					}
				});
		
		assoc = new BotoesGeral("", new ImageIcon("Icon/novo.png"), 8, -5, 100, 100);
		assoc.setBounds(673, 10, 100, 100);
		assoc.setToolTipText("associa o produto ao um ja cadastrado");
		assoc.setText("<html>S-ASSOCIAR<html>");
		assoc.setTamanho(15);
		assoc.setForeground(Color.WHITE);
		assoc.setFont(new Font("Century Gothic", Font.BOLD, 12));
		assoc.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				assoc.setIcon(new ImageIcon("Icon/pesquisa.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				assoc.setIcon(new ImageIcon("Icon/pesquisa2.png"));
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		fina = new BotoesGeral("",new ImageIcon("Icon/novo.png"), 8, -5, 100, 100);
		fina.setBounds(1230, 572, 100, 100);
		fina.setToolTipText("finalizar a entrada da nota");
		fina.setText("<html>FINALIZAR<html>");
		fina.setTamanho(15);
		fina.setForeground(Color.WHITE);
		fina.setFont(new Font("Century Gothic", Font.BOLD, 13));
		fina.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				fina.setIcon(new ImageIcon("Icon/pesquisa.png"));
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				fina.setIcon(new ImageIcon("Icon/pesquisa2.png"));
				
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				
				
			}
		});
		
		panel = new JPanel();
		panel.setBounds(796, 16, 464, 94);
		panel.setBackground(SystemColor.inactiveCaption);
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "ESCOLHA O TIPO DE ENTRADA", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		
		rdbtnNewRadioButton_2 = new JRadioButton("Entrada de Ativo Imobilizado");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_2.setBackground(SystemColor.inactiveCaption);
		
		rdbtnNewRadioButton_1 = new JRadioButton("Entrada de Materia prima");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_1.setBackground(SystemColor.inactiveCaption);
		
		rdbtnNewRadioButton_3 = new JRadioButton("Entrada de Embalagem");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton_3.setBackground(SystemColor.inactiveCaption);
		
		rdbtnNewRadioButton = new JRadioButton("Entrada de mercadoria para venda");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		rdbtnNewRadioButton.setBackground(SystemColor.inactiveCaption);
		rdbtnNewRadioButton.setSelected(true);
		
	}
	
	public void pegarResolucao() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dimensao = t.getScreenSize();
        this.setSize((dimensao.width -10), (dimensao.height - 40));

 }
	public void table() {
	
		
		model= new ModelEntrada() {
			boolean [] cell={true,true,false,false,false};
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return cell[0];
			}
		};
		table = new JTable(model);
		//ModeloTabela.modelogeral(table);
	
		
		
		table.getColumnModel().getColumn(0).setPreferredWidth(60);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(250);
		table.getColumnModel().getColumn(3).setPreferredWidth(60);
		table.getColumnModel().getColumn(4).setPreferredWidth(80);
		table.getColumnModel().getColumn(5).setPreferredWidth(80);
		table.getColumnModel().getColumn(6).setPreferredWidth(80);
		table.getColumnModel().getColumn(7).setPreferredWidth(250);
		table.getColumnModel().getColumn(8).setPreferredWidth(60);
		table.getColumnModel().getColumn(9).setPreferredWidth(90);
		table.getColumnModel().getColumn(10).setPreferredWidth(90);
		table.getColumnModel().getColumn(11).setPreferredWidth(90);
		table.getColumnModel().getColumn(12).setPreferredWidth(90);
		table.getColumnModel().getColumn(13).setPreferredWidth(90);
		table.getColumnModel().getColumn(14).setPreferredWidth(90);
		table.getColumnModel().getColumn(15).setPreferredWidth(90);
		table.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
			
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
		
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER) {
					table.setCellSelectionEnabled(true);
					//table.setValueAt("", table.getSelectedRow(), table.getSelectedColumn());;
				}
				
				
			}
		});
		
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF); 
		paine = new JScrollPane(table);
		paine.setBounds(5, 126, 1340, 407);
		table.repaint();
		getContentPane().add(paine);
		
		for(ProdutoDTO p : ControlProduto.lista()) {
			model.addRow(p);
		}
	}
}
