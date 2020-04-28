import java.lang.System;

public class UseStudent{
	public static void main(String args[]) {
		double[] ms2Grades = {10.0,5,3.5,6,4};
		Student ms1 = new Student("ms1");
		Student ms2 = new Student("ms2",ms2Grades);
		double[] ms1grades = {10.0,40};
		double[] ms2Update = {8,-6.5,20.0};

		try{
		ms1.updateCourseGrades(ms1grades);
		ms2.updateCourseGrades(ms2Update);
		}catch(InvalidGradeException err){
			System.out.println(err.getMessage());
		}
		
		System.out.println(ms2.getNumStudents());
		System.out.println(ms1.listGrades());
		System.out.println(ms2.listGrades());
	}

}
