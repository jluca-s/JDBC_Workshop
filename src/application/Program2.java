package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.impl.DepartmentDaoJDBC;
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
		
		System.out.println("\n=== TEST 2: Department update ===");
		department.setName("SmartPhones");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 3: Department deleteById ===");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");
		
		System.out.println("\n=== TEST 4: Department findById ===");
		department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("\n=== TEST 5: Department findAll ===");
		List<Department> departments = new ArrayList<>();
		departments = departmentDao.findAll();
		for (Department d : departments) {
			System.out.println(d);
		}
		
		
		
		
		
		
		

		
		
		sc.close();
	}

}
