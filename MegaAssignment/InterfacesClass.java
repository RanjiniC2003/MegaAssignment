package MegaAssignment;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;



enum employeeType{
	Commission,
	Hourty,
	BasePlusCommission,
	Salaried
	
	
}

public class InterfacesClass {
	
   static Scanner sc=new Scanner(System.in);
	public static void main(String []args) {
		
		System.out.println("1---> payable");
		System.out.println("2---> Calculator");
		System.out.println("3---> Communication");
		System.out.println("4---> Room booking");
		int choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter Commission");
			System.out.println("Enter Hourty");
			System.out.println("Enter Salaried");
			System.out.println("Enter BasePlusCommission");

			String input1=sc.next();
			employeeType val=employeeType.valueOf(input1);
//			System.out.println(val);
			switch(val) {
			case Commission:
				System.out.println("enter grossSales");
				double grossSales=sc.nextDouble();
				System.out.println("enter commission rate");
				double commissionRate=sc.nextDouble();
				CommissionEmployee commissionEmp=new CommissionEmployee(grossSales,commissionRate);
				System.out.println("Commission employee : "+commissionEmp.getPaymentAmount());
				
				break;
			case Hourty:
				System.out.println("enter wage");
				double wage=sc.nextDouble();
				System.out.println("enter hours");
				double hours=sc.nextDouble();
				HourtyEmployee hourtyEmployee=new HourtyEmployee(wage,hours);
				System.out.println("HourtyEmployee : "+hourtyEmployee.getPaymentAmount());
			    break;
			case Salaried:
				System.out.println("enterweakly Salary");
				double weaklySalary=sc.nextDouble();
				SalariedEmployee salariedEmployee=new SalariedEmployee(weaklySalary);
				System.out.println("SalariedEmployee : "+salariedEmployee.getPaymentAmount());
				break;
			case BasePlusCommission:
				System.out.println("enter baseSalary");
				double baseSalary=sc.nextDouble();
				System.out.println("enter gross sales");
				double grossSaless=sc.nextDouble();
				System.out.println("enter commission rate");
				double commissionRates=sc.nextDouble();
				BasePlusCommissionEmployee basePlusCommissionEmployee=new BasePlusCommissionEmployee(baseSalary,grossSaless,commissionRates);
				System.out.println("BasePlusCommissionEmployee : "+basePlusCommissionEmployee.getPaymentAmount());
				break;
			default:
				break;
		     }	
		    break;
		case 2:
			System.out.println("Enter BasicCalculator");
			System.out.println("Enter PercentageCalculator");
			System.out.println("Enter DecimalCalculator");
			String input2=sc.next();
			calculator val1=calculator.valueOf(input2);
			switch(val1) {
			case BasicCalculator:
				System.out.println("enter num1");
				double num1=sc.nextDouble();
				System.out.println("enter num2");
				double num2=sc.nextDouble();
				BasicCalculator basicCalculator=new BasicCalculator(num1, num2);
				System.out.println("BasicCalculator sumOfTwoNumbers : "+basicCalculator.sumOfTwoNumbers());
				System.out.println("BasicCalculator productOfTwoNumbers : "+basicCalculator.productOfTwoNumbers());
				System.out.println("BasicCalculator divisionOfTwoNumbers : "+basicCalculator.divisionOfTwoNumbers());
				break;
			case PercentageCalculator:
				System.out.println("enter num1");
				double num11=sc.nextDouble();
				System.out.println("enter num2");
				double num22=sc.nextDouble();
				PercentageCalculator percentageCalculator=new PercentageCalculator(num11, num22);
				System.out.println("PercentageCalculator sumOfTwoNumbers : "+percentageCalculator.sumOfTwoNumbers());
				System.out.println("PercentageCalculator productOfTwoNumbers : "+percentageCalculator.productOfTwoNumbers());
				System.out.println("PercentageCalculator divisionOfTwoNumbers : "+percentageCalculator.divisionOfTwoNumbers());
				break;
			case DecimalCalculator:
				System.out.println("enter num1");
				double num111=sc.nextDouble();
				System.out.println("enter num2");
				double num222=sc.nextDouble();
				DecimalCalculator decimalCalculator=new DecimalCalculator(num111, num222);
				System.out.println("decimalCalculator sumOfTwoNumbers : "+decimalCalculator.sumOfTwoNumbers());
				System.out.println("decimalCalculator productOfTwoNumbers : "+decimalCalculator.productOfTwoNumbers());
				System.out.println("decimalCalculator divisionOfTwoNumbers : "+decimalCalculator.divisionOfTwoNumbers());
				break;
				
			default:
				break;
			}
			break;
			
		case 3:
			System.out.println("Enter Whatsapp");
			System.out.println("Enter Email");
			System.out.println("Enter Cliq");
			
			String input3=sc.next();
			communication val3=communication.valueOf(input3);
			switch(val3) {
			case Whatsapp:
				whatsapp whatsapp=new whatsapp();
				whatsapp.fetchNeccessaryInputs();
				whatsapp.sendMassage();
				break;
			case Email:
				Email email=new Email();
				email.fetchNeccessaryInputs();
				email.sendMassage();
				break;
			case Cliq:
				CliqMassage cliq=new CliqMassage();
				cliq.fetchNeccessaryInputs();
				cliq.sendMassage();
				break;
			default:
				break;
			}
			
			break;
			
		case 4:
			System.out.println("enter Economy");
			System.out.println("enter Deluxe");
			System.out.println("enter superDeluxe");
		    
			String input4=sc.next();
			roomBooking rb=roomBooking.valueOf(input4);
			switch(rb) {
			case Economy:
				Economy e=new Economy();
				e.fetchNeccessaryInputs();
				e.fetchMatchingDetails();
				e.BookAndLetKnow();
				break;
			case Deluxe:
				Deluxe d=new Deluxe();
				d.fetchNeccessaryInputs();
				d.fetchMatchingDetails();
				d.BookAndLetKnow();
				break;
			case superDeluxe:
				superDeluxe sd=new superDeluxe();
				sd.fetchNeccessaryInputs();
				sd.fetchMatchingDetails();
				sd.BookAndLetKnow();
				break;
			default:
				break;
			}
			break;
		}
			
	}
}
//.............................................1.............................................

