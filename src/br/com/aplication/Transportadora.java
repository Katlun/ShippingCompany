package br.com.aplication;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.com.gui.JFrameCadastro;
import br.com.gui.JFrameViagem;

import java.awt.BorderLayout;
import javax.swing.JDesktopPane;

public class Transportadora {
	
	protected JFrame frmTransporte;
	private JDesktopPane desktopPane;
	private JMenuBar menu;
	private JMenu mnCadastros;
	private JMenuItem mntCaminhao;
	private JMenuItem mntViagens;
	
	public Transportadora() {
		this.frmTransporte = new JFrame();
		this.frmTransporte.setTitle("Sistema de Gerenciamento de Cadastro e Custos para Transportes.");
		this.frmTransporte.setSize(800, 500);
		this.frmTransporte.setIconImage(getImage());
		this.frmTransporte.setLocationRelativeTo(null);
		this.frmTransporte.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createMenuComponent();
		areaTrabalho();
		this.frmTransporte.setVisible(true);
	}
		
	public Image getImage(){
		URL url  = this.getClass().getResource("../imagem/transporte.png"); 
		Image icone = Toolkit.getDefaultToolkit().getImage(url);
		return icone;
	}
	
	public void areaTrabalho(){
		this.desktopPane = new JDesktopPane();
		this.desktopPane.setBackground(Color.WHITE);
		frmTransporte.getContentPane().add(this.desktopPane, BorderLayout.CENTER);
	}
		
	public void createMenuComponent(){
		menu = new JMenuBar();
		menu.setBackground(Color.CYAN);
		this.frmTransporte.setJMenuBar(menu);
		
		mnCadastros = new JMenu("Cadastros");
		menu.add(mnCadastros);
		
		mntCaminhao = new JMenuItem("Cadastro Caminhao");
		mntCaminhao.addActionListener(new Btncaminhao());
		mnCadastros.add(mntCaminhao);
		
		mntViagens = new JMenuItem("Cadastro de Viagens");
		mntViagens.addActionListener(new Btnviagem());
		mnCadastros.add(mntViagens);
	}
	
	private class Btncaminhao implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new JFrameCadastro();
		}
	}
	
	private class Btnviagem implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			new JFrameViagem();
		}
		
	}
	
}
