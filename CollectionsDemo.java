package corejava;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;

public class CollectionsDemo {
 public static void main(String[] args)
 {
	 CollectionsDemo cdemo18 =  new CollectionsDemo();
	 
	 ArrayList<Integer> alist18 = new ArrayList<Integer>();
	 alist18.add(10);
	 alist18.add(20);
	 alist18.add(30);
	 alist18.add(30);
	 
	 for(Integer ar:alist18)
	 {
		 System.out.println(ar);
	 } 
	 
	 
	 LinkedList<Integer> llist = new LinkedList<Integer>();
	 
	 
	 llist.add(50);
	 llist.add(60);
	 llist.add(60);
	 llist.add(80);
	 System.out.println(llist);
	 
	 
	 Vector<Integer> vobj = new Vector<Integer>();
	 vobj.add(11);
	 vobj.add(12);
	 vobj.add(12);
	 vobj.add(14);
	 vobj.add(15);
	 System.out.println(vobj);
	 
	 
	 Stack<Integer> scol = new Stack<Integer>();
	 scol.add(21);
	 scol.add(22);
	 scol.add(22);
	 scol.add(24);
	 scol.add(25);
	 System.out.println(scol);
	 
	 
	 
	 PriorityQueue<Integer> pqueue = new PriorityQueue<Integer>();
	 pqueue.add(31);
	 pqueue.add(32);
	 pqueue.add(33);
	 pqueue.add(33);
	 pqueue.add(34); 
	 System.out.println(pqueue);
	 
	 ArrayDeque<Integer> aqueue = new ArrayDeque<Integer>();
	 aqueue.add(41);
	 aqueue.add(42);
	 aqueue.add(43);
	 aqueue.add(43);
	 aqueue.add(44);
	 System.out.println(aqueue);
	 
	 HashSet<Integer> hset = new HashSet();
	 hset.add(54);
	 hset.add(52);
	 hset.add(53);
	 hset.add(53);
	 hset.add(51);
	 System.out.println(hset);
	 
	 LinkedHashSet<Integer> linkset = new LinkedHashSet<Integer>();
	 linkset.add(65);
	 linkset.add(62);
	 linkset.add(62);
	 linkset.add(63);
	 System.out.println(linkset);
	 
	 HashMap<Integer,String> hmap = new HashMap<Integer,String>();
	 hmap.put(3, "Muttan  Briyani");
	 hmap.put(1, "Chicken Briyani");
	 hmap.put(1, "Chicken Briyani- 160");
	 hmap.put(4, "Kerla Briyani");
	 hmap.put(5, "Kerla Briyani");
	 System.out.println(hmap);
	 
	 
	 LinkedHashMap<Integer,String> lmap = new LinkedHashMap<Integer,String>();
	 lmap.put(1, "Munnar");
	 lmap.put(6, "Vagamon");
	 lmap.put(1, "Munnar");
	 lmap.put(7, "Wayanad");
	 System.out.println(lmap);
	 
	 
	 TreeMap<Integer,String> tmap = new TreeMap<Integer,String>();
	 tmap.put(9, "Electronic and communication");
	 tmap.put(2,"computer Science" );
	 tmap.put(7,"Bio-Medical Engineering" );
	 tmap.put(3, "mechanical");
	 System.out.println(tmap);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 HashMap<Integer,String> map =new HashMap<Integer,String>();
	 HashMap<Integer,String> map1= new HashMap<Integer,String>();
	 map1.put(4, "pushparaj");
	 map1.put(5,"sasi");
	 map.put(1, "Murugesan");
	 map.put(2, "Ramya");
	 map.putAll(map1);
	 map.replace(2,"Ram");
	 map.remove(2, "Ram");
	 
	 
	 System.out.println(map);
	 
 
 }
}