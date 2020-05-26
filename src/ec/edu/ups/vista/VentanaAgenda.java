/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import java.awt.*;

/**
 *
 * @author Anahi
 */
public class VentanaAgenda extends Frame {

    public VentanaAgenda(String title) {
        this.setTitle(title);

        this.setSize(850, 600);
        this.setLocation(new Point(600, 10));

        Panel panelPrincipal = new Panel();
        Panel panelNorte = new Panel();
        Panel panelCentro = new Panel();
        Panel registrar = new Panel();
        BorderLayout posiciones = new BorderLayout();


        this.setLayout(posiciones);

        Label mensaje = new Label("Bienvenido");
        panelNorte.add(mensaje);
        panelNorte.setBackground(Color.cyan);
        this.add(panelNorte, BorderLayout.NORTH);

        GridLayout malla = new GridLayout(5, 1);
        panelPrincipal.setLayout(malla);
        panelCentro.setLayout(malla);

        GridLayout mallaR = new GridLayout(6, 2, 7, 0);
        registrar.setLayout(mallaR);

        Label ingresarT = new Label("Ingresar Telefono");
        Label espacio = new Label("");
        Label codigoR = new Label("Codigo del Telefono:\n");
        TextField codigo = new TextField("", 5);
        Label numeroR = new Label("Numero:\n");
        TextField numero = new TextField("", 10);
        Label tipoR = new Label("Tipo:\n");
        TextField tipo = new TextField("", 10);
        Label operadoraR = new Label("Operadora:\n");
        TextField operadora = new TextField("", 10);
        Button bSalir = new Button("Salir");
        bSalir.setBackground(Color.lightGray);
        bSalir.setForeground(Color.BLUE);
        Button bSiguiente = new Button("Siguiente");
        bSiguiente.setBackground(Color.lightGray);
        bSiguiente.setForeground(Color.BLUE);

        registrar.add(ingresarT);
        registrar.add(espacio);
        registrar.add(codigoR);
        registrar.add(codigo);
        registrar.add(numeroR);
        registrar.add(numero);
        registrar.add(tipoR);
        registrar.add(tipo);
        registrar.add(operadoraR);
        registrar.add(operadora);
        registrar.add(bSalir);
        registrar.add(bSiguiente);
        panelCentro.add(registrar);
        Panel editar = new Panel();
        Panel panelEditar = new Panel();

        GridLayout mallaRe = new GridLayout(6, 2, 7, 0);
        panelEditar.setLayout(posiciones);
        editar.setLayout(mallaRe);

        Label editarT = new Label("Editar un Telefono");
        Label espacio2 = new Label("");
        Label codigoE = new Label("Escriba el codigo del telefono a editar:");
        TextField codigoE1 = new TextField("", 4);
        Label numeroE = new Label("Numero (nuevo)");
        TextField numeroE2 = new TextField("", 4);
        Label tipoE = new Label("Tipo (nuevo):");
        TextField tipoE2 = new TextField("", 4);
        Label operadoraE = new Label("Operadora: ");
        TextField operadoraE2 = new TextField("", 4);
        Button cancelTT1 = new Button("Cancelar");
        cancelTT1.setBackground(Color.lightGray);
        cancelTT1.setForeground(Color.blue);
        Button actualizarTT = new Button("Siguiente");
        actualizarTT.setBackground(Color.lightGray);
        actualizarTT.setForeground(Color.blue);

        editar.add(editarT, BorderLayout.NORTH);
        editar.add(espacio2);
        editar.add(codigoE);
        editar.add(codigoE1);
        editar.add(numeroE);
        editar.add(numeroE2);
        editar.add(tipoE);
        editar.add(tipoE2);
        editar.add(operadoraE);
        editar.add(operadoraE2);
        editar.add(cancelTT1);
        editar.add(actualizarTT);
        panelCentro.add(editar);

        Panel panelEliminar = new Panel();
        GridLayout mallaE = new GridLayout(4, 1);
        panelEliminar.setLayout(mallaE);

        Label eliminar = new Label("Eliminar Telefono");
        Label espacio3= new Label("");
        Label eliminarT = new Label("Codigo del telefono a eliminar:");
        TextField eliminarT2 = new TextField("", 5);
        Button eliminarT3 = new Button("Cancelar");
        eliminarT3.setBackground(Color.lightGray);
        eliminarT3.setForeground(Color.blue);
        Button eliminarT4 = new Button("Eliminar");
        eliminarT4.setBackground(Color.lightGray);
        eliminarT4.setForeground(Color.blue);

        panelEliminar.add(eliminar);
        panelEliminar.add(espacio3);
        panelEliminar.add(eliminarT);
        panelEliminar.add(eliminarT2);
        panelEliminar.add(eliminarT3);
        panelEliminar.add(eliminarT4);

        panelCentro.add(panelEliminar);
        Panel panelBuscar = new Panel();
        panelBuscar.setLayout(mallaE);
        
        Label buscar = new Label("Buscar un telefono");
        Label buscarT = new Label("Escriba el codigo del telefono a buscar:");
        TextField buscarT2 = new TextField("", 5);
        Button buscarT3 = new Button("Buscar");
        buscarT3.setBackground(Color.lightGray);
        buscarT3.setForeground(Color.blue);
        buscarT3.setSize(100, 10);

        panelBuscar.add(buscar);
        panelBuscar.add(buscarT);
        panelBuscar.add(buscarT2);
        panelBuscar.add(buscarT3);

        panelCentro.add(panelBuscar);

        Panel panelListar = new Panel();
        GridLayout mallaL = new GridLayout(2, 1);
        panelListar.setLayout(mallaL);

        Label listar = new Label("Listar sus telefonos");
        Label espacio4= new Label("");
        Button listarT = new Button("Listar sus telefonos");
        listarT.setBackground(Color.lightGray);
        listarT.setForeground(Color.blue);
        Button atras = new Button("Atras");
        atras.setBackground(Color.lightGray);
        atras.setForeground(Color.blue);
        
        panelListar.add(listar);
        panelListar.add(espacio4);
        panelListar.add(listarT);
        panelListar.add(atras);
        panelCentro.add(panelListar);
        
        panelCentro.setBackground(Color.white);
        panelCentro.setForeground(Color.black);

        this.add(panelCentro, BorderLayout.CENTER);

        Panel panelSalir = new Panel();
        GridLayout mallaS = new GridLayout(1, 2, 7, 0);
        panelSalir.setLayout(mallaS);
        Button inicio = new Button("Inicio");
        inicio.setBackground(Color.cyan);
        Button cerrarSesion = new Button("Cerrar Sesión");
        cerrarSesion.setBackground(Color.cyan);
        Button salir = new Button("Salir");
        salir.setBackground(Color.cyan);
        panelSalir.add(inicio);
        panelSalir.add(cerrarSesion);
        panelSalir.add(salir);

        this.add(panelSalir, BorderLayout.SOUTH);

        this.setVisible(true);

    }

}
