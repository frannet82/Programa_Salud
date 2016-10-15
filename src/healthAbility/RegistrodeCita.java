package healthAbility;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.*;

import javax.mail.internet.MimeMultipart;

public class RegistrodeCita 
{
	static ArrayList<String> Paquete = new ArrayList<>();
	static int valor;
	static int valorDpaso = 0;
	static int Contador = 0;
	static ArrayList<String> CitasDia = new ArrayList<>();
	static ArrayList<String> CitasFecha = new ArrayList<>();
	static ArrayList<String> CitasMañana = new ArrayList<>();
	static ArrayList<String> CitasNoche = new ArrayList<>();
	static ArrayList<String> CitasTarde = new ArrayList<>();
	static ArrayList<String> FechasDcalendario = new ArrayList<>();
	
	public static int PosicionDmedico(String CédMedico){
		int contad=-1;
		String Material=" ";
		while (!Material.equals(CédMedico))
		{
			if (contad!=-1){
			Material=RegistrodeCita.Paquete.get(contad);}
			else{
			contad++;}	
		};
		return contad;
	}
	
	public static void CitasGuardadas2(String día,String fecha,String mañana, String Tarde, String noche,String CédMedico){
		Paquete.add(CédMedico);
		Paquete.add(día);
		Paquete.add(fecha);
		Paquete.add(mañana);
		Paquete.add(Tarde);
		Paquete.add(noche);
	}
	
	public static void Fechaguardadas(int cantidadDdias)
	{
		Calendar fecha = new GregorianCalendar();
		int dianum = fecha.get(Calendar.DAY_OF_MONTH);
        int añonum = fecha.get(Calendar.YEAR);
        fecha.add(Calendar.MONTH,1);
        int mesnum = fecha.get(Calendar.MONTH);
 
        int i=0;
        Date fecha2 = fecha.getTime();
        int dianum2=0;		
        while (i!=cantidadDdias){
        fecha.add(Calendar.DAY_OF_MONTH,1);
        fecha2 = fecha.getTime();
		mesnum = fecha.get(Calendar.MONTH);
		dianum2 = fecha.get(Calendar.DAY_OF_MONTH);	
        String Fecha2= dianum2+"/"+mesnum+"/"+añonum;
        FechasDcalendario.add(Fecha2);
        i++;
        }
	}}
	
		

