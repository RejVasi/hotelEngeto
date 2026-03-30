import java.time.LocalDate;

public class BookingDateAndType
{


    private LocalDate bookingStart;
    private LocalDate bookingEnd;

    private BookingType bookingType;

    public BookingDateAndType(LocalDate _bookingStart, LocalDate _bookingEnd, BookingType _bookingType)
    {
        this.bookingStart = _bookingStart;
        this.bookingEnd = _bookingEnd;
        this.bookingType = _bookingType;
    }

    //  Automatic recreational booking from today and following 6 nights, if no variables are set
    public BookingDateAndType()
    {
        this.bookingStart = LocalDate.now();
        this.bookingEnd = this.bookingStart.plusDays(6);
        this.bookingType = BookingType.RECREATIONAL;
    }

    //region Getters and Setters
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
