package com.download;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URL_Demo {
	public static void main(String[] args) throws Exception {

		String path = "http://baike.baidu.com/item/%E6%9D%8E%E6%9C%9D%E9%98%B3/58360#viewPageContent";
		DownloadUtils.name(path,
				new CallBack() {

					@Override
					public void exe(String string) {
						System.out.println(string);
					}
				});

	}
}
