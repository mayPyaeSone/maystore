package com.packt.maystore.domain;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {
	@Getter
	@Setter
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String productId;
	@Getter
	@Setter
	private String name;
	@Getter
	@Setter
	private BigDecimal unitPrice;
	@Getter
	@Setter
	private String description;
	@Getter
	@Setter
	private String manufacturer;
	@Getter
	@Setter
	private String category;
	@Getter
	@Setter
	private long unitsInStock;
	@Getter
	@Setter
	private long unitsInOrder;
	@Getter
	@Setter
	private boolean discontinued;
	@Getter
	@Setter
	private String condition;
	@Override
	public int hashCode() {
		return Objects.hash(category, condition, description, discontinued, manufacturer, name, productId, unitPrice,
				unitsInOrder, unitsInStock);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(condition, other.condition)
				&& Objects.equals(description, other.description) && discontinued == other.discontinued
				&& Objects.equals(manufacturer, other.manufacturer) && Objects.equals(name, other.name)
				&& Objects.equals(productId, other.productId) && Objects.equals(unitPrice, other.unitPrice)
				&& unitsInOrder == other.unitsInOrder && unitsInStock == other.unitsInStock;
	}
	
}
