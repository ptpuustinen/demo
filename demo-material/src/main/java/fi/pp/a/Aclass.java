package fi.pp.a;

import fi.pp.b.Bclass;

public class Aclass
{
    Bclass bc = new Bclass();

    public int findInt(String whatEver)
    {
        return bc.findInt(whatEver);
    }
}
