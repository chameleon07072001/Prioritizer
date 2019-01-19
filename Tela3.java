import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Tela3 extends JFrame implements ActionListener{

	JButton botaoVoltar;
	JLabel label1, label2, label3;


	public Tela3(){
		setSize(500, 470);
		setTitle("Cotação de moedas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);


		label1 = new JLabel("BEM VINDO AO PRIORITIZER 0.01");
		getContentPane().add(label1);
		label1.setBounds(140,10,240,40);

		label2 = new JLabel("CRIADO POR: CHAMELEON");
		getContentPane().add(label2);
		label2.setBounds(160,400,240,40);
		label3 = new JLabel("Esta Área esta sendo construida Para sua melhor experiência ");
		getContentPane().add(label3);
		label3.setBounds(40,100,440,40);






		botaoVoltar = new JButton("Voltar");
		getContentPane().add(botaoVoltar);
		botaoVoltar.setBounds(180,180,120,40);
		botaoVoltar.addActionListener(this);

	}


	public static void main(String[] args) {
		Tela3 chama3 = new Tela3();
		chama3.setVisible(true);
		chama3.setResizable(false);
	}

	@Override
	public void actionPerformed(ActionEvent t){

		if(t.getSource()==botaoVoltar){
			Main chama1 = new Main();
			chama1.setVisible(true);
			chama1.setResizable(false);
			dispose();
		}


}

}
