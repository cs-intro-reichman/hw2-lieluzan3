
public class TimeCalc {

    public static void main(String[] args) {
        String time =args[0];
        int hours = Integer.parseInt(time.split(":")[0]);
        int minutes =Integer.parseInt( time.split(":")[1]);
        int addminutes = Integer.parseInt(args[1]);
        minutes = minutes + addminutes;

        hours += minutes / 60;
        minutes %= 60;

        hours = hours % 24;

        System.out.println(String.format("%02d", hours) + ":" + String.format("%02d", minutes));

    }
}
