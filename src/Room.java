import java.math.BigDecimal;

public class Room
{

    private int roomNumber;
    private int beds;
    private Boolean hasBalcony;
    private Boolean hasSeaView;
    private BigDecimal pricePerNight;



    private BookingDateAndType bookingDateAndType;

    public Room(int _roomNumber, int _beds, Boolean _hasBalcony, Boolean _hasSeaView, BigDecimal _pricePerNight)
    {
        this.roomNumber = _roomNumber;
        this.beds = _beds;
        this.hasBalcony = _hasBalcony;
        this.hasSeaView = _hasSeaView;
        this.pricePerNight = _pricePerNight;

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

    public Boolean getHasBalcony()
    {
        return hasBalcony;
    }

    public void setHasBalcony(Boolean hasBalcony)
    {
        this.hasBalcony = hasBalcony;
    }

    public Boolean getHasSeaView()
    {
        return hasSeaView;
    }

    public void setHasSeaView(Boolean hasSeaView)
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

    public BookingDateAndType getBookingDateAndType()
    {
        return bookingDateAndType;
    }

    public void setBookingDateAndType(BookingDateAndType bookingDateAndType)
    {
        this.bookingDateAndType = bookingDateAndType;
    }
    //endregion

}
