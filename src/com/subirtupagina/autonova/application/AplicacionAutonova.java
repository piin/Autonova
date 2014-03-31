package com.subirtupagina.autonova.application;

import android.app.Application;
import android.widget.ArrayAdapter;

import com.subirtupagina.autonova.modelo.Publicacion;
import com.subirtupagina.autonova.utils.AsyncConector;

public class AplicacionAutonova extends Application {
	//Url del archivo XML
	private final static String URL = "http://promoandroid.com/autonova.xml";

	public void updatePublicaciones(ArrayAdapter<Publicacion> lvAdapter) {

		AsyncConector conector = new AsyncConector(lvAdapter, URL);
		conector.execute();
	}

}
