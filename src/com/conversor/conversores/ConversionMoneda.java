package com.conversor.conversores;

import java.io.IOException;
import org.json.JSONObject;

import com.conversor.conversores.getDataApi.DataConverter;

/**
 * @version 1.0  
 * @author Cesar Rosa
 */

public class ConversionMoneda implements AutoCloseable {

	DataConverter data = new DataConverter();

	
/**
* Metodo que recibe 3 parametros, la cantidad y los tipos de monedas a convertir y llama a la api a travez de una 
* excepcion CHECKED (IOException) que baja valores de conversion en tiempo real, con los parametros de monedas y 
* cantidad  y retorna un objeto JSON;
*/
	public Object retornarValores(String valor, String Monedaorigen, String Monedacambio)
			throws IOException {

		JSONObject response = data.run("https://api.apilayer.com/currency_data/convert?from=" + Monedaorigen + "&to="
				+ Monedacambio + "&amount=" + valor);
		System.out.println("https://api.apilayer.com/currency_data/convert?from=" + Monedaorigen + "&to=" + Monedacambio
				+ "&amount=" + valor);
		return response.get("result");
	}

	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub

	}
}
