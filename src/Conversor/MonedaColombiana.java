package Conversor;

import javax.swing.JOptionPane;

public class MonedaColombiana {

	public static void convertirUnidades() {
		TasasDeMonedas moneda = new TasasDeMonedas();
		
		String menuPrincipal = (JOptionPane.showInputDialog(null,
				"¿Qué deseas convertir?", "moneda", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "Convertir Moneda", "Convertir Temperaturas"},"Convertir Moneda")).toString();

		if (menuPrincipal == "Convertir Moneda") {
			String opciones = (JOptionPane.showInputDialog(null,
					"Elige la moneda a la que deseas convertir tu dinero: ", "moneda", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "Pesos Colombianos a Dolares", "Pesos Colombianos a Euros",
							"Pesos Colombianos a Libras Esterlinas", "Pesos Colombianos a Yen Japones",
							"Pesos Colombianos a Won Surcoreano", "Dolares a pesos Colombianos",
							"Euros a pesos Colombianos", "Libras Esterlinas a pesos Colombianos",
							"Yen Japones a pesos Colombianos", "Won Surcoreano a pesos Colombianos" },
					"Pesos Colombianos a Dolares")).toString();

			double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir:"));

			switch (opciones) {
				case "Pesos Colombianos a Dolares":
					double valorDolar1 = moneda.getDolar1() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en dólares es: " + valorDolar1);
					break;
				
				case "Pesos Colombianos a Euros": 
					double valorEuro1 = moneda.getEuro1() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en euros es: " + valorEuro1);
					break;
				
				case "Pesos Colombianos a Libras Esterlinas": 
					double valorLibras1 = moneda.getLibraEsterlina1() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en libras esterlinas es: " + valorLibras1); 
					break;
				
				case "Pesos Colombianos a Yen Japones": 
					double valorYen1 = moneda.getYenJapones1() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en yen japonés es: " + valorYen1); 
					break;
				
				case "Pesos Colombianos a Won Surcoreano": 
					double valorWon1 = moneda.getWonSurCoreano1() * cantidad;
				  	JOptionPane.showMessageDialog(null, "La cantidad en won surcoreano es: " + valorWon1); 
					break;
				
				case "Dolares a pesos Colombianos":
					double valorDolar2 = moneda.getDolar2() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en pesos es: " + valorDolar2); 
					break;
					
				case "Euros a pesos Colombianos": 
					double valorEuro2 = moneda.getEuro2() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en pesos es: " + valorEuro2); 
					break;
					
				case "Libras Esterlinas a pesos Colombianos": 
					double valorLibras2 = moneda.getLibraEsterlina2() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en pesos es: " + valorLibras2); 
					break;
					 
				case "Yen Japones a pesos Colombianos": 
					double valorYen2 = moneda.getYenJapones2() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en pesos es: " + valorYen2); 
					 break;
					 
				case "Won Surcoreano a pesos Colombianos": 
					double valorWon2 = moneda.getWonSurCoreano2() * cantidad;
					JOptionPane.showMessageDialog(null, "La cantidad en pesos es: " + valorWon2); 
					 break;
			}
			
			int volverMenu = JOptionPane.showConfirmDialog(null, "¿Desea convertir otra unidad?");
			if (volverMenu == 0) {
				convertirUnidades();
			} else {
				JOptionPane.showMessageDialog(null, "Programa Terminado \n Gracias por usar nuestro conversor Alura");
			}
		}
		
		
		
		if (menuPrincipal == "Convertir Temperaturas") {
			
			String temperaturas = (JOptionPane.showInputDialog(null,
					"Elige la temperatura que deseas convertir: ", "moneda", JOptionPane.PLAIN_MESSAGE, null,
					new Object[] { "De °C a °F", "De °F a °C","De °C a °K", "De °F a °K",},"De °C a °F")).toString();
			
			double grados = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de grados a convertir:"));
			
			switch (temperaturas) {
				case "De °C a °F":
					double fahrenheit = grados * 1.8 + 32;
					JOptionPane.showMessageDialog(null, "Son: " + fahrenheit + " °F.");
					break;
				
				case "De °F a °C":
					double gradosC = (grados - 32)/1.8;
					JOptionPane.showMessageDialog(null, "Son: " + gradosC + " °C.");
					break;
				
				case "De °C a °K":
					double Kelvin = grados + 273.15;
					JOptionPane.showMessageDialog(null, "Son: " + Kelvin + " °K.");
					break;
				
				case "De °F a °K":
					double gKelvin = 5/9*(grados-32) + 273.15;
					JOptionPane.showMessageDialog(null, "Son: " + gKelvin + " °K.");
					break;
			}
			
			int volverMenu = JOptionPane.showConfirmDialog(null, "¿Desea convertir otra unidad?");
			if (volverMenu == 0) {
				convertirUnidades();
			} else {
				JOptionPane.showMessageDialog(null, "Programa Terminado \n Gracias por usar nuestro conversor Alura");
			}
		}
	}

	public static void main(String[] args) {
		convertirUnidades();
	}
}