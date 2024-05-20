package com.distribuida.entities;
 
import java.util.Date;
 
public class factura {
 
	private int idFactura;
	private int numFactura;
	private Date fecha;
	private float totalNeto;
	private float iva;
	private float total;
	private int idCliente;
	public factura(int idFactura, int numFactura, Date fecha, float totalNeto, float iva, float total, int idCliente) {
		super();
		this.idFactura = idFactura;
		this.numFactura = numFactura;
		this.fecha = fecha;
		this.totalNeto = totalNeto;
		this.iva = iva;
		this.total = total;
		this.idCliente = idCliente;
	}
	public int getIdFactura() {
		return idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
	public int getNumFactura() {
		return numFactura;
	}
	public void setNumFactura(int numFactura) {
		this.numFactura = numFactura;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public float getTotalNeto() {
		return totalNeto;
	}
	public void setTotalNeto(float totalNeto) {
		this.totalNeto = totalNeto;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	@Override
	public String toString() {
		return "factura [idFactura=" + idFactura + ", numFactura=" + numFactura + ", fecha=" + fecha + ", totalNeto="
				+ totalNeto + ", iva=" + iva + ", total=" + total + ", idCliente=" + idCliente + "]";
	}
	
	
}