package com.weighbridge.management.services;

import com.weighbridge.management.dtos.WeightResponseForGraph;
import com.weighbridge.management.payload.AllTransactionResponse;
import com.weighbridge.management.payload.ManagementPayload;
import com.weighbridge.management.payload.MaterialProductDataResponse;
import com.weighbridge.management.payload.MaterialProductQualityResponse;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface ManagementDashboardService {
    MaterialProductDataResponse getMaterialProductBarChartData(ManagementPayload managementRequest);

    List<WeightResponseForGraph> getQtyResponseInGraph(ManagementPayload managementPayload,String transactionType);

    MaterialProductQualityResponse getMaterialProductQualities(ManagementPayload managementRequest);

    List<Map<String, Object>> managementGateEntryDashboard(ManagementPayload managementRequest);

    AllTransactionResponse getAllTransactionResponse(ManagementPayload managementPayload,String transactionType);
}