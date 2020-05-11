package paquete;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

import excepciones.DepositoInvalidoException;
import excepciones.ExtraccionInvalidaException;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;

public class Ventana extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPanel panelAgregarCuenta;
	private JPanel panelMuestraCuenta;
	private JPanel panelAcciones;
	private JPanel panelExtraccion;
	private JPanel panelDeposito;
	private JPanel panel;
	private JPanel panel_1;
	private JPanel panel_2;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JPanel panel_7;
	private JTextField textFieldAgregarCuenta;
	private JButton btnAgregarCuenta;
	private JPanel panel_9;
	private JPanel panel_10;
	private JPanel panel_12;
	private JPanel panel_13;
	private JTextField textFieldExtraer;
	private JTextField textDepositar;
	private JButton btnExtraer;
	private JButton btnDepositar;
	private CuentaBancaria cuenta;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 361);
		this.contentPane = new JPanel();
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panelAgregarCuenta = new JPanel();
		this.panelAgregarCuenta.setBorder(new TitledBorder(null, "Agregar Cuenta Bancaria", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.contentPane.add(this.panelAgregarCuenta);
		this.panelAgregarCuenta.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panel = new JPanel();
		this.panelAgregarCuenta.add(this.panel);
		this.panel.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_2 = new JPanel();
		this.panel.add(this.panel_2);
		
		this.panel_3 = new JPanel();
		this.panel.add(this.panel_3);
		
		this.textFieldAgregarCuenta = new JTextField();
		this.panel_3.add(this.textFieldAgregarCuenta);
		this.textFieldAgregarCuenta.setColumns(10);
		
		this.panel_4 = new JPanel();
		this.panel.add(this.panel_4);
		
		this.panel_1 = new JPanel();
		this.panelAgregarCuenta.add(this.panel_1);
		this.panel_1.setLayout(new GridLayout(3, 0, 0, 0));
		
		this.panel_5 = new JPanel();
		this.panel_1.add(this.panel_5);
		
		this.panel_6 = new JPanel();
		this.panel_1.add(this.panel_6);
		
		this.btnAgregarCuenta = new JButton("Agregar Cuenta");
		this.btnAgregarCuenta.addActionListener(this);
		this.panel_6.add(this.btnAgregarCuenta);
		
		this.panel_7 = new JPanel();
		this.panel_1.add(this.panel_7);
		
		this.panelMuestraCuenta = new JPanel();
		this.contentPane.add(this.panelMuestraCuenta);
		this.panelMuestraCuenta.setLayout(new BorderLayout(0, 0));
		
		this.textArea = new JTextArea();
		this.panelMuestraCuenta.add(this.textArea, BorderLayout.CENTER);
		
		this.panelAcciones = new JPanel();
		this.contentPane.add(this.panelAcciones);
		this.panelAcciones.setLayout(new GridLayout(0, 2, 0, 0));
		
		this.panelExtraccion = new JPanel();
		this.panelExtraccion.setBorder(new TitledBorder(null, "Realizar Extraccion", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelAcciones.add(this.panelExtraccion);
		this.panelExtraccion.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_9 = new JPanel();
		this.panelExtraccion.add(this.panel_9);
		
		this.textFieldExtraer = new JTextField();
		this.panel_9.add(this.textFieldExtraer);
		this.textFieldExtraer.setColumns(10);
		
		this.panel_10 = new JPanel();
		this.panelExtraccion.add(this.panel_10);
		
		this.btnExtraer = new JButton("Extraer");
		this.btnExtraer.addActionListener(this);
		this.panel_10.add(this.btnExtraer);
		
		this.panelDeposito = new JPanel();
		this.panelDeposito.setBorder(new TitledBorder(null, "Realizar Deposito", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		this.panelAcciones.add(this.panelDeposito);
		this.panelDeposito.setLayout(new GridLayout(2, 0, 0, 0));
		
		this.panel_12 = new JPanel();
		this.panelDeposito.add(this.panel_12);
		
		this.textDepositar = new JTextField();
		this.panel_12.add(this.textDepositar);
		this.textDepositar.setColumns(10);
		
		this.panel_13 = new JPanel();
		this.panelDeposito.add(this.panel_13);
		
		this.btnDepositar = new JButton("Depositar");
		this.btnDepositar.addActionListener(this);
		this.panel_13.add(this.btnDepositar);
	}

	public void actionPerformed(ActionEvent arg0) {
		
		String accion = arg0.getActionCommand();
		
		if (accion.equals("Agregar Cuenta"))
			this.agregarCuenta();
		else
			if (accion.equals("Extraer"))
				this.extraer();
			else
				if (accion.equals("Depositar"))
					this.depositar();
		
	}

	private void depositar() {
		
		String mensaje = null;
		double deposito = Double.parseDouble(this.textDepositar.getText());
		
		try {
			cuenta.depositar(deposito);
		} 
		catch (DepositoInvalidoException e) {
			mensaje = e.getMessage();
		}
		finally {
			if (mensaje == null) {
				this.textArea.setText("");
				this.textArea.append("Titular: " + cuenta.getTitular() + ", Saldo: " + cuenta.getSaldo() + "\n");
			}
			else
				JOptionPane.showMessageDialog(this,mensaje + "\n");
		}
	}

	private void extraer() {
		
		String mensaje = null;
		double extraccion = Double.parseDouble(this.textFieldExtraer.getText());
		
		try {
			cuenta.extraer(extraccion);
		} 
		catch (ExtraccionInvalidaException e) {
			mensaje = e.getMessage();
		}
		finally {
			if (mensaje == null) {
				this.textArea.setText("");
				this.textArea.append("Titular: " + cuenta.getTitular() + ", Saldo: " + cuenta.getSaldo() + "\n");
			}
			else
				JOptionPane.showMessageDialog(this,mensaje + "\n");
		}
		
	}

	private void agregarCuenta() {
		
		String nombre = this.textFieldAgregarCuenta.getText();
		
		if (!nombre.equalsIgnoreCase("")) {
			cuenta = new CuentaBancaria(nombre);
			this.textArea.append("Titular: " + nombre + ", Saldo: " + cuenta.getSaldo() + "\n");
		}
		else
			JOptionPane.showMessageDialog(this,"Ingrese un nombre valido");
	}
}
