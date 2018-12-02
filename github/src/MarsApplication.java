public class MarsApplication {
    public static void main(String[] args) {
        MarsRobot spirit = new MarsRobot();
        MarsRobot opportunity = new MarsRobot();
        spirit.status = "eksploracja";
        spirit.speed = 2;
        spirit.temperature = -60;
        spirit.showAttributes();

        System.out.println("Zwiększenie prędkości do 3.");
        spirit.speed = 3;
        spirit.showAttributes();

        System.out.println("Zmiana temperatury na -90.");
        spirit.temperature = -90;
        spirit.showAttributes();

        System.out.println("Sprawdzenie temperatury.");
        spirit.checkTemperature();
        spirit.showAttributes();


        opportunity.status = "eksploracja";
        opportunity.speed = 2;
        opportunity.temperature = -60;
        opportunity.showAttributes();

        System.out.println("Zwiększenie prędkości opportunity do 3.");
        opportunity.speed = 3;
        opportunity.showAttributes();

        System.out.println("Zmiana temperatury opportunity na -90.");
        opportunity.temperature = -90;
        opportunity.showAttributes();

        System.out.println("Sprawdzenie temperatury opportunity.");
        opportunity.checkTemperature();
        opportunity.showAttributes();











    }
}
