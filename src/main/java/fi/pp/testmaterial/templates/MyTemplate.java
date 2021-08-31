package fi.pp.testmaterial.templates;

public class MyTemplate<T>
{
    private T whatEver;

    public void setValue(T whatEver)
    {
        this.whatEver = whatEver;
    }

    public T find(T t)
    {
        return whatEver;
    }
}
