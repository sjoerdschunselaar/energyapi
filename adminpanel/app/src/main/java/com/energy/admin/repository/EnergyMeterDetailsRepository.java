package com.energy.admin.repository;

import java.util.List;

import com.energy.admin.model.EnergyMeter;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

@Repository
public class EnergyMeterDetailsRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public List<EnergyMeter> findByMeterDetails(String id) {
        String query = "SELECT * FROM energy_meters WHERE id = :id";

        TypedQuery<EnergyMeter> q = entityManager.createQuery(query, EnergyMeter.class);
        q.setParameter("id", id);
        return q.getResultList();
    }
}
