package com.api.parking_control.repositories;

import com.api.parking_control.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/* Essa inteface é um Bean do Spring, quando eu extendi o JpaRepository ele ja trouxe implicitamente o @Repository
* Foi oque a senhorita disse na aula; Resolvi entrar no JpaRepository e encontrei foi um @NoRepositoryBean, rendi foi nada
* dei uma pesquisada fiquei mais confuso ainda, enfim segundos depois ela coloca o @Repository nesse carai -_-
*
* No ecossistema Spring (Java), a anotação @Repository e o conceito de Repository indicam uma classe
* ou interface responsável pela camada de acesso a dados, fazendo a ponte entre a aplicação e o banco de dados
* */


@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
