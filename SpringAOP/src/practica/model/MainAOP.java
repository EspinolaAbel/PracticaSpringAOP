package practica.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import practica.services.ShapeService;

public class MainAOP {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		ShapeService shapeService = context.getBean("shapeService", ShapeService.class);
//		shapeService.getTriangle().setName("triangulito");
		System.out.println(shapeService.getCircle().getName());
	}
}
