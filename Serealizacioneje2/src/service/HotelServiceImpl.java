package service;

import HotelDTO.HotelDTO;
import interfacesHotel.IHotel;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HotelServiceImpl implements IHotel {
    private List<HotelDTO> productos;

    public HotelServiceImpl() throws IOException, ClassNotFoundException {
        productos = new ArrayList<>();
    }

    @Override
    public HotelDTO findById(int id) {
        return productos.stream()
                .filter(producto -> producto.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<HotelDTO> findAll() throws IOException, ClassNotFoundException {
        productos = (List<HotelDTO>) HotelSerializer.readObjectFromFile("productos.ax");
        return productos;
    }

    @Override
    public void save(HotelDTO producto) throws IOException {
        productos.add(producto);
        HotelSerializer.writeObjectToFile(productos, "productos.ax");
    }

    @Override
    public void update(HotelDTO producto) throws IOException {
        HotelDTO oldProducto = findById(producto.getId());
        if (oldProducto != null) {
            productos.remove(oldProducto);
            productos.add(producto);
            HotelSerializer.writeObjectToFile(productos, "productos.ax");
        }
    }

    @Override
    public void delete(HotelDTO producto) throws IOException {
        productos.remove(producto);
        HotelSerializer.writeObjectToFile(productos, "productos.ax");
    }
}


