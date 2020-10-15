import java.util.Enumeration;

public abstract class Statement {

  public abstract String getRentalRecord(Customer aCustomer);

  public abstract String getRentalFigures(Rental aRental);

  public abstract String getRentalFooterLines(Customer aCustomer);

  public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();

      String result = this.getRentalRecord(aCustomer);

      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         result += this.getRentalFigures(each);
      }
      //add footer lines
      result += this.getRentalFooterLines(aCustomer);
      return result;
    }

}