package MegaAssignment;

import java.util.Date;
import java.util.Scanner;

public class enumClass {
	static Scanner sc=new Scanner(System.in);
  public static void main(String []args) {

	  coinPosition cp=new coinPosition();
	  cp.setCoinPosition();
	  cp.getCoinPosition();
  }
}

enum Chesscoin{
	QUEEN_1_WHITE,
	QUEEN_1_BLACK,
	PAWNS_1_WHITE,
	PAWNS_1_BLACK,
	PAWNS_2_WHITE,
	PAWNS_2_BLACK,
	PAWNS_3_WHITE,
	PAWNS_3_BLACK,
	PAWNS_4_WHITE,
	PAWNS_4_BLACK,
	PAWNS_5_WHITE,
	PAWNS_5_BLACK,
	PAWNS_6_WHITE,
	PAWNS_6_BLACK,
	PAWNS_7_WHITE,
	PAWNS_7_BLACK,
	PAWNS_8_WHITE,
	PAWNS_8_BLACK,
	BISHOPS_1_WHITE,
	BISHOPS_1_BLACK,
	BISHOPS_2_WHITE,
	BISHOPS_2_BLACK,
	KNIGHTS_1_WHITE,
	kNIGHTS_1_BLACK,
	KNIGHTS_2_WHITE,
	kNIGHTS_2_BLACK,
	ROOKS_1_WHITE,
	ROCKS_1_BLACK,
	ROOKS_2_WHITE,
	ROCKS_2_BLACK,
	KING_1_WHITE,
	KING_1_BLACK
}

class coinPosition{
	int row;
	char column;
	Chesscoin coin;
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public char getColumn() {
		return column;
	}
	public void setColumn(char column) {
		this.column = column;
	}
	public Chesscoin getCoin() {
		return coin;
	}
	public void setCoin(Chesscoin coin) {
		this.coin = coin;
	}
	
	public void setCoinPosition() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coin name");
		String coinName=sc.next();
		System.out.println("Enter coin number");
		String coinNum=sc.next();
		System.out.println("Enter coin color");
		String coinColor=sc.next();
		
		String coinDetails=coinName+"_"+coinNum+"_"+coinColor;
		try {
			Chesscoin val=Chesscoin.valueOf(coinDetails);
			setCoin(val);
			System.out.println(val);
			System.out.println("enter row 1-8");
			int coinRow=sc.nextInt();
			System.out.println("enter column a-h");
			String coinColumn=sc.next();
			if(coinColumn.length()==1) {
				char ccolumn=coinColumn.charAt(0);
				if('a'<=ccolumn && ccolumn<='h' && 1<=coinRow && coinRow<=8) {
					setColumn(ccolumn);
					setRow(coinRow);
				}
			}
			
		}
		catch(Exception ex){
			System.out.println("Invalid coin");
		}
		
	}
    public void getCoinPosition() {
    	
		System.out.println("Column : "+getColumn());
		System.out.println("Row : "+getRow());
	}
	
}


enum bankAccount{
	Saving,
	credit,
	checkingAccounts,
}


class customer{
	String name;
	long phoneNum;
	String gender;
	String Address;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	
	public void userDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name");
		String userName=sc.next();
		setName(userName);
		System.out.println("Enter gender");
		String userGender=sc.next();
		setGender(userGender);
		System.out.println("Enter Address");
		String userAddress=sc.next();
		setAddress(userAddress);
		System.out.println("Enter phone number");
		long userPhone=sc.nextLong();
		setPhoneNum(userPhone);
		
	}
}


class Account{
	double minimumBalance;
	double currentBalance;
	Date lastTransactionDate;
	String branch;
	
//	public 
}

