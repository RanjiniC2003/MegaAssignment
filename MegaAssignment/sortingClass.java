package MegaAssignment;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class sortingClass {
	static Scanner sc=new Scanner(System.in);
  public static void main(String []args) {
	  System.out.println("1--> sort1");
	  System.out.println("2--> sort2");
	  System.out.println("3--> sort3");
	  System.out.println("4--> sort4");
	  System.out.println("5--> sort5");
	  System.out.println("6--> sort6");
	  int input=sc.nextInt();
	  switch(input) {
	  case 1:
		  sort1 sort=new sort1();
		  sort.sort();
		  break;
	  case 2:
		  sort2 sort2=new sort2();
		  sort2.sort2();
		  break;
	  case 3:
		  
		  ArrayList<sort3> empList=new ArrayList<>();
		  sort3 a=new sort3(123, "ABC", 2000, 1, 45, 50000, "Manager");
		  sort3 b=new sort3(124, "ABCD", 2004, 2, 40, 45000, "Asst.Manager");
		  sort3 c=new sort3(125, "ABCE", 2007, 3, 36, 30000, "Lead");
		  sort3 d=new sort3(126, "ABCF", 20010, 4, 30, 35000, "Developer");
		  empList.add(a);
		  empList.add(b);
		  empList.add(c);
		  empList.add(d);
		  
		  Collections.sort(empList);
		  for(sort3 s:empList) {
			  System.out.println(s);
		  }
		  break;
	  case 4:
		  ArrayList<sort4> productList1=new ArrayList<sort4>();
		  sort4 a3=new sort4("Zoho","ZWriter","Dubai","Asia",98765,"Office suite",1,2);
		  sort4 b3=new sort4("Google","GWriter","Dubai","Asia",87658,"Office suite",2,3);
		  sort4 c3=new sort4("Zoho","ZShow","Los Angeles","America",7698765,"Office suite",1,1);
		  sort4 d3=new sort4("Google","GSlides","Los Angeles","America",698765,"Office suite",4,4);
		  sort4 e3=new sort4("Zoho","ZCliq","New york","America",7698765,"Collaboration",3,3);
		  sort4 f3=new sort4("Google","Slack","New york","America",7598765,"Collaboration",3,3);
		  
		  productList1.add(a3);
		  productList1.add(b3);
		  productList1.add(c3);
		  productList1.add(d3);
		  productList1.add(e3);
		  productList1.add(f3);
		  
		  
		  Collections.sort(productList1);
		  for(sort4 s:productList1) {
			  System.out.println(s);
		  }
		  
		  
		  
		  
		  
		  ArrayList<sort4> zoho=new ArrayList<sort4>();
		  ArrayList<sort4> google=new ArrayList<sort4>();
		  
		  for(sort4 s:productList1) {
			  if(s.companyName.equals("Zoho")) {
				  zoho.add(s);
			  }
			  else {
				  google.add(s);
			  }
		  }
		  
		  
		  Map<String, ArrayList<sort4>> comDetails=new HashMap<String,ArrayList<sort4>>();
		  comDetails.put("Google", google);
		  comDetails.put("Zoho", zoho);

		  
		  
		  

		  
		  break;
	  case 5:
		  ArrayList<sort5> empList1=new ArrayList<sort5>();
		  sort5 a1=new sort5(123, "ABC", 2000, 1, 45, 50000, "Manager");
		  sort5 d1=new sort5(126, "ABCF", 20010, 4, 30, 35000, "Developer");
		  sort5 b1=new sort5(124, "ABCD", 2004, 2, 35, 45000, "Asst.Manager");
		  sort5 c1=new sort5(125, "ABCE", 2007, 3, 36, 30000, "Lead");
		  
		  empList1.add(a1);
		  empList1.add(b1);
		  empList1.add(c1);
		  empList1.add(d1);
		  
		  System.out.println("Age sort");
		  Collections.sort(empList1,new compareAge());  
		  Iterator itr=empList1.iterator();  
		  while(itr.hasNext()){  
		    sort5 st=(sort5)itr.next();  
		    System.out.println("age - "+st.age+" Name - "+st.empName+" emp id - "+st.empId+" designation- "+st.designation+" salary - "+st.salary+" ranging "+st.ranging);  
		  }  
		  
		  System.out.println("\nranking sort");
		  Collections.sort(empList1,new compareRanking());
		  Iterator<sort5> itr2=empList1.iterator();
		  while(itr2.hasNext()) {
			  sort5 st=(sort5)itr2.next();
			  System.out.println("age - "+st.age+" Name - "+st.empName+" emp id - "+st.empId+" designation- "+st.designation+" salary - "+st.salary+" ranging "+st.ranging);
		  }
		  
		  
		  System.out.println("\nSalary sort");
		  Collections.sort(empList1,new compareSalary());
		  Iterator<sort5> itr3=empList1.iterator();
		  while(itr3.hasNext()) {
			  sort5 st=(sort5)itr3.next();
			  System.out.println("age - "+st.age+" Name - "+st.empName+" emp id - "+st.empId+" designation- "+st.designation+" salary - "+st.salary+" ranging "+st.ranging);
			  
		  }
		  
		  break;
	  case 6:
		  ArrayList<sort6> productList=new ArrayList<sort6>();
		  sort6 a2=new sort6("Zoho","ZWriter","Dubai","Asia",98765,"Office suite",1,2);
		  sort6 b2=new sort6("Google","GWriter","Dubai","Asia",87658,"Office suite",2,3);
		  sort6 c2=new sort6("Zoho","ZShow","Los Angeles","America",7698765,"Office suite",1,1);
		  sort6 d2=new sort6("Google","GSlides","Los Angeles","America",698765,"Office suite",4,4);
		  sort6 e2=new sort6("Zoho","ZCliq","New york","America",7698765,"Collaboration",3,3);
		  sort6 f2=new sort6("Google","Slack","New york","America",7598765,"Collaboration",3,3);
		  
		  productList.add(a2);
		  productList.add(b2);
		  productList.add(c2);
		  productList.add(d2);
		  productList.add(e2);
		  productList.add(f2);
		  
		  System.out.println("Product revenue sort");
		  Collections.sort(productList,new compareProductRevenue());  
		  Iterator<sort6> itr4=productList.iterator();  
		  while(itr4.hasNext()){  
		    sort6 st1=(sort6)itr4.next();  
		    System.out.println("Company name : "+st1.companyName+" Product Name : "+st1.productName);  
		  }  
		  
		  System.out.println("\nRanking in app store sort");
		  Collections.sort(productList,new compareRankingInAppStore());
		  Iterator<sort6> itr5=productList.iterator();
		  while(itr5.hasNext()) {
			  sort6 st=(sort6)itr5.next();
			  System.out.println("Company name : "+st.companyName+" Product Name : "+st.productName);
		  }
		  
		  
		  System.out.println("\nRanking in product sort");
		  Collections.sort(productList,new compareRankingInProduct());
		  Iterator<sort6> itr6=productList.iterator();
		  while(itr6.hasNext()) {
			  sort6 st=(sort6)itr6.next();
			  System.out.println("Company name : "+st.companyName+" Product Name : "+st.productName);
			  
		  }
		  
		  break;
	  }
	  
	  
  }

}


