package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Event;

import java.io.IOException;
import java.util.List;

public interface IEventDAO {
    List<Event> fetchEvents(String combinedName) throws IOException;
}
