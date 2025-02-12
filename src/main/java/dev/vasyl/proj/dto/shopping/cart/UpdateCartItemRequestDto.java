package dev.vasyl.proj.dto.shopping.cart;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Positive;

public record UpdateCartItemRequestDto(
        @Schema(description = "Operation increase(be default) quantity or decrease quantity",
                example = "INCREASE")
        CartItemOperation operation,
        @Schema(description = "quantity",
                example = "3")
        @Positive
        int quantity) {
}
