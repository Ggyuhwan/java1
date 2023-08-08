package ch11_java_api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;

import javax.net.ssl.HttpsURLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
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
			
			for(Object Object: jsonArray) {
				JSONObject jsonObj = (JSONObject) Object;
				System.out.println("Market: " + jsonObj.get("market"));
				System.out.println("korean_name: " + jsonObj.get("korean_name"));
				System.out.println("english_name: " + jsonObj.get("english_name"));
			}
			System.out.println(getCoin("KRW-BTC"));
		}

	}
	public static JSONObject getCoin(String market) {
		JSONObject jsonObj = null;
		try {
			URL url = new URL("https://api.upbit.com/v1/ticker?markets="+market);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader in = new BufferedReader(
					new InputStreamReader(conn.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();
			while((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			in.close();
			JSONParser parser = new JSONParser();
			JSONArray jsonArray = (JSONArray) parser.parse(response.toString());
			jsonObj = (JSONObject) jsonArray.get(0);
			System.out.println("trade date:" + jsonObj.get("trade_date"));
			System.out.println("trade price:" + jsonObj.get("trade_price"));
			//과학적 표기법으로 표현된 숫자 3.8515E7 <--E에 오는숫자는 10의 지수를 나타냄
			// 3.8515 * 10^7 을 의미함 따라서 실제 값은 38515000 을 의미함
			DecimalFormat decimalFormat = new DecimalFormat("#");
			decimalFormat.setMaximumFractionDigits(0); // 소수점 이하 0으로
			System.out.println("trade_price:"
					+ decimalFormat.format(jsonObj.get("trade_price")));
					
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return jsonObj;
	}
}
