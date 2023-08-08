package ru.odintsov.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.odintsov.rest.model.Flowers;
@Repository
public interface FlowersRepository extends JpaRepository<Flowers,Integer> {
}