interface payable {
	double getPaymentAmount();
}


abstract class Employee implements payable{
	private String firstname;
	private String secondname;
	private String socialSecurityNumber;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	
	
}



class invoice implements payable{
	private String partNumber;
	private String partDescription;
	private int quantity;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}
	private double pricePerItem;
	@Override
	public double getPaymentAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
	


}
class CommissionEmployee extends Employee{
		private double grossSales;
		private double commissionRate;
		
		CommissionEmployee(double grossSales,double commisionRate){
			this.grossSales=grossSales;
			this.commissionRate=commisionRate;
		}
		
		public double getGrossSales() {
			return grossSales;
		}
		public void setGrossSales(double grossSales) {
			this.grossSales = grossSales;
		}
		public double getCommissionRate() {
			return commissionRate;
		}
		public void setCommissionRate(double commissionRate) {
			this.commissionRate = commissionRate;
		}
		@Override
		public double getPaymentAmount() {
			double amount=getGrossSales()-getCommissionRate();
			// TODO Auto-generated method stub
			return amount;
		}
	}
	
	class HourtyEmployee extends Employee{
		private double wage;
		private double hours;
		public HourtyEmployee(double wage,double hours) {
			// TODO Auto-generated constructor stub
			this.wage=wage;
			this.hours=hours;
		}
		public double getWage() {
			return wage;
		}
		public void setWage(double wage) {
			this.wage = wage;
		}
		public double getHours() {
			return hours;
		}
		public void setHours(double hours) {
			this.hours = hours;
		}
		@Override
		public double getPaymentAmount() {
			// TODO Auto-generated method stub
			double amount=getWage()*getHours();
			return amount;
		}
	}
	
	
	class SalariedEmployee extends Employee{
		private double weeklySalary;
		public SalariedEmployee(double weeklySalary) {
			// TODO Auto-generated constructor stub\
			this.weeklySalary=weeklySalary;
		}
		public double getWeeklySalary() {
			return weeklySalary;
		}

		public void setWeeklySalary(double weeklySalary) {
			this.weeklySalary = weeklySalary;
		}

		@Override
		public double getPaymentAmount() {
			// TODO Auto-generated method stub
			double amount=getWeeklySalary();
			return amount;
		}
	}
	
	class BasePlusCommissionEmployee extends CommissionEmployee{
		
		private double baseSalary;
		BasePlusCommissionEmployee(double grossSales,double commisionRate,double baseSalary){
			super(grossSales,commisionRate);
			this.baseSalary=baseSalary;
		}

		public double getBaseSalary() {
			return baseSalary;
		}

		public void setBaseSalary(double baseSalary) {
			this.baseSalary = baseSalary;
		}
		@Override
		public double getPaymentAmount() {
			// TODO Auto-generated method stub
			double amount=getBaseSalary()+(getGrossSales()*getCommissionRate());
			return amount;
		}
	}
	

