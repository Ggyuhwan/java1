package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ApiJson {

	public static void main(String[] args) throws IOException, ParseException {
		// https://api.upbit.com/v1/market/all
		// coin 전체 정보(한글면, 영문, 거래코드)
		String mainUrl = "https://api.upbit.com/v1/market/all";
		// markets= <- 코드값 에 해당하는 실시간 상세정보
		String detailUrl = "https://api.upbit.com/v1/ticker?markets=KRW-BTC";

		// URL 클래스 원격자원에 접근
		URL url = new URL(mainUrl);
		HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();
		// 요청 방식 결정(get or post
		conn.setRequestMethod("GET");
		// 연결 타임 아웃 설정
		conn.setConnectTimeout(5000); // 5초
		// 읽기 타임 아웃 설정
		conn.setReadTimeout(5000); // 5초
		conn.setDoOutput(true); // 디폴트
		int responseCode = conn.getResponseCode(); // 응답에 따른 요청값 리턴
		// 정상응답. 체크
		if (responseCode == HttpsURLConnection.HTTP_OK) {
			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			// 내용이 없을때까지 버퍼에 담기
			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			System.out.println(response.toString());

			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(response.toString());
		}

	}

}
