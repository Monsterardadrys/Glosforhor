package glosor;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;

/**
 * Ett program för glosförhör
 * 
 * 1. Ska kunna ta emot input och göra ett fält med frågor och svar. 2. Första
 * formen av förhör är med svarsalternativ 3. Andra formen av förhör är utan
 * svarsalternativ där användarens input måste matcha svaret i filen 4. ska visa
 * statistik över hur många rätt och fel man haft 5. Ska kunna ta en fil och
 * importera glosor med tillhörande svar 6. ska kunna spara ett fält med frågor
 * och svar i en fil som senare ska gå att importera till programmet 7. ska
 * spara statistiken i en fil som sedan ska gå att importera och bygga vidare
 * på.
 * 
 * Behöver funktionen: tryck "Q" för att avbryta och gå tillbaka till
 * huvudmenyn.
 */

import java.util.*;

public class Glosor
{
    private static Scanner userInput = new Scanner(System.in);
    private static File file;
    private static Scanner fileScanner;

    private static List<String> questionsAnswers = new ArrayList<String>();
    private static String[] statistics;
    private static String clearBuffer;
    private static int fileCounter = 1;

    public static void main(String[] args)
    {
        int menuOption1 = 0;
        int menuOption2 = 0;

        System.out.println("-- Välkommen till glosförhör! --");

        while(menuOption1 != 7)
        {
            menu1();
            menuOption1 = integerInput();

            switch(menuOption1)
            {
                case 1:
                    while(menuOption2 != 3)
                    {
                        menu2();
                        menuOption2 = integerInput();
                        switch(menuOption2)
                        {
                            case 1:
                                quizWithAlternatives();
                                break;
                            case 2:
                                quizWithoutAlternatives();
                                break;
                        }
                    }
                    menuOption2 = 0;
                    break;
                case 2:
                    printStats();
                    break;
                case 3:
                    addQA();
                    break;
                case 4:
                    removeQA();
                    break;
                case 5:
                    printQA();
                    break;
                case 6:
                    while(menuOption2 != 5)
                    {
                        menu3();
                        menuOption2 = userInput.nextInt();
                        switch(menuOption2)
                        {
                            case 1:
                                exportQA();
                                break;
                            case 2:
                                exportStats();
                                break;
                            case 3:
                                importQA();
                                break;
                            case 4:
                                importStats();
                                break;
                        }
                    }
                    break;
            }
        }
        System.out.println("Program is closing.");
        userInput.close();
        System.exit(0);
    }

    /*
     * Visar menyn: 1. Spela glosförhör 2. Visa statistik 3. Lägg till frågor
     * och svar 4. Ta bort frågor och svar 5. Visa facit 6. Exportera/importera
     * 7. Avsluta programmet
     */
    private static void menu1()
    {
        System.out.print(
                "\n1. Spela glosförhör\n2. Visa statistik\n3. Lägg till frågor och svar\n4. Ta bort frågor och svar. \n5. Visa facit\n6. Importera/exportera.\n7. Avsluta programmet.\n> ");
    }

    /*
     * Visar menyn: 1. med svarsalternativ 2. utan svarsalternativ 3. Tillbaka
     * till huvudmenyn
     */
    private static void menu2()
    {
        System.out.print(
                "\n1. Spela glosförhör med svarsalternativ\n2. Spela glosförhör utan svarsalternativ\n3. Tillbaka till huvudmenyn\n> ");
    }

    /*
     * Visar menyn: 1. Exportera frågor och svar till en fil 2. Exportera
     * statistik till en fil 3. Importera frågor och svar från en fil 4.
     * Importera statistik från en fil 5. Tillbaka till huvudmenyn
     * 
     */
    private static void menu3()
    {
        System.out.print(
                "\n1. Exportera frågor och svar till en fil\n2. Exportera statistik till en fil\n3. Importera frågor och svar från en fil\n4. Importera statistik från en fil\n5. Tillbaka till huvudmenyn\n> ");
    }

    private static int integerInput()
    {
        int integer = 0;

        if(userInput.hasNextInt())
        {
            integer = userInput.nextInt();
        }
        else
        {
            String clearBuffer = userInput.nextLine();
        }
        clearBuffer = userInput.nextLine();

        return integer;
    }

