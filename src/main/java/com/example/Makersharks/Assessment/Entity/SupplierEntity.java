package com.example.Makersharks.Assessment.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String websiteName;

    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @Enumerated(EnumType.STRING)
    private ManufacturingProcess manufacturingProcess;



    public enum NatureOfBusiness {
        small_scale,
        medium_scale,
        large_scale
    }

    public enum ManufacturingProcess {
        moduling,
        _3d_printing,
        casting,
        coating
    }
}
