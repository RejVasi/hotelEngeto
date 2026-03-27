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
        Guest janaD = new Guest("Jana Dvořáčková", LocalDate.of(1995, 5, 5));
        Guest janD  = new Guest("Jan Dvořáček", LocalDate.of(1993, 4, 5));

        System.out.println(janD.getName() + " " + janD.getBirthDate());
        //endregion

        //region Create rooms
        Room room1 = new Room(1, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room2 = new Room(2, 1, true, true, BigDecimal.valueOf(1000.00));
        Room room3 = new Room(3, 3, false, true, BigDecimal.valueOf(2400.00));
        //endregion

        //region Make reservations
        List<Booking> bookins = new ArrayList<>();
      /*
       bookins.add
                (
                        new Booking(room1, adelaM)
                );
    */
        //endregion
    }


}