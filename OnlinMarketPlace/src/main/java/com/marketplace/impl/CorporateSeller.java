package com.marketplace.impl;

import org.springframework.stereotype.Component;

import com.marketplace.interfaces.Seller;

@Component
public class CorporateSeller implements Seller{
	@Override
	public void addProduct() {
		System.out.println("Product added successfully from CorporateSeller");
		
	}

	@Override
	public void removeProduct() {
		System.out.println("Product removed successfully from CorporateSeller");
	}

	@Override
	public String toString() {
		return "CorporateSeller";
	}

	@Override
	public int calculateSales(int unitsSold) {
		
		return unitsSold*100;
	}

}
