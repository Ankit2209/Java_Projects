package Library_management;
import java.util.Scanner;

	
		public class LibraryProgram{
			public static void main(String[] args)  {
				char r;
			
				do {
				System.out.println("************ Library Management System ************");
				System.out.println("Press 1 for add book ");
				System.out.println("Press 2 for issue a book ");
				System.out.println("press 3 for return a book ");
				System.out.println("press 4 to complete book issue Statement ");
				System.out.println("Press 5 for Exit ");
				Scanner obj=new Scanner(System.in);
				System.out.println(" Enter any number ");
				int  a=obj.nextInt();
				switch(a) {
				case 1:
					Library l=new Library();
					l.add();
					break;
				
			case 2:
				Library l1=new Library();
				l1.issue();
				break;
				
			case 3:
				Library l2=new Library();
				l2.ret();
				break;
				
			case 4:
				Library l3=new Library();
				l3.detail();
				break;
			case 5:
				Library l4=new Library();
				l4.exit();
				break;
				default :
					System.out.println("Invalid numbar ");
			}
				System.out.println(" You want to select next option Y/N");
				r=obj.next().charAt(0);}
				while(r=='y'||r=='Y');
				if(r=='n'||r=='N') {
					Library z=new Library();
					z.exit();
				}
			}
		}
		class Library{
			static String str,b,date;
			static int a,c;

			void add(){
				System.out.println(" Enter Book Name, Price and Book_No");
				Scanner sc=new Scanner(System.in);
				String str= sc.nextLine();
				float price=sc.nextInt();
				int bookNo=sc.nextInt();
				System.out.println(" Your book detail is: Book Name: "+ str+" ,Price is: "+price+" ,Book id is: "+bookNo);

			}
			void issue(){
				Scanner sc1=new Scanner(System.in);
				System.out.println("Book Name");
				str=sc1.nextLine();
				System.out.println("Book_ID");
				a=sc1.nextInt();
				sc1.nextLine();
				System.out.println("Issue Date");
				b=sc1.nextLine();
				System.out.println("Total number of Book Issued");
				c=sc1.nextInt();
				sc1.nextLine();
				System.out.println(" Return Book Date ");
				date=sc1.nextLine();
			}
			int getid() {
				return a;
			}
			
			void ret() {
				System.out.println(" Enter Student_Name & Book_Id");
				Scanner sc2=new Scanner(System.in);
				String name=sc2.nextLine();
				int bookid=sc2.nextInt();
				if(a==bookid){
					System.out.println(" Total Details");
					System.out.println(" Book Name:: "+Library.str);
					System.out.println(" Book Id :: "+Library.a);
					System.out.println(" Issue Date ::"+Library.b);
					System.out.println(" Total number of Book issued :: "+Library.c);
					System.out.println(" Book Return Date :: "+Library.date);
				}
				else {
					System.out.println(" Invalid Id,please Enter Correct id");
				}
			}
			void detail() {
				System.out.println(" Book Name:: "+Library.str);
				System.out.println(" Book Id :: "+Library.a);
				System.out.println(" Issue Date ::"+Library.b);
				System.out.println(" Total number of Book issued :: "+Library.c);
				System.out.println(" Book Return Date :: "+Library.date);
			}
			void exit() {
				System.exit(0);
			}
		
		}
		
		

	
