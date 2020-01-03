package com.example.demo;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class TopTenScraper {
		
		Document doc;
		int weekNum;
		private String url;  
		
	public String[] getTopPassers(int week) throws IOException {
			String[] players = new String[12];
			weekNum = week;
			url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
			doc = Jsoup.connect(url).get();
			Elements passerTable = doc.select("#passer");
			Elements rows = passerTable.select("tr");
			
			for(int i = 0; i < rows.size(); i++) {
				Element row = rows.get(i);
				System.out.println(row.text());
				players[i] = row.text();
			}
			
			return players;
		}
		
		
	public String[] getTopRushers(int week) throws IOException {
		String[] players = new String[12];
		weekNum = week;
		url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
		doc = Jsoup.connect(url).get();
		Elements rusherTable = doc.select("#rusher");
		Elements rows = rusherTable.select("tr");
		
		for(int i = 0; i < rows.size(); i++) {
			Element row = rows.get(i);
			System.out.println(row.text());
			players[i] = row.text();
		}
		
		return players;
	}
		
	public String[] getTopReceivers(int week) throws IOException {
		String[] players = new String[12];
		weekNum = week;
		url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
		doc = Jsoup.connect(url).get();
		Elements receiverTable = doc.select("#receiver");
		Elements rows = receiverTable.select("tr");
		
		for(int i = 0; i < rows.size(); i++) {
			Element row = rows.get(i);
			System.out.println(row.text());
			players[i] = row.text();
		}
		
		return players;
	}
		
	public String[] getTopKickers(int week) throws IOException {
		String[] players = new String[12];
		weekNum = week;
		url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
		doc = Jsoup.connect(url).get();
		Elements kickingTable = doc.select("#kicker");
		Elements rows = kickingTable.select("tr");
		
		for(int i = 0; i < rows.size(); i++) {
			Element row = rows.get(i);
			System.out.println(row.text());
			players[i] = row.text();
		}
		
		return players;
	}
		
	public String[] getTopPunters(int week) throws IOException {
		String[] players = new String[12];
		weekNum = week;
		url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
		doc = Jsoup.connect(url).get();
		Elements punterTable = doc.select("#punter");
		Elements rows = punterTable.select("tr");
		
		for(int i = 0; i < rows.size(); i++) {
			Element row = rows.get(i);
			System.out.println(row.text());
			players[i] = row.text();
		}
		
		return players;
	}
		
	public String[] getTopSacks(int week) throws IOException {
		String[] players = new String[12];
		weekNum = week;
		url = "http://www.nfl.com/stats/weeklyleaders?week=" + weekNum + "&season=2019";
		doc = Jsoup.connect(url).get();
		Elements sacksTable = doc.select("#defensive");
		Elements rows = sacksTable.select("tr");
		
		for(int i = 0; i < rows.size(); i++) {
			Element row = rows.get(i);
			System.out.println(row.text());
			players[i] = row.text();
		}
		
		return players;
	}
}
