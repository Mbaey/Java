package com.nwnu.OOPandFP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Test;

public class LambdaDemo {
	/**
	 * ����������������¼���������

�����Ǹ��ݹ�Ʊ����õ��ɼ���Ϣ��Ȼ�󽫹ɼ�ʵ��ŵ�һ���б�����С�
Ȼ��Լ��Ͻ���һ�α������õ����м۸����500��Ԫ�Ĺɼ�ʵ�塣
�Բ���2�еĽ�����б������õ�����ӵ����߹ɼ۵�ʵ�塣
��Ȼ���������ѭ���Ĵ���̫���ˣ�����Ҳ���Խ����Ǻϲ���һ��ѭ���У�
	 */
	@Test
	public void Commandfun1(){
		final List<StockInfo> stocks = new ArrayList<>();
		for(String symbol : Tickers.symbols) {
		    stocks.add(StockUtil.getPrice(symbol));
		}

		final List<StockInfo> stocksPricedUnder500 = new ArrayList<>();
		final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);
		for(StockInfo stock : stocks) {
		    if(isPriceLessThan500.test(stock))
		        stocksPricedUnder500.add(stock);
		}

		StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
		for(StockInfo stock : stocksPricedUnder500) {
		    highPriced = StockUtil.pickHigh(highPriced, stock);
		}

		System.out.println("High priced under $500 is " + highPriced);
	}
	
	@Test
	public void Commandfun2(){
		StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
		final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);

		for(String symbol : Tickers.symbols) {
		    StockInfo stockInfo = StockUtil.getPrice(symbol);
		    if(isPriceLessThan500.test(stockInfo))
		        highPriced = StockUtil.pickHigh(highPriced, stockInfo);
		}

		System.out.println("High priced under $500 is " + highPriced);
	}
	
	@Test
	public void FunctionProgramingfun1(){
		LambdaDemo.findHighPriced(Tickers.symbols.stream());
	}
	
	public static void findHighPriced(final Stream<String> symbols) {
		final StockInfo highPriced = symbols
				.map(StockUtil::getPrice)
				.filter(StockUtil.isPriceLessThan(500))
				.reduce(StockUtil::pickHigh)
				.get();
		
		System.out.println("High priced under $500 is " + highPriced);
	}
	
	
}