    /*
     * Visar slumpmässigt frågor från "questionsAnswers" med 3 svarsalternativ
     * och väntar på svar, om input matchar svaret i fältet bedöms det som rätt
     * och annars som fel. Lagrar statistik över antal rätt och fel i
     * "statistics" sorterat efter vilket förhörs-alternativ man valt
     */
    private static void quizWithAlternatives()
    {

    }

    /*
     * Visar slumpmässigt frågor från "questionsAnswers" och väntar på svar, om
     * input matchar svaret i fältet bedöms det som rätt och annars som fel
     * Lagrar statistik över antal rätt och fel i "statistics" sorterat efter
     * vilket förhörs-alternativ man valt
     */
    private static void quizWithoutAlternatives()
    {

    }

    /*
     * Lägger till frågor och svar i "questionsAnswers"
     * 
     */
    private static void addQA()
    {

    }

    /*
     * Visar alla frågor och svar i "questionsAnswers", ber om en siffra som
     * motsvarar index av frågor för att ta bort dem ur fältet.
     * 
     */
    private static void removeQA()
    {
        printQA();
    }

    /*
     * Visar alla frågor och svar i "questionsAnswers"
     * 
     */
    private static void printQA()
    {
        int counter = 0; 
        for(String question : questionsAnswers)
        {
            System.out.println(question);
            counter++;
        }
    }

    /*
     * Visar "statistics"
     * 
     */
    private static void printStats()
    {

    }

    /**
     * 
     * @param strings
     * @param fileName
     * @param fileCounter
     * @throws IOException
     */
    private static void export(List<String> list, String fileName, int fileCounter) throws IOException
    {
        Date date = new Date();
        String dateFormat = DateFormat.getDateInstance(1, new Locale("sv", "SE")).format(date);
        try(FileWriter fileWriter = new FileWriter(dateFormat + " " + fileCounter + " " + fileName))
        {
            for(String str : list)
            {
                fileWriter.write(str + "\n");
            }
        }
    }

    /*
     * Exporterar frågor och svar i "questionsAnswers" till en fil
     * 
     */
    private static void exportQA()
    {
        System.out.println("Spara frågor och svar till en fil. Ange ett filnamn: ");
        String fileName = userInput.nextLine();

        try
        {
            export(questionsAnswers, fileName, fileCounter);
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * Exporterar fältet "statistics" till en fil
     * 
     */
    private static void exportStats()
    {
        System.out.println("Spara statistik till en fil. Ange ett filnamn: ");
        String fileName = userInput.next();

        try
        {
            export(questionsAnswers, fileName, fileCounter);
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /*
     * Importerar frågor och svar till "questionsAnswers" från en fil
     * 
     */
    private static List<String> importer(String fileName) throws IOException
    {
        file = new File(fileName);
        fileScanner = new Scanner(file);
        List<String> list = new ArrayList<String>();
        String[] tempList = null;

        while(fileScanner.hasNext())
        {
            String line = fileScanner.nextLine();
            tempList = line.split(", ");
            for(int i = 0; i < tempList.length; i++)
            {
                list.add(tempList[i]);
            }
        }

        return list;
    }

    /*
     * Importerar frågor och svar till "questionsAnswers" från en fil
     * 
     */
    private static void importQA()
    {
        System.out.println("Hämta frågor och svar från en fil. Ange ett filnamn: ");
        String fileName = userInput.next();
        List<String> questions = null;
        try
        {
            questions = importer(fileName);
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("File not found" + e.getMessage());
        }

        for(String string: questions)
        {
            System.out.println(string);
            questionsAnswers.add(string);
        }
    }

    /*
     * Importerar startistik till "statistics" från en fil
     * 
     */
    private static void importStats()
    {
        System.out.println("Hämta statistik från en fil. Ange ett filnamn: ");
        String fileName = userInput.next();
        List<String> stats = null;

        try
        {
            stats = importer(fileName);
        }
        catch(IOException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("File not found" + e.getMessage());
        }

        for(String string: stats)
        {
            questionsAnswers.add(string);
        }
    }
}
