package ru.odintsov.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.odintsov.rest.model.Flowers;
import ru.odintsov.rest.servises.FlowersServices;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FlowersController {

    private final FlowersServices flowersServices;

    @Autowired
    public FlowersController(FlowersServices flowersServices) {
        this.flowersServices = flowersServices;
    }

    @GetMapping("/get")
    public List<Flowers> getAll() {
        return flowersServices.getAll();
    }

    @PostMapping("/post")
    public Integer add(@RequestBody Flowers flowers) {
        return flowersServices.addNewFlowers(flowers);
    }

    @PutMapping("/put/{id}")
    public void update(@PathVariable int id, @RequestBody Flowers flowers) {
        flowersServices.update(id, flowers);
    }

    @DeleteMapping("delete/{id}")
    public void remove(@PathVariable int id) {
        flowersServices.delete(id);
    }
}
