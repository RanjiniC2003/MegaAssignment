package MegaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

import sms.Student;

public class ClassExample {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Students> students=new ArrayList<Students>();
    public static void main(String args[]) {
    	
	   System.out.println("1--> Book");
	   System.out.println("2--> Students");
	   System.out.println("3--> Product");
	   System.out.println("4--> loan");
	   int input=sc.nextInt();
	   switch(input) {
	   case 1:
		   Page pa=new Page();
		   Book book=new Book();
		   System.out.println("Create a book");
		   System.out.println("Enter the number of pages " );
		   int pages=sc.nextInt();
		  
		   for(int i=0;i<pages;i++) {
			  
			   System.out.println("Enter the number of paragraph");
			   int paragraph=sc.nextInt();
			   for(int j=0;j<paragraph;j++) {
				  System.out.println("Enter "+(j+1)+" page paragraph");
				  String para=sc.next();
				  pa.insertParagraph(para);
			   }
			   book.insertPage(pa);
		   }
		   
//		   pa.paragraphLoop();
		   System.out.print(book.toString());
		   break;
		   
	   case 2:
		   
		   Students st1=new Students(123, "Aarthi", "12", 76, 56, 90, 50);
		   Students st2=new Students(124, "sakthi", "12", 70, 52, 40, 50);
		   Students st3=new Students(125, "mathu", "12", 76, 56, 90, 70);
		   Students st4=new Students(126, "kavya", "12", 36, 76, 20, 50);
		   Students st5=new Students(127, "dinesh", "12", 76, 86, 90, 50);
		   students.add(st1);
		   students.add(st2);
		   students.add(st3);
		   students.add(st4);
		   students.add(st5);
		   
		   System.out.println("Enter student id ");
		   int id=sc.nextInt();
		   boolean findId=true;
		   
		   for(Students st:students) {
			  if(id==st.getStudentId()) {
				  findId=false; 
				  st.result();
			  }
		   }
		   if(findId) {
				System.out.println("Invalid id");
		   }
		   break;
	   case 3:
		   
		   ArrayList<product> pr=new ArrayList<>();
		  product product1=new product(123, "Coffee cups",125, 150, 3);
		  product product2=new product(124, "T-shirts",100, 300, 3);
		  product product3=new product(125, "Portable TV",5000, 7000, 1);
		  product product4=new product(126, "Lenovo K9 Phone",9000, 12000, 1);
		  pr.add(product1);
		  pr.add(product2);
		  pr.add(product3);
		  pr.add(product4);
		  
		  
		  System.out.println("Enter product id");
		  int productId=sc.nextInt();
		  boolean loops=false;
		  for(product pt:pr) {
			  if(productId==pt.getProductId()) {
				  loops=true;
				  System.out.println("total selling price : "+pt.totalSellingPrice());
				  System.out.println("percentage profit : "+pt.PercentageProfit());
			  }
		  }
		  if(!loops) {
		     System.out.println("Invalid id");
		  }
		  break;
		  
	   case 4:
		   
		   ArrayList<loan> loanList=new ArrayList<loan>();
		   loan loan1=new loan(1234,"Aarthi",9876543, 120000, "SBI", 12.50*100);
		   loan loan2=new loan(1235,"Avinesh",9176543, 150000, "SBI", 25.50*100);
		   loanList.add(loan1);
		   loanList.add(loan2);
		   System.out.println("Enter loan account id");
			  long loanId=sc.nextLong();
			  boolean loop=false;
			  for(loan lo:loanList) {
				  if(loanId==lo.getAccNum()) {
					  loop=true;
					  System.out.println(lo.getCustomerName()+"-"+"monthlyInterest : "+lo.monthlyInterest());
					  System.out.println(lo.getCustomerName()+"-"+"monthPayable : "+lo.monthPayable());
					  System.out.println(lo.getCustomerName()+"-"+"monthlyEMI : "+lo.monthlyEMI());
				  }
			  }
			  if(!loop) {
			     System.out.println("Invalid id");
			  }
			  break;
			  
	   case 5:
		   
		   break;
	   }
	   
   }
}
//.............................................1..................................................

class Book{
    long isbnNumber;
    ArrayList<Page> pages=new ArrayList<Page>();
	public long getIsbnNumber() {
		return isbnNumber;
	}
	public void setIsbnNumber(long isbnNumber) {
		this.isbnNumber = isbnNumber;
	}
	public ArrayList<Page> getPages() {
		return pages;
	}
	public void setPages(ArrayList<Page> pages) {
		this.pages = pages;
	}
	
	public void insertPage(Page page) {
		pages.add(page);
	}
	public String toString() {
		String out="";
		for(Page p:pages) {
			out+=p.toString();
		}
		return out;
	}
 
}

class Page{
    public ArrayList<String> paragraphs=new ArrayList<String>();;
    

	public ArrayList<String> getParagraph() {
		return paragraphs;
	}
	
	public void setParagraph(ArrayList<String> paragraph) {
		this.paragraphs = paragraph;
	}
	
	public void insertParagraph(String paragraph){
		paragraphs.add(paragraph);
	}
	
	public String toString() {
	    return String.join("\n",paragraphs);
	}
}



//.........................................2.......................................................

class Students{
	int studentId;
	String studentName;
	String className;
	int english;
	int maths;
	int chemistry;
	int physics;
	
