package VIEW;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import VIEW.tabela.ModeloTabela;
import VIEW.tabela.TabelaFunc;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.util.Locale.Category;
import javax.swing.JTextArea;
import javax.swing.JSlider;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;

public class TelaCadProduto extends JFrame {

	private JPanel contentPane;
	private JTextField txtCod;
	private JTextField textBarras;
	private JTextField txtDesc;
	private JTextField txtUn;
	private JTextField txtCaixa;
	private JTextField txtFracao;
	private JTextField txtQuant;
	private JTextField txtPrecoVenda;
	private JTextField txtFornec;
	private JTextField txtPrecoCaixa;
	private JTextField txtPrecoComp;
	private JTextField ncm;
	private JTextField cest;
	private JTextField txtCit;
	private JTextField txtValidade;
	private JTextField txtValPromocao;
	private JTextField precoPromocao;
	private JTextField txtPesquisa;
	private JTable table;
	private JTextField txtQuantEnsumo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new TelaCadProduto("");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaCadProduto(String acao) {
		setTitle("Ficha de cadastro");
			TabelaFunc r=new TabelaFunc();
		
		ModeloTabela.modelogeral(r);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setResizable(false);//seuJFrame
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		opedit();
		JTabbedPane ficha = new JTabbedPane(JTabbedPane.TOP);
		ficha.setBackground(Color.GRAY);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(ficha, GroupLayout.PREFERRED_SIZE, 674, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addComponent(ficha, GroupLayout.PREFERRED_SIZE, 599, GroupLayout.PREFERRED_SIZE))
		);
		
