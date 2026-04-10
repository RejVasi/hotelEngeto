import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Booking
{


    private Room room;
    private Guest mainGuest;
    private List<Guest> otherGuests;


    private LocalDate bookingStart;
    private LocalDate bookingEnd;
    private BookingType bookingType;

    //private BookingDateAndType bookingDateAndType;

    // All information filled
    public Booking(Room room, LocalDate bookingStart, LocalDate bookingEnd, BookingType bookingType, Guest mainGuest, Guest[] otherGuests)
    {
        this.room = room;
        this.mainGuest = mainGuest;
        this.otherGuests = Arrays.asList(otherGuests);

        this.bookingStart = bookingStart;
        this.bookingEnd = bookingEnd;
        this.bookingType = bookingType;
    }

    // Room, main and other guests filled no booking date and type
    public Booking(Room room, Guest mainGuest, Guest[] otherGuests)
    {
        this(room, LocalDate.now(), LocalDate.now().plusDays(6), BookingType.Recreational, mainGuest, otherGuests);
    }

    // Room, booking date + type and main Guest filled, no other guest
    public Booking(Room room, LocalDate bookingStart, LocalDate bookingEnd, BookingType bookingType, Guest mainGuest)
    {
        this.room = room;
        this.mainGuest = mainGuest;

        this.bookingStart = bookingStart;
        this.bookingEnd = bookingEnd;
        this.bookingType = bookingType;

    }
    // Room and main Guest filled, no other guest + no booking date and type
    public Booking(Room room, Guest mainGuest)
    {
        this.room = room;
        this.mainGuest = mainGuest;

        this.bookingStart = LocalDate.now();
        this.bookingEnd = LocalDate.now().plusDays(6);
        this.bookingType = BookingType.Recreational;

    }

    private String convertBoolToCzechYesNo(boolean bool)
    {
        if(bool)
        {
            return "Ano";
        }
        return "Ne";
    }

    public int getGuestsCount()
    {
        // Other guest + main guest (main guest is always only one, and without him no reservation can be made)
        if (this.otherGuests != null)
        {
            return this.otherGuests.size() + 1;
        }
        // Only main guest
        return 1;
    }

    // 9) Only night count is being returned
    public int getBookingLength()
    {
        return Math.toIntExact(getBookingStart().until(getBookingEnd(), ChronoUnit.DAYS));
    }

    // 10)
    public BigDecimal getTotalPrice()
    {
        return BigDecimal.valueOf(getBookingLength()).multiply(this.room.getPricePerNight());
    }


    // 11)
    public String getFormattedSummary()
    {
        return getBookingStart() + " až " + getBookingEnd() + ": " + getMainGuest().getName() + " (" + getMainGuest().getBirthDate() + ")" + "[" + getGuestsCount() + ", " + convertBoolToCzechYesNo(this.room.getHasSeaView()) + "] za " + getTotalPrice() + " Kč";
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

    public LocalDate getBookingStart()
    {
        return bookingStart;
    }

    public void setBookingStart(LocalDate bookingStart)
    {
        this.bookingStart = bookingStart;
    }

    public LocalDate getBookingEnd()
    {
        return bookingEnd;
    }

    public void setBookingEnd(LocalDate bookingEnd)
    {
        this.bookingEnd = bookingEnd;
    }

    public BookingType getBookingType()
    {
        return bookingType;
    }

    public void setBookingType(BookingType bookingType)
    {
        this.bookingType = bookingType;
    }

    //endregion
}