	public Students(int studentId,String studentName,String className,int english,int maths,int chemistry,int physics) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.className=className;
		this.chemistry=chemistry;
		this.maths=maths;
		this.physics=physics;
		this.english=english;
	}
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMaths() {
		return maths;
	}
	public void setMaths(int maths) {
		this.maths = maths;
	}
	public int getChemistry() {
		return chemistry;
	}
	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}
	public int getPhysics() {
		return physics;
	}
	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
	
	public float getTotal() {
		return getEnglish()+getChemistry()+getMaths()+getPhysics();
	}
	public float percentage() {
		float val=getTotal()/4;
		return val;
	}
	
	
	public void result() {
		
		if(percentage()>50) {
			System.out.print(getStudentName()+"-"+getStudentId()+"Pass");
		}
		else {
			System.out.println(getStudentName()+"-"+getStudentId()+"Fail");
		}
		
	}
	
}







//............................................3....................................


class product{
	int productId;
	String productName;
	double costPrice;
	double sellingPrice;
	int  quentityPurchased;
	
	public product(int productId,String productName,double costPrice,double sellingPrice,int quentityPurchase){
		this.productId=productId;
		this.productName=productName;
		this.costPrice=costPrice;
		this.sellingPrice=sellingPrice;
		this.quentityPurchased=quentityPurchase;
		// TODO Auto-generated constructor stub
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public double getSellingPrice() {
		return sellingPrice;
	}
	public void setSellingPrice(double sellingPrice) {
		this.sellingPrice = sellingPrice;
	}
	public int getQuentityPurchased() {
		return quentityPurchased;
	}
	public void setQuentityPurchased(int quentityPurchased) {
		this.quentityPurchased = quentityPurchased;
	} 
	
	public double totalSellingPrice() {
		return getSellingPrice()*getQuentityPurchased();
	}
	
	public double PercentageProfit() {
		return ((getSellingPrice()-getCostPrice())/getCostPrice())*100;
	}
	
}
//..................................................4...............................................

class loan {
	int customerNumber;
	String customerName;
	long accNum;
	double principalAmount;
	String planName;
	double interestRate;
	public loan(int customerNumber,String customerName,long accNum,double principalAmount,String planName,double interestRate) {
		this.customerNumber=customerNumber;
		this.customerName=customerName;
		this.accNum=accNum;
		this.interestRate=interestRate;
		this.planName=planName;
		this.principalAmount=principalAmount;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getPrincipalAmount() {
		return principalAmount;
	}
	public void setPrincipalAmount(double principalAmount) {
		this.principalAmount = principalAmount;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	public double monthlyInterest() {
		return (getPrincipalAmount()*getInterestRate()*14)/(100*12*14);
	}
	
	public double monthPayable() {
		return (getPrincipalAmount()/12)*14;
	}
	public double monthlyEMI() {
		return monthlyInterest()+monthPayable();
	}
}




//.......................................................5.......................................

class train{
	int engine;
	ArrayList<compartment> compartments;
	ArrayList<comportmentlinks>comportmentlinks;
	
	
	public train(int engine, ArrayList<compartment> compartments, ArrayList<comportmentlinks> comportmentlinks) {
		this.engine = engine;
		this.compartments = compartments;
		this.comportmentlinks = comportmentlinks;
	}
	public ArrayList<comportmentlinks> getComportmentlinks() {
		return comportmentlinks;
	}
	public void setComportmentlinks(ArrayList<comportmentlinks> comportmentlinks) {
		this.comportmentlinks = comportmentlinks;
	}
	public int getEngine() {
		return engine;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public ArrayList<compartment> getCompartments() {
		return compartments;
	}
	public void setCompartments(ArrayList<compartment> compartments) {
		this.compartments = compartments;
	}
	
	
}

class comportmentlinks{
	
}


class compartment{
	ArrayList<seat> seats;

	public compartment(ArrayList<seat> seats) {
		this.seats = seats;
	}

	public ArrayList<seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<seat> seats) {
		this.seats = seats;
	}
}


class seat{
	int person;

	public seat(int person) {
		this.person = person;
	}

	public int getPerson() {
		return person;
	}

	public void setPerson(int person) {
		this.person = person;
	}
}






//...........................................6..................................

class organization{
	ArrayList<employee> emp=new ArrayList<employee>();
}

class employee{
	ArrayList<developer> developer=new ArrayList<developer>();
	ArrayList<designer> designer=new ArrayList<designer>();
	ArrayList<contentWriter> contentWriter=new ArrayList<contentWriter>();
}
class developer{
	String unitTesting;
	String codeTesting;
}
class designer{
	String designing;
	String printing;
}
class contentWriter{
	String writingContent;
	String tagLines;
}

class technicalArchitect extends developer{
	ArrayList<developer> dev=new ArrayList<developer>(); 
	String managingDeveloper;
	String productArchitecture;
	String framework;
}

class design extends designer{
	ArrayList<designer>des=new ArrayList<designer>();
	String managingDesigner;
	String designIdeation;
}

class marketer extends contentWriter{
	ArrayList<contentWriter> cw=new ArrayList<contentWriter>();
	String managingWriters;
	String marketing;
}




//............................7..........................


abstract class rawMaterial{
	int screwsSixe;
	int nailsize;
	int nutsSize;
	int boltsize;
	int engineItemsize;
}
class car extends rawMaterial{
    car(int screwsSixe,int nailsize,int nutsSize,int boltsize,int engineItemsize){
    	super.boltsize=boltsize;
    	super.engineItemsize=engineItemsize;
    	super.screwsSixe=screwsSixe;
    	super.nailsize=nailsize;
    	super.nutsSize=nutsSize;
    }
}
