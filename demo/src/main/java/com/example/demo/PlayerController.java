package com.example.demo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.TopTenList;
import com.example.demo.TopTenScraper;
@RestController
public class PlayerController {
	
	List<TopTenList> players = new ArrayList<>();
	TopTenScraper tts;
	
	@RequestMapping("/topPassers")
	public List<String> getPassers() throws IOException{	
		List<String> playerList = new ArrayList<>();
		tts = new TopTenScraper();
		String[] s = tts.getTopPassers(1);
		
	    for(int i = 0; i < s.length; i++) {
	    	playerList.add(s[i]);  
	    }
	    return playerList;
     
	}
	
	@RequestMapping("/topRushers")
	public List<String> getRushers() throws IOException{	
		List<String> playerList = new ArrayList<String>();
		tts = new TopTenScraper();
		String[] s = tts.getTopRushers(1);
		
	    for(int i = 0; i < s.length; i++) {
	    	playerList.add(s[i]);  
	    }
	    return playerList;   
	}
	
	@RequestMapping("/topReceivers")
	public List<TopTenList> getReceivers() throws IOException{	
		List<TopTenList> playerList = new ArrayList<TopTenList>();
		tts = new TopTenScraper();
		String s = tts.getTopReceivers(2);
		
	    playerList.add(new TopTenList(s));  
	    return playerList;
     
	}
	
	@RequestMapping("/topKickers")
	public List<TopTenList> getKickers() throws IOException{	
		List<TopTenList> playerList = new ArrayList<TopTenList>();
		tts = new TopTenScraper();
		String s = tts.getTopKickers(2);
		
	    playerList.add(new TopTenList(s));  
	    return playerList;
     
	}
	
	@RequestMapping("/topPunters")
	public List<TopTenList> getPunters() throws IOException{	
		List<TopTenList> playerList = new ArrayList<TopTenList>();
		tts = new TopTenScraper();
		String s = tts.getTopPunters(2);
		
	    playerList.add(new TopTenList(s));  
	    return playerList;
     
	}
	
	@RequestMapping("/topSacks")
	public List<TopTenList> getSacks() throws IOException{	
		List<TopTenList> playerList = new ArrayList<TopTenList>();
		tts = new TopTenScraper();
		String s = tts.getTopSacks(2);
		
	    playerList.add(new TopTenList(s));  
	    return playerList;
     
	}
	
	
	
}
