package io.pivotal.pal.tracker;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private HashMap<Long, TimeEntry> repo = new HashMap<>();
    private long id = 0;

    public TimeEntry create(TimeEntry timeEntry) {
        id++;
        timeEntry.setId(id);
        repo.put(id,timeEntry);
        return timeEntry;
    }

    public TimeEntry find(Long id) {
        return repo.get(id);
    }

    public List<TimeEntry> list() {
        return new ArrayList<TimeEntry>(repo.values());
    }

    public TimeEntry update(Long id, TimeEntry timeEntry) {
        if(!repo.containsKey(id))
            return null;
        timeEntry.setId(id);
        repo.put(id, timeEntry);
        return timeEntry;
    }

    public void delete(Long id) {
        repo.remove(id);
    }
}
