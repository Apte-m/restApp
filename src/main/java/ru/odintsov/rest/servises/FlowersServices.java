package ru.odintsov.rest.servises;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.odintsov.rest.model.Flowers;
import ru.odintsov.rest.repository.FlowersRepository;

import java.util.List;

@Service
public class FlowersServices {

    private FlowersRepository flowersRepository;

    @Autowired
    public FlowersServices(FlowersRepository flowersRepository) {
        this.flowersRepository = flowersRepository;
    }

    public List<Flowers> getAll() {
        return flowersRepository.findAll();
    }

    public Integer addNewFlowers(Flowers flowers) {
        flowersRepository.save(flowers);
        return flowers.getId();
    }

    public void update(int id, Flowers flowers) {
        flowers.setId(id);
        flowersRepository.save(flowers);
    }

    public void delete(int id) {
        flowersRepository.deleteById(id);
    }
}
