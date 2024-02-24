package com.prueba.servicioSOAPGN.services;

import com.prueba.servicioSOAPGN.model.TasaCambio;

import java.util.List;

public interface IRegistrarTasasService {

    TasaCambio guardarTasaCambio(TasaCambio tasaCambio);

    List<TasaCambio> getAllTasas();

}
