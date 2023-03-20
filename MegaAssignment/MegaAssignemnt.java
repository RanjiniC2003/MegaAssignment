package MegaAssignment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
//import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;




//import javaAssignmentCollection.items;


public class MegaAssignemnt {
	public static void main(String args[]) {
		System.out.println("1.)Operations on objects");
		int total = 0;
		 ArrayList<item> itemList = new ArrayList<item>() {
	            {
	                add(new item("Stationary","Pen",16));
	                add(new item("Stationary","Pencil",24));
	                add(new item("Stationary","Notebook",38));
	                add(new item("Food","Milk",24));
	                add(new item("Food","Vegetables",21));
	                add(new item("Food","Fruits",27));
	            }
	     };

		Collections.sort(itemList);
		Iterator<item> itrItem=itemList.iterator();
		while (itrItem.hasNext()){
			item val=itrItem.next();
//			System.out.println(val);
			total+=val.price;
		}
     System.out.println("--------------------------------1--------------------------------\n");
         System.out.println("Total price : "+total);
		 System.out.println("avg value : "+total/itemList.size());
		 System.out.println("Min value : "+itemList.get(itemList.size()-1).price);
		 System.out.println("Max value : "+itemList.get(0).price);
		 

	        ArrayList <item> stationary=new ArrayList<item>();
	        ArrayList <item> food=new ArrayList<item>();

	        for (item names:itemList){
	            if (names.category=="Stationary"){
	            	stationary.add(names);
	            }
	            if (names.category=="Food"){
	            	food.add(names);
	            }
	        }
	    
	        
	        System.out.println("--------------------------------2--------------------------------\n");
	        
	        LinkedHashMap<String,ArrayList<item>> lhm=new LinkedHashMap<String,ArrayList<item>>();
	        lhm.put("Stationary", stationary);
	        lhm.put("Food",food);
//	        Set<Map.Entry<String,ArrayList <items>>> s=map.entrySet();
	        Set <Map.Entry<String,ArrayList<item>>> set=lhm.entrySet();
	        Iterator<Map.Entry<String,ArrayList<item>>> itr1=set.iterator();
	        while(itr1.hasNext()) {
	        	System.out.println(itr1.next());
	        }
	        
	        System.out.println("--------------------------------3--------------------------------\n");
	        
	        List<month> allmonth=new ArrayList<month>() {
	        	{
	        		add(new month("august",1232));
	        		add(new month("march",2091));
	        		add(new month("january",1000));
	        		add(new month("november",4300));
	        		add(new month("february",1340));
	        		add(new month("octomber",5600));
	        		add(new month("april",1500));
	        		add(new month("may",5000));
	        		add(new month("december",3300));
	        		add(new month("july",3200));
	        		add(new month("june",3000));
	        		add(new month("septemper",3400));
	        	}
	        };
	        Collections.sort(allmonth,new Comparator<month>() {
	        	SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
	        	@Override
	        	public int compare(month o1, month o2) {
	        		// TODO Auto-generated method stub
	        		
	        		int result=-1;
	        		try{
	        		result=sdf.parse(o1.months).compareTo(sdf.parse(o2.months));
	        		}
	        		catch(Exception ex) {
	        			System.out.println(ex.getMessage());
	        		}
	        		return result;
	        	}
	        	
	        });
	        for(month month:allmonth) {
	        	System.out.println(month);
	        }
		
          System.out.println("--------------------------------4--------------------------------\n");
          System.out.println("--------------------------------a.)Start with - ma--------------------------------\n");
          for(month month:allmonth) {
        	  if(month.months.startsWith("ma")) {
        		  System.out.println(month.months);
        	  }
          }
          System.out.println("--------------------------------b.)Have charcters in between -emb --------------------------------\n");
          for(month month:allmonth) {
        	  if(!month.months.startsWith("emb") && month.months.contains("emb") && !month.months.endsWith("emb")) {
        		  System.out.println(month.months);
        	  }
          }
          System.out.println("--------------------------------c.)Ends with - ary --------------------------------\n");
          for(month month:allmonth) {
        	  if(month.months.endsWith("ary")) {
        		  System.out.println(month.months);
        	  }
          }
	
	System.out.println("2.)Interfaces");
	

  }

}

class month {
    String months;
    int sales;
    month(String months,int sales){
    	this.months=months;
    	this.sales=sales;
    }
    
    public String toString() {
    	return "Month --> "+months+" sales --> "+sales;
    }
	
	
}

class item implements Comparable<item>{
	String category;
	String items;
	int price;
	item(String category,String items,int price){
		this.category=category;
		this.items=items;
		this.price=price;
	}

	@Override
	public int compareTo(item item) {
		if(price>item.price){
			return -1;
		}
		else if(price<item.price){
			return 1;
		}
		else {
			return 0;
		}
	}

	public String toString(){
		return category+" "+items+" "+price;
	}
}





















