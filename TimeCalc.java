
public class TimeCalc {

    public static void main(String[] args) {
        int hours = Integer.parseInt(args[0]);
        int minutes = Integer.parseInt(args[1]);
        int addminutes = Integer.parseInt(args[2]);
        minutes = minutes + addminutes;

        hours += minutes / 60;
        minutes %= 60;

        hours = hours % 24;

        System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes));

    }
}
