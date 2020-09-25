public class Card {
	
	public String valor;		// Valor de: A,2,3,4,5,6,7,8,9,10,J,Q,K
	public String palo;			// Palo: Treboles: T, Espadas: E, Oros: O, Corazones: C
	public String color;		// Color: Negro (N) y Rojo (R)

	public Card(String valor, String palo, String color) {
		
		this.valor = valor;
		this.palo = palo;
		this.color = color;
	}
	
	public String getValor() {
		return valor;
	}

	public String getPalo() {
		return palo;
	}

	public String getColor() {
		return color;
	}

	@Override
    public String toString() {
        return "Card{" + " Valor=" + valor + " Palo=" + palo + "Color= "+ color + "}";
    }
		
}
