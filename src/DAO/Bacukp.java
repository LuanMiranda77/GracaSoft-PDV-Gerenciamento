package DAO;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



/*
 * @ autor dessa luan marinate 
 */

public class Bacukp  {
	private File origem;
	private File destino; 
	BufferedInputStream copiar = null;
	FileOutputStream colar = null;
	
	public String gerarBackup(String orig, String dest) {
		final List<String> arquivos = new ArrayList<String>(); 
		arquivos.add("//AgendaConsulta.xml");
		arquivos.add("//agendaProf.xml");
		arquivos.add("//central.xml");
		arquivos.add("//CEP.xml");
		arquivos.add("//Config.xml");
		arquivos.add("//Convenio.xml");
		arquivos.add("//Emitente.xml");
		arquivos.add("//Especialidade.xml");
		arquivos.add("//func.xml");
		arquivos.add("//Medicamento.xml");
		arquivos.add("//Paciente.xml");
		arquivos.add("//Procedimento.xml");
		arquivos.add("//Profissional.xml");
		
		for(String arq : arquivos) {
			origem = new File(orig+arq);
			destino = new File(dest);
			copiar(origem);
			colar(destino);
		}
		
			return "backup realizado com sucesso.";      
				
	}
		
	public void copiar(File origem) {
		try {
			copiar = new BufferedInputStream(new FileInputStream(origem));
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de arqiovo",JOptionPane.ERROR_MESSAGE);
		}
		
		
	}
	public void colar(File destino) {
		try {
			colar = new FileOutputStream(destino);
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de arqiovo",JOptionPane.ERROR_MESSAGE);
		}
		
		int cont = 0;
		byte[]bytes = new byte[1024];
		try {
			while((cont=copiar.read(bytes))>=0) {
				colar.write(bytes,0,cont);
				
			}
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(),"Erro de arqiovo",JOptionPane.ERROR_MESSAGE);
		}
		
	}
	public static void main(String[] args) {
		Bacukp b = new Bacukp();
		b.gerarBackup("C:\\Users\\luanp\\eclipse-workspace\\AppClinica\\xml", "E:\\programas\\sistemasluan");
	}

}
