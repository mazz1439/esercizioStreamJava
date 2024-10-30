import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        WriteLines writeLines = new WriteLines("output.txt");
        try {
            writeLines.writeToFile();
        } catch (IOException e) {
            System.err.println("Errore durante la scrittura su file: " + e.getMessage());
        }
    }
}
