package de.akdb.oesio.readinggroup.events;

import javax.enterprise.context.Dependent;
import javax.enterprise.event.Observes;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Dependent
public class EventObserver
{
    private static final Logger LOG = LoggerFactory.getLogger(EventObserver.class);

    public void observe(@Observes EventPayload payload) {
        LOG.error("Event observed: " + payload.getStatus());
    }
}
