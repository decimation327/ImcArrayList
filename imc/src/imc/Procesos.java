package imc;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {

	int cant;
	String nombre,resul="";
	double imc,peso,talla;
	ArrayList<String> nombresList;
	ArrayList<String> resultadoList;
	String result="";
	String nombreBuscar="";
	
	public Procesos() {
		
	}
	
	private void iniciar() {
		cant=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad "));
		
		for (int i = 0; i < cant; i++) {
			ingresarDatos();
			calcularImc();
		}
	}
	
	public void ingresarDatos() {
System.out.println("Ingrese datos");
		
nombresList.add(JOptionPane.showInputDialog(("Ingrese nombre")));
talla=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la talla"));
peso=Double.parseDouble(JOptionPane.showInputDialog("ingrese su peso"));
	}

	public void calcularImc() {

		imc= peso/(talla * talla);
		
		if (imc <18) {
			resul = "Anorexia";
		} else if (imc >= 18 && imc< 20) {
			resul = "Delgadez";
		} else if (imc >= 20 && imc< 27) {
			resul = "Normalidad";
		}else if (imc >= 27 && imc < 30) {
			resul = "Obesidad (grado1)";
		} else if (imc >= 30 && imc< 35) {
			resul = "Obesidad (grado2)";
		} else if (imc >= 30 && imc< 35) {
			resul = "Obesidad (grado3)";
		}else if (imc >= 40) {
			resul = "Obesidad morbida";
		}
		resultadoList.add(resul);
	}
	
	public void imprimirLista() {
		for (int i = 0; i < nombresList.size(); i++) {
			System.out.println(nombresList+"");
		}
	}
	
	
}
