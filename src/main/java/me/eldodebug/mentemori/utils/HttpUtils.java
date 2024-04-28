package me.eldodebug.mentemori.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class HttpUtils {

	public static String readResponse(String url, Map<String, String> headers) {

		try {
			HttpURLConnection connection = setupConnection(url, "Mozilla/5.0", 5000, false);

			if (headers != null) {
				for (String header : headers.keySet()) {
					connection.addRequestProperty(header, headers.get(header));
				}
			}

			InputStream is = connection.getResponseCode() != 200 ? connection.getErrorStream()
					: connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is, StandardCharsets.UTF_8));

			return readResponse(rd);
		} catch (IOException e) {
		}

		return null;
	}

	private static String readResponse(BufferedReader br) {

		try {
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				sb.append(line);
			}

			return sb.toString();
		} catch (IOException e) {
		}

		return null;
	}

	public static HttpURLConnection setupConnection(String url, String userAgent, int timeout, boolean useCaches) {

		try {
			HttpURLConnection connection = ((HttpURLConnection) new URL(url).openConnection());

			connection.setRequestMethod("GET");
			connection.setUseCaches(useCaches);
			connection.addRequestProperty("User-Agent", userAgent);
			connection.setRequestProperty("Accept-Language", "en-US");
			connection.setRequestProperty("Accept-Charset", "UTF-8");
			connection.setReadTimeout(timeout);
			connection.setConnectTimeout(timeout);
			connection.setDoOutput(true);

			return connection;
		} catch (Exception e) {
		}

		return null;
	}
}
