package com.ntg.wineservice.web.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WineDto {
    private String name;
    private WineStyle wineStyle;
    private String upc;
    private int quantityOnHand;
    private BigDecimal price;
}
