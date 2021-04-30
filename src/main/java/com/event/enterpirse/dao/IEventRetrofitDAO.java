package com.event.enterpirse.dao;

import com.event.enterpirse.dto.Event;
import retrofit2.http.GET;
import retrofit2.http.Query;

import java.util.List;

public interface IEventRetrofitDAO {

    @GET() //This is where you put in the web address of the .json feed
    List<Event> getEvents(@Query("Combined_Name")String combinedName);
}
