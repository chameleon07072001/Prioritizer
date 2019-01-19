import  javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class Tela2 extends JFrame implements ActionListener{

	JTextField campo1, campo2, campo3, campo4, campo5, campo6, campo7;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8, label9;
	JButton botaoPrioritizer, botaoVoltar, botaoSair;
	public double n1, n2, n3, n4, n5, n6, n7;


	public Tela2(){
		setSize(500, 470);
		setTitle("Prioritizer");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);


		botaoPrioritizer = new JButton("PRIORITIZER");
		getContentPane().add(botaoPrioritizer);
		botaoPrioritizer.setBounds(315,220,130,30);
		botaoPrioritizer.addActionListener(this);


		botaoVoltar = new JButton("Voltar");
		getContentPane().add(botaoVoltar);
		botaoVoltar.setBounds(290,300,80,30);
		botaoVoltar.addActionListener(this);
		

		botaoSair = new JButton("Sair");
		getContentPane().add(botaoSair);
		botaoSair.setBounds(380,300,80,30); //Onde X, Onde Y comprimento do componente, tamanho
		botaoSair.addActionListener(this);

		label1 = new JLabel("BEM VINDO AO PRIORITIZER 0.01");
		getContentPane().add(label1);
		label1.setBounds(140,20,240,40);

		label2 = new JLabel("CRIADO POR: CHAMELEON");
		getContentPane().add(label2);
		label2.setBounds(160,390,240,40);


		label3 = new JLabel("Capital: ");
		getContentPane().add(label3);
		label3.setBounds(10, 67,200,40);


		label4 = new JLabel("Àgua: ");
		getContentPane().add(label4);
		label4.setBounds(10, 146,200,40);

		label5 = new JLabel("Luz: ");
		getContentPane().add(label5);
		label5.setBounds(10, 196,200,40);


		label6 = new JLabel("Alimentação: ");
		getContentPane().add(label6);
		label6.setBounds(10, 246,200,40);


		label7 = new JLabel("Escola: ");
		getContentPane().add(label7);
		label7.setBounds(10, 296,200,40);


		label8 = new JLabel("Telefone: ");
		getContentPane().add(label8);
		label8.setBounds(230,96,200,40);


		label9 = new JLabel("Lazer");
		getContentPane().add(label9);
		label9.setBounds(230,140,240,40);


		campo1 = new JTextField();
		getContentPane().add(campo1);
		campo1.setBounds(110, 70, 100, 30);

		campo2 = new JTextField();
		getContentPane().add(campo2);
		campo2.setBounds(110, 150, 100, 30);


		campo3 = new JTextField();
		getContentPane().add(campo3);
		campo3.setBounds(110, 200, 100, 30);


		campo4 = new JTextField();
		getContentPane().add(campo4);
		campo4.setBounds(110, 250, 100, 30);


		campo5 = new JTextField();
		getContentPane().add(campo5);
		campo5.setBounds(110, 300, 100, 30);


		campo6 = new JTextField();
		getContentPane().add(campo6);
		campo6.setBounds(320, 100, 100, 30);


		campo7 = new JTextField();
		getContentPane().add(campo7);
		campo7.setBounds(320, 150, 100, 30);



	}


	public static void main(String[] args) {
		Tela2 chama2 = new Tela2();
		chama2.setVisible(true);
		chama2.setResizable(false);
	}


@Override
	public void actionPerformed(ActionEvent v){


		if(v.getSource()==botaoSair){
			System.exit(1);
		}


		if(v.getSource()==botaoVoltar){
			Main chama1 = new Main();
			chama1.setVisible(true);
			chama1.setResizable(false);
			dispose();

		}

		Double num = Double.parseDouble(campo1.getText());

		Double num2 = Double.parseDouble(campo2.getText());
		Double num3 = Double.parseDouble(campo3.getText());
		Double num4 = Double.parseDouble(campo4.getText());
		Double num5 = Double.parseDouble(campo5.getText());
		Double num6 = Double.parseDouble(campo6.getText());
		Double num7 = Double.parseDouble(campo7.getText());


		Double despesas = num2+num3+num4+num5+num6+num7;
		Double contaFinal = num - (despesas);


		if(v.getSource()==botaoPrioritizer){

		JOptionPane.showMessageDialog(null, " Com seu capital de: "+ num + " E Com despessas de: "+ despesas +" Sobram: " +contaFinal);


		if(contaFinal <= 0){
			JOptionPane.showMessageDialog(null, " Suas contas estão muito altas! Tente revisa-las");
		}else{
			JOptionPane.showMessageDialog(null, " Parabéns! Suas contas estão em ordem.");
		}
}


	}

}
