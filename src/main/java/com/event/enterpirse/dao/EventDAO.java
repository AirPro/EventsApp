package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Event;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.List;

@Repository
public class EventDAO implements IEventDAO{
    @Override
    public List<Event> fetchEvents(String combinedName) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();
        IEventRetrofitDAO eventRetrofitDAO = retrofitInstance.create(IEventRetrofitDAO.class);
        Call<List<Event>> allEvents = eventRetrofitDAO.getEvents(combinedName);
        Response<List<Event>> execute = allEvents.execute();
        List<Event> events = execute.body();
        return events;
    }
}
