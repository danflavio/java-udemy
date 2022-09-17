package exercicios_fixacao;

import java.util.Locale;

public class SaidaEntradaDados {
	private String product1 = "Computer";
	private String product2 = "Office desk";
	private int age = 30;
	private int code = 5290;
	private char gender = 'F';
	double price1 = 2100.00;
	double price2 = 650.50;
	double measure = 53.234567;

	public String getProduct1() {
		return product1;
	}

	public void setProduct1(String product1) {
		this.product1 = product1;
	}

	public String getProduct2() {
		return product2;
	}

	public void setProduct2(String product2) {
		this.product2 = product2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public double getPrice1() {
		return price1;
	}

	public void setPrice(double price1) {
		this.price1 = price1;
	}

	public double getPrice2() {
		return price2;
	}

	public void setPrice2(double price2) {
		this.price2 = price2;
	}

	public double getMeasure() {
		return measure;
	}

	public void setMeasure(double measure) {
		this.measure = measure;
	}

	@Override
	public String toString() {
		return "SaidaEntradaDados [product1=" + product1 + ", product2=" + product2 + ", age=" + age + ", code=" + code
				+ ", gender=" + gender + ", price1=" + price1 + ", price2=" + price2 + ", measure=" + measure + "]";
	}
	
	public void printInfo() {
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", this.getProduct1(), this.getPrice1());
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender: %c %n", this.getAge(), this.getCode(), this.getGender());
		System.out.println();
		System.out.printf("Measue with eight decimal places: %.8f %n", this.getMeasure());
		System.out.printf("Rouded (three decimal places): %.3f %n", this.getMeasure());
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f %n", this.getMeasure());
	}
}
