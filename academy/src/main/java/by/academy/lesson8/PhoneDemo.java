package by.academy.lesson8;

public class PhoneDemo {

	public static void main(String[] args) {
			
		Phone phone1 = new Phone();
		Phone phone2 = new Phone();
		Phone phone3 = new Phone();
		
		Phone phone4 = new Phone("2312434134","sd",8);
		Phone phone5 = new Phone();
		Phone phone6 = new Phone();
		
		System.out.println(phone4.getNumber);
		System.out.println(phone5.getNumber);
		System.out.println(phone6.getNumber);
		
		phone4.receiveCall("bob");
	}

}
