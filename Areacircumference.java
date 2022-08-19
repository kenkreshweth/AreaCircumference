

public class Areacircumference {
	public static void main(String[] args)
	{
		int r;
		float cir,area,pi=3.14f;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the radius of a circle");
		r=s.nextInt();
		cir=2*pi*r;
		area=2*pi*r*r;
		System.out.println("The circumference is "+cir+" The area is "+area);
	}
}
