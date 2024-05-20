package com.distribuida.entities;
 
public class facturaDetalle {
 
	private int idFacturaDetalle;
	private int cantidad;
	private float subtotal;
	private int idFactura;
	private int idLibro;
	public facturaDetalle(int idFacturaDetalle, int cantidad, float subtotal, int idFactura, int idLibro) {
		super();
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactura = idFactura;
		this.idLibro = idLibro;
	}
	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}
	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public float getSubtotal() {
		return subtotal;
	}
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getIdLibro() {
		return idLibro;
	}
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
	@Override
	public String toString() {
		return "facturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactura=" + idFactura + ", idLibro=" + idLibro + "]";
	}
	
	
}