package com.marketplace.beans;

import org.springframework.stereotype.Component;

import com.marketplace.interfaces.Seller;

@Component
public class OnlineMarketplace {

	
	public OnlineMarketplace(Seller seller) {
		super();
		this.seller = seller;
	}

	private Seller seller;

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "OnlineMarketplace [seller=" + seller + "]";
	}
	
	
}
