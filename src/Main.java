import java.math.BigDecimal;
import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        /* Previous lesson, continuing with part 2

        //region Create Guests and print
        Guest adelaM = new Guest("Adéla Malíková", LocalDate.of(1993, 3, 13));
        Guest janD  = new Guest("Jan Dvořáček", LocalDate.of(1995, 5, 5));
        janD.setBirthDate(LocalDate.of(1995, 4, 5));
        System.out.println(janD.getName() + " " + janD.getBirthDate());

        System.out.println("\n\n");
        
        //endregion

        //region Create rooms
        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));
        //endregion

        //region Make reservations
        Booking firstBooking = new Booking(room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), BookingType.Recreational, adelaM);
        Booking secondBooking = new Booking(room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), BookingType.Recreational, adelaM, new Guest[] { janD });
        Booking thirdBookingOneRoomDifferentDates = new Booking(room3, LocalDate.of(2021, 11, 11), LocalDate.of(2021, 11, 20), BookingType.Work, adelaM, new Guest[] { janD });
        Booking forthBookingNoReserveDates = new Booking(room2, adelaM, new Guest[] { janD });

        List<Booking> bookings = new ArrayList<>();
        bookings.add(firstBooking);
        bookings.add(secondBooking);
        bookings.add(thirdBookingOneRoomDifferentDates);
        bookings.add(forthBookingNoReserveDates);


        for (int i = 0; i < bookings.size(); i++)
        {
             Guest mainGuest = bookings.get(i).getMainGuest();
             Room reservedRoom = bookings.get(i).getRoom();
           //  BookingDateAndType bookingDates = bookings.get(i).getBookingDateAndType();

             String text = "Booking num: " + i
                     + "\nMain guest: " + mainGuest.getDescription()
                     + "\nOther guests: " + bookings.get(i).getOtherGuestsNames()
                     + "\nRoom: " + reservedRoom.getRoomNumber()
                     + "\nBed count: " + reservedRoom.getBeds()
                     + "\nHas balcony: " + reservedRoom.getHasBalcony()
                     + "\nHas sea view: " + reservedRoom.getHasSeaView()
                     + "\nPrice per night: " + reservedRoom.getPricePerNight()
                     + "\nBooking start: " + bookings.get(i).getBookingStart()
                     + "\nBooking end: " + bookings.get(i).getBookingEnd()
                     + "\nBooking type: " + bookings.get(i).getBookingType();

                System.out.println(text);
                System.out.println("\n\n");

        }
        //endregion

         */
        fillBookings();
    }

    private static void fillBookings()
    {
        //region Create rooms
        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));
        //endregion

        //region Create guests
        Guest karelD = new Guest("Karel Dvořák", LocalDate.of(1990, 5, 15));
        Guest karelD2 = new Guest("Karel Dvořák", LocalDate.of(1979, 1, 3));
        Guest karolinaT = new Guest("Karolína Tmavá", LocalDate.of(1991, 1, 1));
        //endregion

        //region Test data creation
        Booking firstBooking = new Booking(room3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), BookingType.WORK, karelD);
        Booking secondBooking = new Booking(room2, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), BookingType.RECREATIONAL, karelD2);
        Booking thirdBooking = new Booking(room3, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), BookingType.WORK, karolinaT, new Guest[] { karelD });

        BookingManager bookingManager = new BookingManager();
        bookingManager.addBooking(firstBooking);
        bookingManager.addBooking(secondBooking);
        bookingManager.addBooking(thirdBooking);

        for (int i = 0; i < 10; i++)
        {
            LocalDate startDate = LocalDate.of(2023, 8, 1).plusDays(i * 2);
            LocalDate endDate = startDate.plusDays(1);

            Booking recreationalBooking = new Booking(room2, startDate, endDate, BookingType.RECREATIONAL, karolinaT);
            bookingManager.addBooking(recreationalBooking);
        }

        System.out.println("11) Formatted Summary:");
        for (Booking booking : bookingManager.getBookings())
        {
            System.out.println(booking.getFormattedSummary());
        }
        System.out.println("\n");

        //endregion

        System.out.println("5) Work booking type only count: " + bookingManager.getNumberOfWorkingBookings());
        System.out.println("\n");

        System.out.println("6) Average host count: " + bookingManager.getAverageGuests());
        System.out.println("\n");

        System.out.println("7) Get first N recreational bookings: ");
        for (Booking booking : bookingManager.getTopNHolidayBookings(8))
        {
            System.out.println(booking.getFormattedSummary());
        }
        System.out.println("\n");

        System.out.println("8) Reservation guest counts:" );
        bookingManager.printGuestStatistics();
        System.out.println("\n");

        System.out.println("9) First booking night count: " + bookingManager.getBooking(0).getBookingLength());
        System.out.println("\n");

        System.out.println("10) First booking total price: " + bookingManager.getBooking(0).getTotalPrice());
        System.out.println("\n");

        System.out.println("11) First booking formatted:\n" + bookingManager.getBooking(0).getFormattedSummary());
        System.out.println("\n");

    }

}