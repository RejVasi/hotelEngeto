import java.security.interfaces.RSAMultiPrimePrivateCrtKey;
import java.util.ArrayList;
import java.util.List;

public class Booking
{
    private Room room;
    private Guest mainGuest;
    private List<Guest> otherGuests;

    public Booking(Room _room, BookingDateAndType _roomBookingDateAndType, Guest _mainGuest, List<Guest> _otherGuests)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;
        this.otherGuests = _otherGuests;

        this.room.setBookingDateAndType(_roomBookingDateAndType);
    }

    public Booking(Room _room, BookingDateAndType _roomBookingDateAndType, Guest _mainGuest)
    {
        this.room = _room;
        this.mainGuest = _mainGuest;
    }
}
