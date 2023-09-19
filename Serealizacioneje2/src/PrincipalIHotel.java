import HotelDTO.HotelDTO;
import interfacesHotel.IHotel;
import service.HotelServiceImpl;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class PrincipalIHotel {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        IHotel repo = new HotelServiceImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.print("Menu \n 1. Agregar  \n 2. Listar \n 3. Editar " +
                    "\n 4. Eliminar  \n 5. Salir \n =>");
            opc = s.next();
            switch (opc) {
                case "1": {
                    System.out.println("para cuantas peronas es la reserva: ");
                    Integer id = s.nextInt();
                    System.out.println(":hay mascotas ");
                    String nom = s.next();
                    System.out.println("hay fumadores: ");
                    String cat = s.next();
                    System.out.println("nombre del usuario: ");
                    double ca = s.nextDouble();
                    repo.save(new HotelDTO(id,nom, cat, ca ));
                    break;
                }
                case "2": {
                    List<HotelDTO> productos = repo.findAll();
                    if(!productos.isEmpty()){
                        productos.forEach(System.out::println);
                    }else{
                        System.out.println("No hay reserva");
                    }
                    break;
                }
                case "3": {
                    System.out.println("===== editar ====");
                    System.out.print("ingrese el numero de integrantes nuevos: ");
                    Integer idp = s.nextInt();
                    System.out.print("ingrese mascotas: ");
                    String nom = s.next();
                    System.out.print("ingrese  fumadores: ");
                    String cat = s.next();
                    System.out.print("ingrese el nuevo usuario: ");
                    double ca = s.nextDouble();
                    HotelDTO beaActualizar = new HotelDTO(idp, nom, cat, ca);
                    repo.update(beaActualizar);
                    break;
                }
                case "4": {
                    System.out.println("===== eliminar ======");
                    System.out.print("ingrese id del registro: ");
                    Integer id = s.nextInt();
                    repo.delete(repo.findById(id));
                    repo.findAll().forEach(System.out::println);
                    break;
                }
                case "5": {
                    opc = "5";
                    break;
                }
            }
        } while (opc != "5");
    }
}


