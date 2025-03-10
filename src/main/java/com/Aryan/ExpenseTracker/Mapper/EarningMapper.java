package com.Aryan.ExpenseTracker.Mapper;

import com.Aryan.ExpenseTracker.DTO.EarningDTO;
import com.Aryan.ExpenseTracker.Entity.Earning;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class EarningMapper {
    @Autowired
    private ModelMapper modelMapper;

    public Earning earningDTOtoEarning(EarningDTO earningDTO){
        Earning earning = modelMapper.map(earningDTO, Earning.class);
        return earning;
    }

    public EarningDTO earningToEarningDTO(Earning earning){
        EarningDTO earningDTO = modelMapper.map(earning, EarningDTO.class);
        return earningDTO;
    }


}
