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
	static ArrayList<String> CitasMa�ana = new ArrayList<>();
	static ArrayList<String> CitasNoche = new ArrayList<>();
	static ArrayList<String> CitasTarde = new ArrayList<>();
	static ArrayList<String> FechasDcalendario = new ArrayList<>();
	
	public static int PosicionDmedico(String C�dMedico){
		int contad=-1;
		String Material=" ";
		while (!Material.equals(C�dMedico))
		{
			if (contad!=-1){
			Material=RegistrodeCita.Paquete.get(contad);}
			else{
			contad++;}	
		};
		return contad;
	}
	
	public static void CitasGuardadas2(String d�a,String fecha,String ma�ana, String Tarde, String noche,String C�dMedico){
		Paquete.add(C�dMedico);
		Paquete.add(d�a);
		Paquete.add(fecha);
		Paquete.add(ma�ana);
		Paquete.add(Tarde);
		Paquete.add(noche);
	}
	
	public static void Fechaguardadas(int cantidadDdias)
	{
		Calendar fecha = new GregorianCalendar();
		int dianum = fecha.get(Calendar.DAY_OF_MONTH);
        int a�onum = fecha.get(Calendar.YEAR);
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
        String Fecha2= dianum2+"/"+mesnum+"/"+a�onum;
        FechasDcalendario.add(Fecha2);
        i++;
        }
	}}
	
		

