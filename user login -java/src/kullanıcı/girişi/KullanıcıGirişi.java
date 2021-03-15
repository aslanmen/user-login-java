/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kullanıcı.girişi;

import java.util.Scanner;

/**
 *
 * @author aasla
 */
public class KullanıcıGirişi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int giris_hakkı=3;
        String kullanıcı_adı="ahmet aslan";
        String parola="12345";
        
        System.out.println("******************************");
        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("******************************");
        
        while(true){
            System.out.println("kullanıcı adınız :");
            String kullanıcı=input.nextLine();
            System.out.println("parolanız :");
            String parolanız=input.nextLine();
            if (kullanıcı_adı.equals(kullanıcı) && parola.equals(parolanız)) {
                System.out.println("Hoşgeldiniz :"+kullanıcı);
                break;
            }
            else if (kullanıcı_adı.equals(kullanıcı) && !parola.equals(parolanız)) {
                System.out.println("Parolanız yanlış...");
                giris_hakkı--;
            }
            else if (!kullanıcı_adı.equals(kullanıcı) && parola.equals(parolanız)) {
                System.out.println("Kullanıcı adınız yanlış...");
                giris_hakkı--;
                System.out.println("Kalan giriş hakkı :"+giris_hakkı);
            }
            else{
                System.out.println("Kullanıcı adınız ve parolanız yanlış...");
                giris_hakkı--;
                System.out.println("Kalan giriş hakkı :"+giris_hakkı);
            }
            if (giris_hakkı==0) {
                System.out.println("Giriş hakkınız bitti. Tekrar deneyiniz...");
                break;
            }
         
        
        }
        
    }
    
}
