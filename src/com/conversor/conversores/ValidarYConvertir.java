package com.conversor.conversores;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import com.conversor.principal.Principal;

public class ValidarYConvertir {
	private double cantidadAConvertir,cantidadConvertida;
	private String cadenaAValidar;

	
	public String ValidarCampo(String cadena) {		
		cadenaAValidar = cadena;
		while (true) {			
			if (cadenaAValidar.matches("^[0-9/.]+$")) {
				break;
			} else {
				JOptionPane.showMessageDialog(null, "Debe ingresar número sin espacios");
				cadenaAValidar = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			}
		}
		return cadenaAValidar;
	}
	
	public void ConversorMoneda(String valor, String UnidadOrigen, String unidadCambio) {
		try (ConversionMoneda conversor = new ConversionMoneda()) {
			String campo = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
			if (!(campo == null)) {
				String cantidadAConvertir = ValidarCampo(campo);
				Object data = conversor.retornarValores(cantidadAConvertir, UnidadOrigen, unidadCambio);
				double redondeo = Double.valueOf(data.toString());				
				JOptionPane.showMessageDialog(null, "El cambio de " + valor + " es: " + String.valueOf((double)Math.round(redondeo*100d)/100));
			}
		} catch (Exception ex) {
			Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
			ex.printStackTrace();
		}
	}
	
	
	public void conversorTemperatura(String cadena) {
		ConversionUnidadesTemperatura conversor = new ConversionUnidadesTemperatura();
		String campo = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");		
		if (!(campo == null)) {
			cantidadAConvertir = Double.parseDouble(ValidarCampo(campo));			
			cantidadConvertida = conversor.RetornaValorConvertido(cadena, cantidadAConvertir);			
			JOptionPane.showMessageDialog(null, "La cantidad convertida es: " + (double)Math.round(cantidadConvertida*100d)/100);
		}
		return;
	}
}
