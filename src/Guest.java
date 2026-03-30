import java.time.LocalDate;

public class Guest
{

    private String name;
    private LocalDate birthDate;

    public Guest(String _name, LocalDate _birthDate)
    {
        this.name = _name;
        this.birthDate = _birthDate;
    }




    //region Getters and Setters
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public String getCzechBirthDateString()
    {
        return (this.birthDate.getDayOfMonth() + "." + this.birthDate.getMonthValue() + "." + this.birthDate.getYear());
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    public String getDescription()
    {
        return this.getName() + " " + this.getCzechBirthDateString();
    }


    //endregion
}