//....................................................1...................................................
class sort1{
	public void sort(){
//		int arr[]=new int[7];
		int[] arr=new int[] {30,1,10,4,2,80,10};
		Arrays.sort(arr);
		
		
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" , ");
		}
		System.out.println(arr[arr.length-1]);
		
	}
}

//....................................................2.................................................

class sort2 {
	public void sort2() {
		String[] arr=new String[] {"Ranjini","Siva","Paru","Mani"};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++) {
			System.out.print(arr[i]+" , ");
		}
		System.out.println(arr[arr.length-1]);
		
		
		ArrayList<String> name=new ArrayList<String>(Arrays.asList("Ranjini","Siva","Paru","Mani"));
		
		Collections.sort(name);
		System.out.println("List after the use of" + 
                " Collection.sort() :\n" + name); 
		
	}


	
}

//.........................................................3......................................................

class sort3 implements Comparable<sort3>{
	
		int empId;
		String empName;
		int yearOfPassing;
		int ranging;
		int age;
		int salary;
		String designation;
		
    public sort3(int empId,String empName,int yearOfPassing,int ranging,int age,int salary,String designation) {	
		this.empId=empId;
		this.empName=empName;
		this.yearOfPassing=yearOfPassing;
		this.ranging=ranging;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getYearOfPassing() {
		return yearOfPassing;
	}

	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}

	public int getRanging() {
		return ranging;
	}

	public void setRanging(int ranging) {
		this.ranging = ranging;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	@Override
	public int compareTo(sort3 o) {
		if(o.salary>salary) {
			return 1;
		}
		if(o.salary<salary) {
			return -1;
		}
		else {
			return 0;
		}
		
		
	}
	
	public String toString() {
		return "Emp name : "+getEmpName()+" Emp id : "+getEmpId()+" age : "+getAge()+" designation : "+getDesignation()+" salary : "+getSalary();
	}
    
}


//.....................................4.........................

class sort4 implements Comparable<sort4>{
	String companyName;
	String productName;
	String country;
	String sellingCountry;
	long revenue;
	String productCategory;
	int rankingInAppStore;
	int rankingInProductHunt;
	
