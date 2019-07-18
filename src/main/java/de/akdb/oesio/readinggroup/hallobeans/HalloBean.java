package de.akdb.oesio.readinggroup.hallobeans;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptor;
import javax.interceptor.Interceptors;

import de.akdb.oesio.readinggroup.IHalloBean;
import de.akdb.oesio.readinggroup.events.EventPayload;
import de.akdb.oesio.readinggroup.interceptors.OurInterceptor;
import de.akdb.oesio.readinggroup.interceptors.OurInterceptorBinding;

@Dependent
@OurInterceptorBinding
public class HalloBean implements IHalloBean
{
    @Inject
    private Event<EventPayload> event;

    String prefix = "";

    public HalloBean()
    {
    }

    public HalloBean(String prefix)
    {
        this.prefix = prefix;
    }

    public String hallo()
    {
        event.fire(new EventPayload(2));
        return this.prefix + "Hallo: Klappt auch mit maven 3.3.3. " + this.toString();
    }

    @Override
    public String hallo2()
    {
        event.fire(new EventPayload(2));
        return this.prefix + "Hallo2: " + this.toString();
    }
}
