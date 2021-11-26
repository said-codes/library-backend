package com.misiontic.library.repository;

import com.misiontic.library.model.Reservation;
import com.misiontic.library.repository.crud.ReservationCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ReservationRepository {

    @Autowired
    private ReservationCrudRepository reservationCrudRepository;

    public List<Reservation> getAll() {
        return (List<Reservation>) reservationCrudRepository.findAll();
    }

    public Optional<Reservation> getReservation(Integer id) {
        return reservationCrudRepository.findById(id);
    }

    public Reservation save(Reservation reservation) {
        reservation.setStatus("created");
        return reservationCrudRepository.save(reservation);
    }
}
