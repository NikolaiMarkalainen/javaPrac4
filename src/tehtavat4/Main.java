/*************************************
 Tekijä: Nikolai Markalainen
 Jakson numero: AVE1017-3009 Java ohjelmointi
 Jakson tehtävänumero: Jakso 2 Tehtävät 4.1 - 4.4
 Päiväys: 28.05.2022
 *************************************/

package tehtavat4;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args){
        // 4.1
    Scanner sc = new Scanner(System.in);
    System.out.println("Syota arvo 1-7 saata sille vastaavan paivan: ");
    int mikaPaiva = sc.nextInt();
    switch(mikaPaiva){
        case 1:{
            System.out.println("Maanantai");
            break;
        }
        case 2:{
            System.out.println("Tiistai");
            break;
        }
        case 3:{
            System.out.println("Keskiviikko");
            break;
        }
        case 4:{
            System.out.println("Torstai");
            break;
        }
        case 5:{
            System.out.println("Perjantai");
            break;
        }
        case 6:{
            System.out.println("Lauantai");
            break;
        }
        case 7:{
            System.out.println("Sunnuntai");
            break;
        }
        default:{
            System.out.println("Syota arvo 1-7 valilta! ");
        }
    }
    //4.2, 4.3
        int a = (int) 'a';
        int e = (int) 'e';
        int i = (int) 'i';
        int o = (int) 'o';
        int u = (int) 'u';
        int y = (int) 'y';
        System.out.println("Syota vokaaali: ");
        String vokaali = sc.next();
        switch(vokaali){
            case "a":{
                System.out.println("a on ensimmainen vokaali kirjaimen ASCII arvo on " + a);
                break;
            }
            case "e":{
                System.out.println("e on toinen vokaali ASCII arvo on " + e);
                break;
            }
            case "i":{
                System.out.println("i on kolmas vokaali ASCII arvo on " + i);
                break;
            }
            case "o":{
                System.out.println("o on neljas vokaali ASCII arvo on " + o);
                break;
            }
            case "u":{
                System.out.println("u on viidennes vokaali ASCII arvo on " + u);
                break;
            }
            case "y":{
                System.out.println("y on kuudennes vokaali ASCII arvo on "+ y);
                break;
            }
            default:{
                System.out.println("Syota vokaalit pienena kirjaimena");
                break;
            }
        }
        // 4.4
        System.out.println("Syota ASCII koodi: ");
        int asciiArvo = sc.nextInt();
        char kirjain = (char) asciiArvo;
        System.out.println("Merkki antamallasi ascii koodilla on: " + kirjain);
    }


}
