package model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Articulo {
	private final StringProperty codigo;
	private final StringProperty articulo;
	private final DoubleProperty cantidad;
	private final StringProperty unidad_medida;
	private final DoubleProperty precio_unitario;
	private final DoubleProperty porc_bonificacion;
	private final DoubleProperty importe_bonificado;
	private final DoubleProperty subtotal;
	
	public Articulo() {
		this.codigo = new SimpleStringProperty();
		this.articulo = new SimpleStringProperty();
		this.cantidad = new SimpleDoubleProperty();
		this.unidad_medida = new SimpleStringProperty();
		this.precio_unitario = new SimpleDoubleProperty();
		this.porc_bonificacion = new SimpleDoubleProperty();
		this.importe_bonificado = new SimpleDoubleProperty();
		this.subtotal = new SimpleDoubleProperty();
	}

	public Articulo(String codigo, String articulo, Double cantidad, String unidad_medida, Double precio_unitario,
			Double porc_bonificacion, Double importe_bonificado, Double subtotal) {
		this();
		this.codigo.set(codigo);
		this.articulo.set(articulo);
		this.cantidad.set(cantidad);
		this.unidad_medida.set(unidad_medida);
		this.precio_unitario.set(precio_unitario);
		this.porc_bonificacion.set(porc_bonificacion);
		this.importe_bonificado.set(importe_bonificado);
		this.subtotal.set(subtotal);
	}

	public StringProperty codigoProperty() {
		return this.codigo;
	}
	
	public String getCodigo() {
		return this.codigoProperty().get();
	}
	
	public void setCodigo(final String codigo) {
		this.codigoProperty().set(codigo);
	}
	
	public StringProperty articuloProperty() {
		return this.articulo;
	}
	
	public String getArticulo() {
		return this.articuloProperty().get();
	}
	
	public void setArticulo(final String articulo) {
		this.articuloProperty().set(articulo);
	}
	
	public DoubleProperty cantidadProperty() {
		return this.cantidad;
	}
	
	public double getCantidad() {
		return this.cantidadProperty().get();
	}

	public void setCantidad(final double cantidad) {
		this.cantidadProperty().set(cantidad);
	}

	public StringProperty unidad_medidaProperty() {
		return this.unidad_medida;
	}
	
	public String getUnidad_medida() {
		return this.unidad_medidaProperty().get();
	}
	
	public void setUnidad_medida(final String unidad_medida) {
		this.unidad_medidaProperty().set(unidad_medida);
	}
	
	public DoubleProperty precio_unitarioProperty() {
		return this.precio_unitario;
	}
	
	public double getPrecio_unitario() {
		return this.precio_unitarioProperty().get();
	}

	public void setPrecio_unitario(final double precio_unitario) {
		this.precio_unitarioProperty().set(precio_unitario);
	}

	public DoubleProperty porc_bonificacionProperty() {
		return this.porc_bonificacion;
	}
	
	public double getPorc_bonificacion() {
		return this.porc_bonificacionProperty().get();
	}
	
	public void setPorc_bonificacion(final double porc_bonificacion) {
		this.porc_bonificacionProperty().set(porc_bonificacion);
	}
	
	public DoubleProperty importe_bonificadoProperty() {
		return this.importe_bonificado;
	}
	
	public double getImporte_bonificado() {
		return this.importe_bonificadoProperty().get();
	}
	
	public void setImporte_bonificado(final double importe_bonificado) {
		this.importe_bonificadoProperty().set(importe_bonificado);
	}
	
	public DoubleProperty subtotalProperty() {
		return this.subtotal;
	}
	
	public double getSubtotal() {
		return this.subtotalProperty().get();
	}
	
	public void setSubtotal(final double subtotal) {
		this.subtotalProperty().set(subtotal);
	}
	
	@Override
	public String toString() {
		return "Articulo [codigo=" + codigo + ", articulo=" + articulo + ", cantidad=" + cantidad + ", unidad_medida="
				+ unidad_medida + ", precio_unitario=" + precio_unitario + ", porc_bonificacion=" + porc_bonificacion
				+ ", importe_bonificado=" + importe_bonificado + ", subtotal=" + subtotal + "]";
	}

}