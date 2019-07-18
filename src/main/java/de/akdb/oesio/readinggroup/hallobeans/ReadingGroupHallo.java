package de.akdb.oesio.readinggroup.hallobeans;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;

import de.akdb.oesio.readinggroup.IHalloBean;
import de.akdb.oesio.readinggroup.MaxNumber;
import de.akdb.oesio.readinggroup.Random;
import de.akdb.oesio.readinggroup.ReadingGroup;

//@ReadingGroup
//@Dependent
class ReadingGroupHallo implements IHalloBean
{
    @Inject
    @MaxNumber
    private int maxNumber;
    @Inject
    @Random
    private Instance<Integer> random;
    @Inject
    private MyProducer producer;

    ReadingGroupHallo()
    {
    }

    public String hallo()
    {
        return "Hallo: Auswahl bei Injection durch Qualifier @ReadingGroup, max. Zahl: "
                + this.maxNumber + ", "
                + this.producer.getMaxNumber2()
                + ", Zufall 1: " + this.random.get()
                + ", Zufall 2: " + this.random.get();
    }

    @Override
    public String hallo2()
    {
        return null;
    }
}