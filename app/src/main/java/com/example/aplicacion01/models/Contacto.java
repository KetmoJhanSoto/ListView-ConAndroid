package com.example.aplicacion01.models;

import java.util.ArrayList;

public class Contacto {
    public String Telefono;
    public String Nombre;
    public String Imagen;

    public  String getSmallImage(){
        return  this.Imagen;
    }

    public Contacto(String _telefono, String _nombre, String _imagen) {
        this.Telefono = _telefono;
        this.Nombre = _nombre;
        this.Imagen =_imagen;
    }

    public static ArrayList getCollection() {
        ArrayList<Contacto> collection = new ArrayList<>();
        collection.add(new Contacto("064-202024", "Computadora","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTK-2PhPDytOspWeWCaBIMaF8BzLoazb0SIl8wQzsDK6t1IMk5D"));
        collection.add(new Contacto("064-142330", "Laptop","https://sellercenter-static.linio.com.pe/f/f26afce059c40193d3592996334b62a1.jpeg"));
        collection.add(new Contacto("064-322670", "Mouse","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSmHhnuHtXQklKbdzvH1wr4yWssdwxZu4eLrarGUbv_xvywyDkD"));
        collection.add(new Contacto("064-503401", "Teclado","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcTz2F2sF9dvxFmz1i4gfr-4mapGmDlsiyZw4of5vR1cJsJePJLU"));
        collection.add(new Contacto("064-202022", "Monitor","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcThttPDPj_qtOXTzkDMQ-BLPKp5MfTuVMQjBaA6k4fdgjuY5xI_"));
        collection.add(new Contacto("064-142333", "CPU","https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcSTtA2CnLmlk_FIRh7l9NAIFI8PyjkZD29WPB6-CO7s-ZoYHvsC"));
        collection.add(new Contacto("064-322675", "Case","https://resources.claroshop.com/medios-plazavip/mkt/5d3896a04198b_c5jpg.jpg"));
        return collection;
    }
}