class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    Customer c = new Customer("Rusro");
    Movie m = new Movie("Transformers", 1);
    Rental r = new Rental(m, 7);
  }
}