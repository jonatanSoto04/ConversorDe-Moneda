package Proyrcto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JComboBox;

public class VentanaDeError extends JFrame {
	private JTextField txtEntrada;
	private JTextField txtsalida;

	/**
	 * Launch the application.
	 */
	/**
	 * Create the frame.
	 */
	public VentanaDeError() {
		setTitle("Ventana Operaciones");
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 193, 241));
		panel.setForeground(new Color(153, 193, 241));
		panel.setBounds(0, -31, 450, 305);
		getContentPane().add(panel);
		setResizable(false);
		setLocationRelativeTo(null);
		panel.setLayout(null);
		
		JLabel lblCasosPosiblesDe = new JLabel("Error, causas del error");
		lblCasosPosiblesDe.setBounds(23, 25, 427, 31);
		panel.add(lblCasosPosiblesDe);
		lblCasosPosiblesDe.setVerticalAlignment(SwingConstants.TOP);
		lblCasosPosiblesDe.setFont(new Font("DialogInput", Font.BOLD, 18));
		lblCasosPosiblesDe.setHorizontalAlignment(SwingConstants.LEFT);
		
		JLabel lblIngresoTexto = new JLabel("-  Ingreso texto en el \"Valor a cambiar\".");
		lblIngresoTexto.setBounds(33, 72, 356, 15);
		lblIngresoTexto.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel.add(lblIngresoTexto);
		
		JLabel lblIngresoUn = new JLabel("-  Ingreso un dato en \"valor convertido\".");
		lblIngresoUn.setBounds(33, 97, 356, 15);
		lblIngresoUn.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel.add(lblIngresoUn);
		
		JLabel lblNoSelecciono = new JLabel("-  No selecciono el tipo de divisa.");
		lblNoSelecciono.setBounds(33, 125, 356, 15);
		lblNoSelecciono.setFont(new Font("Dialog", Font.PLAIN, 14));
		panel.add(lblNoSelecciono);
		
		JLabel lblConversorDeMonedas = new JLabel("Conversor de monedas");
		lblConversorDeMonedas.setBounds(12, 12, 438, 27);
		lblConversorDeMonedas.setHorizontalAlignment(SwingConstants.CENTER);
		lblConversorDeMonedas.setVerticalAlignment(SwingConstants.BOTTOM);
		lblConversorDeMonedas.setFont(new Font("Ubuntu", Font.BOLD, 18));
		
		txtEntrada = new JTextField();
		txtEntrada.setBounds(32, 79, 114, 19);
		txtEntrada.setColumns(10);
		
		JLabel lblCuantoDeseaConvertir = new JLabel("Cuanto desea convertir");
		lblCuantoDeseaConvertir.setBounds(22, 61, 166, 15);
		
		JLabel txtSalida = new JLabel("Valor convertido");
		txtSalida.setBounds(244, 61, 166, 15);
		
		txtsalida = new JTextField();
		txtsalida.setColumns(10);
		txtsalida.setBounds(244, 79, 114, 19);
		
		JButton btnaccion = new JButton("Convertir");
		btnaccion.setVerticalAlignment(SwingConstants.TOP);
		btnaccion.setFont(new Font("URW Bookman", Font.BOLD, 14));
		btnaccion.setForeground(new Color(94, 92, 100));
		btnaccion.setBounds(156, 199, 117, 25);
		
		JComboBox cbodivisa = new JComboBox();
		cbodivisa.setName("Tipo de divisa");
		cbodivisa.setBounds(32, 98, 114, 24);
		
		JComboBox cbodivisa1 = new JComboBox();
		cbodivisa1.setName("Tipo de divisa");
		cbodivisa1.setBounds(244, 98, 114, 24);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 472, 300);
	}
}
