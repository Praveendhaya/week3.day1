package week3.day1;

public class Students {


		public void getStudentInfo(int id) {
			System.out.println("Employee ID:" + id);
			
		}
		public void getStudentInfo(int id, String name) {
			
			System.out.println("Employee Name:" + name);
			
		}
		public void getStudentInfo(String email, int phoneNumber) {
			System.out.println("Employee Email:" + email);
			System.out.println("Employee PhoneNumber:" + phoneNumber);
		
		}
		
		public static void main(String[] args) {
			Students details = new Students();
			details.getStudentInfo(1350);
			details.getStudentInfo(1350, "Praveen");
			details.getStudentInfo("praveen.vp93@gmail.com", 948922762);
			

		}

	}

