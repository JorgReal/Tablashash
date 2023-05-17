/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tablashash;

/**
 *
 * @author Real
 */
import java.util.HashMap;

public class Tablashash {
    public static void main(String[] args) {
        //String multilineText = "Hello world!\nThis is a multiline text.\nIt contains multiple lines.";
        String multilineText = "int suma = 0;\nsuma = 54 + 20;";
        HashMap<String, String> tokenTable = new HashMap<>();

        String[] lines = multilineText.split("\n");
        for (int row = 0; row < lines.length; row++) {
            String line = lines[row];
            String[] tokens = line.split("\\s+"); // Dividir por espacios en blanco
            for (int col = 0; col < tokens.length; col++) {
                String token = tokens[col];
                String hashKey = row + "," + col;
                tokenTable.put(hashKey, token);
            }
        }

        // Imprimir la tabla hash
        for (String hashKey : tokenTable.keySet()) {
            String token = tokenTable.get(hashKey);
            System.out.println("Clave Hash: " + hashKey + ", Token: " + token);
        }
    }
}
