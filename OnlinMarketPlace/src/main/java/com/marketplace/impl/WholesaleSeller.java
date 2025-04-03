package com.marketplace.impl;

import org.springframework.stereotype.Component;

import com.marketplace.interfaces.Seller;

@Component
public class WholesaleSeller implements Seller{

	@Override
	public void addProduct() {
		System.out.println("Product added successfully from wholesaleSeller");
		
	}

	@Override
	public void removeProduct() {
		System.out.println("Product removed successfully from wholesaleSeller");
	}

	@Override
	public String toString() {
		return "WholesaleSeller";
	}

	@Override
	public int calculateSales(int unitsSold) {
		
		return unitsSold*100;
	}
}
