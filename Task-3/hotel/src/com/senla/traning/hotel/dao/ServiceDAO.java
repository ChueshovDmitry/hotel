package com.senla.traning.hotel.dao;

import com.senla.traning.hotel.person.HotelGuest;
import com.senla.traning.hotel.service.HotelService;

/**
 * @author Dmitry Chueshov 31.05.2020 21:02
 * @project hotel
 */

public interface ServiceDAO {

    void addService(HotelService hotelService);
    public void removeService(HotelService hotelService);
    public void getAllService();
}
