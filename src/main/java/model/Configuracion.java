package model;

import java.time.LocalDate;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Configuracion {
	
	private final IntegerProperty idconfiguracion;
	private final StringProperty nombre_empresa;
	private final StringProperty email;
	private final StringProperty calle;
	private final IntegerProperty numero;
	private final StringProperty oficina;
	private final StringProperty telefono_fijo;
	private final StringProperty telefono_movil;
	private final StringProperty localidad;
	private final StringProperty codigo_postal;
	private final StringProperty situacion_fiscal;
	private final StringProperty domicilio_fiscal;
	private final IntegerProperty punto_venta;
	private final StringProperty iibb_convmultilateral;
	private final StringProperty cuit;
	private final SimpleObjectProperty<LocalDate> fecha_iactividades;
	private final SimpleBooleanProperty modo_produccion;
	private final SimpleBooleanProperty modo_factura;
	private final StringProperty path_facturaspdf;
	private final StringProperty path_certproduccion;
	private final StringProperty path_certhomologacion;
	private final StringProperty path_claveprivada;
	
	public Configuracion() {
		 idconfiguracion = new SimpleIntegerProperty();
		 nombre_empresa = new SimpleStringProperty();
		 email = new SimpleStringProperty();
		 calle = new SimpleStringProperty();
		 numero = new SimpleIntegerProperty();
		 oficina = new SimpleStringProperty();
		 telefono_fijo = new SimpleStringProperty();
		 telefono_movil = new SimpleStringProperty();
		 localidad = new SimpleStringProperty();
		 codigo_postal = new SimpleStringProperty();
		 situacion_fiscal = new SimpleStringProperty();
		 domicilio_fiscal = new SimpleStringProperty();
		 punto_venta = new SimpleIntegerProperty();
		 iibb_convmultilateral = new SimpleStringProperty();
		 cuit = new SimpleStringProperty();
		 modo_produccion = new SimpleBooleanProperty();
		 modo_factura = new SimpleBooleanProperty();
		 fecha_iactividades = new SimpleObjectProperty<>();
		 path_facturaspdf = new SimpleStringProperty();
		 path_certproduccion = new SimpleStringProperty();
		 path_certhomologacion = new SimpleStringProperty();
		 path_claveprivada = new SimpleStringProperty();
	}

	public Configuracion(Integer idconfiguracion, String nombre_empresa, String email, String calle, Integer numero, 
			String oficina, String telefono_fijo, String telefono_movil, String localidad, String codigo_postal,
			String situacion_fiscal, String domicilio_fiscal, Integer punto_venta, String iibb_convmultilateral, 
			String cuit, LocalDate fecha_iactividades, Boolean modo_produccion, Boolean modo_factura, String path_facturaspdf,
			String path_certproduccion,	String path_certhomologacion, String path_claveprivada) {
		this();
		this.idconfiguracion.set(idconfiguracion);
		this.nombre_empresa.set(nombre_empresa);
		this.email.set(email);
		this.calle.set(calle);
		this.numero.set(numero);
		this.oficina.set(oficina);
		this.telefono_fijo.set(telefono_fijo);
		this.telefono_movil.set(telefono_movil);
		this.localidad.set(localidad);
		this.codigo_postal.set(codigo_postal);
		this.situacion_fiscal.set(domicilio_fiscal);
		this.domicilio_fiscal.set(domicilio_fiscal);
		this.punto_venta.set(punto_venta);
		this.iibb_convmultilateral.set(iibb_convmultilateral);
		this.cuit.set(cuit);
		this.fecha_iactividades.set(fecha_iactividades);
		this.modo_produccion.set(modo_produccion);
		this.modo_factura.set(modo_factura);
		this.path_facturaspdf.set(path_facturaspdf);
		this.path_certproduccion.set(path_certproduccion);
		this.path_certhomologacion.set(path_certhomologacion);
		this.path_claveprivada.set(path_claveprivada);
	}

	public IntegerProperty idconfiguracionProperty() {
		return this.idconfiguracion;
	}
	
	public int getIdconfiguracion() {
		return this.idconfiguracionProperty().get();
	}
	
	public void setIdconfiguracion(final int idconfiguracion) {
		this.idconfiguracionProperty().set(idconfiguracion);
	}
	
	public StringProperty nombre_empresaProperty() {
		return this.nombre_empresa;
	}
	
	public String getNombre_empresa() {
		return this.nombre_empresaProperty().get();
	}
	
	public void setNombre_empresa(final String nombre_empresa) {
		this.nombre_empresaProperty().set(nombre_empresa);
	}
	
	public StringProperty emailProperty() {
		return this.email;
	}
	
	public String getEmail() {
		return this.emailProperty().get();
	}
	
	public void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	
	public StringProperty calleProperty() {
		return this.calle;
	}
	
	public String getCalle() {
		return this.calleProperty().get();
	}
	
	public void setCalle(final String calle) {
		this.calleProperty().set(calle);
	}
	
	public IntegerProperty numeroProperty() {
		return this.numero;
	}
	
	public int getNumero() {
		return this.numeroProperty().get();
	}
	
	public void setNumero(final int numero) {
		this.numeroProperty().set(numero);
	}
	
	public StringProperty oficinaProperty() {
		return this.oficina;
	}
	
	public String getOficina() {
		return this.oficinaProperty().get();
	}
	
	public void setOficina(final String oficina) {
		this.oficinaProperty().set(oficina);
	}
	
	public StringProperty telefono_fijoProperty() {
		return this.telefono_fijo;
	}
	
	public String getTelefono_fijo() {
		return this.telefono_fijoProperty().get();
	}
	
	public void setTelefono_fijo(final String telefono_fijo) {
		this.telefono_fijoProperty().set(telefono_fijo);
	}
	
	public StringProperty telefono_movilProperty() {
		return this.telefono_movil;
	}
	
	public String getTelefono_movil() {
		return this.telefono_movilProperty().get();
	}
	
	public void setTelefono_movil(final String telefono_movil) {
		this.telefono_movilProperty().set(telefono_movil);
	}
	
	public StringProperty localidadProperty() {
		return this.localidad;
	}
	
	public String getLocalidad() {
		return this.localidadProperty().get();
	}
	
	public void setLocalidad(final String localidad) {
		this.localidadProperty().set(localidad);
	}
	
	public StringProperty codigo_postalProperty() {
		return this.codigo_postal;
	}
	
	public String getCodigo_postal() {
		return this.codigo_postalProperty().get();
	}
	
	public void setCodigo_postal(final String codigo_postal) {
		this.codigo_postalProperty().set(codigo_postal);
	}
	
	public StringProperty situacion_fiscalProperty() {
		return this.situacion_fiscal;
	}
	
	public String getSituacion_fiscal() {
		return this.situacion_fiscalProperty().get();
	}
	
	public void setSituacion_fiscal(final String situacion_fiscal) {
		this.situacion_fiscalProperty().set(situacion_fiscal);
	}
	
	public StringProperty domicilio_fiscalProperty() {
		return this.domicilio_fiscal;
	}
	
	public String getDomicilio_fiscal() {
		return this.domicilio_fiscalProperty().get();
	}
	
	public void setDomicilio_fiscal(final String domicilio_fiscal) {
		this.domicilio_fiscalProperty().set(domicilio_fiscal);
	}
	
	public IntegerProperty punto_ventaProperty() {
		return this.punto_venta;
	}
	
	public int getPunto_venta() {
		return this.punto_ventaProperty().get();
	}
	
	public void setPunto_venta(final int punto_venta) {
		this.punto_ventaProperty().set(punto_venta);
	}
	
	public StringProperty iibb_convmultilateralProperty() {
		return this.iibb_convmultilateral;
	}
	
	public String getIibb_convmultilateral() {
		return this.iibb_convmultilateralProperty().get();
	}
	
	public void setIibb_convmultilateral(final String iibb_convmultilateral) {
		this.iibb_convmultilateralProperty().set(iibb_convmultilateral);
	}
	
	public StringProperty cuitProperty() {
		return this.cuit;
	}
	
	public String getCuit() {
		return this.cuitProperty().get();
	}
	
	public void setCuit(final String cuit) {
		this.cuitProperty().set(cuit);
	}
	
	public SimpleObjectProperty<LocalDate> fecha_iactividadesProperty() {
		return this.fecha_iactividades;
	}
	
	public LocalDate getFecha_iactividades() {
		return this.fecha_iactividadesProperty().get();
	}
	
	public void setFecha_iactividades(final LocalDate fecha_iactividades) {
		this.fecha_iactividadesProperty().set(fecha_iactividades);
	}
	
	public SimpleBooleanProperty modo_produccionProperty() {
		return this.modo_produccion;
	}

	public boolean isModo_produccion() {
		return this.modo_produccionProperty().get();
	}
	
	public void setModo_produccion(final boolean modo_produccion) {
		this.modo_produccionProperty().set(modo_produccion);
	}
	
	public SimpleBooleanProperty modo_facturaProperty() {
		return this.modo_factura;
	}

	public boolean isModo_factura() {
		return this.modo_facturaProperty().get();
	}
	
	public void setModo_factura(final boolean modo_factura) {
		this.modo_facturaProperty().set(modo_factura);
	}
	
	public StringProperty path_facturaspdfProperty() {
		return this.path_facturaspdf;
	}
	
	public String getPath_facturaspdf() {
		return this.path_facturaspdfProperty().get();
	}
	
	public void setPath_facturaspdf(final String path_facturaspdf) {
		this.path_facturaspdfProperty().set(path_facturaspdf);
	}
	
	public StringProperty path_certproduccionProperty() {
		return this.path_certproduccion;
	}
	
	public String getPath_certproduccion() {
		return this.path_certproduccionProperty().get();
	}
	
	public void setPath_certproduccion(final String path_certproduccion) {
		this.path_certproduccionProperty().set(path_certproduccion);
	}
	
	public StringProperty path_certhomologacionProperty() {
		return this.path_certhomologacion;
	}
	
	public String getPath_certhomologacion() {
		return this.path_certhomologacionProperty().get();
	}
	
	public void setPath_certhomologacion(final String path_certhomologacion) {
		this.path_certhomologacionProperty().set(path_certhomologacion);
	}

	public StringProperty path_claveprivadaProperty() {
		return this.path_claveprivada;
	}
	
	public String getPath_claveprivada() {
		return this.path_claveprivadaProperty().get();
	}

	public void setPath_claveprivada(final String path_claveprivada) {
		this.path_claveprivadaProperty().set(path_claveprivada);
	}
	
}