//..................................................2............................................
interface Calculator{
	double sumOfTwoNumbers();
	double productOfTwoNumbers();
	double divisionOfTwoNumbers();
}

enum calculator{
	BasicCalculator,
	PercentageCalculator,
	DecimalCalculator
	
}

class BasicCalculator implements Calculator{

	double num1;
	double num2;
	BasicCalculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	@Override
	public double sumOfTwoNumbers() {
		// TODO Auto-generated method stub
		return getNum1()+getNum2();
	}

	@Override
	public double productOfTwoNumbers() {
		// TODO Auto-generated method stub
		return getNum1()*getNum2();
	}

	@Override
	public double divisionOfTwoNumbers() {
		// TODO Auto-generated method stub
		return getNum1()/getNum2();
	}
	
}


class PercentageCalculator implements Calculator{
	double num1;
	double num2;
	PercentageCalculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	@Override
	public double sumOfTwoNumbers() {
		// TODO Auto-generated method stub
		return (getNum1()+getNum2())/100;
	}

	@Override
	public double productOfTwoNumbers() {
		// TODO Auto-generated method stub
		return (getNum1()*getNum2())/100;
	}

	@Override
	public double divisionOfTwoNumbers() {
		// TODO Auto-generated method stub
		return (getNum1()/getNum2())/100;
	}
	
}


class DecimalCalculator implements Calculator{
	double num1;
	double num2;
	DecimalCalculator(double num1,double num2){
		this.num1=num1;
		this.num2=num2;
	}
	

	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	@Override
	public double sumOfTwoNumbers() {
		// TODO Auto-generated method stub
		double add=getNum1()+getNum2();
		BigDecimal bd=new BigDecimal(add).setScale(2,RoundingMode.HALF_UP);
		double newVal=bd.doubleValue();
		return newVal;
	}
	@Override
	public double productOfTwoNumbers() {
		// TODO Auto-generated method stub
		double add=getNum1()*getNum2();
		BigDecimal bd=new BigDecimal(add).setScale(2,RoundingMode.HALF_UP);
		double newVal=bd.doubleValue();
		return newVal;
	}
	

	@Override
	public double divisionOfTwoNumbers() {
		// TODO Auto-generated method stub
		double add=getNum1()/getNum2();
		BigDecimal bd=new BigDecimal(add).setScale(2,RoundingMode.HALF_UP);
		double newVal=bd.doubleValue();
		return newVal;
	}
	
}



//..........................................3.................................................

enum communication{
	Whatsapp,
	Email,
	Cliq
}

interface Communication{
	void fetchNeccessaryInputs();
	void sendMassage();
}

class whatsapp implements Communication{
    long phoneNum;
    String massage;
    
    
  
	public long getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(long phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	@Override
	public void fetchNeccessaryInputs() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter phone number");
		int phoneNumber=sc.nextInt();
		setPhoneNum(phoneNumber);
		System.out.println("enter massage");
		String sentMassage=sc.next();
		setMassage(sentMassage);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendMassage() {
		// TODO Auto-generated method stub
		System.out.println("Massage sent \n massage : "+getMassage());
		
	}
	
}


class Email implements Communication{
    String fromAddress;
    String toAddress;
    String subject;
    String massage;
    
	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	@Override
	public void fetchNeccessaryInputs() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter From address");
		String efa=sc.next();
		setFromAddress(efa);
		System.out.println("enter to address");
		String eta=sc.next();
		setToAddress(eta);
		System.out.println("enter subject");
		String sub=sc.next();
		setSubject(sub);
		System.out.println("enter massage");
		String sentMassage=sc.next();
		setMassage(sentMassage);
		
	}

