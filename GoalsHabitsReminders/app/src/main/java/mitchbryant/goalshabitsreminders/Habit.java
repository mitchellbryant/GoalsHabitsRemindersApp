package mitchbryant.goalshabitsreminders;

/**
 * Created by Mitchell Bryant on 7/17/2018
 */
public class Habit {



    private long habitID;
    private Boolean isNew;
    private String name;
    private String frequency;
    private String days;
    private String timesPerWeek;
    private String timeOfMonth;
    private String generalTimeOfDay;
    private String exactTimeOfDay;

    public long getHabitID() {
        return habitID;
    }

    public void setHabitID(long habitID) {
        this.habitID = habitID;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public String getTimesPerWeek() {
        return timesPerWeek;
    }

    public void setTimesPerWeek(String timesPerWeek) {
        this.timesPerWeek = timesPerWeek;
    }

    public String getTimeOfMonth() {
        return timeOfMonth;
    }

    public void setTimeOfMonth(String timeOfMonth) {
        this.timeOfMonth = timeOfMonth;
    }

    public String getGeneralTimeOfDay() {
        return generalTimeOfDay;
    }

    public void setGeneralTimeOfDay(String generalTimeOfDay) {
        this.generalTimeOfDay = generalTimeOfDay;
    }

    public String getExactTimeOfDay() {
        return exactTimeOfDay;
    }

    public void setExactTimeOfDay(String exactTimeOfDay) {
        this.exactTimeOfDay = exactTimeOfDay;
    }
}
