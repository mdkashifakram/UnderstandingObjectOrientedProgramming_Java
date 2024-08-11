package com.UnderstandingOops.PlayerFunction;

import java.util.Scanner;

public class Team {
	private Player[] players;
	private int playerCount;
	
	public Team(int capacity) {
		players=new Player[capacity];
		playerCount=0;
				
	}

	public void addPlayer(Player player) {
		if(playerCount<players.length) {
			players[playerCount++]=player;
		}
		else {
			System.out.println("No more players can be added to the team");
		}
	}
	public int getTotalScore() {
		int scoreCount=0;
		for(int i=0;i<playerCount;i++) {
			scoreCount+=players[i].getScore();
		}
		return scoreCount;
	}
	public int getHighestScore() {
		int highestScore=0;
		for(int i=0;i<playerCount;i++) {
			if(players[i].getScore()>highestScore) {
			highestScore=players[i].getScore();	
			}
		}
		return highestScore;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Team team=new Team(5);
		Player p1=new Player("Kashif",40);
		Player p2=new Player("Jhon",120);
		Player p3=new Player("Alice",40);
		Player p4=new Player("Akram",20);
		
		team.addPlayer(p1);
		team.addPlayer(p2);
		team.addPlayer(p3);
		team.addPlayer(p4);
		System.out.println("Total Score of the team : "+team.getTotalScore());
		System.out.println("Highest score is  : "+team.getHighestScore());
	}

}
