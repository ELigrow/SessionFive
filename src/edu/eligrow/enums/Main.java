package edu.eligrow.enums;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter the first three letters of your favorite NFC team or their mascot: ");
        Scanner keyboard = new Scanner(System.in);
        String team = keyboard.nextLine();

        try {

            team = team.toUpperCase();

            if (Team.valueOf(team) != null) {
                System.out.println(Team.valueOf(team).getValue());
            }

        } catch (Exception e) {

        }try {

            if (Mascot.valueOf(team) != null) {
                System.out.println(Mascot.valueOf(team).getValue());
            }

        } catch (Exception e) {
        }
    }

    public enum Team{
    	GRE("Green Bay Packers"), CHI("Chicago Bears"), DET("Detroit Lions"), MIN("Minnesota Vikings"),
		SAN("San Francisco Forty-Niners"), SEA("Seattle Seahawks"), LOS("Los Angeles Rams"),
		NEW("New York Giants"), DAL("Dallas Cowboys"), PHI("Philadelphia Eagles"), WAS("Washington Redskins"),
		TAM("Tampa Bay Buccaneers"), CAR("Carolina Panthers"), ATL("Atlanta Falcons");

        private String value;

        Team(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }


	}
	public enum Mascot{
        PAC("Green Bay Packers"), BEA("Chicago Bears"), LIO("Detroit Lions"), VIK("Minnesota Vikings"),
        FOR("San Francisco Forty-Niners"), SEA("Seattle Seahawks"), RAM("Los Angeles Rams"),
        GIA("New York Giants"), COW("Dallas Cowboys"), EAG("Philadelphia Eagles"), RED("Washington Redskins"),
        BUC("Tampa Bay Buccaneers"), PAN("Carolina Panthers"), FAL("Atlanta Falcons");

        private String value;

        private Mascot(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
