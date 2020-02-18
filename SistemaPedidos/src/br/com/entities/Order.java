package br.com.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.enums.OrderStatus;

public class Order {

	private Date moment;
	private OrderStatus status;

	private Client client;

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	private List<OrderItem> orderItem = new ArrayList<OrderItem>();
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public void addItem(OrderItem oi) {
		this.orderItem.add(oi);
	}

	public void removeItem(OrderItem oi) {
		this.orderItem.remove(oi);
	}
	
	public double total() {
		int total = 0;
		for(OrderItem oi : orderItem) {
			total += oi.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat();
		
		sb.append("Order Moment: ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Order Status");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client + "\n");
		sb.append("Order Items: " + "\n");
		for(OrderItem oi : orderItem) {
			sb.append(oi.getProduct().getName() + " " + oi.getProduct().getPrice() + " QUANTITY: " + oi.getQuantity() + ", SUBTOTAL: $" +  oi.subTotal() + "\n");
		}
		sb.append("Total Price: $");
		sb.append(total());
		
		return sb.toString();
	}
	
	

}
