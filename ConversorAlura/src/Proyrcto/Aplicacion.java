package Proyrcto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.accessibility.AccessibleContext;
import javax.swing.DefaultComboBoxModel;

public class Aplicacion extends JFrame implements ActionListener{

	private JPanel pantalla;
	protected JTextField textEntrada;
	private JTextField textSalida;
	protected double text;
	JButton btnConvertir;
	String divs;
	String divs2;
	
	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public Aplicacion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		iniciarComponentes();
		setTitle("Ventana Operaciones");
		setResizable(false);
		setLocationRelativeTo(null);
	}
		
	private void iniciarComponentes() {
		
		setBounds(100, 100, 450, 300);
		pantalla = new JPanel();
		pantalla.setBackground(new Color(153, 193, 241));
		pantalla.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(pantalla);
		pantalla.setLayout(null);
			
		JLabel lblConversorDeMoneda = new JLabel("Conversor de moneda");
		lblConversorDeMoneda.setFont(new Font("Dialog", Font.BOLD, 20));
		lblConversorDeMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorDeMoneda.setBounds(0, 12, 438, 27);
		pantalla.add(lblConversorDeMoneda);
			
		textEntrada = new JTextField();
		textEntrada.setToolTipText("");
		textEntrada.setForeground(new Color(119, 119, 119));
		textEntrada.setBounds(26, 77, 150, 19);
		pantalla.add(textEntrada);
			
		textSalida = new JTextField();
		textSalida.setToolTipText("");
		textSalida.setForeground(new Color(119, 119, 119));
		textSalida.setBounds(231, 77, 156, 19);
		pantalla.add(textSalida);
			
		JLabel lblValorACambiar = new JLabel("Valor  a cambiar");
		lblValorACambiar.setBounds(27, 61, 136, 15);
		pantalla.add(lblValorACambiar);
			
		JLabel lblValorConvertido = new JLabel("Valor convertido");
		lblValorConvertido.setBounds(231, 61, 136, 15);
		pantalla.add(lblValorConvertido);
			
		btnConvertir = new JButton("Convertido");
		btnConvertir.addActionListener(this);
		btnConvertir.setBounds(153, 192, 117, 25);
		pantalla.add(btnConvertir);
			
		JComboBox cbodivisa = new JComboBox();
		cbodivisa.setModel(new DefaultComboBoxModel(new String[] {"", "Euro", "Dolar USA", "Peso Colombiano"}));
		cbodivisa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divs = (String)cbodivisa.getSelectedItem();
			}
		});
		cbodivisa.setBounds(26, 100, 150, 24);
		pantalla.add(cbodivisa);
			
		JComboBox cbodivisa2 = new JComboBox();
		cbodivisa2.setModel(new DefaultComboBoxModel(new String[] {"","Euro", "Dolar USA", "Peso Colombiano"}));
		cbodivisa2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				divs2 = (String)cbodivisa2.getSelectedItem();
			}
		});
		cbodivisa2.setBounds(231, 100, 156, 24);
		pantalla.add(cbodivisa2);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(btnConvertir == e.getSource()) {
			try {
				double text = Double.parseDouble(textEntrada.getText());
				Convierte convierte = new Convierte();
				convierte.Convertir(divs, divs2, text);
				textSalida.setText(String.valueOf(convierte.getResultado()));
			} catch (Exception e1) {
				//e1.printStackTrace();
				textSalida.setText(String.valueOf(""));
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							VentanaDeError frame = new VentanaDeError();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		}
	}
	public static void main(String[] args) {		
		Aplicacion frame = new Aplicacion();
		frame.setVisible(true);
	}
}
