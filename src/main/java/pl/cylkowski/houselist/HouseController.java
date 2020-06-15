package pl.cylkowski.houselist;

import org.springframework.web.bind.annotation.*;
import pl.cylkowski.houselist.model.House;
import pl.cylkowski.houselist.servives.HouseService;

import java.util.List;

@CrossOrigin
@RestController
public class HouseController {


    private HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @GetMapping("/api/house")
    public List<House> getAllHouses(){
        return houseService.getAllHouses();
    }

    @PostMapping("/api/house")
    public House addHouse(@RequestBody House house){
        return houseService.addHouse(house);
    }

    @DeleteMapping("/api/house/{house_id}")
    public void deleteHouse(@PathVariable("house_id") long house_id){
        houseService.deleteHouse(house_id);
    }

//    @PutMapping("api/house/")
//    public House updateHouse(@RequestBody House house){
//        return houseService.updateHouse(house);
//    }
}
