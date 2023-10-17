package com.flowers.flower;

import java.awt.Component;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class FlowerScreen extends JFrame implements ActionListener {

    private JLabel lblName, lblDescription, lblPrice, lblResult;
    private JTextField txtName, txtDescription, txtPrice, txtResult;
    private JButton btnInsert, btnUpdate, btnDelete;
    private GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JPanel pnlData, pnlButtons, pnlResult, pnlFinal;

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

        lblDescription=new JLabel("REsultado:",JLabel.RIGHT);
		lblDescription.setFont(f);
		txtDescription=new JTextField(20);
		txtDescription.setFont(f);
		txtDescription.setToolTipText("Digite o nome da planta:");

        lblPrice=new JLabel("Preço:",JLabel.RIGHT);
		lblPrice.setFont(f);
		txtPrice=new JTextField(20);
		txtPrice.setFont(f);
		txtPrice.setToolTipText("Digite o preço da planta:");

        btnInsert=new JButton("Adicionar");
		btnInsert.setFont(f);
		btnInsert.setToolTipText("Clique aqui para adicionar a planta ao banco.");
		btnInsert.setMnemonic('C');
		btnInsert.addActionListener(this);

        btnUpdate=new JButton("Alterar");
		btnUpdate.setFont(f);
		btnUpdate.setToolTipText("Clique aqui para alterar a planta ao banco.");
		btnUpdate.setMnemonic('C');
		btnUpdate.addActionListener(this);

        btnDelete=new JButton("Remover");
		btnDelete.setFont(f);
		btnDelete.setToolTipText("Clique aqui para remover a planta ao banco.");
		btnDelete.setMnemonic('C');
		btnDelete.addActionListener(this);

        gridBagConstraints.fill=GridBagConstraints.BOTH;
        gridBagConstraints.insets=new Insets(8,8,8,8);

        pnlData=new JPanel(new GridBagLayout());
		addGridBag(0,0,lblName,pnlData);
		addGridBag(1,0,txtName,pnlData);
		addGridBag(0,1,lblDescription,pnlData);
		addGridBag(1,1,txtDescription,pnlData);
		addGridBag(0,2,lblPrice,pnlData);
		addGridBag(1,2,txtPrice,pnlData);

        pnlButtons=new JPanel(new GridBagLayout());
		addGridBag(0,0,btnInsert,pnlButtons);
		addGridBag(1,0,btnUpdate,pnlButtons);
		addGridBag(2,0,btnDelete,pnlButtons);
        
        pnlResult = new JPanel(new GridBagLayout());
        addGridBag(0, 0, lblResult, pnlResult);

        pnlFinal=new JPanel(new GridBagLayout());
        addGridBag(0,0,pnlData,pnlFinal);
        addGridBag(0, 1, pnlButtons, pnlFinal);
        addGridBag(0, 2, pnlResult, pnlFinal);
        Container P=getContentPane();
        P.add(pnlFinal);
    }

    public void addGridBag(final int x,final int y,final Component obj,final JPanel pnl)
	{
		gridBagConstraints.gridx=x;
		gridBagConstraints.gridy=y;
		pnl.add(obj,gridBagConstraints);
	}

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
