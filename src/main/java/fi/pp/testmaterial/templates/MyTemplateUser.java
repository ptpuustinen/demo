package fi.pp.testmaterial.templates;

public class MyTemplateUser
{
    MyTemplate<Integer> myt;

    MyTemplateUser()
    {
        myt = new MyTemplate<Integer>();
        myt.setValue(9);
    }

    public Integer findInt()
    {
        return myt.find(6);
    }
}
