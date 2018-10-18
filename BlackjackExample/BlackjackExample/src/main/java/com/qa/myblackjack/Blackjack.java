package com.qa.myblackjack;


public class Blackjack {

	public static void main(String[] args) {
}


	public int play(int player, int dealer) {
		if(player>21 && dealer>21) return 0;
		if(player<1 || dealer<1) return 0;
		if(player==dealer) return 0;
		if(player>21 || dealer>21) return 0;
		if((21-player)<=(21-dealer)) return player;
		if((21-player)>=(21-dealer)) return dealer;
		return 0;
	}
	
	
}