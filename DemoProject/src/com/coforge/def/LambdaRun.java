package com.coforge.def;

public class LambdaRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Courses course=new Student();
//		course.showCourses();
//		course=new Employee();
//		course.showCourses();
//		course=new JobSeekers();
//		course.showCourses();
//    Courses course=new Courses() {
//    	public void showCourses() {
//    		System.out.println("courses for employees");
//    	}
//    	};
//    	course.showCourses();
//    course=new Courses() {
//
//		@Override
//		public void showCourses() {
//			// TODO Auto-generated method stub
//			System.out.println("courses for student");
//		}	
//    };
//    
//    course.showCourses();
//    course=new Courses() {
//
//		@Override
//		public void showCourses() {
//			// TODO Auto-generated method stub
//			System.out.println("courses for Jobseekers");
//		}	
//    };
//    course.showCourses();
		 Courses course=()->System.out.println("courses for employees");
		   
		    	course.showCourses();
		    course=()->System.out.println("courses for student");
		    
		    course.showCourses();
		    course=()-> System.out.println("courses for Jobseekers");
		    course.showCourses();
		    Checker check=(name)->System.out.println(name);
		    check.greet("rajat");
    
	}
}
