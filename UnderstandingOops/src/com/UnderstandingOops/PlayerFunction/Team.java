package com.UnderstandingOops.PlayerFunction;
import java.util.Scanner;

public class Team {
	Player[] players;
	int countPlayer;
	public Team(int capacity) {
		players=new Player[capacity];
		countPlayer=0;
	}
	public void addPlayers(Player player) {
		if(countPlayer<players.length) {
			players[countPlayer++]=player;
		}
	}

	public int getTotalMarks() {
		int fullmarks=0;
		for(int i=0;i<countPlayer;i++) {
			fullmarks+=players[i].getScore();
		}
		return fullmarks;
	}
	public int getHighestMarks() {
		int highestmarks=0;
		for(int i=0;i<countPlayer;i++) {
			if(players[i].getScore()>highestmarks) {
				highestmarks=players[i].getScore();
			}
		}
		return highestmarks;
	}
	
	
	public static void main(String[] args) {
		Team team=new Team(5);
		
		Player p1=new Player("Kashif",10);
		Player p2=new Player("Sam",20);
		Player p3=new Player("Tista",30);
		Player p4=new Player("Sajid",40);
		Player p5=new Player("Akram",35);
		team.addPlayers(p1);
		team.addPlayers(p2);
		team.addPlayers(p3);
		team.addPlayers(p4);
		team.addPlayers(p5);
		
		System.out.println("The Total Marks of the team is : "+team.getTotalMarks());
		System.out.println("The highest marks among the players: "+team.getHighestMarks());
		}

}