	@Override
	public void sendMassage() {
		System.out.println("Email sent \n From address : "+getFromAddress()+"\n To address : "+getToAddress()+"\n Subject : "+getSubject()+"\n Massage : "+getMassage());
		// TODO Auto-generated method stub
		
	}
	
}


class CliqMassage implements Communication{
    String mail;
    String massage;
    
	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMassage() {
		return massage;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	@Override
	public void fetchNeccessaryInputs() {
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter reciplent mail");
		String remail=sc.next();
		setMail(remail);
		System.out.println("enter massage");
		String sentMassage=sc.next();
		setMassage(sentMassage);
		
	}

	@Override
	public void sendMassage() {
		// TODO Auto-generated method stub
		System.out.println("Massage sent \n reciplent mail : "+getMail()+"\n massage : "+getMassage());
	
	}
	
}



//..............................................4...............................................

interface RoomBooking {
	void fetchNeccessaryInputs();
	void fetchMatchingDetails();
	void BookAndLetKnow();
}

enum roomBooking{
	Economy,
	Deluxe,
	superDeluxe
}

class Economy implements RoomBooking{
    String cotType;
    int RoomNum;
    String address;
	public String getCotType() {
		return cotType;
	}

	public void setCotType(String cotType) {
		this.cotType = cotType;
	}

	public int getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void fetchNeccessaryInputs() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cot type");
		System.out.println("1--> single");
		System.out.println("2--> double");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("single");
			break;
		case 2:
			System.out.println("double");
			break;
		}
	
	}

	@Override
	public void fetchMatchingDetails() {
		setAddress("Kodaikanal");
		setRoomNum(1);
		System.out.println("Address : "+getAddress());
		System.out.println("Room number : "+getRoomNum());
		
		
		
	}

	@Override
	public void BookAndLetKnow() {
			  System.out.println("Booked successfully, food is not provided, coffee/tea not provided, no room service");
		
	}
	
}


class Deluxe implements RoomBooking{
	String cotType;
    int RoomNum;
    String address;
	public String getCotType() {
		return cotType;
	}

	public void setCotType(String cotType) {
		this.cotType = cotType;
	}

	public int getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public void fetchNeccessaryInputs() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cot type");
		System.out.println("1--> single");
		System.out.println("2--> double");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("single");
			break;
		case 2:
			System.out.println("double");
			break;
		}
	
	}

	@Override
	public void fetchMatchingDetails() {
		setAddress("Kodaikanal");
		setRoomNum(2);
		System.out.println("Address : "+getAddress());
		System.out.println("Room number : "+getRoomNum());
		
		
		
	}

	@Override
	public void BookAndLetKnow() {
			  System.out.println("Booked successfully, food provided, coffee/tea provided with extra charge, room service on request");
		
	}
	
}




class superDeluxe implements RoomBooking{

	String cotType;
    int RoomNum;
    String address;
	public String getCotType() {
		return cotType;
	}

	public void setCotType(String cotType) {
		this.cotType = cotType;
	}

	public int getRoomNum() {
		return RoomNum;
	}

	public void setRoomNum(int roomNum) {
		RoomNum = roomNum;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public void fetchNeccessaryInputs() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cot type");
		System.out.println("1--> single");
		System.out.println("2--> double");
		int input=sc.nextInt();
		switch(input) {
		case 1:
			System.out.println("single");
			break;
		case 2:
			System.out.println("double");
			break;
		}
	
	}

	@Override
	public void fetchMatchingDetails() {
		setAddress("Kodaikanal");
		setRoomNum(3);
		System.out.println("Address : "+getAddress());
		System.out.println("Room number : "+getRoomNum());
		
		
		
	}

	@Override
	public void BookAndLetKnow() {
			  System.out.println("Booked successfully, food all time available, coffee/tea free of charge,room service provided");
		
	}
	
}