	public sort4(String companyName,String productName,String country,String sellingCountry,long revenue,String productCategory,int rankingInAppStore,int rankingInProductHunt){
		this.companyName=companyName;
		this.productName=productName;
		this.country=country;
		this.sellingCountry=sellingCountry;
		this.revenue=revenue;
		this.productCategory=productCategory;
		this.rankingInAppStore=rankingInAppStore;
		this.rankingInProductHunt=rankingInProductHunt;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSellingCountry() {
		return sellingCountry;
	}
	public void setSellingCountry(String sellingCountry) {
		this.sellingCountry = sellingCountry;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getRankingInAppStore() {
		return rankingInAppStore;
	}
	public void setRankingInAppStore(int rankingInAppStore) {
		this.rankingInAppStore = rankingInAppStore;
	}
	public int getRankingInProductHunt() {
		return rankingInProductHunt;
	}
	public void setRankingInProductHunt(int rankingInProductHunt) {
		this.rankingInProductHunt = rankingInProductHunt;
	}
	@Override
	public int compareTo(sort4 o) {
		return (int) (this.revenue-o.getRevenue());
		// TODO Auto-generated method stub
	}
	
	
	public String toString() {
		return "Product Name : "+getProductName()+" revenue : "+revenue;
	}
}




//..........................................................5....................................................
class sort5{
	int empId;
	String empName;
	int yearOfPassing;
	int ranging;
	int age;
	int salary;
	String designation;
	
	public sort5(int empId,String empName,int yearOfPassing,int ranging,int age,int salary,String designation) {	
		this.empId=empId;
		this.empName=empName;
		this.yearOfPassing=yearOfPassing;
		this.ranging=ranging;
		this.age=age;
		this.salary=salary;
		this.designation=designation;
	}
	
	
	public int getEmpId() {
		return empId;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public int getYearOfPassing() {
		return yearOfPassing;
	}
	
	public void setYearOfPassing(int yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	
	public int getRanging() {
		return ranging;
	}
	
	public void setRanging(int ranging) {
		this.ranging = ranging;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}



class compareAge implements Comparator<sort5>{

	@Override
	public int compare(sort5 o1, sort5 o2) {
		// TODO Auto-generated method stub
		if(o1.age>o2.age) {
			return -1;
		}
		else if(o1.age<o2.age) {
			return 1;
		}
		else {
			return 0;
		}
		
	}
	
}


class compareRanking implements Comparator<sort5>{

	@Override
	public int compare(sort5 o1, sort5 o2) {
		if(o1.ranging>o2.ranging) {
			return -1;
		}
		if(o1.ranging<o2.ranging) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}

class compareSalary implements Comparator<sort5>{

	@Override
	public int compare(sort5 o1, sort5 o2) {
		if(o1.salary>o2.salary) {
			return -1;
		}
		if(o1.salary<o2.salary) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}




//...............................................6....................................

class sort6{
	String companyName;
	String productName;
	String country;
	String sellingCountry;
	long revenue;
	String productCategory;
	int rankingInAppStore;
	int rankingInProductHunt;
	
	public sort6(String companyName,String productName,String country,String sellingCountry,long revenue,String productCategory,int rankingInAppStore,int rankingInProductHunt){
		this.companyName=companyName;
		this.productName=productName;
		this.country=country;
		this.sellingCountry=sellingCountry;
		this.revenue=revenue;
		this.productCategory=productCategory;
		this.rankingInAppStore=rankingInAppStore;
		this.rankingInProductHunt=rankingInProductHunt;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSellingCountry() {
		return sellingCountry;
	}
	public void setSellingCountry(String sellingCountry) {
		this.sellingCountry = sellingCountry;
	}
	public long getRevenue() {
		return revenue;
	}
	public void setRevenue(long revenue) {
		this.revenue = revenue;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public int getRankingInAppStore() {
		return rankingInAppStore;
	}
	public void setRankingInAppStore(int rankingInAppStore) {
		this.rankingInAppStore = rankingInAppStore;
	}
	public int getRankingInProductHunt() {
		return rankingInProductHunt;
	}
	public void setRankingInProductHunt(int rankingInProductHunt) {
		this.rankingInProductHunt = rankingInProductHunt;
	}
	
}



class compareProductRevenue implements Comparator<sort6>{

	@Override
	public int compare(sort6 o1, sort6 o2) {
		if(o1.revenue>o2.revenue) {
			return -1;
		}
		if(o1.revenue<o2.revenue) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}



class compareRankingInAppStore implements Comparator<sort6>{

	@Override
	public int compare(sort6 o1, sort6 o2) {
		if(o1.rankingInAppStore>o2.rankingInAppStore) {
			return -1;
		}
		if(o1.rankingInAppStore<o2.rankingInAppStore) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}




class compareRankingInProduct implements Comparator<sort6>{

	@Override
	public int compare(sort6 o1, sort6 o2) {
		if(o1.rankingInProductHunt>o2.rankingInProductHunt) {
			return -1;
		}
		if(o1.rankingInProductHunt<o2.rankingInProductHunt) {
			return 1;
		}
		else {
			return 0;
		}
	}
	
}





