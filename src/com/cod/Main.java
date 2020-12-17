package com.cod;

public class Main {
    public static void main(String[] args) {
/**
 * aki mediante sentencias if else nos muestra si la conexion fallo o no
 */
      if (VisualizarConx1("pepe@danielcastelao.org"))
      {
        System.out.println("Listo");
      }
      else
        {
            System.out.println("Fallo");
        }
    if(VisualizarConx2())
    {
    System.out.println("Listo");
    }
    else
      {
        System.out.println("Fallo");
      }
    }

    /**
     * aki hay dos metodos que nos sacan por pantalla la conexion y el gmail del usuario
     * @param
     * @return
     */
    public static boolean VisualizarConx1(String u)
    {
      Visualizargmails Usuario1 = new Visualizargmails(u);
      System.out.println("Conectando a " + Usuario1.usuario2 + ", con el usuario " + u);
      return Usuario1.conx();
    }

    public static boolean VisualizarConx2()
    {
      Visualizargmails Usuario2 = new Visualizargmails();
      System.out.println("Conectando a " + Usuario2.usuario2 + ", con el usuario " + Usuario2.Usuario1);
      return Usuario2.conx();
      }
}
