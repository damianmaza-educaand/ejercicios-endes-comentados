package endes;

public class ejerciciocomentado1 {

	// Clase que representa una carta de un mazo
	public String suit; // Palo de la carta (p.ej., Spades)
	public String value; // Valor de la carta (p.ej., Ace)
// Constructor que inicializa el palo y el valor de la carta
public void Card(String suit, String value) {
this.suit = suit;
this.value = value;
}// Devuelve la representación en texto de la carta
public String toString() {
return (this.suit + "-" + this.value);
}
}
