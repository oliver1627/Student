package StudentPackage;



	public class students{
	    public static void main(String[] args) {
	       
	    	Student student1 = new Student("Oliver De Ocampo", 112233, 85.5f);
	        Student student2 = new Student("Peter Sigurdson", 445566, 92.3f);

	      
	      
	        System.out.println("Name: " + student1.getName());
	        System.out.println("ID: " + student1.getId());
	        System.out.println("Grade: " + student1.getGrade());
	        System.out.println("----------------------");

	        
	        System.out.println("Name: " + student2.getName());
	        System.out.println("ID: " + student2.getId());
	        System.out.println("Grade: " + student2.getGrade());
	        System.out.println("----------------------");
	    }
	}
