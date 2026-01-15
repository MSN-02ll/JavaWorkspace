package com.kh.practice.network.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class ApiTest {

	public static void main(String[] args) {
		try {
			String serviceUrl = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc";
			String serviceKey = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMinuDustFrcstDspth";
			String stationName = URLEncoder.encode("종로구","UTF-8");
			String dataTerm = "DAILY";
			
			serviceUrl +="?serviceKey="+ serviceKey
						+"&stationName="+ stationName
						+"&dataTerm =" + dataTerm;
			
			URL url = new URL(serviceUrl);
			try(BufferedReader br = new BufferedReader(
					new InputStreamReader(url.openConnection()
							.getInputStream()))){
				String line = null;
				while((line = br.readLine()) !=null) {
					System.out.println(line);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}finally {
			
		}
	}
}

