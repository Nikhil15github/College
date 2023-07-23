package com.amdocs.wipro.education.college;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CollegeInfo {

	public void getCollegeInfo()
	{
		ArrayList<String> teacherScience= new ArrayList();
		
		teacherScience.add("Dhumal Madam");
		teacherScience.add("Dalavi Sir");
		teacherScience.add("Yadav Sir");
		
		ArrayList<String> teacherCoomerce= new ArrayList();
		
		teacherCoomerce.add("Surve Sir");
		teacherCoomerce.add("Dalavi Sir");
		teacherCoomerce.add("Dhore Sir");
		
		ArrayList<String> teacherArts= new ArrayList();
		
		teacherArts.add("raut sir");
		teacherArts.add("Dalavi Sir");
		teacherArts.add("Kadam Sir");
		
		HashMap<String ,ArrayList<String>> dep = new HashMap();
		
		dep.put("Science", teacherScience);
		dep.put("Coomerce", teacherCoomerce);
		dep.put("Arts", teacherArts);
		
		
		HashMap<String, HashMap<String ,ArrayList<String>>> college = new HashMap();
		
		college.put("Wadia", dep);
		
		Set<String> key= college.keySet();
		
		Iterator<String> it = key.iterator();
		
		
		while(it.hasNext())
		{
			String i = it.next();
			System.out.println(i);
			System.out.println(college.get(i));
		}
		
	}
	
	
	public static void main(String[] args) 
	{
		CollegeInfo info= new CollegeInfo();
		info.getCollegeInfo();
	
	}
}
