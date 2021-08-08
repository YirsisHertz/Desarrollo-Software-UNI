package paquete;

import javax.swing.*;

public class Ventana extends JFrame {

  JMenuBar barra;

  JMenu menu_archivo;
  JMenu menu_opciones;
  JMenu menu_ayuda;

  JMenuItem itemAbrir;
  JMenuItem itemNuevo;
  JMenuItem itemSalir;
  JMenuItem itemImprimir;
  JMenuItem itemConfiguracion;
  JMenuItem itemAyuda;
  JMenuItem itemAcercaDe;

  public Ventana(){
    setTitle("Menu Java");
    setSize(400, 300);
    setResizable(false);
    setLocationRelativeTo(null);

    barra = new JMenuBar();
    menu_archivo = new JMenu("Archivo");
    menu_opciones = new JMenu("Opciones");
    menu_ayuda= new JMenu("Ayuda");

    itemAbrir = new JMenuItem("Abrir");
    itemNuevo = new JMenuItem("Nuevo");
    itemSalir = new JMenuItem("Salir");
    itemImprimir = new JMenuItem("Imprimir");
    itemConfiguracion = new JMenuItem("Configuracion");
    itemAyuda = new JMenuItem("Ayuda");
    itemAcercaDe = new JMenuItem("Acerca De");

    barra.add(menu_archivo);
    barra.add(menu_opciones);
    barra.add(menu_ayuda);

    menu_archivo.add(itemAbrir);
    menu_archivo.add(itemNuevo);
    menu_archivo.add(itemSalir);

    menu_opciones.add(itemImprimir);
    menu_opciones.add(itemConfiguracion);

    menu_ayuda.add(itemAyuda);
    menu_ayuda.add(itemAcercaDe);

    itemNuevo.addActionListener((e) -> {
      JOptionPane.showMessageDialog(null, "Opcion Nuevo");
    });

    itemAbrir.addActionListener((e) -> {
      JOptionPane.showMessageDialog(null, "Opcion Abrir");
    });

    itemSalir.addActionListener((e) -> {
      System.exit(0);
    });

    setJMenuBar(barra);
    setVisible(true);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
}
