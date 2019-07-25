package de.akdb.oesio.readinggroup;

import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;

import de.akdb.oesio.readinggroup.hallobeans.HalloBean;

@Dependent
public class ProducerFactory
{
    public ProducerFactory()
    {
    }

    //@Produces
    @RequestScoped
    public IHalloBean getHallo()
    {
        System.out.println("Hallo erzeugt");
        return new HalloBean("Tolles Präfix ");
    }

    public void disposeHallo(/*@Disposes*/ IHalloBean bean) {
        System.out.println("Disposing: " + bean);
    }
}