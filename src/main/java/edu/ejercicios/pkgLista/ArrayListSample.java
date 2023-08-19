package edu.ejercicios.pkgLista;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public void ejemplo1() {
        List<String> taskList = new ArrayList<>();
        taskList.add("Sacar al perro");
        taskList.add("Ir de compras");
        taskList.add("Hacer la cama");
        taskList.add("Ir a votar");

        //iterar, iterator, for each
        int pos = 0;
        for (String item : taskList) {
            System.out.println(pos+ " Tarea: " + item);
            pos++;
        }

        //String primerElemento = taskList.get(0);
        //System.out.println("Primer elemento: " + primerElemento);

        //taskList.remove(0);

        //primerElemento = taskList.get(0);
        //System.out.println("Primer elemento: " + primerElemento);
    }

    public void ejercicio1(){
        List<Integer> taskList = new ArrayList<>();
        taskList.add(1000);
        taskList.add(2000);
        taskList.add(3000);
        taskList.add(4000);

        int pos = 0;
        int suma = 0;
        for (Integer item: taskList) {
            System.out.println(pos+ " Tarea: " + item);
            suma = suma + item;
            pos++;
        }
        System.out.println("La suma de los elementos es: " + suma);

    }

    public void listaTareas(){
        List<ClsTaskList> tl = new ArrayList<>();
        ClsTaskList tarea = new ClsTaskList();

        tarea.setTaskName("Ir a votar");
        tarea.setTaskDescription("Escuela, mesa 5");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Sacar al perro");
        tarea.setTaskDescription("Llevar al firulais al parque");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        tarea.setTaskName("Hacer la cama");
        tarea.setTaskDescription("Mi mama me va a matar");
        tarea.setDone(false);
        tl.add(tarea);
        tarea = new ClsTaskList();

        for(ClsTaskList item: tl){
            System.out.println(item.toString());
        }

        }
    }

