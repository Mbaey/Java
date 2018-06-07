package com.nwnu.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public interface Demo {
	int PAGE_SIZE=10;
	void fun1();
	default void fun2(){
		System.out.println("fun2");
	}
	static void fun3(){
		System.out.println("fun3");
	}

	public static void main(String[] args) {
		List<String> list = Arrays.asList("zhangsan","lisi","wanger","mazi");
		
		list.forEach(item->System.out.println(item));
		System.out.println();
		list.forEach(System.out::println);
		
		
		//将List中的每一个元素都加上_haha，再都变成大写，然后按字典降序输出
//		System.out.println();
//		list.sort(new Comparator<String>() {
//			@Override
//			public int compare(String arg0, String arg1) {
//				return arg0.compareTo(arg1);
//			}
//		});
//		list.forEach(System.out::println);
		
		System.out.println();
		list.stream().sorted((m,n)->m.compareTo(n))
			.forEach(System.out::println);
		
		System.out.println();
		list.stream().map(item->(item+"_haha").toUpperCase())
					.sorted((m,n)->m.compareTo(n))
					.forEach(System.out::println);
		
		System.out.println();
		//求List中所有元素的字符的个数
		 Integer string = list.stream()
				 .map(item->item.length())	//映射
				 .reduce((sum,item)->sum+item).get();	//规约
		 System.out.println(string);
		
		 System.out.println();
		 //過濾出長度大於4的元素
		 list.stream().filter(item->item.length()>4)
		 	.forEach(System.out::println);
		
		 //過濾出長度大於4的元素轉換成List
		 System.out.println();
		 List<String> collect = list.stream()
				 .filter(item->item.length()>4)
				 .collect(Collectors.toList());
		 System.out.println(collect);
		 
		 System.out.println();
		 //將List中的元素用#拼成字符串
		 String collect2 = list.stream().collect(Collectors.joining("#"));
		 System.out.println(collect2);
		 
		 System.out.println();
		  IntSummaryStatistics summaryStatistics = list.stream().map(item->item.length()).mapToInt(item->item).summaryStatistics();
		 System.out.println(summaryStatistics.getMax());
		 System.out.println(summaryStatistics.getMin());
		 System.out.println(summaryStatistics.getSum());
		 System.out.println(summaryStatistics.getAverage());
		  
		 
		 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
