//Esta es la clase clínica que contiene todos los métodos respectivos al control de los datos de las clínicas en el sistema.

package healthAbility;
import java.util.*;
import java.io.*;

public class Clinica
{
	//Atributos de la clase de clinicas
	static int cantClinicas=0;
	static ArrayList<String> nombre=new ArrayList<>();
	static ArrayList<String> direccion= new ArrayList<>();
	static ArrayList<String> distrito= new ArrayList<>();
	static ArrayList<String> canton= new ArrayList<>();
	static ArrayList<String> provincia= new ArrayList<>();
	static ArrayList<String> foto= new ArrayList<>();
	static ArrayList<Integer> SubNombres  = new ArrayList<>();
	static ArrayList<String> nombresEncontrados  = new ArrayList<>();
	static ArrayList<Integer> posiciones= new ArrayList<>();
	static ArrayList<String> clinicasEncontradas=new ArrayList<>();
	
	public static void registrarClinica(String pNombre, String pDireccion, String pDistrito, String pCanton, String pProvincia, String pFoto){
		ArrayList<String> Provincias=new ArrayList<>();
		Provincias.add("San JoséCartagoHerediaAlajuelaGuanacastePuntarenasLimón");
		if (validarRegistro(pNombre)==1){
			if((Provincias.get(0)).toLowerCase().contains(pProvincia.toLowerCase())|(Provincias.get(0)).toUpperCase().contains(pProvincia.toUpperCase())){
				if(pDireccion!=null|pDireccion!=" "|pDireccion!=""){
					nombre.add(pNombre);
					direccion.add(pDireccion);
					distrito.add(pDistrito);
					canton.add(pCanton);
					provincia.add(pProvincia);
					foto.add(pFoto);
					cantClinicas++;
				}
				else{
					System.out.println("Debe ingresar la direccion para poder registrar la clinica");
				}
			}
			else{
				System.out.println("La provincia ingresada debe pertenecer a Costa Rica");
			}
			
		}
		else{
			System.out.println("No se puede registrar la clínica debido a que ya existe una clínica u hospital con ese nombre");
		}
	}
	
	//Metodo que recibe el nombre de una clinica y retorna a que provincia pertenece
	public static String retornarProvincia(String buscar)
	{
		boolean encontrado=false;
		int i=0;
		while(!encontrado && i < nombre.size() && nombre.get(i) != null)
		{
			if((nombre.get(i).equals(buscar)))
			{
				encontrado = true;
			}
			i++;
		}
		return Clinica.provincia.get(i);
	}
	
	//Recibe el nombre de una clínica y verifica que no haya sido registrada previamente 
	public static int validarRegistro(String pNombre){
		int validar=1;
		if(nombre.size()>0)
		{
			for(int cont=0; cont<cantClinicas && validar != 0;cont++)
			{
				if(nombre.get(cont).toLowerCase().equals(pNombre.toLowerCase())||nombre.get(cont).toUpperCase().equals(pNombre.toUpperCase()))
				{
					validar=0;
				}
			}
		}
		return validar;
	}
	
	//Recibe una provincia de Costa Rica e ingresa en una lista todas las Clinicas que pertenecen a esa provincia
	public static ArrayList<Integer> BuscadorProvincia(String Buscar)
	{
		SubNombres.clear();
		nombresEncontrados.clear();
		if (cantClinicas == 0)
		{
			System.out.println("No hay ningun medico registrado");
			return null;
		}
		else
		{
			for(int pos = 0; pos<cantClinicas; pos++)
			{
				if (provincia.get(pos).toLowerCase().contains(Buscar.toLowerCase()))
				{
					SubNombres.add(pos);
				}
			}
		}
		return SubNombres;
	}
	
