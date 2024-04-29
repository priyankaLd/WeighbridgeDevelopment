package com.weighbridge.admin.repsitories;

import com.weighbridge.admin.entities.SupplierMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SupplierMasterRepository extends JpaRepository<SupplierMaster,Long> {


    boolean existsBySupplierContactNoOrSupplierEmail(String emailId, String contactNo);

    SupplierMaster findBySupplierName(String supplierName);

    @Query("SELECT s.supplierId FROM SupplierMaster s WHERE s.supplierName = :supplierName")
    Long findSupplierIdBySupplierName(@Param("supplierName") String supplierName);

    @Query("SELECT s.supplierName,s.supplierAddressLine1 from SupplierMaster s where s.supplierId =:supplierId")
    Object[] findSupplierNameBySupplierId(@Param("supplierId") long supplierId);

    @Query("SELECT s.supplierAddressLine1,s.supplierAddressLine2 from SupplierMaster s where s.supplierName =:supplierName")
    String findSupplierAddressBySupplierName(@Param("supplierName") String supplierName);
}