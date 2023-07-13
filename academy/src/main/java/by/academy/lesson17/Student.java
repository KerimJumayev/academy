package by.academy.lesson17;

import java.util.Objects;

//Создать класс Student, содержащий следующие характеристики

//– имя, группа, курс, оценки по предметам. 
//Создать коллекцию, содержащую объекты класса Student. 
//Написать метод, который удаляет студентов со средним баллом <3.
//Если средний балл>=3, студент переводится на следующий курс.
//Напишите метод printStudents(List<Student> students, int course),
//который получает список студентов и номер курса и печатает на консоль имена тех студентов из списка, которые обучаются на данном курсе.

public class Student implements Comparable<Student> {
	private String name;
	private int group;
	private int course;
	private double marks;

	Student(String name, int group, int course, double marks) {
		super();
		this.name = name;
		this.group = group;
		this.course = course;
		this.marks = marks;
	
		

	}

	@Override
	public int compareTo(Student o) {

		return name.compareTo(o.getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGroup() {
		return group;
	}

	public void setGroup(int group) {
		this.group = group;
	}

	public int getCourse() {
		return course;
	}

	public void setCourse(int course) {
		this.course = course;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public int hashCode() {
		return Objects.hash(course, group, marks, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return course == other.course && group == other.group
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", group=" + group + ", course=" + course + ", marks=" + marks + "]";

	}

}
