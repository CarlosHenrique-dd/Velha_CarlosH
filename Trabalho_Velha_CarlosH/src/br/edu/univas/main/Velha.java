package br.edu.univas.main;

import java.util.Scanner;

public class Velha {
	static int tab[][] = {{9,9,9},{9,9,9},{9,9,9}};
	static String a0= " ",a1=" ",a2=" ",b0=" ",b1=" ",b2=" ",c0=" ",c1=" ",c2=" ";
	static String pla1,pla2,ps1,ps2;
	static int para=9;static int cont = 0,rep = 0;
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[]args) {
		
		
		System.out.println("Nome Player 1?");
		pla1 = sc.next();
		System.out.println("Nome Player 2?");
		pla2 = sc.next();
		
		do {if(para!=9) {para=9;}
		for (rep=0;rep<10;rep++) {
			System.out.println("   A"+"   B"+"   C");	
			System.out.println("1 _"+a0+"_|_"+a1+"_|_"+a2+"_");
			System.out.println("2 _"+b0+"_|_"+b1+"_|_"+b2+"_");
			System.out.println("3  "+c0+" | "+c1+" | "+c2    );
			System.out.println();
			
			resultado();if(para==1||para==0) {break;}
			
			if(rep==0||rep==2||rep==4||rep==6||rep==8) {System.out.println("VEZ DO(A) "+pla1+".");ps1 = sc.next();player1(ps1);}
			if(rep==1||rep==3||rep==5||rep==7)		   {System.out.println("VEZ DO(A) "+pla2+".");ps2 = sc.next();player2(ps2);}
			
			
		}continua();rep=0;
		}while(cont==1);}
	
	public static void player1(String xx) {
		if(xx.contains("1a")){tab[0][0] = 1;a0="X";}
		if(xx.contains("1b")){tab[0][1] = 1;a1="X";}
		if(xx.contains("1c")){tab[0][2] = 1;a2="X";}
		if(xx.contains("2a")){tab[1][0] = 1;b0="X";}
		if(xx.contains("2b")){tab[1][1] = 1;b1="X";}
		if(xx.contains("2c")){tab[1][2] = 1;b2="X";}
		if(xx.contains("3a")){tab[2][0] = 1;c0="X";}
		if(xx.contains("3b")){tab[2][1] = 1;c1="X";}
		if(xx.contains("3c")){tab[2][2] = 1;c2="X";}
	}
	public static void player2(String yy) {
		if(yy.contains("1a")){tab[0][0] = 0;a0="O";}
		if(yy.contains("1b")){tab[0][1] = 0;a1="O";}
		if(yy.contains("1c")){tab[0][2] = 0;a2="O";}
		if(yy.contains("2a")){tab[1][0] = 0;b0="O";}
		if(yy.contains("2b")){tab[1][1] = 0;b1="O";}
		if(yy.contains("2c")){tab[1][2] = 0;b2="O";}
		if(yy.contains("3a")){tab[2][0] = 0;c0="O";}
		if(yy.contains("3b")){tab[2][1] = 0;c1="O";}
		if(yy.contains("3c")){tab[2][2] = 0;c2="O";}
	}
	
	public static void resultado() {

				if(tab[0][0]==1 && tab[0][1]==1 && tab[0][2]==1 ||
				   tab[1][0]==1 && tab[1][1]==1 && tab[1][2]==1 ||
				   tab[2][0]==1 && tab[2][1]==1 && tab[2][2]==1 ||
				   tab[0][0]==1 && tab[1][0]==1 && tab[2][0]==1 ||
				   tab[0][1]==1 && tab[1][1]==1 && tab[2][1]==1 ||
				   tab[0][2]==1 && tab[1][2]==1 && tab[2][2]==1 ||
				   tab[0][0]==1 && tab[1][1]==1 && tab[2][2]==1 ||
				   tab[2][0]==1 && tab[1][1]==1 && tab[0][2]==1 ) {System.out.println(pla1+" VENCEU.");para = 1;}
				
				if(tab[0][0]==0 && tab[0][1]==0 && tab[0][2]==0 ||
				   tab[1][0]==0 && tab[1][1]==0 && tab[1][2]==0 ||
				   tab[2][0]==0 && tab[2][1]==0 && tab[2][2]==0 ||
				   tab[0][0]==0 && tab[1][0]==0 && tab[2][0]==0 ||
				   tab[0][1]==0 && tab[1][1]==0 && tab[2][1]==0 ||
				   tab[0][2]==0 && tab[1][2]==0 && tab[2][2]==0 ||
				   tab[0][0]==0 && tab[1][1]==0 && tab[2][2]==0 ||
				   tab[2][0]==0 && tab[1][1]==0 && tab[0][2]==0 ) {System.out.println(pla2+" VENCEU.");para = 0;}
				
				if(tab[0][0]!=9&&tab[0][1]!=9&&tab[0][2]!=9&&
				   tab[1][0]!=9&&tab[1][1]!=9&&tab[1][2]!=9&&
				   tab[2][0]!=9&&tab[2][1]!=9&&tab[2][2]!=9&&para!=1&&para!=0) {System.out.println("DEU VELHA.");}
				
				
	}
	public static void continua() {
		System.out.println("Deseja continuar jogando?");
		System.out.println("1-SIM  2-NÃO");
		int con = sc.nextInt();
		
	if(con == 1) {cont = 1;tab[0][0]=9;tab[0][1]=9;tab[0][2]=9;
						   tab[1][0]=9;tab[1][1]=9;tab[1][2]=9;
						   tab[2][0]=9;tab[2][1]=9;tab[2][2]=9;
	a0= " ";a1=" ";a2=" ";b0=" ";b1=" ";b2=" ";c0=" ";c1=" ";c2=" ";rep=0;}
	
	if(con == 2) {sc.close();}}
	}
