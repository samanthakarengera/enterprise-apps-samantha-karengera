package be.ehb.ngoapp.repository;

import be.ehb.ngoapp.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}