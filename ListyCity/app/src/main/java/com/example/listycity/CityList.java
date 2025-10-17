package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     *      This is a candidate city to add
     * @throws IllegalArgumentException if the city already exist
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }
    /**
     * Returns true if the given city exists in the list.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Removes the given city if present; otherwise throws an exception.
     * @throws IllegalArgumentException if the city is not found
     */
    public void delete(City city) {
        boolean removed = cities.remove(city);
        if (!removed) {
            throw new IllegalArgumentException("City not found: " + city);
        }
    }

    /**
     * @return the number of cities currently in the list
     */
    public int countCities() {
        return cities.size();
    }
}