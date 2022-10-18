package src;

import javax.xml.namespace.QName;
import java.awt.*;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.*;


class Goblin{
        public String name;
        protected double health;
        protected double stamina;
        protected double speed;
        protected double size;

        private String defaultGoblin = "glibglob";
        protected double defaultHealth = 40.00;
        protected double defaultStamina = 50.00;
        protected double defaultSpeed = 20.00;
        protected double defaultSize = 10.00;

        public Goblin(){
            this.name = defaultGoblin;
            this.health = defaultHealth;
            this.stamina = defaultStamina;
            this.speed = defaultSpeed;
            this.size = defaultSize;

            System.out.println("-------| " + "\u001B[32m" + "Created new goblin: DEFAULT" + "\u001B[0m" + " |-------");
        }
        public Goblin(String goblinName){
            System.out.println("-------| " + "\u001B[32m" + "Created new goblin: " + "\u001B[0m" + goblinName + " |-------");
            this.name = goblinName;
        }

        public void createGoblin(){
           if(this.size < 10){
               this.health = 77;
               this.stamina = 89;
               this.speed = 100;

           } else if (this.size < 40) {
               this.health = 88;
               this.stamina = 77;
               this.speed = 84;

           } else if (this.size < 70) {
               this.health = 100;
               this.stamina = 55;
               this.speed = 68;

           }
        }
        public void printGoblinData(){
            System.out.format("Goblin Name: %s\n", this.name);
        }
        public void goblinBattleCry(){
            System.out.printf("%s goes AHHHHHHHHHH", this.name);
        }

    }



class Swindler extends Goblin{
    public Swindler(){
        this.name = "Swindler";
        this.health = super.defaultHealth;
        this.stamina = super.defaultStamina;
        this.speed = super.defaultSpeed;
        this.size = super.defaultSize;
    }
}

class Employee{
    public static String company = "Veridian Dynamics";
    public String name;
    public void displayEmployee(){
        System.out.println(this.name);
    }
}

public class Main {
    private static final DateFormat full = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

    public static void bark(){
        System.out.println("Woof Woof");
    }
    public static void bark(int weight) throws IOException {
        if(weight > 30){
            System.out.println("WOOOOOOF!");
        }else{
            System.out.println("woof woof....woof?");
            int byteStream = System.in.read();
        }
    }




    public static void main(String[] args) throws IOException{
        Goblin gargonian = new Goblin("Lustafa");
        new Goblin("Garbage");
        gargonian.printGoblinData();
        gargonian.name = "Mackeral";
        gargonian.printGoblinData();
        Goblin chicken = new Goblin("Chicken");
        chicken.goblinBattleCry();
        Swindler swindler =  new Swindler();
        chicken = swindler;
        chicken.printGoblinData();

        JFrame frame =  new JFrame();
        JButton goblinAttack = new JButton("Attack Goblin");
        goblinAttack.setBounds(130,100,100,40);
        frame.setBackground(Color.decode("#1B1B1B"));
        JTextArea Type = new JTextArea();
        Type.setBounds(200,200,200,200);
        frame.add(goblinAttack);
        frame.add(Type);
        frame.setSize(800,500);
        frame.setVisible(true);

    }
}