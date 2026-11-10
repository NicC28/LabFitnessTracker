import java.util.Scanner;

class workout{
    String type;
    int duration;

    void  showWorkout()
    {
        System.out.println("Workout: " + type);
        System.out.println("Duration: " + duration + " minutes");
    }
}

class RunningWorkout extends workout
{
    double distance;
    void showDetails()
    {
        showWorkout();
        System.out.println("Distance: " + distance + " km");
        System.out.println("Calories burned: " + (distance*60));
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        RunningWorkout workout = new RunningWorkout();
        System.out.print("Enter Workout Type: ");
        workout.type = input.nextLine();
        System.out.print("Enter Duration(minutes): ");
        workout.duration = input.nextInt();
        System.out.print("Enter distance (km): ");
        workout.distance = input.nextDouble();
        System.out.println("Workout Summary:");
        workout.showDetails();

    }
}