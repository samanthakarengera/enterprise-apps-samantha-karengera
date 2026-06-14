package be.ehb.ngoapp.repository;

import be.ehb.ngoapp.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}