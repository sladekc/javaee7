package de.akdb.oesio.readinggroup.hallobeans;

import java.util.Random;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;

import de.akdb.oesio.readinggroup.MaxNumber;

@Dependent
class MyProducer
{
    private int maxNumber = 100;
    private Random random = new Random(System.currentTimeMillis());

    MyProducer()
    {
    }

    @Produces
    @MaxNumber
    int getMaxNumber()
    {
        return this.maxNumber;
    }

    int getMaxNumber2()
    {
        return this.maxNumber + 50;
    }

    Random getRandom()
    {
        return this.random;
    }

    @Produces
    @de.akdb.oesio.readinggroup.Random
    int next()
    {
        return this.getRandom().nextInt(this.maxNumber);
    }
}