	//Este método recibe el nombre de una clínica y abre su perfil correspondiente
	public static ArrayList<String> abrirVentanaClinica(String pNombre){
		String buscarMin=pNombre.toLowerCase();
		String buscarMay=pNombre.toUpperCase();
		ArrayList<Integer> posiciones=new ArrayList<>();
		final ArrayList<String> abrirVentana=new ArrayList<>();
		int pos=0;
		if(cantClinicas==0){
			return null;
		}
		else{
			for(pos=0;pos <cantClinicas;pos++){
				if((nombre.get(pos)).toLowerCase().equals(buscarMin)||(nombre.get(pos)).toUpperCase().equals(buscarMay)){
					posiciones.add(pos);
				}
			
			}
			for(pos=0; pos <posiciones.size(); pos++){
				abrirVentana.add(nombre.get(posiciones.get(pos)));
				abrirVentana.add(direccion.get(posiciones.get(pos)));
				abrirVentana.add(distrito.get(posiciones.get(pos)));
				abrirVentana.add(canton.get(posiciones.get(pos)));
				abrirVentana.add(provincia.get(posiciones.get(pos)));
				abrirVentana.add(foto.get(posiciones.get(pos)));
				pos++;
				
			}
			return abrirVentana;
		}
	}
	
	//Este método recibe una secuencia de caracteres e ingresa en una lista las 10 primeras clínicas que coincidan con la búsqueda
	public static ArrayList<String> buscadorClinica(String buscar){
		posiciones.clear();
		clinicasEncontradas.clear();
		int pos;
		if(cantClinicas==0)
		{
			System.out.println("no hay clinicas registradas");
			return null;
		}
		else
		{
			for(pos = 0; pos < cantClinicas; pos++ )
			{
				if((nombre.get(pos)).toLowerCase().contains(buscar.toLowerCase()))
				{
					posiciones.add(pos);
				}
			}
			for(pos=0; pos < posiciones.size() && pos < 10; pos++)
			{
				clinicasEncontradas.add(nombre.get(posiciones.get(pos)));
				
			}
			return clinicasEncontradas;
		}	
	}
	
	//Recibe el nombre de una clínica y obtiene su posición en la lista de las clínicas
	public static int posicionEnLista(String pNombre){
		int pos = 0;
		if(cantClinicas==0)
		{
			System.out.println("No hay clinicas registradas");
		}
		else{
			for(pos= 0; pos < cantClinicas; pos++){
				if(nombre.get(pos).toLowerCase().contains(pNombre.toLowerCase())||nombre.get(pos).toUpperCase().contains(pNombre.toUpperCase())){
				}
			}
			
		}
		return pos;
	}
	
	//Recibe el nombre de una clínica y retorna  en que posición se encuentra en la lista de clínicas
	public static int BuscarClinica(String pnombre)
	{
		boolean encontrado = false;
		int i=0;
		int indice=-1;
		while (!encontrado && i < nombre.size() && nombre.get(i) != null)
		{
			if ((nombre.get(i).equals(pnombre)))
			{
				indice=i;
				encontrado=true;
			}
			i++;
		}
		return indice;
	}
	//Recibe el nombre de una clínica y la elimina de la lista de clínicas
	public static int borrarClinica(String pNombre){
		boolean encontrado=false;
		int i=0;
		int indice=-1;
		while(!encontrado && i < nombre.size() && nombre.get(i) != null)
		{
			if((nombre.get(i).equals(pNombre)))
			{
				System.out.println("Se logro eliminar la clinica"+" "+nombre.get(i));
				nombre.remove(i);
				direccion.remove(i);
				distrito.remove(i);
				canton.remove(i);
				provincia.remove(i);
				foto.remove(i);
				indice=i;
				encontrado=true;
				cantClinicas--;
			}
			else
			{
				System.out.println("No se puede eliminar la clinica debido a que no existe");
			}
			i++;
		}
		return indice;
	}
	
	//Recibe el nombre de una clínica y con base en el nombre genera el perfil de la clínica
	public static ArrayList<String> cambiarEtq(String pNombre)
	{
		int posicion;
		posicion=Clinica.posicionEnLista(pNombre);
		ArrayList<String> etiq=new ArrayList<>();
		etiq.add(nombre.get(posicion));
		etiq.add(direccion.get(posicion));
		etiq.add(distrito.get(posicion));
		etiq.add(canton.get(posicion));
		etiq.add(provincia.get(posicion));
		etiq.add(foto.get(posicion));
		return  etiq;
	}

}
