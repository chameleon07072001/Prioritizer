import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Main extends JFrame implements ActionListener{


	//Anuncia os componentes 
	JButton botaoPrioriter1, botaoCotacao, botaoSair;
	JLabel labe11, labe12;

	JMenuBar barra = new JMenuBar();

	JMenu menu1 = new JMenu("Opçoẽs");
	JMenuItem item1 = new JMenuItem("Sair");
	JMenu menu2 = new JMenu("Sobre");



	public Main(){
		//principais componentes da tela
		setSize(500, 470);
		setTitle("Prioritizer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);


		setJMenuBar(barra);
		barra.add(menu1);
		barra.add(menu2);
		menu1.add(item1);
		///////////////////////////////////////



		//Area de Label
		labe11 = new JLabel("BEM VINDO AO PRIORITIZER 0.01");
		getContentPane().add(labe11);
		labe11.setBounds(135,40,240,40);

		labe12 = new JLabel("CRIADO POR: CHAMELEON");
		getContentPane().add(labe12);
		labe12.setBounds(155,380,240,40);
		/////////////



		//Area dos botoes
		botaoPrioriter1 = new JButton("Prioritizer");
		getContentPane().add(botaoPrioriter1);
		botaoPrioriter1.setBounds(160,100,170,40);  //Onde X, Onde Y comprimento do componente, tamanho
		botaoPrioriter1.addActionListener(this); //Coloca a acao nos botoes

		botaoCotacao = new JButton("Cotação de moedas");
		getContentPane().add(botaoCotacao);
		botaoCotacao.setBounds(160,180,170,40); //Onde X, Onde Y comprimento do componente, tamanho
		botaoCotacao.addActionListener(this);	//Coloca a acao nos botoes

		botaoSair = new JButton("Sair");
		getContentPane().add(botaoSair);
		botaoSair.setBounds(160,260,170,40); //Onde X, Onde Y comprimento do componente, tamanho
		botaoSair.addActionListener(this);//Coloca a acao nos botoes
		///////

	}




	public static void main(String[] args){

		//colocando a telaVisivel
		Main chama1 = new Main();
		chama1.setVisible(true);
		chama1.setResizable(false);
		//////
    	//Nao permitindo o redimensionamento

	}

	/////////Area das acoes 
	@Override
	public void actionPerformed(ActionEvent e){

		if(e.getSource()==botaoPrioriter1){
		Tela2 chama2 = new Tela2();
		chama2.setVisible(true);
		chama2.setResizable(false);
		dispose();

	}

	if(e.getSource()==botaoCotacao){
		Tela3 chama3 = new Tela3();
		chama3.setVisible(true);
		chama3.setResizable(false);
		dispose();
		
	}
	if(e.getSource()==botaoSair){
			 System.exit(0);
	}
}

}
