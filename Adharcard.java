import java.util.*;
class adhar
{
	public String name;
	private long adharcard;
	private long phNo;
	private int age;
	public static String nationality="Indian";
	
	public adhar(String name,long adharcard,long phNo,int age)
	{
		this.name=name;
		this.adharcard=adharcard;
		this.phNo=phNo;
		this.age=age;
	}
	public long getadhar()
	{
		return adharcard;
	}
	public long getphone()
	{
		return phNo;
	}
	public int getage()
	{
		return age;
	}
	public void setadhar(long newadhar)
	{
		adharcard=newadhar;
	}
	public void setphone(long newphone)
	{
		phNo=newphone;
	}
	public void setage(int newage)
	{
		age=newage;
	}

}


class Adharcard
{
	static Scanner s=new Scanner(System.in);
	public static void main(String []sp)throws Exception
	{
		adhar s1=new adhar("Santhosh",12345,9080755564L,21);
		adhar s2=new adhar("Pushpalatha",54321,8870064173L,20);
		adhar s3=new adhar("Satha",67891,9080764173L,12);
		
		System.out.println("Select Number Your Want");
		System.out.println("________________________");


		System.out.println("1."+s1.name);
		System.out.println("2."+s2.name);
		System.out.println("3."+s3.name);
		
		int input=s.nextInt();
		
		switch (input)
		{
		case 1:
			{
			System.out.println("Name:"+s1.name);
			System.out.println("Adhar Number:"+s1.getadhar());
			System.out.println("Phone Number:"+s1.getphone());
			System.out.println("Age:"+s1.getage());
			System.out.println("Nationality:"+s1.nationality);
			System.out.println("===============================");
			Thread.sleep(3000);
			System.out.println("\t\tYou can Modify Here,>>>\n\t\t\t1.Adharcard\n\t\t\t2.Phone Number\n\t\t\t3.Age");
			
			int input1=s.nextInt();
			switch (input1)//santhosh
			{
			case 1:
				{
				    System.out.println("Enter New Adhar Number!");
					long a=s.nextLong();
					//s1.setadhar(s.nextLong());
					s1.setadhar(a);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s1.getadhar());
					break;
				}
			case 2:
				{
					System.out.println("Enter New Phone Number!");
					long b=s.nextLong();
					s1.setphone(b);
					System.out.println("After Modifying...*");
                    Thread.sleep(1000);					
					System.out.println(s1.getphone());
					break;
				}
			case 3:
				{
					System.out.println("Enter New Update Age!");
					int c=s.nextInt();
					s1.setage(c);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s1.getage());
					break;
				}
			
			}
			break;
			}
		case 2:
			{
			System.out.println("Name:"+s2.name);
			System.out.println("Adhar Number:"+s2.getadhar());
			System.out.println("Phone Number:"+s2.getphone());
			System.out.println("Age:"+s2.getage());
			System.out.println("Nationality:"+s2.nationality);
			System.out.println("===============================");
			Thread.sleep(3000);
			System.out.println("\t\tYou can Modify Here,>>>\n\t\t\t1.Adharcard\n\t\t\t2.Phone Number\n\t\t\t3.Age");
			
			int input2=s.nextInt();
			switch (input2)//Pushpalatha
			{
			case 1:
				{
				    System.out.println("Enter New Adhar Number!");
					long a=s.nextLong();
					//s1.setadhar(s.nextLong());
					s2.setadhar(a);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s2.getadhar());
					break;
				}
			case 2:
				{
					System.out.println("Enter New Phone Number!");
					long b=s.nextLong();
					s2.setphone(b);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s2.getphone());
					break;
				}
			case 3:
				{
					System.out.println("Enter New Update Age!");
					int c=s.nextInt();
					s2.setage(c);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s2.getage());
					break;
				}
			
			}			
			
			
			break;
			}
		case 3:
			{
			System.out.println("Name:"+s3.name);
			System.out.println("Adhar Number:"+s3.getadhar());
			System.out.println("Phone Number:"+s3.getphone());
			System.out.println("Age:"+s3.getage());
			System.out.println("Nationality:"+s3.nationality);
			System.out.println("===============================");
			Thread.sleep(3000);
			System.out.println("\t\tYou can Modify Here,>>>\n\t\t\t1.Adharcard\n\t\t\t2.Phone Number\n\t\t\t3.Age");
			
			
			int input3=s.nextInt();
			switch (input3)//Satha
			{
			case 1:
				{
				    System.out.println("Enter New Adhar Number!");
					long a=s.nextLong();
					//s1.setadhar(s.nextLong());
					s3.setadhar(a);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s3.getadhar());
					break;
				}
			case 2:
				{
					System.out.println("Enter New Phone Number!");
					long b=s.nextLong();
					s3.setphone(b);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s3.getphone());
					break;
				}
			case 3:
				{
					System.out.println("Enter New Update Age!");
					int c=s.nextInt();
					s3.setage(c);
					System.out.println("After Modifying...*");
					Thread.sleep(1000);
					System.out.println(s3.getage());
					break;
				}
			
			}			
			
			
			break;
			}
		
		}
		
	}
}