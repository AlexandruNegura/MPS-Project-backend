package mps.fifa.repository;

import mps.fifa.model.PlayerCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerCardRepo extends JpaRepository<PlayerCard, Long> {
}
