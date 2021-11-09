package AssException;

public class salarcheck {


		static void salarycheck (int salary)  throws salaryexception{
			if (salary < 2100)
			{
				throw new salaryexception("You need to work hard ");
			}
			if((salary<2100 ) || (salary >5000)){
	        	throw new salaryexception("Your salary is somehow good");
	        }
	        if (salary >5000)
			{
				throw new salaryexception("Salary is very good ");
			}
			
	 		}

		public static void main(String[] args) {
			try {
				salarycheck(6000);
			}catch(Exception n)
			{
				System.out.println("Exception:"+n.getMessage());
				
			}

			

		}

		
	

	}


