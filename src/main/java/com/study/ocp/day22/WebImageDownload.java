package com.study.ocp.day22;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class WebImageDownload {

	public static void main(String[] args) {
		String sourcePath = "https://img.strategy.style/2022/03/1646292285-3be433a179f12483196c5d9b9da1d9dc-840x525.jpg";
		String destPath = "src\\main\\java\\com\\study\\ocp\\day22\\files\\su27.jpg";
		try(InputStream is = getImageStream(sourcePath);
			FileOutputStream fos = new FileOutputStream(destPath);) {
			
			byte[] buffer = new byte[1];
			while(is.read(buffer) != -1) {
				fos.write(buffer);
			}
			System.out.println("Download OK!");
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private static InputStream getImageStream(String sourcePath) throws IOException {
		URL url = new URL(sourcePath);
		return url.openStream();
	}

}
