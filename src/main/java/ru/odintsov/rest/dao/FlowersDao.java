package ru.odintsov.rest.dao;

import org.springframework.stereotype.Component;
import ru.odintsov.rest.model.Flowers;

import java.util.ArrayList;
import java.util.List;

@Component
public class FlowersDao {
    List<Flowers> flowersList = new ArrayList<>();
    private static int COUNT = 0;

    {
        flowersList.add(new Flowers(++COUNT, "Button", 5, "Red"));
        flowersList.add(new Flowers(++COUNT, "Violet", 50, "Black"));
        flowersList.add(new Flowers(++COUNT, "Rose", 10, "Yellow"));
        flowersList.add(new Flowers(++COUNT, "Hydrangea", 45, "White"));
    }

    public List<Flowers> getAllFlowers() {
        return flowersList;
    }

    public void addNewFlowers(Flowers flowers) {
        flowers.setId(++COUNT);
        flowersList.add(flowers);
    }

    public void update(int id, Flowers flowers) {
        Flowers flower = flowersList.stream().filter(n -> n.getId() == id).findAny().orElse(null);

        flower.setColor(flowers.getColor());
        flower.setName(flowers.getName());
        flower.setCount(flowers.getCount());
    }

    public void remove(int id) {
        flowersList.removeIf(n -> n.getId() == id);
    }
}
