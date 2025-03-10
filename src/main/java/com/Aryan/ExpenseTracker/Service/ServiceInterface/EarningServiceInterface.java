package com.Aryan.ExpenseTracker.Service.ServiceInterface;

import com.Aryan.ExpenseTracker.DTO.EarningDTO;

import java.util.List;

public interface EarningServiceInterface {
    EarningDTO createEarning(EarningDTO earningDTO);
    EarningDTO getEarningById(Long id);
    List<EarningDTO> getAllEarnings();
    EarningDTO updateEarning(EarningDTO earningDTO, Long id);
    EarningDTO deleteEarning(Long id);

    List<EarningDTO> getEarningByUserId(Long userId);
}
