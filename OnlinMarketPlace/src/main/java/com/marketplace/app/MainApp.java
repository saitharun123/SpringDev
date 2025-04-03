package com.marketplace.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.marketplace.beans.OnlineMarketplace;
import com.marketplace.config.ProjectConfig;
import com.marketplace.impl.WholesaleSeller;
import com.marketplace.interfaces.Seller;

public class MainApp {

public static void main(String[] args) {
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
	
	OnlineMarketplace market = context.getBean(OnlineMarketplace.class);
	
//	market.setSeller(new WholesaleSeller());
	market.getSeller().addProduct();
	market.getSeller().removeProduct();
	System.out.println("Total Sales Made by "+market.getSeller()+" : "+market.getSeller().calculateSales(400));
}
}
