package com.example.test.FirstMocked.controllers;

import com.example.test.FirstMocked.DAO.ManufacturerRepositoryMocked;
import com.example.test.FirstMocked.models.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class FirstController {
    private final ManufacturerRepositoryMocked manufacturerRepositoryMocked;

    @Autowired
    public FirstController(ManufacturerRepositoryMocked manufacturerRepositoryMocked) {
        this.manufacturerRepositoryMocked = manufacturerRepositoryMocked;
    }

    @GetMapping
    public List<Manufacturer> getManufacturers() {
        return manufacturerRepositoryMocked.findAll();
    }

    @GetMapping("/{id}")
    public Manufacturer getManufacturer(@PathVariable("id") int id) {
        return manufacturerRepositoryMocked.find(id);
    }

    @PostMapping
    public Manufacturer create(@RequestBody Manufacturer manufacturer) {
        manufacturerRepositoryMocked.create(manufacturer);
        return manufacturerRepositoryMocked.find(manufacturer.getId());
    }

    @DeleteMapping("/{id}")
    public List<Manufacturer> delete(@PathVariable("id") int id) {
        manufacturerRepositoryMocked.delete(id);
        return manufacturerRepositoryMocked.findAll();
    }

    @PutMapping("/{id}")
    public Manufacturer update(@PathVariable("id") int id, @RequestBody Manufacturer updatedManufacturer) {
        manufacturerRepositoryMocked.update(id, updatedManufacturer);
        return manufacturerRepositoryMocked.find(id);
    }
}
