import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookingManager
{
    private List<Booking> reservations = new ArrayList<>();

    // 1)
    public void addBooking(Booking booking)
    {
        this.reservations.add(booking);
    }

    // 2)
    public Booking getBooking(int index)
    {
        if(index > -1 && index < this.reservations.size())
        {
            return this.reservations.get(index);
        }
        return null;
    }

    // 3)
    public List<Booking> getBookings()
    {
        return this.reservations;
    }

    // 4)
    public void clearBookings()
    {
        this.reservations.clear();
    }

    // 5)
    public int getNumberOfWorkingBookings()
    {
        return Math.toIntExact(
                this.reservations
                    .stream()
                    .filter(booking -> booking.getBookingType().equals(BookingType.Work))
                    .count());
    }

    // 6) Get average guests per reservation
    public double getAverageGuests()
    {
        if(this.reservations.isEmpty())
        {
            return 0.0;
        }

        int guestCount = 0;
        for (Booking booking : this.reservations)
        {
            guestCount += booking.getGuestsCount();
        }

        return (double) guestCount / this.reservations.size();
    }

    // 7)
    public List<Booking> getTopNHolidayBookings(int n)
    {
         return this.reservations
                .stream()
                .filter(booking -> booking.getBookingType().equals(BookingType.Recreational))
                .limit(n)
                .toList();
    }

    // 8)
    public void printGuestStatistics()
    {
        int totalOnePersonReservations = 0;
        int totalTwoPersonReservations = 0;
        int totalThreePlusPersonReservations = 0;

        for (Booking booking : this.reservations)
        {
            if (booking.getGuestsCount() == 1)
            {
                totalOnePersonReservations++;
            }
            else if(booking.getGuestsCount() == 2)
            {
                totalTwoPersonReservations++;
            }
            else
            {
                totalThreePlusPersonReservations++;
            }
        }

        System.out.println("Total one-person reservations: " + totalOnePersonReservations);
        System.out.println("Total two-person reservations: " + totalTwoPersonReservations);
        System.out.println("Total three or more person reservations: " + totalThreePlusPersonReservations);

    }
}
