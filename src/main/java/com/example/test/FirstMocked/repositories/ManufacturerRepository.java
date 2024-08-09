package com.example.test.FirstMocked.repositories;

import com.example.test.FirstMocked.models.Manufacturer;

import java.util.List;

public interface ManufacturerRepository {
    List<Manufacturer> findAll();
    void create(Manufacturer manufacturer);
    Manufacturer find(int id);
    void update(int id, Manufacturer updatedManufacturer);
    void delete(int id);
}
