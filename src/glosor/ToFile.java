package glosor;

import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class ToFile
{
    /**
     * Creates a text file from an array of strings.
     *
     * @param strings
     *            The array of strings to be written to the text file.
     * @param fileName
     *            The name of the text file to be created.
     * @throws IOException
     *             if an I/O error occurs while writing to the file.
     */
    public static void createTextFile(String[] strings, String fileName, int fileCounter) throws IOException
    {
        Date date = new Date();
        String dateFormat = DateFormat.getDateInstance(1, new Locale("sv", "SE")).format(date);
        try(FileWriter fileWriter = new FileWriter(dateFormat + " " + fileCounter + " " + fileName))
        {
            for(String str : strings)
            {
                fileWriter.write(str + "\n");
            }
        }
    }

    // Usage Example
    public static void main(String[] args)
    {
        int fileCounter = 1;
        String[] content = { "Hello", "World!", "This is a text file." };
        String fileName = "output.txt";

        while(fileCounter <= 10)
        {
            try
            {
                createTextFile(content, fileName, fileCounter++);
                System.out.println("Text file created successfully.");
            }
            catch(IOException e)
            {
                System.err.println("An error occurred while creating the text file: " + e.getMessage());
            }
        }

    }
}
