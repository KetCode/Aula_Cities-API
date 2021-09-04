package com.github.ketcode.citiesapi.states;

import com.github.ketcode.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
