package com.example.Carshop.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Carshop.Model.Marque;
import com.example.Carshop.Repository.MarqueRepository;

import java.util.List;

@Service
public class MarqueService {

    @Autowired
    private MarqueRepository MarqueRepository;

    public List<Marque> getAllMarques() {
        return MarqueRepository.findAll();
    }

    public Marque getMarqueById(int id) {
        return MarqueRepository.findById(id).orElse(null);
    }

    public Marque saveMarque(Marque Marque) {
        return MarqueRepository.save(Marque);
    }

    public void deleteMarque(int id) {
        MarqueRepository.deleteById(id);
    }

    // Autres méthodes CRUD personnalisées si nécessaire
}

