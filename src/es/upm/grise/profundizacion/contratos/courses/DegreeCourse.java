package es.upm.grise.profundizacion.contratos.courses;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;

import es.upm.grise.profundizacion.contratos.values.CourseData;

public class DegreeCourse extends Course {

	final private static double fee = 27.33;

	@Ensures("getFee() >= 0")
	@Requires("\"DEGREE\".equals(course.getLevel()) && course.getCredits() >= 1 && course.getCredits() <= 6 && numRegistrations >= 1 && numRegistrations <= 6")
	public DegreeCourse(CourseData course, int numRegistrations) {
		super(numRegistrations);
		this.courseData = course;
	}

	@Override
	public double getFee() {
		return (numRegistrations == 1 ? 0 : fee);
	}

}
