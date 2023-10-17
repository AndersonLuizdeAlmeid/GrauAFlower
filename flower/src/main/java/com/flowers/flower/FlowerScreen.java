package com.flowers.flower;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowerScreen extends JFrame implements ActionListener {

    private JLabel lblName, lblDescription, lblPrice, lblResult;
    private JTextField txtName, txtDescription, txtPrice, txtResult;
    private JButton btnInsert, btnUpdate, btnDelete;
    private GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JPanel pnlData, pnlButtons, pnlResult;

    public FlowerScreen(){
        this.setTitle("Exemplo");
		this.setLocation(700,320);
		this.setSize(500,400);
		this.setResizable(false);

        Font f = new Font("SansSerif", Font.PLAIN, 20);
        
        lblName=new JLabel("Nome:",JLabel.RIGHT);
		lblName.setFont(f);
		txtName=new JTextField(20);
		txtName.setFont(f);
		txtName.setToolTipText("Digite o nome da planta:");
	
        lblResult=new JLabel("Resultado:",JLabel.RIGHT);
		lblResult.setFont(f);

        lblPrice=new JLabel("Preço:",JLabel.RIGHT);
		lblPrice.setFont(f);
		txtPrice=new JTextField(20);
		txtPrice.setFont(f);
		txtPrice.setToolTipText("Digite o preço da planta:");

        lblResult=new JLabel("REsultado:",JLabel.RIGHT);
		lblResult.setFont(f);
		txtResult=new JTextField(20);
		txtResult.setFont(f);
		txtResult.setToolTipText("Digite o nome da planta:");

        btnInsert=new JButton("Calcular");
		btnInsert.setFont(f);
		btnInsert.setToolTipText("Clique aqui para calcular a média do aluno");
		btnInsert.setMnemonic('C');
		btnInsert.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
