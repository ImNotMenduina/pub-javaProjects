package rent_cars;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

public class Contract {
	private LocalDateTime start;
	private LocalDateTime returnCar;
	
	private Vehicle vehicle;
	private Invoice invoice;
	public Contract(LocalDateTime start, LocalDateTime returnCar, Vehicle vehicle) {
		this.start = start;
		this.returnCar = returnCar;
		this.vehicle = vehicle;
	}
	public LocalDateTime getStart() {
		return start;
	}
	public void setStart(LocalDateTime start) {
		this.start = start;
	}
	public LocalDateTime getReturnCar() {
		return returnCar;
	}
	public void setReturnCar(LocalDateTime returnCar) {
		this.returnCar = returnCar;
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
	
}
