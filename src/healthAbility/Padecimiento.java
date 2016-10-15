//Esta es la clase padecimiento que contiene todos los metodos respectivos al control de los datos de los padecimientos en el sistema.

package healthAbility;
import java.util.*;
import java.io.*;

public class Padecimiento
{
	static ArrayList<ArrayList<String>> nombrePadecimiento = new ArrayList<>();
	static ArrayList<String> tipos = new ArrayList<>();
	static ArrayList<String> descripcion = new ArrayList<>();
	static int cantPadecimientos = 0;
	static ArrayList<Integer> SubNombres  = new ArrayList<>();
	static ArrayList<String> nombresEncontrados  = new ArrayList<>();
	//Recibe el nombre de un padecimiento, el tipo y la descripción  y lo registra en el sistema
	public static void ingresarPadecimiento(String pNombre, String pTipos, String pDescripcion)
	{
		if(validarRegistro(pNombre) == 1)
		{
			int i = BuscarTipo(pTipos);
			if (i != -1)
			{
				nombrePadecimiento.get(i).add(pNombre);
			}
			else
			{
				ArrayList<String> nombre = new ArrayList<>();
				nombre.add(pNombre);
				nombrePadecimiento.add(nombre);
				tipos.add(pTipos);
				descripcion.add(pDescripcion);
				cantPadecimientos++;
			}
		}
		else
		{
			System.out.println("No se puede registrar este padecimiento debido a que ya existe uno con el mismo nombre");
		}
	}
	//Recibe el nombre de un padecimiento y retorna en que posicion de la lista de padecimientos se encuentra
	public static int BuscarTipo(String pnombre)
	{
		boolean encontrado = false;
		int i=0;
		int indice=-1;
		while (!encontrado && i < tipos.size() && tipos.get(i) != null)
		{
			if ((tipos.get(i).toLowerCase().equals(pnombre.toLowerCase())))
			{
				indice=i;
				encontrado=true;
			}
			i++;
		}
		return indice;
	}
	//Recibe el nombre de un padecimiento y valida si ya fue registrado anteriormente o no
	public static int validarRegistro(String pNombre)
	{
		int validar = 1;
		if(cantPadecimientos > 0)
		{
			for(int cont = 0;cont < tipos.size() && validar != 0;cont++)
			{
				for(String i : nombrePadecimiento.get(cont))
				{
					if(!i.equals(""))
					{
						if(i.toLowerCase().equals(pNombre.toLowerCase()))
						{
							validar=0;
						}
					}
				}
			}
		}
		return validar;
	}
	
	//Recibe el nombre de un padecimiento y devuelve una lista con los padecimientos que coincidan con la búsqueda
	public static ArrayList<String> BuscadorPadecimiento(String Buscar)
	{
		SubNombres.clear();
		nombresEncontrados.clear();
		if (cantPadecimientos == 0)
		{
			System.out.println("No hay ninguna clínica registrada");
			return null;
		}
		else
		{
			for(int pos = 0; pos < cantPadecimientos; pos++)
			{
				for (String i : nombrePadecimiento.get(pos))
				{
					if (!i.equals(""))
					{
						if (i.toLowerCase().contains(Buscar.toLowerCase()))
						{
							nombresEncontrados.add(i);
						}
					}
				}
			}
			return nombresEncontrados;
		}
	}
	
	//Recibe el nombre de un padecimiento e ingresa en una lista tanto el nombre como el tipo de padecimiento
	@SuppressWarnings("null")
	public static ArrayList<Integer> BuscarPadecimiento(String pnombre)
	{
		boolean encontrado = false;
		int i=0;
		ArrayList<Integer> indice = new ArrayList<>();
		while (!encontrado && i < tipos.size() && tipos.get(i) != null)
		{
			for(int x = 0; x < nombrePadecimiento.get(i).size(); x++)
			{
				if ((nombrePadecimiento.get(i).get(x).toLowerCase().equals(pnombre.toLowerCase())))
				{
					indice.add(i);
					indice.add(x);
					encontrado=true;
				}
			}
			i++;
		}
		return indice;
	}
	//Recibe el nombre de un padecimineto y lo elimina de la lista de padecimientos
	public static int borrarNombre(String pNombre)
	{
		boolean encontrado=false;
		int i=0;
		int indice = -1;
		while(!encontrado && i < tipos.size() && nombrePadecimiento.get(i) != null)
		{
			for (int x = 0; x < nombrePadecimiento.get(i).size() && indice == -1; x++)
			{
				if((nombrePadecimiento.get(i).get(x).toLowerCase().equals(pNombre.toLowerCase())))
				{
					System.out.println("Se logro eliminar el padecimiento"+" "+nombrePadecimiento.get(i).get(x));
					nombrePadecimiento.get(i).remove(x);
					encontrado=true;
					indice = x;
				}
			}
			i++;
		}
		if(!encontrado)
		{
			System.out.println("No se puede eliminar el padecimiento debido a que no existe");
		}
		return indice;
	}
	
	public static void main(String[] args) 
	{
		Padecimiento.ingresarPadecimiento("Infarto","Coronaria","Da al miocardio");
		Padecimiento.ingresarPadecimiento("","Oseo","Artritis");
		Padecimiento.ingresarPadecimiento("Bronquitis","Pulmonar", "Agua en los pulmones");
		Padecimiento.ingresarPadecimiento("","Coronaria", "Obstrucci de arteria");
		Padecimiento.ingresarPadecimiento("Fractura en la pierna","Oseo","Fractura de tibia y peron�");
		Padecimiento.borrarNombre("Infarto");
	}
}
