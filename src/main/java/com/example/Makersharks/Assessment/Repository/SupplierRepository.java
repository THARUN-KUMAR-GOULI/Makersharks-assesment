package com.example.Makersharks.Assessment.Repository;

import com.example.Makersharks.Assessment.Entity.SupplierEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<SupplierEntity, Long> {
    Page<SupplierEntity> findByLocationAndNatureOfBusinessAndManufacturingProcess(
            String location, SupplierEntity.NatureOfBusiness natureOfBusiness, SupplierEntity.ManufacturingProcess manufacturingProcess, Pageable pageable
    );

    Page<SupplierEntity> findByLocationAndNatureOfBusiness(String location, SupplierEntity.NatureOfBusiness natureOfBusiness, Pageable pageable);

    Page<SupplierEntity> findByLocationAndManufacturingProcess(String location, SupplierEntity.ManufacturingProcess manufacturingProcess, Pageable pageable);

    Page<SupplierEntity> findByNatureOfBusinessAndManufacturingProcess(SupplierEntity.NatureOfBusiness natureOfBusiness, SupplierEntity.ManufacturingProcess manufacturingProcess, Pageable pageable);

    Page<SupplierEntity> findByLocation(String location, Pageable pageable);

    Page<SupplierEntity> findByNatureOfBusiness(SupplierEntity.NatureOfBusiness natureOfBusiness, Pageable pageable);

    Page<SupplierEntity> findByManufacturingProcess(SupplierEntity.ManufacturingProcess manufacturingProcess, Pageable pageable);
}
