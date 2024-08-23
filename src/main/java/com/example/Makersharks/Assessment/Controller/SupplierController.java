package com.example.Makersharks.Assessment.Controller;

import com.example.Makersharks.Assessment.Entity.SupplierEntity;
import com.example.Makersharks.Assessment.Repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierRepository supplierRepository;


    @PostMapping("/query")
    public ResponseEntity<Page<SupplierEntity>> querySuppliers(
            @RequestParam(required = false) String location,
            @RequestParam(required = false) SupplierEntity.NatureOfBusiness natureOfBusiness,
            @RequestParam(required = false) SupplierEntity.ManufacturingProcess manufacturingProcess,
            @RequestParam(required = false) int page,
            @RequestParam(required = false) int size
            ){

        Pageable pageable = PageRequest.of(page, size);
        Page<SupplierEntity> supplierEntities;


        if(location != null && natureOfBusiness != null && manufacturingProcess != null){
            supplierEntities = supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcess(location, natureOfBusiness, manufacturingProcess, pageable);
        } else if (location != null && natureOfBusiness != null) {
            supplierEntities = supplierRepository.findByLocationAndNatureOfBusiness(location, natureOfBusiness, pageable);
        } else if (location != null && manufacturingProcess != null) {
            supplierEntities = supplierRepository.findByLocationAndManufacturingProcess(location, manufacturingProcess, pageable);
        } else if (natureOfBusiness != null && manufacturingProcess != null) {
            supplierEntities = supplierRepository.findByNatureOfBusinessAndManufacturingProcess(natureOfBusiness, manufacturingProcess, pageable);
        } else if (location != null) {
            supplierEntities = supplierRepository.findByLocation(location, pageable);
        } else if (natureOfBusiness != null) {
            supplierEntities = supplierRepository.findByNatureOfBusiness(natureOfBusiness, pageable);
        } else if (manufacturingProcess != null) {
            supplierEntities = supplierRepository.findByManufacturingProcess(manufacturingProcess, pageable);
        } else {
            supplierEntities = supplierRepository.findAll(pageable);
        }

        return ResponseEntity.ok(supplierEntities);
    }
}
