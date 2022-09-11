package com.conversor.principal;

import javax.swing.*;

import com.conversor.selectores.SelectorMonedas;
import com.conversor.selectores.SelectorUnidadesTemperatura;

/**
 * @version 1.0  
 * @author Cesar Rosa
 * Metodo main en el que se pueden seleccionar los 2 tipos de conversores, monedas y unidades de temperatura.
**/

public class Principal {

	public static void main(String[] args) {

		SelectorMonedas moneda = new SelectorMonedas();
		SelectorUnidadesTemperatura temperatura = new SelectorUnidadesTemperatura();

		String[] menuPrincipal = { "Conversor de Moneda", "Conversor de Temperatura" };
		Icon icono = new ImageIcon("imagenes/cambioM.png");

		while (true) {
			String resp = (String) JOptionPane.showInputDialog(null, "Seleccione una opción de conversion", "Conversor",
					JOptionPane.DEFAULT_OPTION, icono, menuPrincipal, menuPrincipal[0]);

			if (!(resp == null)) {
				if (resp.equals("Conversor de Moneda"))
					moneda.OpcionesConversor();

				if (resp.equals("Conversor de Temperatura"))
					temperatura.OpcionesConversor();
			}

			int ventanaYesNotCancel = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Conversor de Moneda",
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
			// 0=yes, 1=no, 2=cancel
			if (ventanaYesNotCancel == 1 || ventanaYesNotCancel == 2) {
				JOptionPane.showMessageDialog(null, "Programa Terminado");
				System.exit(0);
			}
		}
	}
}