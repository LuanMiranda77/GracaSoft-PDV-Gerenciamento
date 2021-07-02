package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;

import CONTROL.ControlProduto;
import DTO.ProdutoDTO;
import ExcpitonGeral.ExceptionProdutoNaoVend;
import VIEW.tabela.ModeloTabela;
import VIEW.tabela.PDVtableModel;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class TelaCadNfe extends Principal{

	private JPanel contentPane;
	private static JTextField txtBarra;
	private JTextField txtDesc;
	private JTextField txtPreco;
	private JTable table;
	private JLabel lblTotal;
	private PDVtableModel modelo;
	private JScrollPane contener;
	private JTextField txtQuant;
	private int cont;
	private NumberFormat convertMoeda = NumberFormat.getCurrencyInstance();
	private JLabel barraT;
	private ProdutoDTO produto = new ProdutoDTO();
	private JLabel descricao;
	private DecimalFormat convert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
			          new TelaCadNfe();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadNfe() {
		pegarResolucao();
		setTitle("Gerador de NFe");
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		componetes();
		
		this.setVisible(true);
		repaint();
	}
	public void pegarResolucao() {
		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension dimensao = t.getScreenSize();
		this.setSize(957, 718);

	}

	public void componetes() {
		txtBarra = new JTextField();
		txtBarra.setBackground(Color.DARK_GRAY);
		txtBarra.setForeground(Color.WHITE);
		txtBarra.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtBarra.setBorder(new TitledBorder(null, "Codigo Barras", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		txtBarra.setOpaque(false);
		txtBarra.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		txtBarra.setCaretColor(Color.WHITE);
		txtBarra.requestFocus();
		txtBarra.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321qazwsxedcrfvtgbyhnujmikolp-";// lista de caracters que não devem ser
																			// aceitos
				if (!caracteres.contains(e.getKeyChar() + "")) {// se o caracter que gerou o
					e.consume();// aciona esse propriedade para eliminar a ação do evento
				}
			}

			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent event) {

				comandoTecla(event);
			}
		});

		txtQuant = new JTextFieldSoNumero();
		txtQuant.setBackground(Color.DARK_GRAY);
		txtQuant.setForeground(Color.WHITE);
		txtQuant.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtQuant.setColumns(10);
		txtQuant.setCaretColor(Color.WHITE);
		txtQuant.setBorder(new TitledBorder(null, "Quant", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		txtQuant.setOpaque(false);
		txtQuant.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {

			}

			public void keyReleased(KeyEvent e) {

			}

			@Override
			public void keyPressed(KeyEvent e) {
				comandoTecla(e);

			}
		});

		txtDesc = new JTextFieldSoNumero();
		txtDesc.setBackground(Color.DARK_GRAY);
		txtDesc.setForeground(Color.WHITE);
		txtDesc.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtDesc.setColumns(10);
		txtDesc.setBorder(
				new TitledBorder(null, "Desconto", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		txtDesc.setOpaque(false);
		txtDesc.setCaretColor(Color.WHITE);
		txtDesc.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {
				String caracteres = "0987654321.,";// lista de caracters que não devem ser aceitos
				if (!caracteres.contains(e.getKeyChar() + "")) {// se o caracter que gerou o

					e.consume();// aciona esse propriedade para eliminar a ação do evento
				}
			}

			public void keyReleased(KeyEvent e) {
				// proximo(e);

			}

			@Override
			public void keyPressed(KeyEvent e) {
				comandoTecla(e);

			}
		});

		txtPreco = new JTextFieldSoNumero();
		txtPreco.setBackground(Color.DARK_GRAY);
		txtPreco.setForeground(Color.WHITE);
		txtPreco.setFont(new Font("Tahoma", Font.BOLD, 25));
		txtPreco.setColumns(10);
		txtPreco.setBorder(
				new TitledBorder(null, "Pre\u00E7o", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		txtPreco.setOpaque(false);
		txtPreco.setCaretColor(Color.WHITE);
		txtPreco.addKeyListener(new KeyListener() {

			public void keyTyped(KeyEvent e) {

			}

			public void keyReleased(KeyEvent e) {
				/// proximo(e);

			}

			@Override
			public void keyPressed(KeyEvent e) {
				comandoTecla(e);

			}
		});

		descricao = new JLabel("DESCRI\u00C7\u00C3O DO PRODUTO");
		descricao.setForeground(Color.BLACK);
		descricao.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
		descricao.setBackground(Color.orange);
		descricao.setOpaque(true);
		descricao.setBorder(BorderFactory.createLineBorder(Color.black));

		lblTotal = new JLabel("TOTAL-->>");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 50));

		barraT = new JLabel("0");
		barraT.setText(convertMoeda.format(Float.parseFloat(barraT.getText())));
		barraT.setHorizontalAlignment(SwingConstants.CENTER);
		barraT.setFont(new Font("Tahoma", Font.BOLD, 80));
		barraT.setForeground(Color.WHITE);
		barraT.setBackground(Color.RED);
		barraT.setOpaque(true);
		barraT.setBorder(
				new SoftBevelBorder(BevelBorder.LOWERED, new Color(51, 51, 102), null, new Color(51, 153, 102), null));
		barraT.setBorder(BorderFactory.createLineBorder(Color.black));

		JLabel infor = new JLabel(
				"F1-PESQUISAR PRODUTO   F3-FECHAR COM CART\u00C3O    F8-FECHAR COM TROCO    F10-FECHAR AVISTA    F11-PESQUISA PRE\u00C7O");
		infor.setHorizontalAlignment(SwingConstants.LEFT);
		infor.setForeground(Color.ORANGE);
		infor.setBackground(Color.WHITE);
		infor.setFont(new Font("Tahoma", Font.BOLD, 13));
		infor.setToolTipText("");
		infor.setBorder(new TitledBorder(null, "Informa\u00E7\u00F5es", TitledBorder.LEADING, TitledBorder.TOP, null,
				Color.ORANGE));

		// tabela
		table = new JTable();
		ModeloTabela.modelogeral(table);
		tableProd();

		JLabel lblNr = new JLabel("000198 - Vendedor -  LUAN");
		lblNr.setForeground(Color.ORANGE);
		lblNr.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblNr.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "N\u00BA Venda",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(descricao, GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE)
						.addComponent(contener, GroupLayout.PREFERRED_SIZE, 919, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(txtBarra, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtQuant, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNr, GroupLayout.PREFERRED_SIZE, 375, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(txtDesc, GroupLayout.PREFERRED_SIZE, 177, GroupLayout.PREFERRED_SIZE)
									.addGap(14)
									.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE)))
							.addGap(415))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(barraT, GroupLayout.PREFERRED_SIZE, 595, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(infor, 0, 0, Short.MAX_VALUE)
							.addGap(418))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNr, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtQuant, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtPreco, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDesc, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
						.addComponent(txtBarra, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(descricao, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(contener, GroupLayout.PREFERRED_SIZE, 233, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(lblTotal, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(barraT, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(infor, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
					.addGap(21))
		);
		contentPane.setLayout(gl_contentPane);
		
		String [] lista= {"Venda de mercadoria","Devoluções de mercadoria recebida"};
		
		Date d = new Date();
	    String hoje = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(d);
		
	}

	public void comandoTecla(KeyEvent event) {

		if (event.getKeyCode() == KeyEvent.VK_F1) {
			new TelaEstoque("");
		}

		else if (event.getKeyCode() == KeyEvent.VK_ENTER) {
			// ProdutoDTO produto =
			// ControlProduto.consulta(Integer.parseInt(txtBarra.getText()));
			if (cont == 0) {
				//try {
					String c = txtBarra.getText();
					if(c.equals("")) {
						JOptionPane.showMessageDialog(null, "Pistole um produto ou digite o codigo resumido", "Aviso", JOptionPane.ERROR_MESSAGE);
						txtBarra.requestFocus();
					}
					else {
						boolean band=false;
					for (ProdutoDTO p : ControlProduto.lista()) {
						if (p.getCodBarra().equals(c)) {
							produto = p;
							descricao.setText("<html>"+" "+produto.getNome()+"<br>"+"estoque: "+produto.getQuant()+" codigo: "+produto.getId()+"<html>");
							txtPreco.setText(String.valueOf(p.getPrecoUnit()));
							txtQuant.requestFocus();
							cont = 1;
							band=true;
							}
						else if(p.getRef().equals(c)) {
							produto = p;
							descricao.setText("<html>"+" "+produto.getNome()+"<br>"+"estoque: "+produto.getQuant()+" codigo: "+produto.getId()+"<html>");
							txtPreco.setText(String.valueOf(p.getPrecoUnit()));
							txtQuant.requestFocus();
							cont = 1;
							band=true;
						}
						else {
							long cod =Long.parseLong(c);
							if (p.getId()==cod) {
								produto = p;
								descricao.setText("<html>"+" "+produto.getNome()+"<br>"+"estoque: "+produto.getQuant()+" codigo: "+produto.getId()+"<html>");
								txtPreco.setText(String.valueOf(p.getPrecoUnit()));
								txtQuant.requestFocus();
								cont = 1;
								band=true;
							}
						}
					}
					if(band=false) {
					JOptionPane.showMessageDialog(null, "Produto não cadastrado", "Aviso", JOptionPane.ERROR_MESSAGE);
					}
					}
				
				
			} else if (cont == 1) {
				if(txtQuant.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Digite a quantidade !","Erro de quantidade", JOptionPane.ERROR_MESSAGE);
					txtQuant.requestFocus();
				}
				else {
				txtDesc.requestFocus();
				produto.setQuantVend(Double.parseDouble(txtQuant.getText()));
				cont = 2;
				}

			} else if (cont == 2) {
				if (!txtDesc.getText().equals("")) {
					txtPreco.setText(String.valueOf(ComandText.diminuir(txtPreco, txtDesc)));
					produto.setPrecoUnit(Float.parseFloat(txtPreco.getText()));
				} 
				txtPreco.requestFocus();
				cont = 4;
			} else if (cont == 4) {
				modelo.addRow(produto);
				ComandText.limpar(txtBarra);
				ComandText.limpar(txtQuant);
				ComandText.limpar(txtDesc);
				ComandText.limpar(txtPreco);
				txtBarra.requestFocus();
				
				barraT.setText(convertMoeda.format(modelo.totalList()));
				cont = 0;

			}
		} 
		 else if (event.getKeyCode() == KeyEvent.VK_F3) {
				if (modelo.totalList() == 0) {
					JOptionPane.showMessageDialog(null, "Valor de venda zerado!", "Erro", JOptionPane.ERROR_MESSAGE);
				} else {
					desativarMold();
					new TelaCartao(this);
	                
					TelaCartao.setTotalVenda(modelo.totalList());
				}
			}

			else if (event.getKeyCode() == KeyEvent.VK_MULTIPLY) {
				txtQuant.setText(txtBarra.getText());
				ComandText.limpar(txtBarra);
			}
		else if (event.getKeyCode() == KeyEvent.VK_F4) {
			String cod=JOptionPane.showInputDialog(null, "Pistole o Produto a ser cancelado?");
			try {
				modelo.buscarQuantVend(cod);
				barraT.setText(convertMoeda.format(modelo.totalList()));
			} catch (ExceptionProdutoNaoVend e) {
				JOptionPane.showMessageDialog(null, e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
			}
		
			
		} 
		else if (event.getKeyCode() == KeyEvent.VK_F11) {
			new TelaPesquisaPreco();
		}
		else if (event.getKeyCode() == KeyEvent.VK_F8) {
		
			new TelaTroco(this);
			TelaTroco.setTotalVenda(modelo.totalList());
			  
		}
		
	}

	public static void capCod(long c) {
		txtBarra.setText("" + c);
	}

	private void tableProd() {

		modelo = new PDVtableModel() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		};
		table = new JTable();
		table.setModel(modelo);


		table.getColumnModel().getColumn(0).setPreferredWidth(70);
		table.getColumnModel().getColumn(1).setPreferredWidth(95);
		table.getColumnModel().getColumn(2).setPreferredWidth(300);
		table.getColumnModel().getColumn(3).setPreferredWidth(70);
		table.getColumnModel().getColumn(4).setPreferredWidth(100);
		table.getColumnModel().getColumn(5).setPreferredWidth(100);
		table.getColumnModel().getColumn(6).setPreferredWidth(100);
		

		contener = new JScrollPane(table);
		table.setFont(new Font("Calibri Light", Font.PLAIN, 20));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

	}
	

	public void desativarMold() {
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent evt) {
				ModeloTabela.destivar(table);

			}

		});
	}
	
	
}
