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

    public BookingDateAndType()
    {
        this.bookingStart = LocalDate.now();
        this.bookingEnd = this.bookingStart.plusDays(6);
        this.bookingType = BookingType.RECREATIONAL;
    }
}
