package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.web.bind.annotation.RequestMapping;

public class Test {
	public static void main(String[] args) throws FileNotFoundException {
		
		List<TopTenList> players = new ArrayList<>();

			 List<TopTenList> playerList = new ArrayList<TopTenList>();
		      Scanner sc = new Scanner(new File("fantasyscores.csv"));
		      while(sc.hasNext()) {
		    	  playerList.add(new TopTenList(sc.next()));
		      }
			 /*
			  playerList.add(new Player("Patrick", "Mahomes", "Kansas City Chiefs"));
		      playerList.add(new Player("Saquon",  "Barkley", "New York Giants"));
		      playerList.add(new Player("Nick",    "Chubb",   "Cleveland Browns"));
		      playerList.add(new Player("Mike",    "Evans",   "Tampa Bay Buccaneers"));
		      playerList.add(new Player("Cooper",  "Cupp",    "St. Louis Rams"));
		      */
		      sc.close();
		      for(int i =0; i < 10; i++) {
		      System.out.println(playerList.get(i));
		      }
		}
		
}
