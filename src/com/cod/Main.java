package com.cod;

public class Main {
    public static void main(String[] args) {

      if (metodo1("pepe@danielcastelao.org"))
      {
        System.out.println("Listo");
      }
      else
        {
            System.out.println("Fallo");
        }
    if(metodo2())
    {
    System.out.println("Listo");
    }
    else
      {
        System.out.println("Fallo");
      }
    }

    public static boolean metodo1(String u)
    {
      Visualizargmails Usuario1 = new Visualizargmails(u);
      System.out.println("Conectando a " + Usuario1.h + ", con el usuario " + u);
      return Usuario1.con();
    }

    public static boolean metodo2()
    {
      Visualizargmails Usuario2 = new Visualizargmails();
      System.out.println("Conectando a " + Usuario2.h + ", con el usuario " + Usuario2.e);
      return Usuario2.con();
      }
}
