package edu.ejercicios.pkgEjercicio;

import java.util.ArrayList;
import java.util.List;

public class ClsEjercicio6 {

    public void ejercicio(){

        List<arraylistejer> tl = new ArrayList<>();
        arraylistejer ej = new arraylistejer();

        ej.setNombre("Juan");
        ej.setSueldo_base(3500);
        ej.setDescuentos(500);
        tl.add(ej);
        ej = new arraylistejer();

        ej.setNombre("Luis");
        ej.setSueldo_base(5000);
        ej.setDescuentos(500);
        tl.add(ej);
        ej = new arraylistejer();

        ej.setNombre("Aaron");
        ej.setSueldo_base(5000);
        ej.setDescuentos(500);
        tl.add(ej);
        ej = new arraylistejer();

        ej.setNombre("Vanessa");
        ej.setSueldo_base(10000);
        ej.setDescuentos(500);
        tl.add(ej);
        ej = new arraylistejer();

        ej.setNombre("Fernanda");
        ej.setSueldo_base(5000);
        ej.setDescuentos(500);
        tl.add(ej);
        ej = new arraylistejer();

        double liquido = 0;
        for(arraylistejer item: tl){
            System.out.println("Nombre: " + item.getNombre());
            System.out.println("Sueldo base: " + item.getSueldo_base());
            System.out.println("Descuentos: " + item.getDescuentos());
            liquido = item.getSueldo_base() - item.getDescuentos();
            System.out.println("Sueldo liquido: " + liquido);
        }
    }
}
