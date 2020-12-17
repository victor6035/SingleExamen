package com.cod;
public class Visualizargmails
{
    /**
     * variables de tipo String
     */
    String Usuario1 = "";
    String usuario2 = "127.0.0.2";

    private static Visualizargmails instance = null;



    public static Visualizargmails getInstance(){
        if (instance == null) {
            /**
             * como no esta creada  se crea por k desde aki podemos accder al constructor predefinido
             */
            instance = new Visualizargmails();
        }
        // devuelvo la instancia
        return instance;
    }

    /**
     * son los contructores de esta clase
     */
    Visualizargmails()
    {
    Usuario1 ="anonymous@danielcastelao.org";
    }

    Visualizargmails(String param1)
    {
        this.Usuario1 = param1;
    }

    /**
     * metodo conexion conx que retorna un fallse o un true dependiendo de si
     * @return
     */
    public boolean conx()
    {
    if (Usuario1 !="anonymous@danielcastelao.org")
    {
        return true;
    }
    else
        {
            return false;
        }
    }
}
