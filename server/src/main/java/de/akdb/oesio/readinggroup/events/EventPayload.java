package de.akdb.oesio.readinggroup.events;

public class EventPayload
{

    private int status;

    public EventPayload(int status) {
        this.status = status;
    }

    public int getStatus()
    {
        return status;
    }


}
