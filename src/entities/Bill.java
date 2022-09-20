package entities;

public class Bill {
	private char gender;
	private int beer;
	private int barbecue;
	private int drink;
	
	public Bill(char gender, int beer, int barbecue, int drink) {
		super();
		this.gender = gender;
		this.beer = beer;
		this.barbecue = barbecue;
		this.drink = drink;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBeer() {
		return beer;
	}

	public void setBeer(int beer) {
		this.beer = beer;
	}

	public int getBarbecue() {
		return barbecue;
	}

	public void setBarbecue(int barbecue) {
		this.barbecue = barbecue;
	}

	public int getDrink() {
		return drink;
	}

	public void setDrink(int drink) {
		this.drink = drink;
	}
	
	//Couver Artistico
	public double cover() {
		if(feeding(beer, barbecue, drink) <= 30.0) {
			return 4.0;
		}
		else {
			return 0.0;
		}
	}
	
	//Consumo
	public double feeding(int beer, int barbecue, int drink) {
		return (beer * 5.0) + (barbecue * 7.0) + (drink * 3.0);
	}
	
	//Ingresso, para homens 10, para mulheres 8
	public double ticket(char sexo) {
		if(sexo == 'F' || sexo == 'f') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	//Total
	public double total(char gender, int beer, int barbecue, int drink) {
		return cover() + feeding(beer, barbecue, drink) + ticket(gender);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		double consumo = feeding(beer, barbecue, drink);
		double ingresso = ticket(gender);
		
		sb.append("Consumo: R$ " + String.format("%.2f", consumo));
		if(consumo <= 30.0) {
			sb.append("\nCouver: R$ 4.00");
		}
		else {
			sb.append("\nIsaento de Couver");
		}
		sb.append("\ningresso: " + String.format("%.2f", ingresso));
		sb.append("\n\nValor a pagar: R$" + String.format("%.2f", total(gender, beer, barbecue, drink)));
		
		return sb.toString();
	}
}	
