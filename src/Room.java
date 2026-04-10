import java.math.BigDecimal;

public class Room
{

    private int roomNumber;
    private int beds;
    private boolean hasBalcony;
    private boolean hasSeaView;
    private BigDecimal pricePerNight;




    public Room(int roomNumber, int beds, boolean hasBalcony, boolean hasSeaView, BigDecimal pricePerNight)
    {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;
        this.pricePerNight = pricePerNight;

    }



    //region Getters and Setters
    public int getRoomNumber()
    {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public int getBeds()
    {
        return beds;
    }

    public void setBeds(int beds)
    {
        this.beds = beds;
    }

    public boolean getHasBalcony()
    {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony)
    {
        this.hasBalcony = hasBalcony;
    }

    public boolean getHasSeaView()
    {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView)
    {
        this.hasSeaView = hasSeaView;
    }

    public BigDecimal getPricePerNight()
    {
        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight)
    {
        this.pricePerNight = pricePerNight;
    }

    //endregion

}
