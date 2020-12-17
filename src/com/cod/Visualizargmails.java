package com.cod;
public class Visualizargmails {
    String e = "";
    String h = "127.0.0.2";

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
