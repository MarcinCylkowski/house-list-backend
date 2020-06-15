package pl.cylkowski.houselist.servives;


import org.springframework.stereotype.Service;
import pl.cylkowski.houselist.model.House;
import pl.cylkowski.houselist.repositories.HouseRepository;

import java.util.List;



@Service
public class HouseService {

    private HouseRepository houseRepository;

    public HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public List<House> getAllHouses(){
        return houseRepository.findAll();
    }

    public void deleteHouse(long house_id){
        houseRepository.deleteById(house_id);
        System.out.println("Usunięto dom z kolekcji");
    }

    public House addHouse(House house){
       return houseRepository.save(house);
    }

//    public House updateHouse(House house){
//        return houseRepository.save(house);
//    }

}
