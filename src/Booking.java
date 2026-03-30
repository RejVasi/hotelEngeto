import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Booking
{


    private Room room;
    private Guest mainGuest;
    private List<Guest> otherGuests;


    private BookingDateAndType bookingDateAndType;

    // All information filled
    public Booking(Room _room, BookingDateAndType _roomBookingDateAndType, Guest _mainGuest, Guest[] _otherGuests)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;
        this.otherGuests = Arrays.asList(_otherGuests);

        this.bookingDateAndType = _roomBookingDateAndType;
    }

    // Room, main and other guests filled no booking date and type
    public Booking(Room _room, Guest _mainGuest, Guest[] _otherGuests)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;
        this.otherGuests = Arrays.asList(_otherGuests);

        this.bookingDateAndType = new BookingDateAndType();
    }

    // Room, booking date + type and main Guest filled, no other guest
    public Booking(Room _room, BookingDateAndType _roomBookingDateAndType, Guest _mainGuest)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;

        this.bookingDateAndType = _roomBookingDateAndType;

    }
    // Room and main Guest filled, no other guest + no booking date and type
    public Booking(Room _room, Guest _mainGuest)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;

        this.bookingDateAndType = new BookingDateAndType();

    }

    //region Getters and Setters
    public Room getRoom()
    {
        return room;
    }

    public void setRoom(Room room)
    {
        this.room = room;
    }

    public Guest getMainGuest()
    {
        return mainGuest;
    }

    public void setMainGuest(Guest mainGuest)
    {
        this.mainGuest = mainGuest;
    }

    public List<Guest> getOtherGuests()
    {
        return otherGuests;
    }

    // To print out array of other guests in Main loop
    public List<String> getOtherGuestsNames()
    {

        List<String> guestArr = new ArrayList<>();
        List<Guest> guestList = getOtherGuests();
        if (guestList != null)
        {
            for (Guest guest : guestList)
            {
                guestArr.add(guest.getName());
            }
        }
        return guestArr;

    }

    public void setOtherGuests(List<Guest> otherGuests)
    {
        this.otherGuests = otherGuests;
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
