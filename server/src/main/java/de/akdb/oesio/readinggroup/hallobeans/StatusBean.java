package de.akdb.oesio.readinggroup.hallobeans;

import de.akdb.oesio.readinggroup.IHalloBean;

public class StatusBean implements IHalloBean
{
    private int n = 0;

    public StatusBean()
    {
    }

    public String hallo()
    {
        return "Bean mit Application Scope. Hat Status: " + this.n;
    }

    @Override
    public String hallo2()
    {
        return null;
    }
}