package ru.odintsov.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.odintsov.rest.dao.FlowersDao;
import ru.odintsov.rest.model.Flowers;

import java.util.List;

@RestController
public class FlowersController {

    private FlowersDao flowersDao;

    @Autowired
    public FlowersController(FlowersDao flowersDao) {
        this.flowersDao = flowersDao;
    }

    @GetMapping("/get")
    public List<Flowers> getAll() {
        return flowersDao.getAllFlowers();
    }

    @PostMapping("/post")
    public void add(@RequestBody Flowers flowers) {
        flowersDao.addNewFlowers(flowers);
    }

    @PutMapping("/put/{id}")
    public void update(@PathVariable int id, @RequestBody Flowers flowers) {
        flowersDao.update(id, flowers);
    }

    @DeleteMapping("delete/{id}")
    public void remove(@PathVariable int id) {
        flowersDao.remove(id);
    }
}
