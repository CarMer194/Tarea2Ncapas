package com.uca.capas.ejemplo.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@RequestMapping("/ejemplo")
	public @ResponseBody String ejemplo() {
		String texto = "Hola mundo desde spring MVC! hora actual es: ";
		return texto.concat(Calendar.getInstance().getTime().toString());
	}
	
	@RequestMapping("/parametro")
	public @ResponseBody String parametro(HttpServletRequest request) {
		Integer param= Integer.parseInt(request.getParameter("dia"));
		String dia="";
		switch (param) {
		case 1: dia="lunes";
		break;
		case 2: dia="martes";
		break;
		case 3: dia="miercoles";
		break;
		case 4: dia="jueves";
		break;
		case 5: dia="viernes";
		break;
		case 6: dia="sabado";
		break;
		case 7: dia="domingo";
		break;
		}
		return "dia de la semana enviado " + dia;
	}
	
	@RequestMapping("/alumno")
	public @ResponseBody String alumno() {
		return "Informacion del alumno:\nNombre: Carlos Ernesto \nApellido:Merino Silva\nCarnet: 00060313\nAnio Cursado: 5";
	}
	
	@RequestMapping("/fecha")
	public @ResponseBody String diaParam(HttpServletRequest request) {
		String dia="";
		Integer diap=0;
		Integer mes=0;
		Integer anio=0;
		diap =Integer.parseInt(request.getParameter("dia"));
		mes=Integer.parseInt(request.getParameter("mes"));
		anio=Integer.parseInt(request.getParameter("anio"));
		Calendar cal=Calendar.getInstance();
		cal.set(anio, mes, diap);;
		int diaS=cal.get(Calendar.DAY_OF_WEEK);
		switch (diaS) {
		case 1: dia="viernes";
		break;
		case 2: dia="sabado";
		break;
		case 3: dia="domingo";
		break;
		case 4: dia="lunes";
		break;
		case 5: dia="martes";
		break;
		case 6: dia="miercoles";
		break;
		case 7: dia="jueves";
		break;
		}
		return "El dia de la semana es: "+dia;
	}
}
