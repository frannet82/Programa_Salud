//Esta es la clase medico que contiene todos los metodos respectivos al control de los datos de los medicos en el sistema.

package healthAbility;
import java.util.*;

import javax.script.*;
import javax.swing.text.BadLocationException;

public class Medico
{
	static ArrayList<Integer> SubNombres  = new ArrayList<>();
	static ArrayList<String> nombresEncontrados  = new ArrayList<>();
	public static int cantidadDeMedicos = 0;
	public static ArrayList<String> nombre = new ArrayList<>();
	public static ArrayList<String> apellido1 = new ArrayList<>();
	public static ArrayList<String> apellido2 = new ArrayList<>();
	public static ArrayList<String> cedula = new ArrayList<>();
	public static ArrayList<String> correo = new ArrayList<>();
	public static ArrayList<String> foto = new ArrayList<>();
	public static ArrayList<ArrayList<String>> especialidad = new ArrayList<>();
	public static ArrayList<String> slogan = new ArrayList<>();
	public static ArrayList<String[]> centroMedico = new ArrayList<>();
	public static ArrayList<String> contraseña = new ArrayList<>();
	public static ArrayList<ArrayList<String>> procedimiento = new ArrayList<>();
	public static ArrayList<String> idioma = new ArrayList<>();
	public static ArrayList<String> educacion = new ArrayList<>();
	public static ArrayList<String> afiliacion = new ArrayList<>();
	public static ArrayList<Double> CalificacionMedico = new ArrayList<>();
	public static ArrayList<Double> actualCalificacionMedico = new ArrayList<>();
	public static ArrayList<Review> reviews = new ArrayList<>();
	public static ArrayList<Citas> citas = new ArrayList<>();
	public static ArrayList<ArrayList<Integer>> CantidadDeCalificaciones = new ArrayList<>();
	
	
	//Esta es la funcion que ingresa los datos de un medico al sistema e incrementa la cantidad de medicos en uno
	public static void IngresarMedico(String pnombre,String papellido1,String papellido2,String pfoto,String pcedula,String pcorreo,ArrayList<String> pespecialidad,String pslogan,String[] pcentromedico,ArrayList<String> pprocedimiento,String pidioma,String peducacion,String pafiliacion,String pcontraseña) throws BadLocationException
	{
		nombre.add(pnombre);
		apellido1.add(papellido1);
		apellido2.add(papellido2);
		foto.add(pfoto);
		cedula.add(pcedula);
		correo.add(pcorreo);
		especialidad.add(pespecialidad);
		slogan.add(pslogan);
		centroMedico.add(pcentromedico);
		procedimiento.add(pprocedimiento);
		idioma.add(pidioma);
		educacion.add(peducacion);
		afiliacion.add(pafiliacion);
		CalificacionMedico.add(0.0);
		CantidadDeCalificaciones.add(new ArrayList<Integer>());
		actualCalificacionMedico.add(0.0);
		contraseña.add(pcontraseña);
		Review preview = new Review();
		reviews.add(preview);
		Citas pCitas = new Citas(pcedula);
		citas.add(pCitas);
		cantidadDeMedicos++;
	}

	//Recibe como parametro una cadena de caracteres e ingresa en una lista los primeros 10 nombres de los medicos que coincidan con la busqueda
	public static ArrayList<String> BuscadorMedico(String Buscar)
	{
		SubNombres.clear();
		nombresEncontrados.clear();
		if (cantidadDeMedicos == -1)
		{
			System.out.println("No hay ningun medico registrado");
			return null;
		}
		else
		{
			for(int pos = 0; pos<=cantidadDeMedicos-1; pos++)
			{
				if (nombre.get(pos).toLowerCase().contains(Buscar.toLowerCase()) || apellido1.get(pos).toLowerCase().contains(Buscar.toLowerCase()) || apellido2.get(pos).toLowerCase().contains(Buscar.toLowerCase()))
				{
					SubNombres.add(pos);
				}
			}
			for(int pos = 0; pos<= SubNombres.size()-1 && pos<=9; pos++)
			{
				nombresEncontrados.add(nombre.get(SubNombres.get(pos)) + " " + apellido1.get(SubNombres.get(pos)) + " " + apellido2.get(SubNombres.get(pos)));
			}
			return nombresEncontrados;
		}
	}
	
