package com.cxk.model.domain.response;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;


@Data
public class StatisticsByYearResponse {

    List<BigDecimal> incomeList;
    List<BigDecimal> expenseList;
}