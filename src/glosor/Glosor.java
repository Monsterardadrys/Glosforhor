package glosor;

/** Ett program för glosförhör 
 * 
 * 1. Ska kunna ta emot input och göra ett fält med frågor och svar. 
 * 2. Första formen av förhör är med svarsalternativ 
 * 3. Andra formen av förhör är utan svarsalternativ där användarens input måste matcha svaret i filen 
 * 4. ska visa statistik över hur många rätt och fel man haft
 * 5. Ska kunna ta en fil och importera glosor med tillhörande svar 
 * 6. ska kunna spara ett fält med frågor och svar i en fil som senare ska gå att importera till programmet
 * 7. ska spara statistiken i en fil som sedan ska gå att importera och bygga vidare på.  
 * 
 * Behöver funktionen: tryck "Q" för att avbryta och gå tillbaka till huvudmenyn. 
 */

import java.util.*; 

public class Glosor
{
    private Scanner userInput; 
    
    private static String[] questionsAnswers; 
    private static String[] statistics; 

    public static void main(String[] args) {
        
    }
    
    /* Visar menyn: 
     * 1. Spela glosförhör med svarsalternativ 
     * 2. Spela glosförhör utan svarsalternativ  
     * 2. Visa statistik 
     * 3. Lägg till frågor och svar 
     * 4. Ta bort frågor och svar
     * 5. Visa facit 
     * 6. Exportera/importera 
     * 6a. Exportera frågor och svar till en fil 
     * 6b. Exportera statistik till en fil 
     * 6c. Importera frågor och svar från en fil 
     * 6d. Importera statistik från en fil 
     * 10. Avsluta programmet
     * 
     */
    private void menu() {
        
    }
    
    /* Visar slumpmässigt frågor från "questionsAnswers" med 3 svarsalternativ 
     * och väntar på svar, om input matchar svaret i fältet bedöms det som rätt 
     * och annars som fel. Lagrar statistik över antal rätt och fel i "statistics" 
     * sorterat efter vilket förhörs-alternativ man valt
     */
    private void quizWithAlternatives() {
        
    }
    
    /* Visar slumpmässigt frågor från "questionsAnswers" och väntar på svar, 
     * om input matchar svaret i fältet bedöms det som rätt och annars som fel 
     * Lagrar statistik över antal rätt och fel i "statistics" sorterat efter 
     * vilket förhörs-alternativ man valt
     */
    private void quizWithoutAlternatives() {
        
    }
    
    /* Lägger till frågor och svar i "questionsAnswers"
     * 
     */
    private void addQA() {
        
    }
    
    /* Visar alla frågor och svar i "questionsAnswers", ber om en siffra som motsvarar index av 
     * frågor för att ta bort dem ur fältet. 
     * 
     */
    private void removeQA() {
        printQA(); 
    }
    
    /* Visar alla frågor och svar i "questionsAnswers"
     * 
     */
    private void printQA() {
        
    }
    
    /* Visar "statistics"
     * 
     */
    private void printStats() {
        
    }
    
    /* Exporterar frågor och svar i "questionsAnswers" till en fil 
     * 
     */
    private void exportQA() {
        
    }
    
    /* Importerar frågor och svar till "questionsAnswers" från en fil 
     * 
     */
    private void importQA() {
        
    }
    
    /* Exporterar fältet "statistics" till en fil 
     * 
     */
    private void exportStats() {
        
    }
    
    /* Importerar startistik till "statistics" från en fil 
     * 
     */
    private void importStats() {
        
    }
}
