package com.api.parking_control.services;

/* Aqui seria ideal ficar a regra de negocio, e é usado para diminuir o acoplamento
*   É uma camada intermediaria entre o controller e o repository */

import com.api.parking_control.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    final
    ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }
}
