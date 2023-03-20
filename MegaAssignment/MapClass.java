package MegaAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapClass {
	public static void main(String []args) {
		mapProgram mp=new mapProgram();
		
		System.out.println("------------------------------------1-----------------------------");
		mp.mapProgram();
		
		
		System.out.println("-----------------------------------------2-----------------------");
		mp.mapProgram2();
		
		
		ArrayList<mapProgram1> schoolList=new ArrayList<mapProgram1>();
		schoolList.add(new mapProgram1("ZU sas","Afsana"));
		schoolList.add(new mapProgram1("ZU sas","Naveen"));
		schoolList.add(new mapProgram1("ZU sas","Kavitha"));
		schoolList.add(new mapProgram1("ZU sas","Sasi"));
		schoolList.add(new mapProgram1("ZU sas","Amirtha Varshini"));
		schoolList.add(new mapProgram1("ZU sb","Mukil"));
		schoolList.add(new mapProgram1("ZU sb","Kumar"));
		schoolList.add(new mapProgram1("ZU sb","Murali"));
		schoolList.add(new mapProgram1("ZU sb","Mathinika"));
		
		
		
		ArrayList<mapProgram1> sas=new ArrayList<mapProgram1>();
		ArrayList<mapProgram1> sb=new ArrayList<mapProgram1>();
		for(mapProgram1 mp1:schoolList) {
			if(mp1.schoolName.equals("ZU sas")) {
				sas.add(mp1);
			}
			else {
				sb.add(mp1);
			}
		}
		
		System.out.println("---------------------------------3------------------------------");
		
		LinkedHashMap<String,ArrayList<mapProgram1>> lhm=new LinkedHashMap<String,ArrayList<mapProgram1>>();
        lhm.put("ZU sas",sas);
        lhm.put("sb",sb);
//        Set<Map.Entry<String,ArrayList <items>>> s=map.entrySet();
        Set<Entry<String, ArrayList<mapProgram1>>> set=lhm.entrySet();
        Iterator<Map.Entry<String,ArrayList<mapProgram1>>> itr1=set.iterator();
        while(itr1.hasNext()) {
        	Entry<String, ArrayList<mapProgram1>> val=itr1.next();
        	System.out.println(val.getKey()+" "+val.getValue());
        }
        
        
        
        
        ArrayList<mapProgram4> groupList=new ArrayList<mapProgram4>();
        groupList.add(new mapProgram4("Aarthi","Computer","12","A1"));
        groupList.add(new mapProgram4("Anandh","Bio-Maths","12","A"));
        groupList.add(new mapProgram4("Aksahaya","Computer","12","A1"));
        groupList.add(new mapProgram4("Akalya","Bio-Maths","12","A"));
        
        
        
        ArrayList<mapProgram4> maths=new ArrayList<mapProgram4>();
		ArrayList<mapProgram4> computer=new ArrayList<mapProgram4>();
		for(mapProgram4 mp4:groupList) {
			if(mp4.group.equals("Computer")) {
				computer.add(mp4);
			}
			else {
				maths.add(mp4);
			}
		}
		
		System.out.println("---------------------------------------4---------------------------------------");
		
		LinkedHashMap<String,ArrayList<mapProgram4>> lhm2=new LinkedHashMap<String,ArrayList<mapProgram4>>();
        lhm2.put("Maths",maths);
        lhm2.put("Computer",computer);
//        Set<Map.Entry<String,ArrayList <items>>> s=map.entrySet();
        Set<Entry<String, ArrayList<mapProgram4>>> set1=lhm2.entrySet();
        Iterator<Map.Entry<String,ArrayList<mapProgram4>>> itr2=set1.iterator();
        while(itr2.hasNext()) {
        	Entry<String, ArrayList<mapProgram4>> val=itr2.next();
        	System.out.println(val.getKey()+" "+val.getValue());
        }
        
        
        
        
        
        ArrayList<category> category=new ArrayList<category>();
        category.add(new category("dresses","T-shirt"));
        category.add(new category("dresses","shirt"));
        category.add(new category("dresses","chudithar"));
        category.add(new category("dresses", "sarees"));
        category.add(new category("stationary", "pen"));
        category.add(new category("stationary", "paper"));
        category.add(new category("stationary", "noteBook"));
        category.add(new category("food", "vegitables"));
        category.add(new category("food","fruits"));
        category.add(new category("food", "bread"));
        
//        
//        ArrayList<Integer> dress=new ArrayList<Integer>();
//        ArrayList<Integer> stationary=new ArrayList<Integer>();
//        ArrayList<Integer> food=new ArrayList<Integer>();
        
        int dress=0;
        int stationary=0;
        int food=0;
        for(category cata:category) {
        	if(cata.name.equals("dresses")) {
        		dress++;
        	}
        	else if(cata.name.equals("stationary")) {
        		stationary++;
        	}
        	else if(cata.name.equals("food")){
        		food++;
        	}
        }
        
        
        
        
        System.out.println("---------------------------------------------2----------------------------------------");
        
        LinkedHashMap<String, Integer> categoryMap=new LinkedHashMap<String,Integer>();
        categoryMap.put("Dresses", dress);
        categoryMap.put("Stationary", stationary);
        categoryMap.put("Food", food);
        
        
        Set<Entry<String, Integer>> categorySet=categoryMap.entrySet();
        Iterator<Map.Entry<String, Integer>> catergoryItr=categorySet.iterator();
        while(catergoryItr.hasNext()) {
        	Entry<String,Integer> val=catergoryItr.next();
        	System.out.println(val.getKey()+" "+val.getValue());
        }
        
	}
	
	
	
	
   
 
}

