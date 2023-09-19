package interfacesHotel;

import HotelDTO.HotelDTO;

import java.io.IOException;
import java.util.List;

public interface IHotel {

        HotelDTO findById(int id);
        List<HotelDTO> findAll() throws IOException, ClassNotFoundException;
        void save(HotelDTO producto) throws IOException;
        void update(HotelDTO producto) throws IOException;
        void delete(HotelDTO producto) throws IOException;
}
