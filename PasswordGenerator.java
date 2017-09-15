/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordgenerator;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Pundo
 */
public class PasswordGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int length = 10;
        System.out.println(generatePswd(length));
       // JOptionPane.showMessageDialog(null,generatePswd(length));
    }
    static char[] generatePswd(int len){
        System.out.println("Your Password: ");
         String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         String chars = "abcdefghijklmnopqrstuvwxyz";
         String nums =  "0123456789";
         String symbols = "!@#$%^&*_-=+?<>";
         
         String passSymbols = charsCaps + chars + nums + symbols;
         Random sid =  new Random();
         
         char[] password = new char[len];
            int index = 0;
            for (int i = 0 ; i<len;i++){
                password[i] = passSymbols.charAt(sid.nextInt(passSymbols.length()));
                
            }
            return password;
    }
    
}
