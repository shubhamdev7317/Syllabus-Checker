import java.util.Scanner;
class polysyl
{
	public static void main(String[] args)
	{
		int a,m,n,o;
 int x,y,z,w;
 System.out.println("---This java program is for Polytechnic syllabus for all branches---");
 System.out.println("If you want to know your syllabus, Please follow these points:-");
 System.out.println("Please follow the instructions carefully otherwise you got ERROR...! ");
 System.out.println("******************");
 System.out.println("Press 1 --> For Computer Science and Engineering");
 System.out.println("Press 2 --> For Civil Engineering");
 System.out.println("Press 3 --> For Mechanical Engineering");
 System.out.println("Press 4 --> For Electrical Engineering");
 System.out.println("******************");
 
 Scanner obj=new Scanner(System.in);
 a=obj.nextInt();
 
		switch(a)
		{
			case 1:
		    System.out.println("Enter your year in the form of 1,2,3.... ");
			x=obj.nextInt();
			    switch(x)
				{
					case 1:
					System.out.println("Enter your semester in the form of 1,2,3... ");
					m=obj.nextInt();
					    switch(m)
						{
							
							case 1:
							System.out.println("=>Communication Skills ");
	                        System.out.println("=>Applied Mathematics");
	                        System.out.println("=>Applied Physics");
	                        System.out.println("=>Applied Chemistry");
	                        System.out.println("=>Fundamental of Computer and Information Technology");
	                        System.out.println("=>Technical Drawing");
	                        System.out.println("=>Workshop Practice");
	                        break;
	  
	                        case 2:
	                        System.out.println("=>Applied Mathematics-2nd");
	                        System.out.println("=>Applied Physics-2nd");
                            System.out.println("=>Basics of Electrical and Electronics Engineering");
	                        System.out.println("=>Multimedia & Animation");
	                        System.out.println("=>Concept of Programming Using C");
	                        System.out.println("=>Office Automation Tools");
	                        break;
							default:
							System.out.println("Only two semesters are there (1st sem and 2nd sem)");
						}
					break;
					case 2:
					System.out.println("Enter your semester:");
					n=obj.nextInt();
					    switch(n)
						{
							case 3:
	                        System.out.println("=>Internet and Web Technology ");
	                        System.out.println("=>Applied Mathematics-3rd");
	                        System.out.println("=>Environmental Studies");
	                        System.out.println("=>Data Communication and Computer Networks");
	                        System.out.println("=>Datat Structure Using C");
	                        System.out.println("=>Digital Electronics");
	                        break;
	  
	                        case 4:                   
	                        System.out.println("=>Communication Skills-2nd ");
	                        System.out.println("=>Database Management System");
	                        System.out.println("=>Object Oriented Programming Using Java");
	                        System.out.println("=>Operating Systems");
	                        System.out.println("=>E-Commerce and Digital Marketing");
	                        System.out.println("=>Energy Conservation");
	                        System.out.println("=>Universal Human Values");
                            break;
							default:
							System.out.println("Only two semesters are there (3rd sem and 4th sem)");
						}
					break;
					case 3:
					System.out.println("Enter your semester = ");
					o=obj.nextInt();
					    switch(o)
						{
						    case 5:
	                        System.out.println("---Industrial Training--- ");
	                        System.out.println("=>Software Engineering");
	                        System.out.println("=>Web Development using PHP");
	                        System.out.println("=>Computer Programming Using Python");
	                        System.out.println("=>Computer Architecture and Hardware Maintenance");
	                        System.out.println("=>Internet of Things");
	                        System.out.println("=>Minor Project Work");
	                        break;
	  
	                        case 6:
	                        System.out.println("=>Development of Android Applications");
	                        System.out.println("=>Cloud Computing");
	                        System.out.println("=>Industrial Management and Entrepreneurship Development");
	                        System.out.println("=>Elective");
	                        System.out.println("=>Major Project Work");
	                        break;
	                        default:
	                        System.out.println("Only two semesters are there (5th sem. and 6th sem.)");
						
						}
					break;
					default:
				    System.out.println("Only three years are allowed");
				}
				break;
				
	
	        case 2:
		    System.out.println("Enter your year = ");
		    y=obj.nextInt();
		    
			    switch(y)
				{
					case 1:
					System.out.println("Enter your semester = ");
					m=obj.nextInt();
					    switch(m)
						{
							case 1:
	                        System.out.println("=>Communication Skills-1st");
	                        System.out.println("=>Applied Mathematics-1st");
	                        System.out.println("=>Applied Physics-1st");
	                        System.out.println("=>Applied Chemistry-1st");
	                        System.out.println("=>Engineering Drawing-1st");
	                        System.out.println("=>Construction Materials");
	                        System.out.println("=>General Workshop Practice-1");
	                        break;
	  
	                        case 2:
		                    System.out.println("=>Applied Mathematics-2nd");
	                        System.out.println("=>Computer Aided Drawing");
	                        System.out.println("=>Applied Mechanics");
	                        System.out.println("=>Basics of Mechanical and Electronics Engineering");
	                        System.out.println("=>Basics of Information Technology");
	                        System.out.println("=>General Workshop Practice-2nd");
	                        break;
							default:
							System.out.println("Only two semesters are there (1st sem and 2nd sem)");
						}
					break;
					case 2:
					System.out.println("Enter your semester");
					n=obj.nextInt();
					    switch(n)
						{
							case 3:
		                    System.out.println("=>Hydraulics and Hydraulic Mechanics");
	                        System.out.println("=>Concrete Technology");
	                        System.out.println("=>Environmental Studies");
	                        System.out.println("=>Structural Mechanics");
	                        System.out.println("=>Building Constructions");
	                        System.out.println("=>Building Drawings");
	                        break;
	  
                            case 4:
	                        System.out.println("=>Communication Skills-2nd");
	                        System.out.println("=>Highway Engineering");
	                        System.out.println("=>Irrigation Engineering");
	                        System.out.println("=>Survaying-1");
	                        System.out.println("=>Reinforced Cement Concrete Structures(RCC Structures)");
	                        System.out.println("=>Energy Conservation");
	                        System.out.println("=>RCC Drawing");
	                        System.out.println("---Industrial Training---");
							break;
							default:
							System.out.println("Only two semesters are there (3rd sem and 4th sem)");	
						}
					break;
					case 3:
					System.out.println("Enter your semester = ");
					o=obj.nextInt();
						switch(o)
						{
							case 5:
	                        System.out.println("=>Water and Waste Wate Engineering");
	                        System.out.println("=>Railways, Bridges and Tunnels");
	                        System.out.println("=>Earthquake Engineering");
	                        System.out.println("=>Soil Mechanics and Foundation Engineering");
	                        System.out.println("=>Surveying-2nd");
	                        System.out.println("=>Waste Water and Irrigation Engineering Drawing");
	                        System.out.println("=>Universal Human Values");
	                        break;
	  
	                        case 6:
	                        System.out.println("---Survey Camp---");
	                        System.out.println("=>Quantity Surveying and Valuation");
	                        System.out.println("=>Construction Management, Accounts and Entrepreneurship Development");
	                        System.out.println("=>Design of Steel Structure");
	                        System.out.println("=>Steel Structure Drawing");
	                        System.out.println("=>Software Application in Civil Engineering");
	                        System.out.println("=>Elective");
	                        System.out.println("=>Project Work");
	                        break;
						    default:
	                        System.out.println("Only two semesters are there (5th sem. and 6th sem.)");
						}
					break;
					default:
				    System.out.println("Only three years are allowed");			
				}
			break;
				
			
			case 3:
			System.out.println("Enter your year = ");
			z=obj.nextInt();
			    switch(z)
				{
					case 1:
					System.out.println("Enter your semester = ");
					m=obj.nextInt();
					    switch(m)
						{
						    case 1:
	                        System.out.println("=>Communication Skills-1st");
	                        System.out.println("=>Applied Mathematics-1st");
	                        System.out.println("=>Applied Physics-1st");
	                        System.out.println("=>Applied Chemistry-1st");
	                        System.out.println("=>Engineering Drawing-1st");
	                        System.out.println("=>Basics of Information Technology");
	                        System.out.println("=>General Workshop Practice-1st");
	                        break;
	  
	                        case 2:
	                        System.out.println("=>Applied Mathematics-2nd");
	                        System.out.println("=>Applied Physics-2nd");
	                        System.out.println("=>Applied Mechanics");
	                        System.out.println("=>General Engineering");
	                        System.out.println("=>Engineering Drawing-2nd");
	                        System.out.println("=>General Workshop Practice-2nd");
	                        break;
							default:
							System.out.println("Only two semesters are there (1st sem and 2nd sem)");
						
						}
					break;
                    case 2:
					System.out.println("Enter your semester = ");
					n=obj.nextInt();
					    switch(n)
						{
							case 3:
	                        System.out.println("=>Applied Mathematics-2nd");
	                        System.out.println("=>Applied Physics-2nd");
	                        System.out.println("=>Applied Mechanics");
	                        System.out.println("=>General Engineering");
	                        System.out.println("=>Engineering Drawing-2nd");
	                        System.out.println("=>General Workshop Practice-2nd");
	                        break;
	  
	                        case 4:
	                    	System.out.println("=>Communication Skills-2nd");
	                        System.out.println("=>Refrigeration and Air Conditioning");
                       	    System.out.println("=>Hydraulics and Pneumatics");
	                        System.out.println("=>Compute Aided Design and Manufacturing");
	                        System.out.println("=>Environmental Studies");
                        	System.out.println("=>Energy Conservation");
                            System.out.println("=>Universal Human Values");
	                        break;
							default:
							System.out.println("Only two semesters are there (3rd sem and 4th sem)");
						}
					break;
					case 3:
					System.out.println("Enter your semester = ");
					o=obj.nextInt();
					    switch(o)
						{
							case 5:
		                    System.out.println("---Industrial Training---");
	                        System.out.println("=>Industrial Management and Entrepreneurship Development");
	                        System.out.println("=>Theory of Machines");
	                        System.out.println("=>Machine Design");
	                        System.out.println("=>Production Technology");
	                        System.out.println("=>Production Management");
	                        System.out.println("=>Automobile Engineering");
	                        break;
	     
	                    	case 6:
	                        System.out.println("=>Industrial Engineering");
	                        System.out.println("=>Metrology and Measuring Instruments");
	                        System.out.println("=>CNC Machines and Automation");
	                        System.out.println("=>Elective");
	                        System.out.println("=>Project Work");
	                        break; 
	                        default:
							System.out.println("Only two semesters are there (5th sem and 6th sem)");
						}
					break;
					default:
					System.out.println("Only three years are allowed...");
				}
			break;
			
			case 4:
			System.out.println("Enter your year = ");
			w=obj.nextInt();
			    switch(w)
				{
					case 1:
					System.out.println("Enter your semester = ");
					m=obj.nextInt();
					    switch(m)
						{
							case 1:
		                    System.out.println("=>Communication Skills-1st");
	                        System.out.println("=>Applied Mathematics-1st");
	                        System.out.println("=>Applied Physics-1st");
	                        System.out.println("=>Applied Chemistry-1st");
	                        System.out.println("=>Engineering Drawing-1st");
	                        System.out.println("=>Engineering Mechanics and Materials");
	                        System.out.println("=>General Workshop Practice-1");
	                        break;
	  
	                        case 2:
	                        System.out.println("=>Electrical Engineering-1st");
	                        System.out.println("=>Applied Mathematics-2nd");
	                        System.out.println("=>Applied Physics-2nd");
	                        System.out.println("=>Applied Chemistry-1st");
	                        System.out.println("=>Basics of Information Technology");
	                        System.out.println("=>Electronic Components and Devices");
	                        System.out.println("=>General Workshop Practice-2nd");
	                        break;
							default:
							System.out.println("Only two semesters are there (1st sem and 2nd sem)");
						}
					break;
					case 2:
					System.out.println("Enter your semester = ");
					n=obj.nextInt();
					    switch(n)
						{
							case 3:
	                        System.out.println("=>Electrical Engineering-2nd");
	                        System.out.println("=>Applied Mathematics-3rd");
	                        System.out.println("=>Environmental Studies");
                       	    System.out.println("=>Electronic Devices and Circuits");
	                        System.out.println("=>Electronics Workshop");
	                        System.out.println("=>Digital Electronics");
	                        System.out.println("=>Universal Human Values");
	                        break;
	  
	                        case 4:
	                        System.out.println("=>Communication Skills-2nd");
	                        System.out.println("=>Industrial Electronics and Transducers");
	                        System.out.println("=>Network Filters and Transmission Line");
	                        System.out.println("=>Electronic Instruments and Measurement");
	                        System.out.println("=>Principles of Communication Engineering");
	                        System.out.println("=>Energy Conservation");
                       	    break;
							default:
							System.out.println("Only two semesters are there (3rd sem and 4th sem)");
		                }
					break;
					case 3:
					System.out.println("Enter your semester = ");
					o=obj.nextInt();
					    switch(o)
						{
							case 5:
	                        System.out.println("---Industrial Training---");
	                        System.out.println("=>Industrial Management & Entrepreneurship Development");
	                        System.out.println("=>Applied Physics-1st");
	                        System.out.println("=>Theory of Machines");
	                        System.out.println("=>Machine Design");
	                        System.out.println("=>Prduction Technology");
	                        System.out.println("=>Production Management");
	                        System.out.println("=>Automobile Engineering");
	                        break;
	  
	                        case 6:
	                        System.out.println("=>Industrial Engineering");
	                        System.out.println("=>Metrology and Measuring Instruments");
	                        System.out.println("=>CNC Machines and Automation");
	                        System.out.println("=>Elective ");
	                        System.out.println("=>Project Work");
                            break;
							default:
							System.out.println("Only two semesters are there (5th sem and 6th sem)");
						}
					break;
					default:
					System.out.println("Only three years are allowed...");
				}
			break;
			default:
			System.out.println("Error... Please press the buttons carefully");
			
			
		}
	}
}