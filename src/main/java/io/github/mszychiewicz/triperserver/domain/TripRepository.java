package io.github.mszychiewicz.triperserver.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
interface TripRepository extends JpaRepository<Trip, Long> {
  Trip save(Trip trip);

  Optional<Trip> findById(Long id);
}