		JPanel descricao = new JPanel();
		descricao.setBackground(Color.DARK_GRAY);
		ficha.addTab("FICHA PRODUTO", new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"), descricao, "Preencher dados do produto");
		
		txtCod = new JTextField();
		txtCod.setBounds(68, 11, 106, 26);
		txtCod.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCod.setColumns(10);
		
		JLabel lblCod = new JLabel("Codigo:");
		lblCod.setForeground(Color.ORANGE);
		lblCod.setBounds(10, 11, 69, 24);
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblCodbarras = new JLabel("Cod.Barras:");
		lblCodbarras.setForeground(Color.ORANGE);
		lblCodbarras.setBounds(10, 54, 108, 28);
		lblCodbarras.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		textBarras = new JTextField();
		textBarras.setBounds(103, 56, 142, 26);
		textBarras.setText("1234567891234");
		textBarras.setFont(new Font("Tahoma", Font.BOLD, 14));
		textBarras.setColumns(10);
		
		JLabel lblDescrio = new JLabel("Descri\u00E7\u00E3o:");
		lblDescrio.setForeground(Color.ORANGE);
		lblDescrio.setBounds(10, 99, 108, 28);
		lblDescrio.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtDesc = new JTextField();
		txtDesc.setBounds(103, 101, 448, 26);
		txtDesc.setText("1234567891234");
		txtDesc.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtDesc.setColumns(10);
		
		JLabel lblMe = new JLabel("Unid. venda:");
		lblMe.setForeground(Color.ORANGE);
		lblMe.setBounds(10, 191, 108, 28);
		lblMe.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtUn = new JTextField();
		txtUn.setBounds(117, 193, 57, 26);
		txtUn.setText("UN");
		txtUn.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtUn.setColumns(10);
		
		JLabel lblCaixaVenda = new JLabel("Caixa. venda:");
		lblCaixaVenda.setForeground(Color.ORANGE);
		lblCaixaVenda.setBounds(10, 240, 108, 28);
		lblCaixaVenda.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtCaixa = new JTextField();
		txtCaixa.setBounds(117, 242, 57, 26);
		txtCaixa.setText("UN");
		txtCaixa.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCaixa.setColumns(10);
		
		JLabel lblFraoDoProduto = new JLabel("Fra\u00E7\u00E3o do Produto:");
		lblFraoDoProduto.setForeground(Color.ORANGE);
		lblFraoDoProduto.setBounds(10, 292, 142, 28);
		lblFraoDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtFracao = new JTextField();
		txtFracao.setBounds(160, 294, 57, 26);
		txtFracao.setText("UN");
		txtFracao.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtFracao.setColumns(10);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setForeground(Color.ORANGE);
		lblQuantidade.setBounds(10, 342, 97, 28);
		lblQuantidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtQuant = new JTextField();
		txtQuant.setBounds(111, 344, 94, 26);
		txtQuant.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtQuant.setColumns(10);
		descricao.setLayout(null);
		descricao.add(txtCod);
		descricao.add(lblCod);
		descricao.add(lblCodbarras);
		descricao.add(textBarras);
		descricao.add(lblDescrio);
		descricao.add(txtDesc);
		descricao.add(lblMe);
		descricao.add(txtUn);
		descricao.add(txtCaixa);
		descricao.add(lblCaixaVenda);
		descricao.add(lblFraoDoProduto);
		descricao.add(txtFracao);
		descricao.add(lblQuantidade);
		descricao.add(txtQuant);
		
		JLabel lblTerDisconto = new JLabel("Tem Desconto?:");
		lblTerDisconto.setForeground(Color.ORANGE);
		lblTerDisconto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTerDisconto.setBounds(10, 396, 129, 28);
		descricao.add(lblTerDisconto);
		
		JComboBox opDesc = new JComboBox();
		opDesc.setModel(new DefaultComboBoxModel(new String[] {"SIM", "NAO"}));
		opDesc.setBounds(136, 399, 69, 26);
		descricao.add(opDesc);
		
		JTextArea txtObservacao = new JTextArea();
		txtObservacao.setBounds(10, 465, 411, 69);
		descricao.add(txtObservacao);
		
		JLabel lblObservaesDoProduto = new JLabel("Observa\u00E7\u00F5es do produto");
		lblObservaesDoProduto.setForeground(Color.ORANGE);
		lblObservaesDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblObservaesDoProduto.setBounds(10, 439, 235, 28);
		descricao.add(lblObservaesDoProduto);
		
		JLabel lblPreoVenda = new JLabel("Pre\u00E7o Venda:");
		lblPreoVenda.setForeground(Color.ORANGE);
		lblPreoVenda.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreoVenda.setBounds(443, 357, 106, 28);
		descricao.add(lblPreoVenda);
		
		txtPrecoVenda = new JTextField();
		txtPrecoVenda.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPrecoVenda.setColumns(10);
		txtPrecoVenda.setBounds(553, 359, 106, 26);
		descricao.add(txtPrecoVenda);
		
		txtFornec = new JTextField();
		txtFornec.setText("UN");
		txtFornec.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtFornec.setColumns(10);
		txtFornec.setBounds(108, 149, 443, 26);
		descricao.add(txtFornec);
		
		JLabel lblFornecedor = new JLabel("Fornecedor:");
		lblFornecedor.setForeground(Color.ORANGE);
		lblFornecedor.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFornecedor.setBounds(10, 149, 108, 28);
		descricao.add(lblFornecedor);
		
		JLabel lblPreoCaixa = new JLabel("Pre\u00E7o Caixa:");
		lblPreoCaixa.setForeground(Color.ORANGE);
		lblPreoCaixa.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreoCaixa.setBounds(443, 396, 106, 28);
		descricao.add(lblPreoCaixa);
		
		txtPrecoCaixa = new JTextField();
		txtPrecoCaixa.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPrecoCaixa.setColumns(10);
		txtPrecoCaixa.setBounds(553, 398, 106, 26);
		descricao.add(txtPrecoCaixa);
		
		JLabel lblPreoCompra = new JLabel("Pre\u00E7o Compra:");
		lblPreoCompra.setForeground(Color.ORANGE);
		lblPreoCompra.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblPreoCompra.setBounds(431, 439, 118, 28);
		descricao.add(lblPreoCompra);
		
		txtPrecoComp = new JTextField();
		txtPrecoComp.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPrecoComp.setColumns(10);
		txtPrecoComp.setBounds(553, 441, 106, 26);
		descricao.add(txtPrecoComp);
		
		JButton botOK = new JButton("OK");
		botOK.setBounds(456, 491, 89, 43);
		descricao.add(botOK);
		
		JButton botCancelar = new JButton("CANCELAR");
		botCancelar.setBounds(555, 491, 104, 43);
		descricao.add(botCancelar);
		
		JLabel lblValidade = new JLabel("Validade:");
		lblValidade.setForeground(Color.ORANGE);
		lblValidade.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblValidade.setBounds(283, 54, 75, 28);
		descricao.add(lblValidade);
		
		txtValidade = new JTextField();
		txtValidade.setText("29/12/2019");
		txtValidade.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtValidade.setColumns(10);
		txtValidade.setBounds(365, 56, 106, 26);
		descricao.add(txtValidade);
		
		JLabel fundo = new JLabel("");
		fundo.setBackground(Color.DARK_GRAY);
		fundo.setBounds(1, 0, 669, 545);
		fundo.setIcon(new ImageIcon("icon/fundoCad1.jpg"));
		fundo.setFont(new Font("Tahoma", Font.BOLD, 15));
		descricao.add(fundo);
		
		
		JPanel icms = new JPanel();
		icms.setBackground(Color.GRAY);
		ficha.addTab("ICMS", new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"), icms, null);
		
		JLabel lblNcm = new JLabel("NCM:");
		lblNcm.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		ncm = new JTextField();
		ncm.setFont(new Font("Tahoma", Font.BOLD, 14));
		ncm.setColumns(10);
		
		JLabel lblTipoDoProduto = new JLabel("Tipo do Produto:");
		lblTipoDoProduto.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox opTipoProd = new JComboBox();
		opTipoProd.setModel(new DefaultComboBoxModel(new String[] {"REVENDA", "MAT.PRIMA", "FAB.PROPRIA", "EMBALAGEM", "USO E COMSUMO", "SERVICO", "INSUMOS", "IMOBILIZADO"}));
		
		JLabel lblCest = new JLabel("CEST:");
		lblCest.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		cest = new JTextField();
		cest.setFont(new Font("Tahoma", Font.BOLD, 14));
		cest.setColumns(10);
		
		JLabel lblCit = new JLabel("CIT:");
		lblCit.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtCit = new JTextField();
		txtCit.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtCit.setColumns(10);
		
		JTextArea areaNCM = new JTextArea();
		areaNCM.setEditable(false);
		areaNCM.setBackground(Color.DARK_GRAY);
		
		JTextArea areaCEST = new JTextArea();
		areaCEST.setEditable(false);
		areaCEST.setBackground(Color.DARK_GRAY);
		
		JPanel panProd = new JPanel();
		panProd.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS FISCAIS DE SAIDA", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		panProd.setBackground(Color.GRAY);
		
		JPanel panIcms = new JPanel();
		panIcms.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "DADOS FISCAIS DE ENTRADA", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 200, 0)));
		panIcms.setBackground(Color.GRAY);
		
		JLabel label = new JLabel("PIS:");
		label.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox pisEntrada = new JComboBox();
		pisEntrada.setModel(new DefaultComboBoxModel(new String[] {"50-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno", "51-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito \u2013 Vinculada Exclusivamente a Receita N\u00E3o Tributada no Mercado Interno", "52-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada Exclusivamente a Receita de Exporta\u00E7\u00E3o", "53-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno", "54-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "55-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas N\u00E3o-Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "56-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno, e de Exporta\u00E7\u00E3o", "60-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita Tributada no Mercado Interno", "61-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita N\u00E3o-Tributada no Mercado Interno", "62-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita de Exporta\u00E7\u00E3o", "63-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno", "64-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "65-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas N\u00E3o-Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "66-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno, e de Exporta\u00E7\u00E3o", "67-Cr\u00E9dito Presumido - Outras Opera\u00E7\u00F5es", "70-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o sem Direito a Cr\u00E9dito", "71-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o com Isen\u00E7\u00E3o", "72-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o com Suspens\u00E3o", "73-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o a Al\u00EDquota Zero", "74-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o sem Incid\u00EAncia da Contribui\u00E7\u00E3o", "75-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o por Substitui\u00E7\u00E3o Tribut\u00E1ria", "98-Outras Opera\u00E7\u00F5es de Entrada", "99-Outras Opera\u00E7\u00F5es"}));
		
		JLabel label_2 = new JLabel("CONFIS:");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox confisEntrada = new JComboBox();
		confisEntrada.setModel(new DefaultComboBoxModel(new String[] {"50-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada Exclusivamente a Receita Tributada no Mercado Interno", "51-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito \u2013 Vinculada Exclusivamente a Receita N\u00E3o Tributada no Mercado Interno", "52-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada Exclusivamente a Receita de Exporta\u00E7\u00E3o", "53-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno", "54-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "55-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas N\u00E3o-Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "56-Opera\u00E7\u00E3o com Direito a Cr\u00E9dito - Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno, e de Exporta\u00E7\u00E3o", "60-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita Tributada no Mercado Interno", "61-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita N\u00E3o-Tributada no Mercado Interno", "62-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada Exclusivamente a Receita de Exporta\u00E7\u00E3o", "63-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno", "64-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "65-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas N\u00E3o-Tributadas no Mercado Interno e de Exporta\u00E7\u00E3o", "66-Cr\u00E9dito Presumido - Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o Vinculada a Receitas Tributadas e N\u00E3o-Tributadas no Mercado Interno, e de Exporta\u00E7\u00E3o", "67-Cr\u00E9dito Presumido - Outras Opera\u00E7\u00F5es", "70-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o sem Direito a Cr\u00E9dito", "71-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o com Isen\u00E7\u00E3o", "72-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o com Suspens\u00E3o", "73-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o a Al\u00EDquota Zero", "74-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o sem Incid\u00EAncia da Contribui\u00E7\u00E3o", "75-Opera\u00E7\u00E3o de Aquisi\u00E7\u00E3o por Substitui\u00E7\u00E3o Tribut\u00E1ria", "98-Outras Opera\u00E7\u00F5es de Entrada", "99-Outras Opera\u00E7\u00F5es"}));
		
		JLabel label_3 = new JLabel("PIS:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label_4 = new JLabel("IPI:");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		
		JComboBox ipiEntrada = new JComboBox();
		GroupLayout gl_panIcms = new GroupLayout(panIcms);
		gl_panIcms.setHorizontalGroup(
			gl_panIcms.createParallelGroup(Alignment.LEADING)
				.addGap(0, 312, Short.MAX_VALUE)
				.addGroup(gl_panIcms.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panIcms.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panIcms.createSequentialGroup()
							.addComponent(label)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(pisEntrada, 0, 250, Short.MAX_VALUE))
						.addGroup(gl_panIcms.createSequentialGroup()
							.addComponent(label_2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(confisEntrada, 0, 227, Short.MAX_VALUE))
						.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panIcms.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(ipiEntrada, 0, 250, Short.MAX_VALUE)))
					.addContainerGap())
		);
		gl_panIcms.setVerticalGroup(
			gl_panIcms.createParallelGroup(Alignment.LEADING)
				.addGap(0, 207, Short.MAX_VALUE)
				.addGroup(gl_panIcms.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panIcms.createParallelGroup(Alignment.BASELINE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(pisEntrada, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panIcms.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(confisEntrada, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panIcms.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panIcms.createSequentialGroup()
							.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
							.addGap(62)
							.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panIcms.createSequentialGroup()
							.addGap(2)
							.addComponent(ipiEntrada, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panIcms.setLayout(gl_panIcms);
		GroupLayout gl_icms = new GroupLayout(icms);
		gl_icms.setHorizontalGroup(
			gl_icms.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_icms.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTipoDoProduto, GroupLayout.PREFERRED_SIZE, 129, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_icms.createSequentialGroup()
							.addGap(126)
							.addComponent(opTipoProd, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_icms.createSequentialGroup()
							.addComponent(lblCit, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addGap(4)
							.addComponent(txtCit, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_icms.createSequentialGroup()
							.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_icms.createSequentialGroup()
									.addComponent(lblCest, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(cest, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_icms.createSequentialGroup()
									.addComponent(lblNcm)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(ncm, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
								.addComponent(areaCEST, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)
								.addComponent(areaNCM, GroupLayout.PREFERRED_SIZE, 352, GroupLayout.PREFERRED_SIZE)))
						.addGroup(Alignment.TRAILING, gl_icms.createSequentialGroup()
							.addComponent(panProd, GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panIcms, GroupLayout.PREFERRED_SIZE, 324, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_icms.setVerticalGroup(
			gl_icms.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_icms.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTipoDoProduto, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_icms.createSequentialGroup()
							.addGap(3)
							.addComponent(opTipoProd, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCit, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_icms.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNcm, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(ncm, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(areaNCM, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addGap(45)
					.addGroup(gl_icms.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblCest, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
						.addComponent(cest, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(areaCEST, GroupLayout.PREFERRED_SIZE, 95, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_icms.createParallelGroup(Alignment.LEADING)
						.addComponent(panIcms, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(panProd, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		
		JLabel lblPis = new JLabel("PIS:");
		lblPis.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox pisSaida = new JComboBox();
		pisSaida.setModel(new DefaultComboBoxModel(new String[] {"01-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota B\u00E1sica", "02-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota Diferenciada", "03-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota por Unidade de Medida de Produto", "04-Opera\u00E7\u00E3o Tribut\u00E1vel Monof\u00E1sica - Revenda a Al\u00EDquota Zero", "05-Opera\u00E7\u00E3o Tribut\u00E1vel por Substitui\u00E7\u00E3o Tribut\u00E1ria", "06-Opera\u00E7\u00E3o Tribut\u00E1vel a Al\u00EDquota Zero", "07-Opera\u00E7\u00E3o Isenta da Contribui\u00E7\u00E3o", "08-Opera\u00E7\u00E3o sem Incid\u00EAncia da Contribui\u00E7\u00E3o", "09-Opera\u00E7\u00E3o com Suspens\u00E3o da Contribui\u00E7\u00E3o", "49-Outras Opera\u00E7\u00F5es de Sa\u00EDda"}));
		
		JLabel lblConfis = new JLabel("CONFIS:");
		lblConfis.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox confisSaida = new JComboBox();
		confisSaida.setModel(new DefaultComboBoxModel(new String[] {"01-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota B\u00E1sica", "02-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota Diferenciada", "03-Opera\u00E7\u00E3o Tribut\u00E1vel com Al\u00EDquota por Unidade de Medida de Produto", "04-Opera\u00E7\u00E3o Tribut\u00E1vel Monof\u00E1sica - Revenda a Al\u00EDquota Zero", "05-Opera\u00E7\u00E3o Tribut\u00E1vel por Substitui\u00E7\u00E3o Tribut\u00E1ria", "06-Opera\u00E7\u00E3o Tribut\u00E1vel a Al\u00EDquota Zero", "07-Opera\u00E7\u00E3o Isenta da Contribui\u00E7\u00E3o", "08-Opera\u00E7\u00E3o sem Incid\u00EAncia da Contribui\u00E7\u00E3o", "09-Opera\u00E7\u00E3o com Suspens\u00E3o da Contribui\u00E7\u00E3o", "49-Outras Opera\u00E7\u00F5es de Sa\u00EDda"}));
		
		JLabel label_1 = new JLabel("PIS:");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel lblIpi = new JLabel("IPI:");
		lblIpi.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox ipiSaida = new JComboBox();
		ipiSaida.setModel(new DefaultComboBoxModel(new String[] {"50-Sa\u00EDda Tributada", "51-Sa\u00EDda Tribut\u00E1vel com Al\u00EDquota Zero", "52-Sa\u00EDda Isenta", "53-Sa\u00EDda N\u00E3o-Tributada", "54-Sa\u00EDda Imune", "55-Sa\u00EDda com Suspens\u00E3o", "99-Outras Sa\u00EDdas"}));
		
		JLabel lblCst = new JLabel("CST:");
		lblCst.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JComboBox cstSaida = new JComboBox();
		cstSaida.setModel(new DefaultComboBoxModel(new String[] {"101-Tributada pelo Simples Nacional com permiss\u00E3o de cr\u00E9dito", "102- Tributada pelo Simples Nacional sem permiss\u00E3o de cr\u00E9dito", "103- Isen\u00E7\u00E3o do ICMS no Simples Nacional para faixa de receita bruta", "201- Tributada pelo Simples Nacional com permiss\u00E3o de cr\u00E9dito e com cobran\u00E7a do ICMS por Substitui\u00E7\u00E3o Tributaria", "202- Tributada pelo Simples Nacional sem permiss\u00E3o de cr\u00E9dito e com cobran\u00E7a do ICMS por Substitui\u00E7\u00E3o Tributaria", "203- Isen\u00E7\u00E3o do ICMS nos Simples Nacional para faixa de receita bruta e com cobran\u00E7a do ICMS por Substitui\u00E7\u00E3o Tributaria", "300- Imune", "400- N\u00E3o tributada pelo Simples Nacional", "500- ICMS cobrado anteriormente por Substitui\u00E7\u00E3o Tributaria (substitu\u00EDdo) ou por antecipa\u00E7\u00E3o", "900- Outros"}));
		GroupLayout gl_panProd = new GroupLayout(panProd);
		gl_panProd.setHorizontalGroup(
			gl_panProd.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panProd.createSequentialGroup()
					.addGroup(gl_panProd.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panProd.createSequentialGroup()
							.addGap(71)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_panProd.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panProd.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panProd.createSequentialGroup()
									.addComponent(lblConfis)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(confisSaida, 0, 226, Short.MAX_VALUE))
								.addGroup(gl_panProd.createSequentialGroup()
									.addComponent(lblPis)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(pisSaida, 0, 261, Short.MAX_VALUE))
								.addGroup(gl_panProd.createSequentialGroup()
									.addComponent(lblIpi, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(ipiSaida, 0, 261, Short.MAX_VALUE))))
						.addGroup(gl_panProd.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblCst)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(cstSaida, GroupLayout.PREFERRED_SIZE, 249, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_panProd.setVerticalGroup(
			gl_panProd.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panProd.createSequentialGroup()
					.addGroup(gl_panProd.createParallelGroup(Alignment.LEADING)
						.addComponent(lblCst, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panProd.createSequentialGroup()
							.addGap(2)
							.addComponent(cstSaida, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(15)
					.addGroup(gl_panProd.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPis, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(pisSaida, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panProd.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblConfis, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(confisSaida, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(20)
					.addGroup(gl_panProd.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblIpi, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(ipiSaida, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(33)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panProd.setLayout(gl_panProd);
		icms.setLayout(gl_icms);
		
		JPanel panFoto = new JPanel();
		panFoto.setBackground(Color.GRAY);
		ficha.addTab("Foto", new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"), panFoto, null);
		
		JLabel foto = new JLabel("");
		foto.setBackground(Color.DARK_GRAY);
		foto.setForeground(Color.WHITE);
		foto.setBorder(new TitledBorder(null, "Foto do produto", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		
		JButton carregar = new JButton("Carregar Foto");
		GroupLayout gl_panFoto = new GroupLayout(panFoto);
		gl_panFoto.setHorizontalGroup(
			gl_panFoto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panFoto.createSequentialGroup()
					.addContainerGap(100, Short.MAX_VALUE)
					.addGroup(gl_panFoto.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_panFoto.createSequentialGroup()
							.addComponent(foto, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
							.addGap(93))
						.addGroup(Alignment.TRAILING, gl_panFoto.createSequentialGroup()
							.addComponent(carregar, GroupLayout.PREFERRED_SIZE, 302, GroupLayout.PREFERRED_SIZE)
							.addGap(176))))
		);
		gl_panFoto.setVerticalGroup(
			gl_panFoto.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panFoto.createSequentialGroup()
					.addGap(95)
					.addComponent(foto, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(carregar, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(90, Short.MAX_VALUE))
		);
		panFoto.setLayout(gl_panFoto);
		
		JPanel panPromocao = new JPanel();
		panPromocao.setBackground(Color.GRAY);
		ficha.addTab("Promo\u00E7\u00E3o/Composi\u00E7\u00E3o", new ImageIcon("C:\\Users\\luanp\\eclipse-workspace\\Graca_Software\\icon\\info.png"), panPromocao, null);
		
		JLabel lblValidadeDaPromoo = new JLabel("Validade da promo\u00E7\u00E3o:");
		lblValidadeDaPromoo.setForeground(Color.ORANGE);
		lblValidadeDaPromoo.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		txtValPromocao = new JTextField();
		txtValPromocao.setText("29/15/2019");
		txtValPromocao.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtValPromocao.setColumns(10);
		
		precoPromocao = new JTextField();
		precoPromocao.setText("1234567891234");
		precoPromocao.setFont(new Font("Tahoma", Font.BOLD, 14));
		precoPromocao.setColumns(10);
		
		JLabel lblPreoPromocional = new JLabel("Pre\u00E7o Promocional:");
		lblPreoPromocional.setForeground(Color.ORANGE);
		lblPreoPromocional.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JPanel panelComp = new JPanel();
		panelComp.setBackground(Color.DARK_GRAY);
		panelComp.setBorder(new TitledBorder(null, "Ficha de Composi\u00E7\u00E3o", TitledBorder.LEADING, TitledBorder.TOP, null, Color.ORANGE));
		GroupLayout gl_panPromocao = new GroupLayout(panPromocao);
		gl_panPromocao.setHorizontalGroup(
			gl_panPromocao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panPromocao.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblValidadeDaPromoo)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(txtValPromocao, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(374, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, gl_panPromocao.createSequentialGroup()
					.addGap(27)
					.addComponent(lblPreoPromocional, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(precoPromocao, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
					.addGap(354))
				.addGroup(gl_panPromocao.createSequentialGroup()
					.addContainerGap()
					.addComponent(panelComp, GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panPromocao.setVerticalGroup(
			gl_panPromocao.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panPromocao.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_panPromocao.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblValidadeDaPromoo, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtValPromocao, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(26)
					.addGroup(gl_panPromocao.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPreoPromocional, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
						.addComponent(precoPromocao, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(36)
					.addComponent(panelComp, GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
					.addContainerGap())
		);
		
		txtPesquisa = new JTextField();
		txtPesquisa.setText("1234567891234");
		txtPesquisa.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtPesquisa.setColumns(10);
		
		JButton botPesquisa = new JButton(new ImageIcon("icon/pesquisaP.png"));
		
		JButton btnOk = new JButton("OK");
		
		JButton btnCancelar = new JButton("DELETE");
		
		JScrollPane scrollPane = new JScrollPane();
		
		txtQuantEnsumo = new JTextField();
		txtQuantEnsumo.setText("0,00");
		txtQuantEnsumo.setFont(new Font("Tahoma", Font.BOLD, 14));
		txtQuantEnsumo.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("CUSTO PRODUTO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel lblPrecoCusto = new JLabel("0,00");
		lblPrecoCusto.setBackground(Color.RED);
		lblPrecoCusto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecoCusto.setForeground(Color.BLACK);
		lblPrecoCusto.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblPrecoCusto.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.ORANGE, Color.ORANGE));
		lblPrecoCusto.setOpaque(true);
		
		JLabel lblPreoSugerido = new JLabel("PRE\u00C7O SUGERIDO");
		lblPreoSugerido.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		JLabel label_6 = new JLabel("0,00");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setForeground(Color.BLACK);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		label_6.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.BLACK, Color.BLACK, Color.ORANGE, Color.ORANGE));
		label_6.setBackground(Color.GREEN);
		GroupLayout gl_panelComp = new GroupLayout(panelComp);
		gl_panelComp.setHorizontalGroup(
			gl_panelComp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComp.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelComp.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelComp.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 156, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(lblPrecoCusto, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
							.addGap(42)
							.addComponent(lblPreoSugerido, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE))
						.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE)
						.addGroup(gl_panelComp.createSequentialGroup()
							.addGap(10)
							.addGroup(gl_panelComp.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelComp.createSequentialGroup()
									.addComponent(botPesquisa, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, 313, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(txtQuantEnsumo, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelComp.createSequentialGroup()
									.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 78, GroupLayout.PREFERRED_SIZE)))
							.addGap(247)))
					.addContainerGap())
		);
		gl_panelComp.setVerticalGroup(
			gl_panelComp.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelComp.createSequentialGroup()
					.addGap(4)
					.addGroup(gl_panelComp.createParallelGroup(Alignment.BASELINE)
						.addComponent(botPesquisa, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPesquisa, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtQuantEnsumo, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panelComp.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnCancelar, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addGap(17)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 187, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addGroup(gl_panelComp.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelComp.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
							.addComponent(lblPrecoCusto, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelComp.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblPreoSugerido, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
							.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		panelComp.setLayout(gl_panelComp);
		panPromocao.setLayout(gl_panPromocao);
		contentPane.setLayout(gl_contentPane);
		setBounds(300, 50, 700, 650);
	
		setVisible(true);
		repaint();

	}
	public void opedit() {
		//txtCod.setText("");
		
	}
}
