package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TEST 1: Department Insert ===");
		Department department = new Department(null, "Food");
		departmentDao.insert(department);
		System.out.println(department);
		System.out.println("Insert completed!");
		
		System.out.println("=== TEST 2: Department update ===");
		department.setName("SmartPhones");
		departmentDao.update(department);
		
		

		
		
		sc.close();
	}

}
