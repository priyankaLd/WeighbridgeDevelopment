package com.weighbridge.gateuser.repositories;

import com.weighbridge.gateuser.entities.GateEntryTransaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.orm.jpa.JpaObjectRetrievalFailureException;

import java.time.LocalDate;
import java.util.List;

/**
 * Repository interface for accessing gate entry transaction data.
 */
public interface GateEntryTransactionRepository extends JpaRepository<GateEntryTransaction, Integer>, JpaSpecificationExecutor<GateEntryTransaction> {

    /**
     * Retrieves a list of gate entry transactions based on the specified site ID and company ID.
     *
     * @param siteId    The ID of the site to filter gate entry transactions.
     * @param companyId The ID of the company to filter gate entry transactions.
     * @return A list of gate entry transactions matching the provided site ID and company ID.
     */
    Page<GateEntryTransaction> findBySiteIdAndCompanyIdOrderByTicketNoDesc(String siteId, String companyId ,Pageable pageable);
    //Pagination get All user
    Page<GateEntryTransaction> findBySiteIdAndCompanyIdAndVehicleOutIsNull(Pageable pageable,String siteId, String companyId);

//    List<GateEntryTransaction> findBySiteIdAndCompanyIdOrderByTransactionDateDesc(String siteId, String companyId);

    // Modified method to find by siteId, companyId, and transactionDate within the specified range
    List<GateEntryTransaction> findBySiteIdAndCompanyIdAndTransactionDateBetweenOrderByTransactionDateDesc(String siteId, String companyId, LocalDate startDate, LocalDate endDate);

//    List<Object[]> findGateEntryTransactions(Long siteId, Long companyId, List<String> selectedFields);

    GateEntryTransaction findByTicketNo(Integer ticketNo);

    Integer countBySiteIdAndCompanyIdAndVehicleOutIsNull(String siteId, String companyId);
//    List<GateEntryTransaction> findBySiteIdAndCompanyId(String userSite, String userCompany);
}

