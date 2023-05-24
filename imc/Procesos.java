package imc;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Procesos {
    String cadena="", nombre="";
    double imc, talla, peso;
    int telefono;
    ArrayList<String> listaNombres = new ArrayList<String>();
    ArrayList<String> listaResultado = new ArrayList<String>();

    int telefono;
	double talla,peso;
	ArrayList<String> resultado;
	ArrayList<String> nombres;
	
	public void procesos () {
		
	}
	
	
	public void iniciar() {
		String menu;
		int opc;
		do {
		menu = "INGRESE UNA OPCION\n";
		menu+= "1.Registrar Personas\n";
		menu+="2. Mostrar Lista\n";
		menu+="3. Eliminar\n";
		menu+= "4. Actualizar Nombre\n";
		menu+= "5. Salir\n";
		

		
		opc = Integer.parseInt((JOptionPane.showInputDialog(menu)));
		
		switch (opc) {
		case 1: {
			llenardatos();
			break;
		}case 2: {
			imprimirLista();
			break;
		}case 3: {
			eliminarNombre();
			break;
		}case 4: {
			actualizarNombre();
			
			
			
			break;
		}case 5: {
			System.out.println("Gracias por usar el programa");
			break;

		}
		default:
			System.out.println("Numero Incorrecto");
		}
		} while (opc != 5);

	}
	
	
	public void llenardatos() {
		nombres = new ArrayList<>();
		
		nombres.add(JOptionPane.showInputDialog("Ingrese su nombre"));	
		
		telefono=Integer.parseInt(JOptionPane.showInputDialog("Ingrese su telefono"));
		
		talla=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su talla"));
		
		peso=Double.parseDouble(JOptionPane.showInputDialog("Ingrese su peso"));
		
		calcularImc();
	}
	
	
	public void calcularImc() {
		
		resultado = new ArrayList<>();
		String resul = "";
		double imc;
		
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
		
		
		resultado.add(resul);
		
	}
	
	
	public void imprimirLista () {
		
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i) + " El resultado es: " + resultado.get(i));	
		}
	}
	
	public void buscarNombre () {
	    String nombreBuscado = JOptionPane.showInputDialog("Ingrese el nombre que desea buscar");
	    boolean encontrado = false;
	    for (int i = 0; i < nombres.size(); i++) {
	        if (nombres.get(i).equals(nombreBuscado)) {
	            System.out.println(nombres.get(i) + " El resultado es: " + resultado.get(i));
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre buscado no se encuentra en la lista");
	    }
		
	}
	
	public void eliminarNombre () {
	    String nombreEliminar = JOptionPane.showInputDialog("Ingrese el nombre que desea eliminar");
	    boolean encontrado = false;
	    for (int i = 0; i < nombres.size(); i++) {
	        if (nombres.get(i).equals(nombreEliminar)) {
	            nombres.remove(i);
	            resultado.remove(i);
	            System.out.println("El nombre ha sido eliminado de la lista");
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre a eliminar no se encuentra en la lista");
	    }
		
	}
	
	public void actualizarNombre() {
	    String nombreActualizar = JOptionPane.showInputDialog("Ingrese el nombre que desea actualizar");
	    String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre");
	    boolean encontrado = false;
	    for (int i = 0; i < nombres.size(); i++) {
	        if (nombres.get(i).equals(nombreActualizar)) {
	            nombres.set(i, nuevoNombre);
	            System.out.println("El nombre ha sido actualizado");
	            encontrado = true;
	            break;
	        }
	    }
	    if (!encontrado) {
	        System.out.println("El nombre a actualizar no se encuentra en la lista");
	    }
	}
}