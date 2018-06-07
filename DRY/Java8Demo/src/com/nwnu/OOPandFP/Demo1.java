package com.nwnu.OOPandFP;

import java.math.BigDecimal;
import java.util.stream.Collectors;

public class Demo1 {
	public static void main(String[] args) {
		final BigDecimal HUNDRED = new BigDecimal("100");
		
		System.out.println("Stocks priced over $100 are " +
		Tickers.symbols
		.stream()
		.filter(symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
		.sorted()
//		.map(symbol ->symbol.toString() )
		.collect(Collectors.joining(", ") ));
	}
}

