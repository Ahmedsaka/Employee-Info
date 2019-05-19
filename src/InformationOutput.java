import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.GsonBuilder;

public class InformationOutput {
    static Scanner input = new Scanner(System.in);
    static ArrayList<IndividualBlock> employess = new ArrayList<>();
    public static void main(String... args){
        employess.add(new IndividualBlock("Ahmed", "Saka", 200000, "Officer 1","Maryland, Lagos"));
        employess.add(new IndividualBlock("Foluke", "Adefioye", 240000, "Officer 2", "Ikate, Lekki"));
        employess.add(new IndividualBlock("Alero", "Olu", 240000, "Officer 2", "Yaba Lagos"));
        employess.add(new IndividualBlock("Adeyinka", "Adegbenro", 240000, "Officer 2", "Yaba, Lagos"));
        employess.add(new IndividualBlock("Emmanuel", "Onuwhafua", 400000, "Front-line Manager ", "Gowon Estate, Egbeda Lagos"));
        employess.add(new IndividualBlock("Efi", "Okomayin", 291000, "Officer 3", "Dolphin Estate Victoria Island Lagos"));
        employess.add(new IndividualBlock("Oluwatobi", "Odemona", 240000, "Officer 2", "Yaba, Lagos"));
        employess.add(new IndividualBlock("Kingsley", "Alademomi", 240000, "Officer 2", "Yaba Lagos"));
        employess.add(new IndividualBlock("Fisayo", "Idowu", 240000, "Officer 1", "Yaba, Lagos"));
        employess.add(new IndividualBlock("Samson", "Oyetayo", 200000, "Officer 1", "Abule Egba, Lagos"));
        employess.add(new IndividualBlock("Titilope", "Olusoga", 200000, "Officer 1", "Agungi Lekki, Lagos"));

        System.out.print("Enter your first name: ");
        String name1 = input.next();
        System.out.print("Enter your last name: ");
        String name2 = input.next();

        String s1 = name1.substring(0,1).toUpperCase();
        String new_name1 = s1 + name1.substring(1);

        String s2 = name2.substring(0,1).toUpperCase();
        String new_name2 = s2 + name2.substring(1);

        forgotPassword(new_name1, new_name2);

        String individualInfo = new GsonBuilder().setPrettyPrinting().create().toJson(employess.get(1));
        System.out.println(individualInfo);

    }
        static void forgotPassword(String firstName, String lastName){
        try {
            for (int i = 0; i<employess.size(); i++){
                if (employess.get(i).firstName.equals(firstName) && employess.get(i).lastName.equals(lastName)) System.out.println("Check to confirm your password: "+ employess.get(i).getId());
                else if (((!employess.get(i).firstName.equals(firstName) && employess.get(i).lastName.equals(lastName)))||((employess.get(i).firstName.equals(firstName) && !employess.get(i).lastName.equals(lastName)))) System.out.println("Sorry, your details is not on our system");
            }
        }catch (Exception e){
            System.out.println("Please check your input!");
        }

    }
}