	//Recibe el nombre de un medico lo elimina del sistema y decrementa la cantidad de medicos en uno
	public static int borrarMedico(String pNombre){
		boolean encontrado=false;
		int i=0;
		int indice=-1;
		while(!encontrado && i < cedula.size() && cedula.get(i) !=null){
			if((cedula.get(i).equals(pNombre)))
			{
				System.out.println("Se logro eliminar al medico"+" "+cedula.get(i));
				nombre.remove(i);
				apellido1.remove(i);
				apellido2.remove(i);
				cedula.remove(i);
				correo.remove(i);
				foto.remove(i);
				especialidad.remove(i);
				slogan.remove(i);
				centroMedico.remove(i);
				contraseña.remove(i);
				procedimiento.remove(i);
				idioma.remove(i);
				educacion.remove(i);
				afiliacion.remove(i);
				CalificacionMedico.remove(i);
				CantidadDeCalificaciones.remove(i);
				actualCalificacionMedico.remove(i);
				contraseña.remove(i);
				reviews.remove(i);
				cantidadDeMedicos--;
				encontrado = true;
				indice = 1;
			}
			else
			{
				System.out.println("No se puede eliminar al medico debido a que no existe");
			}
			i++;
		}
		return indice;
	}
	
	//Funcion que recibe la posicion en la lista de medicos y un valor de uno a cinco para calificar al medico en esa posicion
	public static void CalificarMedico(int Pos, int num)
	{
		if (Pos == 0)
		{
			System.out.println("El medico no se encuentra registrado");
		}
		else
		{
			CantidadDeCalificaciones.get(Pos).add(0);
			CalificacionMedico.set(Pos,(CalificacionMedico.get(Pos) + num));
			actualCalificacionMedico.set(Pos,CalificacionMedico.get(Pos) / CantidadDeCalificaciones.get(Pos).size());
		}
	}
	
	//Recibe una provicia de Costa Rica y un area de especialidad medica e ingresa en una lista todos los medicos que coniciden con la busqueda
	public static ArrayList<Integer> BuscadorMedicoFiltroEP(String Provincia, String Especialidad)
	{
		SubNombres.clear();
		nombresEncontrados.clear();
		String Especialidades = "";
		String Provincias = "";
		if (cantidadDeMedicos == 0)
		{
			System.out.println("No hay ningun medico registrado");
			return null;
		}
		else
		{
			for(int pos = 0; pos < cantidadDeMedicos; pos++)
			{
				for (int i = 0; i < especialidad.get(pos).size(); i++)
				{
					Especialidades += especialidad.get(pos).get(i);
				}
				for(String i : centroMedico.get(pos))
				{
					Provincias += Clinica.retornarProvincia(i);
				}
				if (Provincias.contains(Provincia) && Especialidades.contains(Especialidad))
				{
					SubNombres.add(pos);
				}
				Especialidades = "";
			}
			return SubNombres;
		}
	}
	
	//Recibe una especialidad medica e ingresa en una lista todos los medicos que sean especialistas en esa vara
	public static ArrayList<Integer> BuscadorEspecialidad(String Buscar)
	{
		SubNombres.clear();
		nombresEncontrados.clear();
		String Especialidades = "";
		
		if (cantidadDeMedicos == 0)
		{
			System.out.println("No hay ningun medico registrado");
			return null;
		}
		
		else
		{
			for(int pos = 0; pos<cantidadDeMedicos; pos++)
			{
				for (int i = 0; i < especialidad.get(pos).size(); i++)
				{
					Especialidades += especialidad.get(pos).get(i);
				}
				if (Especialidades.toLowerCase().contains(Buscar.toLowerCase()))
				{
					SubNombres.add(pos);
				}
				Especialidades = "";
			}
			return SubNombres;
		}
	}
	
	//Recibe el nombre de una medico y retorna su posicion en la lista, si no esta devuelve un -1
	public static int BuscarMedico(String pnombre)
	{
		boolean encontrado = false;
		int i=0;
		int indice=-1;
		while (!encontrado && i < nombre.size() && nombre.get(i) != null)
		{
			if ((nombre.get(i) +" "+ apellido1.get(i)+" "+ apellido2.get(i)).equals(pnombre))
			{
				indice=i;
				encontrado=true;
			}
			i++;
		}
		return indice;
	}

	public static void main(String[] args) throws ScriptException
	{
		String password;
		char[] x = new char[]{'1','2','3','4','5'};
		StringBuilder SB = new StringBuilder();
		for (char i : x)
		{
			SB.append(i);
		}
		password = SB.toString();
		System.out.println(password);
	}
}

