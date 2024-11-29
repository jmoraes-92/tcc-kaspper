package com.orcamentos.kaspper.model.enums;

public enum StatusDemanda {
    EM_ANALISE,
    EM_DESENVOLVIMENTO,
    CONCLUIDA;

    public static StatusDemanda fromString(String value) {
        for (StatusDemanda status : values()) {
            if (status.name().equalsIgnoreCase(value)) {
                return status;
            }
        }
        throw new IllegalArgumentException("Status inválido: " + value);
    }
}
