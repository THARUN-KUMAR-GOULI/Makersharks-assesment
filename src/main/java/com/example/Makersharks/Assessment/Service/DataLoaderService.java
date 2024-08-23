package com.example.Makersharks.Assessment.Service;

import com.example.Makersharks.Assessment.Entity.SupplierEntity;
import com.example.Makersharks.Assessment.Repository.SupplierRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DataLoaderService {

    @Autowired
    private SupplierRepository supplierRepository;

    @PostConstruct
    public void loadData() {
        supplierRepository.deleteAll();

        SupplierEntity supplier1 = new SupplierEntity();
        supplier1.setCompanyName("Company1");
        supplier1.setWebsiteName("www.Company1.com");
        supplier1.setLocation("India");
        supplier1.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.large_scale);
        supplier1.setManufacturingProcess(SupplierEntity.ManufacturingProcess.casting);

        SupplierEntity supplier2 = new SupplierEntity();
        supplier2.setCompanyName("Company2");
        supplier2.setWebsiteName("www.Company2.com");
        supplier2.setLocation("Russia");
        supplier2.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier2.setManufacturingProcess(SupplierEntity.ManufacturingProcess.casting);

        SupplierEntity supplier3 = new SupplierEntity();
        supplier3.setCompanyName("Company3");
        supplier3.setWebsiteName("www.Company3.com");
        supplier3.setLocation("India");
        supplier3.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier3.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);

        SupplierEntity supplier4 = new SupplierEntity();
        supplier4.setCompanyName("Company4");
        supplier4.setWebsiteName("www.Company4.com");
        supplier4.setLocation("USA");
        supplier4.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier4.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);

        SupplierEntity supplier5 = new SupplierEntity();
        supplier5.setCompanyName("Company5");
        supplier5.setWebsiteName("www.Company5.com");
        supplier5.setLocation("India");
        supplier5.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier5.setManufacturingProcess(SupplierEntity.ManufacturingProcess.casting);

        SupplierEntity supplier6 = new SupplierEntity();
        supplier6.setCompanyName("Company6");
        supplier6.setWebsiteName("www.Company6.com");
        supplier6.setLocation("USA");
        supplier6.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier6.setManufacturingProcess(SupplierEntity.ManufacturingProcess.coating);

        SupplierEntity supplier7 = new SupplierEntity();
        supplier7.setCompanyName("Company7");
        supplier7.setWebsiteName("www.Company7.com");
        supplier7.setLocation("India");
        supplier7.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier7.setManufacturingProcess(SupplierEntity.ManufacturingProcess.coating);

        SupplierEntity supplier8 = new SupplierEntity();
        supplier8.setCompanyName("Company8");
        supplier8.setWebsiteName("www.Company8.com");
        supplier8.setLocation("Russia");
        supplier8.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.large_scale);
        supplier8.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);

        SupplierEntity supplier9 = new SupplierEntity();
        supplier9.setCompanyName("Company9");
        supplier9.setWebsiteName("www.Company9.com");
        supplier9.setLocation("India");
        supplier9.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier9.setManufacturingProcess(SupplierEntity.ManufacturingProcess._3d_printing);

        SupplierEntity supplier10 = new SupplierEntity();
        supplier10.setCompanyName("Company10");
        supplier10.setWebsiteName("www.Company10.com");
        supplier10.setLocation("Russia");
        supplier10.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier10.setManufacturingProcess(SupplierEntity.ManufacturingProcess._3d_printing);

        SupplierEntity supplier11 = new SupplierEntity();
        supplier11.setCompanyName("Company11");
        supplier11.setWebsiteName("www.Company11.com");
        supplier11.setLocation("China");
        supplier11.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.large_scale);
        supplier11.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);

        SupplierEntity supplier12 = new SupplierEntity();
        supplier12.setCompanyName("Company12");
        supplier12.setWebsiteName("www.Company12.com");
        supplier12.setLocation("India");
        supplier12.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier12.setManufacturingProcess(SupplierEntity.ManufacturingProcess.casting);

        SupplierEntity supplier13 = new SupplierEntity();
        supplier13.setCompanyName("Company13");
        supplier13.setWebsiteName("www.Company13.com");
        supplier13.setLocation("USA");
        supplier13.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier13.setManufacturingProcess(SupplierEntity.ManufacturingProcess._3d_printing);

        SupplierEntity supplier14 = new SupplierEntity();
        supplier14.setCompanyName("Company4");
        supplier14.setWebsiteName("www.Company4.com");
        supplier14.setLocation("Russia");
        supplier14.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.large_scale);
        supplier14.setManufacturingProcess(SupplierEntity.ManufacturingProcess.coating);

        SupplierEntity supplier15 = new SupplierEntity();
        supplier15.setCompanyName("Company15");
        supplier15.setWebsiteName("www.Company15.com");
        supplier15.setLocation("France");
        supplier15.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier15.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);

        SupplierEntity supplier16 = new SupplierEntity();
        supplier16.setCompanyName("Company16");
        supplier16.setWebsiteName("www.Company16.com");
        supplier16.setLocation("USA");
        supplier16.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier16.setManufacturingProcess(SupplierEntity.ManufacturingProcess.coating);

        SupplierEntity supplier17 = new SupplierEntity();
        supplier17.setCompanyName("Company17");
        supplier17.setWebsiteName("www.Company17.com");
        supplier17.setLocation("France");
        supplier17.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier17.setManufacturingProcess(SupplierEntity.ManufacturingProcess._3d_printing);

        SupplierEntity supplier18 = new SupplierEntity();
        supplier18.setCompanyName("Company18");
        supplier18.setWebsiteName("www.Company18.com");
        supplier18.setLocation("France");
        supplier18.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.medium_scale);
        supplier18.setManufacturingProcess(SupplierEntity.ManufacturingProcess.casting);

        SupplierEntity supplier19 = new SupplierEntity();
        supplier19.setCompanyName("Company19");
        supplier19.setWebsiteName("www.Company19.com");
        supplier19.setLocation("India");
        supplier19.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.large_scale);
        supplier19.setManufacturingProcess(SupplierEntity.ManufacturingProcess._3d_printing);

        SupplierEntity supplier20 = new SupplierEntity();
        supplier20.setCompanyName("Company20");
        supplier20.setWebsiteName("www.Company20.com");
        supplier20.setLocation("Russia");
        supplier20.setNatureOfBusiness(SupplierEntity.NatureOfBusiness.small_scale);
        supplier20.setManufacturingProcess(SupplierEntity.ManufacturingProcess.moduling);


        supplierRepository.saveAll(Arrays.asList(supplier1, supplier2, supplier3, supplier4, supplier5, supplier6, supplier7, supplier8, supplier9, supplier10, supplier11, supplier12, supplier13, supplier14, supplier15, supplier16, supplier17, supplier18, supplier19, supplier20));
    }
}
