package com.cod;
public class Visualizargmails {
    String e = "";
    String h = "127.0.0.2";

    private static Visualizargmails instance = null;


    public static Visualizargmails getInstance(){
        if (instance == null) {
            // como no está creada, la creo
            // desde aqui si que puedo acceder al constructor
            // porque estoy en la misma clase
            instance = new Visualizargmails();
        }
        // devuelvo la instancia
        return instance;
    }

    Visualizargmails()
    {
    e="anonymous@danielcastelao.org";
    }

    Visualizargmails(String param1)
    {
        this.e = param1;
    }

    public boolean con()
    {
    if (e!="anonymous@danielcastelao.org")
    {
        return true;
    }
    else
        {
            return false;
        }
    }
}
