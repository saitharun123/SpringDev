package com.marketplace.impl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.marketplace.interfaces.Seller;

@Component
@Primary
public class IndividualSeller implements Seller{

	@Override
	public void addProduct() {
		System.out.println("Product added successfully from individualSeller");
		
	}

	@Override
	public void removeProduct() {
		System.out.println("Product removed successfully from individualSeller");
	}

	@Override
	public String toString() {
		return "IndividualSeller";
	}

	@Override
	public int calculateSales(int unitsSold) {
		
		return unitsSold*100;
	}

}
