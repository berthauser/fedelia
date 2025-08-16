package services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import model.Configuracion;

public class ConfiguracionDAO {

	// *************************************
	// SELECT * 
	// *************************************
	public static ObservableList<Configuracion> buscarConfiguracion() throws SQLException, ClassNotFoundException {
		String selectStmt = "select * from configuracion";
		try {
			ObservableList<Configuracion> listaConfiguraciones = getConfiguraciones(DBUtil.dbExecuteQuery(selectStmt));
			return listaConfiguraciones;
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Imposible mostrar las Configuraciones " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
	}
	
	public static Configuracion getConfiguracion() throws SQLException, ClassNotFoundException {
		String selectStmt = "select * from configuracion";
		try {
			Configuracion dataConfiguracion = getDataConfiguracion(DBUtil.dbExecuteQuery(selectStmt));
			return dataConfiguracion;
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Imposible mostrar la Configuración " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
	}

	// *************************************
	// INSERT
	// *************************************
	public static void insertarConfiguracion(String nombre_empresa, String email, String calle, Integer numero,
			String oficina, String telefono_fijo, String telefono_movil, String localidad, String codigo_postal,
			String situacion_fiscal, String domicilio_fiscal, Integer punto_venta, String iibb_convmultilateral,
			String cuit, String fecha_iactividades, Boolean modo_produccion, Boolean modo_factura,
			String path_facturaspdf, String path_certproduccion, String path_certhomologacion, String path_claveprivada)
			throws SQLException, ClassNotFoundException {

		String insertStmt = "INSERT INTO configuracion (nombre_empresa, email, calle, numero, oficina, telefono_fijo, telefono_movil, "
				+ "localidad, codigo_postal, situacion_fiscal, domicilio_fiscal, punto_venta, iibb_convmultilateral, "
				+ "cuit, fecha_iactividades, modo_produccion, modo_factura, path_facturaspdf, path_certproduccion, "
				+ "path_certhomologacion, path_claveprivada) VALUES ('" + nombre_empresa + "', '" + email + "', '"
				+ calle + "', '" + numero + "', '" + oficina + "', " + "'" + telefono_fijo + "', '" + telefono_movil
				+ "', '" + localidad + "', '" + codigo_postal + "', '" + situacion_fiscal + "', '" + domicilio_fiscal
				+ "', " + "'" + punto_venta + "', '" + iibb_convmultilateral + "', '" + cuit + "', '"
				+ fecha_iactividades + "', '" + modo_produccion + "', '" + modo_factura + "', '" + path_facturaspdf
				+ "', " + "'" + path_certproduccion + "', '" + path_certhomologacion + "', + '" + path_claveprivada
				+ "')";
		try {
			DBUtil.dbExecuteUpdate(insertStmt);
		} catch (ClassNotFoundException | SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Imposible dar de Alta la Configuracion " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
	}

	// *************************************
	// UPDATE 
	// *************************************
	public static void modificarConfiguracion(Integer idconfiguracion, String nombre_empresa, String email,
			String calle, Integer numero, String oficina, String telefono_fijo, String telefono_movil, String localidad,
			String codigo_postal, String situacion_fiscal, String domicilio_fiscal, Integer punto_venta,
			String iibb_convmultilateral, String cuit, String fecha_iactividades, Boolean modo_produccion,
			Boolean modo_factura, String path_facturaspdf, String path_certproduccion, String path_certhomologacion,
			String path_claveprivada) throws SQLException, ClassNotFoundException {
		
		String updateStmt = "UPDATE configuracion set nombre_empresa = '" + nombre_empresa + "', " + "email = '" + email
				+ "', " + "calle = '" + calle + "', " + "numero = '" + numero + "', " + "oficina = '" + oficina + "',  "
				+ "telefono_fijo = '" + telefono_fijo + "',  " + "telefono_movil = '" + telefono_movil + "',"
				+ "localidad = '" + localidad + "', " + "codigo_postal = '" + codigo_postal + "',  "
				+ "situacion_fiscal = '" + situacion_fiscal + "',  " + "domicilio_fiscal = '" + domicilio_fiscal + "',"
				+ "punto_venta = '" + punto_venta + "', " + "iibb_convmultilateral = '" + iibb_convmultilateral + "',  "
				+ "cuit = '" + cuit + "',  " + "fecha_iactividades = '" + fecha_iactividades + "',"
				+ "modo_produccion = '" + modo_produccion + "', " + "modo_factura = '" + modo_factura + "', "
				+ "path_facturaspdf = '" + path_facturaspdf + "', " + "path_certproduccion = '" + path_certproduccion
				+ "', " + "path_certhomologacion = '" + path_certhomologacion + "', " + "path_claveprivada = '"
				+ path_claveprivada + "' " + " WHERE idconfiguracion = " + idconfiguracion;
		try {
			DBUtil.dbExecuteUpdate(updateStmt);
		} catch (SQLException e) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Error de SQL");
			alert2.setContentText("Imposible modificar la Configuracion " + e);
			e.printStackTrace();
			alert2.showAndWait();
			throw e;
		}
	}
	
	private static ObservableList<Configuracion> getConfiguraciones(ResultSet rs)
			throws SQLException, ClassNotFoundException {
		ObservableList<Configuracion> listaConfiguraciones = FXCollections.observableArrayList();
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		while (rs.next()) {
			Configuracion configuracion = new Configuracion();
			configuracion.setIdconfiguracion(rs.getInt("idconfiguracion"));
			configuracion.setNombre_empresa(rs.getString("nombre_empresa"));
			configuracion.setEmail(rs.getString("email"));
			configuracion.setCalle(rs.getString("calle"));
			configuracion.setNumero(rs.getInt("numero"));
			configuracion.setOficina(rs.getString("oficina"));
			configuracion.setTelefono_fijo(rs.getString("telefono_fijo"));
			configuracion.setTelefono_movil(rs.getString("telefono_movil"));
			configuracion.setLocalidad(rs.getString("localidad"));
			configuracion.setCodigo_postal(rs.getString("codigo_postal"));
			configuracion.setSituacion_fiscal(rs.getString("situacion_fiscal"));
			configuracion.setDomicilio_fiscal(rs.getString("domicilio_fiscal"));
			configuracion.setPunto_venta(rs.getInt("punto_venta"));
			configuracion.setIibb_convmultilateral(rs.getString("iibb_convmultilateral"));
			configuracion.setCuit(rs.getString("cuit"));
//			configuracion.setFecha_iactividades(LocalDate.parse(rs.getString("fecha_iactividades"), formatter));
			configuracion.setFecha_iactividades(LocalDate.parse(rs.getString("fecha_iactividades")));
			configuracion.setModo_produccion(rs.getBoolean("modo_produccion"));
			configuracion.setModo_factura(rs.getBoolean("modo_factura"));
			configuracion.setPath_facturaspdf(rs.getString("path_facturaspdf"));
			configuracion.setPath_certproduccion(rs.getString("path_certproduccion"));
			configuracion.setPath_certhomologacion(rs.getString("path_certhomologacion"));
			configuracion.setPath_claveprivada(rs.getString("path_claveprivada"));
			listaConfiguraciones.add(configuracion);
		}
		return listaConfiguraciones;
	}
	
	private static Configuracion getDataConfiguracion(ResultSet rs) throws SQLException, ClassNotFoundException {
		Configuracion configuracion = new Configuracion();
		configuracion.setIdconfiguracion(rs.getInt("idconfiguracion"));
		configuracion.setNombre_empresa(rs.getString("nombre_empresa"));
		configuracion.setEmail(rs.getString("email"));
		configuracion.setCalle(rs.getString("calle"));
		configuracion.setNumero(rs.getInt("numero"));
		configuracion.setOficina(rs.getString("oficina"));
		configuracion.setTelefono_fijo(rs.getString("telefono_fijo"));
		configuracion.setTelefono_movil(rs.getString("telefono_movil"));
		configuracion.setLocalidad(rs.getString("localidad"));
		configuracion.setCodigo_postal(rs.getString("codigo_postal"));
		configuracion.setSituacion_fiscal(rs.getString("situacion_fiscal"));
		configuracion.setDomicilio_fiscal(rs.getString("domicilio_fiscal"));
		configuracion.setPunto_venta(rs.getInt("punto_venta"));
		configuracion.setIibb_convmultilateral(rs.getString("iibb_convmultilateral"));
		configuracion.setCuit(rs.getString("cuit"));
//		configuracion.setFecha_iactividades(LocalDate.parse(rs.getString("fecha_iactividades"), formatter));
		configuracion.setFecha_iactividades(LocalDate.parse(rs.getString("fecha_iactividades")));
		configuracion.setModo_produccion(rs.getBoolean("modo_produccion"));
		configuracion.setModo_factura(rs.getBoolean("modo_factura"));
		configuracion.setPath_facturaspdf(rs.getString("path_facturaspdf"));
		configuracion.setPath_certproduccion(rs.getString("path_certproduccion"));
		configuracion.setPath_certhomologacion(rs.getString("path_certhomologacion"));
		configuracion.setPath_claveprivada(rs.getString("path_claveprivada"));
		return configuracion;
	}

}