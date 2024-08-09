package com.example.test.FirstMocked.DAO;

import com.example.test.FirstMocked.models.Manufacturer;
import com.example.test.FirstMocked.repositories.ManufacturerRepository;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

@Component
public class ManufacturerRepositoryMocked implements ManufacturerRepository {
    private List<Manufacturer> manufacturers;
    private static int MANUFACTURER_COUNT;

    {
        manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer(++MANUFACTURER_COUNT, "Adidas", "sport", new GregorianCalendar(2020, 11, 11)));
        manufacturers.add(new Manufacturer(++MANUFACTURER_COUNT, "Nike", "sport", new GregorianCalendar(2018, 1, 1)));
        manufacturers.add(new Manufacturer(++MANUFACTURER_COUNT, "IKEA", "household", new GregorianCalendar(2020, 11, 11)));
    }

    @Override
    public List<Manufacturer> findAll() {
        return manufacturers;
    }

    @Override
    public void create(Manufacturer manufacturer) {
        manufacturer.setId(++MANUFACTURER_COUNT);
        manufacturers.add(manufacturer);
    }

    @Override
    public Manufacturer find(int id) {
        return manufacturers.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }

    @Override
    public void update(int id, Manufacturer updatedManufacturer) {
        Manufacturer manufacturerToBeUpdated = find(id);
        if (updatedManufacturer.getName() != null) {
            manufacturerToBeUpdated.setName(updatedManufacturer.getName());
        }
        if (updatedManufacturer.getDescription() != null) {
            manufacturerToBeUpdated.setDescription(updatedManufacturer.getDescription());
        }

        if (updatedManufacturer.getCooperation_date() != null) {
            manufacturerToBeUpdated.setCooperation_date(updatedManufacturer.getCooperation_date());
        }
    }

    @Override
    public void delete(int id) {
        manufacturers.removeIf(p -> p.getId() == id);
    }
}
