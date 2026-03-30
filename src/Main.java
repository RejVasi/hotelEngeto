import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
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
        Booking firstBooking = new Booking(room1, new BookingDateAndType(LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), BookingType.RECREATIONAL), adelaM);
        Booking secondBooking = new Booking(room3, new BookingDateAndType(LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), BookingType.RECREATIONAL), adelaM, new Guest[] { janD });
        Booking thirdBookingOneRoomDifferentDates = new Booking(room3, new BookingDateAndType(LocalDate.of(2021, 11, 11), LocalDate.of(2021, 11, 20), BookingType.WORK), adelaM, new Guest[] { janD });
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
             BookingDateAndType bookingDates = bookings.get(i).getBookingDateAndType();

             String text = "Booking num: " + i
                     + "\nMain guest: " + mainGuest.getDescription()
                     + "\nOther guests: " + bookings.get(i).getOtherGuestsNames()
                     + "\nRoom: " + reservedRoom.getRoomNumber()
                     + "\nBed count: " + reservedRoom.getBeds()
                     + "\nHas balcony: " + reservedRoom.getHasBalcony()
                     + "\nHas sea view: " + reservedRoom.getHasSeaView()
                     + "\nPrice per night: " + reservedRoom.getPricePerNight()
                     + "\nBooking start: " + bookingDates.getBookingStart()
                     + "\nBooking end: " + bookingDates.getBookingEnd()
                     + "\nBooking type: " + bookingDates.getBookingType();

                System.out.println(text);
                System.out.println("\n\n");

        }




        //endregion
    }


}