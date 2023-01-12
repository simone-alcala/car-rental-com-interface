package model.entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CarRental {
  private LocalDateTime start;
  private LocalDateTime finish;
  
  private Vehicle vehicle;
  private Invoice invoice;

  private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    
  public CarRental() { }

  public CarRental(LocalDateTime start, LocalDateTime finish, Vehicle vehicle) {
    this.start = start;
    this.finish = finish;
    this.vehicle = vehicle;
  }

  public LocalDateTime getStart() {
    return start;
  }

  public void setStart(LocalDateTime start) {
    this.start = start;
  }

  public LocalDateTime getFinish() {
    return finish;
  }

  public void setFinish(LocalDateTime finish) {
    this.finish = finish;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Invoice getInvoice() {
    return invoice;
  }

  public void setInvoice(Invoice invoice) {
    this.invoice = invoice;
  }

  @Override
  public String toString() {
    return 
      "Carro: " + vehicle.getModel() +
      " - De "  + start.format(fmt)  + 
      " até "   + finish.format(fmt) ;
  }

 
}
