package com.juliehang.concertfinder.repository;

import com.juliehang.concertfinder.model.Concert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface ConcertRepository extends JpaRepository<Concert, Long> {
    
    List<Concert> findByVenue(String venue);
    List<Concert> findByVenueContainingIgnoreCase(String venue);
    List<Concert> findByDateAfter(LocalDateTime date);
    Optional<Concert> findByNameAndDateAndVenue(String name, LocalDateTime date, String venue);
    List<Concert> findByNameContainingIgnoreCase(String searchTerm);
}