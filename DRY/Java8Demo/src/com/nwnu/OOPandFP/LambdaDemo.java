package com.nwnu.OOPandFP;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.Test;

public class LambdaDemo {
	/**
	 * 上述代码完成了以下几个工作：

首先是根据股票代码得到股价信息，然后将股价实体放到一个列表对象中。
然后对集合进行一次遍历，得到所有价格低于500美元的股价实体。
对步骤2中的结果进行遍历，得到其中拥有最高股价的实体。
当然，如果觉得循环的次数太多了，我们也可以将它们合并到一个循环中：
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
