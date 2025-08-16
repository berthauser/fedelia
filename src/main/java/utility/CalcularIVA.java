package utility;

public class CalcularIVA {

	private Double precio;

	public CalcularIVA(Double precio) {
		this.precio = precio;
	}

	public Double calcular_iva() { 
		Double alicuota = 0.21;
		Double iva = precio * alicuota;
		return iva;
	}

}