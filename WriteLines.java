import java.io.*;

public class WriteLines {
    private String filename;

    public WriteLines(String filename) {
        this.filename = filename;
    }

    public void writeToFile() throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter(filename));
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Inserisci delle linee. Per terminare scrivi una linea vuota.");
        String linea = input.readLine();
        
        while (!linea.equals("")) {
            output.println(linea);
            linea = input.readLine();
        }
        
        input.close();
        output.close();
        System.out.println("Scrittura su file completata.");
    }
}