//..........................1..................

class mapProgram{
	
	public static void mapProgram() {
		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		map1.put(1,"Siva");
		map1.put(2, "Ranjini");
		map1.put(3, "Paru");
		map1.put(4, "Mani");
		
		System.out.println("First value"+map1.get(1));
	}

//.........................2..........................
	
	public static void mapProgram2() {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<String, String> map=new LinkedHashMap<String,String>();
		map.put("abc","1");
		map.put("def","2");
		map.put("ghi","3");
		map.put("jkl","4");
		map.put("mno","5");
		map.put("pqrs","6");
		map.put("tuv","7");
		map.put("wxyz","8");
		
		
		System.out.println("Enter number of telephoe keypad String");
		int num=sc.nextInt();
		String output="";
		String input="";
		for(int i=0;i<num;i++) {
			System.out.println("Enter "+(i+1)+" value");
			String value=sc.next();
			Set<Entry<String,String>> telset=map.entrySet();
			Iterator<Map.Entry<String, String>> telitr = telset.iterator();
			
			while(telitr.hasNext()) {
				Entry<String, String> val=telitr.next();
				if(value.equals(String.valueOf(val.getKey()))) {
					input+=String.valueOf(val.getKey())+" ";
					output+=val.getValue();
					
				}
			}	
		}
		System.out.println("Answer");
		System.out.println("input : "+input +",output "+output);
		System.out.println("\n\n");
	}
	
	
}



//............................3.................

class mapProgram1{
	String schoolName;
	String studentName;
	public mapProgram1(String schoolName,String studentName) {
		this.schoolName=schoolName;
		this.studentName=studentName;
			
	}
	public String toString() {
		return "School name : "+schoolName+" Student name : "+studentName;
	}
}

//.....................................4...............

class mapProgram4{
	String Name;
	String group;
	String className;
	String section;
	public mapProgram4(String name, String group, String className, String section) {
		this.Name = name;
		this.group = group;
		this.className = className;
		this.section = section;
	}
	public String toString() {
		return "group name : "+group+"  name : "+Name+" Section : "+section+" class name : "+className;
	}
	
}



//...............................5...................................


class category{
	String name;
	String item;
	public category(String name, String item) {
		this.name = name;
		this.item = item;
	}
	
	public String toString() {
		return "Category name : "+name+" item : "+item;
	}
}
