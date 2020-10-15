import java.util.Enumeration;

public class TextStatement extends Statement {

    public String getRentalRecord(Customer aCustomer){
      return("Rental Record for " + aCustomer.getName() +"\n");
    }

    public String getRentalFigures(Rental aRental){
      return("\t" + aRental.getMovie().getTitle()+ "\t" +String.valueOf(aRental.getCharge()) + "\n");
    }

    public String getRentalFooterLines(Customer aCustomer){
      String result = "";
      result += "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n";
      result += "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
      return result;
    }

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