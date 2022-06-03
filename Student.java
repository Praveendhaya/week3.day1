package org.student;


	import org.department.Department;

	public class Student extends Department{
		
		public void studentName() {
			System.out.println("studentName:Praveen");
		}
		
		public void studentDept() {
			System.out.println("studentDept:EEE");
		}
		public void studentId() {
			System.out.println("studentId:EEC200980");
		}

		public static void main(String[] args) {
			Student details = new Student();
			details.collegeName();
			details.collegeCode();
			details.collegeRank();
			details.deptName();
			details.studentName();
			details.studentDept();
			details.studentId();

		}

	}

