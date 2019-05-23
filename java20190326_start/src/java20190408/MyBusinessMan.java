package java20190408;

class Man{
	String name;
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man {
	String company;
	String position;
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position );
		tellYourName();
	}
	public BusinessMan(String name, String company, String position) {
        this.name = name;
        this.company = company;
        this.position = position;
    }
}


class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
        
	man.tellYourInfo();
    }
}