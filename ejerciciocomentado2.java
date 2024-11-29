package endes;

import java.util.ArrayList;

import javax.smartcardio.Card;
public class ejerciciocomentado2 {
// Método principal que genera, mezcla y muestra cartas
public static void main(String[] args) {// Palos y valores del mazo
String[] suits = { "Spades", "Diamonds", "Club", "Heart" };
String[] values = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };

ArrayList<Card> deck = new ArrayList<Card>(); // Lista dinámica para almacenar cartas

// Crear el mazo de cartas
for (int i = 0; i < suits.length; i++) {
for (int j = 0; j < values.length; j++) {
Card card = new Card(suits[i], values[j]);
deck.add(card);
}
}
// Mezclar el mazo de cartas
for (int i = 0; i < deck.size(); i++) {
int j = (int) Math.floor(Math.random() * i); // Generar índice aleatorio
Card tmp = deck.get(i); // Intercambiar cartas
deck.set(i, deck.get(j));
deck.set(j, tmp);
}
// Mostrar las primeras 5 cartas
for (int i = 0; i < 5; i++) {
	System.out.println(deck.get(i));
	            }
	      }
	}