package com.download;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import com.download.CallBack;

public class DownloadUtils {
	public static void name(String path, CallBack callBack ) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					URL url = new URL(path);
					InputStream is = url.openStream();	
					
					StringBuffer sb = new StringBuffer();
					int len=-1;
					byte buf[] = new byte[256];
					while ((len = is.read(buf)) != -1) {
						sb.append( new String(buf, 0, len));
					}
					is.close();
					
					
					callBack.exe(sb.toString());
					System.out.println("****");
				} catch (IOException e) {
					e.printStackTrace();
				}
				
			}
		}).start();		
	}
}
