import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck{
	
	ArrayList<Card> baraja;
	
	public int Deck(){
		
		String valor[] = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
		String palo[]= {"Treboles", "Espadas", "Oros", "Corazones"};
		String color[] = {"Negro", "Rojo"};
		//Card baraja[];
		ArrayList<Card> baraja = new ArrayList<Card>();
		
		for(int i=0;i<2;i++){
			for(int j=0;j<4;j++) {
				for(int k=0;k<13;k++) {	
					baraja.add(new Card(valor[i], palo[j], color[k]));					
				}
								
			}
            
        }
		return 0;
	   
	}
	
	public void shuffle() {
		Collections.shuffle(baraja);
		System.out.println("La baraja fue mezclada");
	}
	
	//Remover ultima carta de la baraja
	public void head() {
		System.out.println("La ultima carta: " + ""+ "" + palo + "" + valor);
		baraja.remove(0);
	}
	
	public Card pick(String p) {
		System.out.println("Valor de carta: " + valor + palo + color);
		baraja.remove[0];
	}
	
	public void hand(Card c) {
		baraja.add(c);
	}
	
}
