package come.epam.lab.task;

public enum DaysOfWeek {
    MONDAY("First"), TUESDAY("Second"), WEDNESDAY("Third"), THURSDAY("Fourth"), FRIDAY("Fifth"), SATURDAY("Sixth"), SUNDAY("Seventh");

    String numInRow;

     DaysOfWeek(String numberOfDay) {
         this.numInRow = numberOfDay;
    }

    public String getNumberInWeekRow() {
         return numInRow;
    }
}
