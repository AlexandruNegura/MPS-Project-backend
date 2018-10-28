package mps.fifa.repository;

import mps.fifa.model.LeaderCard;
import mps.fifa.model.SpellCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaderCardRepo extends JpaRepository<LeaderCard, Long> {

}
