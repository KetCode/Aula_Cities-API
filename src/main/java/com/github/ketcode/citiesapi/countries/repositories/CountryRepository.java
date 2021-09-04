package com.github.ketcode.citiesapi.countries.repositories;

import com.github.ketcode.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
