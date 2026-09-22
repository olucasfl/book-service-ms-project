package br.com.lucas.book_service.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

public class ExchangeDto implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionFactor;
    private Double convertedValue;
    private String environment;

    public ExchangeDto() {
    }

    public ExchangeDto(Long id, String from, String to, BigDecimal conversionFactor,
                       Double convertedValue, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionFactor = conversionFactor;
        this.environment = environment;
        this.convertedValue = convertedValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getConversionFactor() {
        return conversionFactor;
    }

    public void setConversionFactor(BigDecimal conversionFactor) {
        this.conversionFactor = conversionFactor;
    }

    public Double getConvertedValue() {
        return convertedValue;
    }

    public void setConvertedValue(Double convertedValue) {
        this.convertedValue = convertedValue;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeDto exchangeDto = (ExchangeDto) o;
        return Objects.equals(id, exchangeDto.id) && Objects.equals(from, exchangeDto.from) && Objects.equals(to, exchangeDto.to) && Objects.equals(conversionFactor, exchangeDto.conversionFactor) && Objects.equals(convertedValue, exchangeDto.convertedValue) && Objects.equals(environment, exchangeDto.environment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, to, conversionFactor, convertedValue, environment);
    }
}
