package org.alvas.many_to_one.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.alvas.many_to_one.dao.CollegeDao;
import org.alvas.many_to_one.dto.College;
import org.alvas.many_to_one.dto.Building;

public class CollegeSaveController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollegeDao collegeDao=new CollegeDao();
	College college=new College();
	college.setCollegeName("Reva University");
	college.setCollegeAddress("Bangalore-Karnataka-574225");
	Building building1=new Building();
Building building2=new Building();
building1.setBuildingName("CS");
building1.setBuildingColor("red");
building1.setCollege(college);
building2.setBuildingName("IS");
building2.setBuildingColor("white");
building2.setCollege(college);
collegeDao.saveBuildingCollege(college,building1,building2);
	}

}