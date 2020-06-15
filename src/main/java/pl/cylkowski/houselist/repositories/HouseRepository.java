package pl.cylkowski.houselist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.cylkowski.houselist.model.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {


}
