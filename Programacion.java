/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.programacion;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author domen_mxojouo
 */
public class Programacion {

    // ----------- CLASE PADRE -----------
    public static class Persona {
        protected String nombre;
        protected String cedula;

        public Persona(String nombre, String cedula) {
            this.nombre = nombre;
            this.cedula = cedula;
        }

        public String mostrarInfo() {
            return "Nombre: " + nombre + " | Cédula: " + cedula;
        }
    }

    // ----------- CLASE ESTUDIANTE -----------
    public static class Estudiante extends Persona {
        private final String carrera;

        public Estudiante(String nombre, String cedula, String carrera) {
            super(nombre, cedula);
            this.carrera = carrera;
        }

        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + " | Rol: Estudiante | Carrera: " + carrera;
        }
    }

    // ----------- CLASE DOCENTE -----------
    public static class Docente extends Persona {
        private final String especialidad;

        public Docente(String nombre, String cedula, String especialidad) {
            super(nombre, cedula);
            this.especialidad = especialidad;
        }

        @Override
        public String mostrarInfo() {
            return super.mostrarInfo() + " | Rol: Docente | Especialidad: " + especialidad;
        }
    }

    // ----------- LISTAS E INSTANCIAS -----------
    static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    static ArrayList<Docente> docentes = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    // ----------- MÉTODO PRINCIPAL -----------
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\n--- Sistema de Registro de Personas ---");
            System.out.println("1. Registrar Estudiante");
            System.out.println("2. Registrar Docente");
            System.out.println("3. Mostrar Estudiantes");
            System.out.println("4. Mostrar Docentes");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> registrarEstudiante();
                case 2 -> registrarDocente();
                case 3 -> mostrarListaEstudiantes();
                case 4 -> mostrarListaDocentes();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 5);
    }

    // ----------- REGISTRAR ESTUDIANTE -----------
    public static void registrarEstudiante() {
        System.out.println("\n--- Registrar Estudiante ---");

        System.out.print("Nombre:AVILES ALVAREZ KARLA ANTONIA ");
        String nombre = sc.nextLine();

        System.out.print("Cédula: 0958458526 ");
        String cedula = sc.nextLine();

        System.out.print("Carrera: INGENERIA INDUSTRIAL ");
        String carrera = sc.nextLine();

        estudiantes.add(new Estudiante(nombre, cedula, carrera));

        System.out.println("✔ Estudiante registrado correctamente.");
    }

    // ----------- REGISTRAR DOCENTE -----------
    public static void registrarDocente() {
        System.out.println("\n--- Registrar Docente ---");

        System.out.print("Nombre: ING. FRANCO GARCIA LEON JOSE ");
        String nombre = sc.nextLine();

        System.out.print("Cédula: 0948562558");
        String cedula = sc.nextLine();

        System.out.print("Especialidad: ESTRUCTURA METALICA 1");
        String especialidad = sc.nextLine();

        docentes.add(new Docente(nombre, cedula, especialidad));

        System.out.println("✔ Docente registrado correctamente.");
    }

    // ----------- MOSTRAR ESTUDIANTES -----------
    public static void mostrarListaEstudiantes() {
        System.out.println("\n--- Lista de Estudiantes ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            for (Estudiante e : estudiantes) {
                System.out.println(e.mostrarInfo());
            }
        }
    }

    // ----------- MOSTRAR DOCENTES -----------
    public static void mostrarListaDocentes() {
        System.out.println("\n--- Lista de Docentes ---");
        if (docentes.isEmpty()) {
            System.out.println("No hay registros.");
        } else {
            for (Docente d : docentes) {
                System.out.println(d.mostrarInfo());
            }
        }
    }
}
