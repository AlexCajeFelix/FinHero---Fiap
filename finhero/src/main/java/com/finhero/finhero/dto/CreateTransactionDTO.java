package com.finhero.finhero.dto;

import com.finhero.finhero.model.Transaction;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateTransactionDTO {
    
    @NotNull(message = "Tipo é obrigatório")
    private Transaction.TransactionType type;
    
    @NotNull(message = "Valor é obrigatório")
    @DecimalMin(value = "0.01", message = "Valor deve ser positivo")
    private BigDecimal amount;
    
    private String description;
    
    @NotNull(message = "Categoria é obrigatória")
    private Long categoryId;
}

