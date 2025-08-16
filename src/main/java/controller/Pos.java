package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import javafx.util.Duration;
import model.Articulo;
import model.Configuracion;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import services.ConfiguracionDAO;
import services.DBUtil;
import utility.CalcularIVA;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import feafip.ClassFactory;
import feafip.IBarcode;
import feafip.Iwsfev1;
import feafip.TipoComprobante;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Pos {
	@FXML
	private ImageView imgHeader;
	@FXML
	private Label lblFecha;
	@FXML
	private Label lblHora;
	@FXML
	private Label lblNroTicket;
	@FXML
	private Label lblTipoVenta;
	@FXML
	private Label lblConectado;
	@FXML
	private Label lblConfiguracion;
	@FXML
	private JFXCheckBox cbProductos;
	@FXML
	private JFXCheckBox cbServicios;
	@FXML
	private JFXComboBox<String> cmbFormaPago;
	@FXML
	private JFXDatePicker dpDesde;
	@FXML
	private JFXDatePicker dpHasta;
	@FXML
	private JFXDatePicker dpVtoPago;
	@FXML
	private ImageView imgAfip;
	@FXML
	private Button btnObtenerCAE;
	@FXML
	private JFXTextField txtCAE;
	@FXML
	private JFXDatePicker dpVtoCAE;
	@FXML
	private JFXRadioButton rbAceptacion;
	@FXML
	private JFXButton btnFacturar;
	@FXML
	private ImageView imgFacturar;
	@FXML
	private JFXComboBox<String> cmbTipoComprobante;
	@FXML
	private JFXTextField txtPuntoVenta;
	@FXML
	private JFXDatePicker dpFechaComprobante;
	@FXML
	private JFXButton btnComprobantes;
	@FXML
	private ImageView imgDescuentos;
	@FXML
	private JFXButton btnConfiguracion;
	@FXML
	private ImageView imgConfiguracion;
	@FXML
	private JFXButton btnSalir;
	@FXML
	private ImageView imgSalir;
	@FXML
	private JFXComboBox<String> cmbTipoDocumento;
	@FXML
	private JFXTextField txtDni;
	@FXML
	private JFXTextField txtCliente;
	@FXML
	private JFXComboBox<String> cmbSituacionFiscal;
	@FXML
	private JFXTextArea txtDomicilio;
	@FXML
	private TextField txtCodigo;
	@FXML
	private TextField txtProducto;
	@FXML
	private TextField txtCantidad;
	@FXML
	private TextField txtPrecioUnitario;
	@FXML
	private TextField txtBonificacion;
	@FXML
	private TextField txtImporteBonif;
	@FXML
	private TextField txtAlicuota;
	@FXML
	private Button btnAgregar;
	@FXML
	private TableView<Articulo> tblArticulos;
	@FXML
	private TableColumn<Articulo, String> colCodigo;
	@FXML
	private TableColumn<Articulo, String> colArticulo;
	@FXML
	private TableColumn<Articulo, Double> colCantidad;
	@FXML
	private TableColumn<Articulo, Double> colPrecioUnitario;
	@FXML
	private TableColumn<Articulo, Double> colBonificacion;
	@FXML
	private TableColumn<Articulo, Double> colImporteBonif;
	@FXML
	private TableColumn<Articulo, Double> colSubtotal;
	@FXML
	private Label lblSubTotalGeneral;
	@FXML
	private Label lblSubTotalIVA;
	@FXML
	private Label lblTotalGeneral;

	private double dragOffsetX = 0;
	private double dragOffsetY = 0;

	// private static final DateFormat sdf = new SimpleDateFormat("EEE, dd MMM
	// yyyy");
	private static final DateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
	
	// URLs de autenticacion y negocio.
	private static final String PURLWSAA = "https://wsaa.afip.gov.ar/ws/services/LoginCms";
    private static final String PURLWSW = "https://servicios1.afip.gov.ar/wsfev1/service.asmx";
	
	private static final String HURLWSW = "https://wswhomo.afip.gov.ar/wsfev1/service.asmx";
	private static final String HURLWSAA = "https://wsaahomo.afip.gov.ar/ws/services/LoginCms";

	private ObservableList<Articulo> itemsArticulo = FXCollections.observableArrayList();

	private ObservableList<String> documentos = FXCollections.observableArrayList("CUIT", "CDI", "CI Extranjera",
			"Pasaporte", "DNI", "Sin identificar/venta global diaria");
//  80, 87, 91, 94, 96, default 99

	private ObservableList<String> situacionFiscal = FXCollections.observableArrayList("IVA Responsable Inscripto",
			"IVA Responsable No Inscripto", "IVA No Responsable", "IVA Sujeto Exento", "Consumidor Final",
			"Responsable Monotributo", "Sujeto No Categorizado", "Proveedor del Exterior", "IVA Liberado - Ley 19.640",
			"IVA Responsable Inscripto – Agente de Percepción", "Pequeño Contribuyente Eventual",
			"Monotributista Social", "Pequeño Contribuyente Eventual Social");
//    1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 default 6

	private ObservableList<String> comprobantes = FXCollections.observableArrayList("Factura C", "Factura B",
			"Nota de Crédito A", "Nota de Crédito B", "Nota de Crédito C", "Nota de Débito A", "Nota de Débito B",
			"Nota de Débito C");
//  11, 6, 3, 8, 13, 2, 7, 12 default 6

	private ObservableList<String> formaPago = FXCollections.observableArrayList("Contado", "Tarjeta de Débito",
			"Tarjeta de Crédito", "Cuenta Corriente", "Cheque");

//	DATA para AFIP
	Iwsfev1 wsfev1 = ClassFactory.createwsfev1();
	private TipoComprobante tipoComp;   // Factura B(Ver excel referencias codigos AFIP)
	private String fechaComprobante;
	private String condicionIVAReceptor;
	private String fechaVtoCAE;
	private String fechaVtoCAEBD; /// esto es una mierda
	private Double nroComp;
	private Integer concepto;
	private Integer tipoDocumento;
	private Double numeroDocumento;
	private Double totalBruto;
	private Double totalNeto;
	private Double totalIVA;
//	Fin DATA para AFIP
	
	private Configuracion configuracion;

	private String pago = null;
	private String dto = null;
	
	Map<String, Object> parameters = new HashMap<String, Object>();

	/**
	 * Initializes the controller class. This method is automatically called after
	 * the fxml file has been loaded.
	 * 
	 * @return
	 * @return
	 */
	@FXML
	public void initialize() throws FileNotFoundException {

		Date date = new Date();
		lblFecha.setText((sdf.format(date)));

		Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
			LocalTime currentTime = LocalTime.now();
			lblHora.setText(currentTime.getHour() + ":" + currentTime.getMinute() + ":" + currentTime.getSecond());
		}), new KeyFrame(Duration.seconds(1)));
		clock.setCycleCount(Animation.INDEFINITE);
		clock.play();
		
		dpFechaComprobante.setValue(LocalDate.now());

		// Cargo las imágenes
		imgHeader.setImage(new Image("/images/terminal-ballot.png"));
		imgHeader.setSmooth(true);
		imgHeader.setPreserveRatio(true);

		imgConfiguracion.setImage(new Image("/images/gear.png"));
		imgConfiguracion.setSmooth(true);
		imgConfiguracion.setPreserveRatio(true);

		imgSalir.setImage(new Image("/images/icons8-esc-48.png"));
		imgSalir.setSmooth(true);
		imgSalir.setPreserveRatio(true);

		imgAfip.setImage(new Image("/images/afip.png"));
		imgAfip.setSmooth(true);
		imgAfip.setPreserveRatio(true);

		imgFacturar.setImage(new Image("/images/cash-register.png"));
		imgFacturar.setSmooth(true);
		imgFacturar.setPreserveRatio(true);

		Platform.runLater(() -> {
			if (DBUtil.dbConnect()) {
				lblConectado.setText("CONECTADO");
				try {
					checkConfiguracion();
				} catch (ClassNotFoundException | SQLException e1) {
					e1.printStackTrace();
				}
			} else { // no se conectó a la base
				lblConectado.setText("ERROR DE CONEXIÓN");

				Alert alert2 = new Alert(AlertType.ERROR);
				alert2.setTitle("Sin conexión a la base de datos");
				alert2.setContentText("Llame al programador");
				alert2.showAndWait();
				Platform.exit();
				System.exit(0);
			}
		});
		
		tblArticulos.setPlaceholder(new Label("Sin datos visibles"));

		inicializarTabla();

		tblArticulos.setItems(itemsArticulo);

		tblArticulos.setOnKeyPressed(event -> {
			if (tblArticulos.getSelectionModel().getSelectedItem() != null) {
				if (event.getCode().equals(KeyCode.DELETE)) {
					tblArticulos.getItems().remove(tblArticulos.getSelectionModel().getSelectedItem());
					calcularVenta();
				}
			}
		});

		btnFacturar.disableProperty().bind(Bindings.isEmpty((tblArticulos.getItems())));

		cmbTipoComprobante.setItems(comprobantes);

		cmbTipoComprobante.setValue("Factura B");
		
		cmbTipoComprobante.setOnAction(e -> {
			switch (cmbTipoComprobante.getValue()) {
			case "Factura C":
				tipoComp = TipoComprobante.tcFacturaC;
				break;
			case "Factura B":
				tipoComp = TipoComprobante.tcFacturaB;
				break;
			case "Nota de Crédito A":
				tipoComp = TipoComprobante.tcNotaCreditoA;
				break;
			case "Nota de Crédito B":
				tipoComp = TipoComprobante.tcNotaCreditoB;
				break;
			case "Nota de Crédito C":
				tipoComp = TipoComprobante.tcNotaCreditoC;
				break;
			case "Nota de Débito A":
				tipoComp = TipoComprobante.tcNotaDebitoA;
				break;
			case "Nota de Débito B":
				tipoComp = TipoComprobante.tcNotaDebitoB;
				break;
			case "Nota de Débito C":
				tipoComp = TipoComprobante.tcNotaDebitoC;
				break;
			default:
				tipoComp = TipoComprobante.tcFacturaB;
			}
		});

		cmbTipoDocumento.setItems(documentos);

		cmbTipoDocumento.setValue("Sin identificar/venta global diaria");
		
		cmbTipoDocumento.setOnAction(e -> {
			switch (cmbTipoDocumento.getValue()) {
			case "CUIT":
				tipoDocumento = 80;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			case "CDI":
				tipoDocumento = 87;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			case "CI Extranjera":
				tipoDocumento = 91;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			case "Pasaporte":
				tipoDocumento = 94;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			case "DNI":
				tipoDocumento = 96;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			case "Sin identificar/venta global diaria":
				tipoDocumento = 99;
				numeroDocumento = Double.valueOf(txtDni.getText());
				break;
			default:
				tipoDocumento = 99;
				numeroDocumento = 0.0;
			}
		});
		
		dpFechaComprobante.setOnAction(e -> {
			fechaComprobante = dpFechaComprobante.getValue().toString();
		});
		
		cmbSituacionFiscal.setItems(situacionFiscal);
		
		cmbSituacionFiscal.setOnAction(e -> {
			condicionIVAReceptor = cmbSituacionFiscal.getValue().toString();
		});
		
//		txtBonificacion.setOnAction(e -> {
//			if (txtBonificacion.getText().isEmpty()) {
//				txtBonificacion.setText(String.valueOf(0.0));
//			}
//		});
//		
//		txtImporteBonif.setOnAction(e -> {
//			if (txtImporteBonif.getText().isEmpty()) {
//				txtImporteBonif.setText(String.valueOf(0.0));
//			}
//		});

		cmbFormaPago.setItems(formaPago);

		btnAgregar.setOnAction(e -> {
			
			if (txtBonificacion.getText().isEmpty()) 
				txtBonificacion.setText(String.valueOf(0.0));
			
			if (txtImporteBonif.getText().isEmpty()) 
				txtImporteBonif.setText(String.valueOf(0.0));
				
			Articulo articulo = new Articulo(txtCodigo.getText(), txtProducto.getText(),
					Double.valueOf(txtCantidad.getText()), "unidades", Double.valueOf(txtPrecioUnitario.getText()),
					Double.valueOf(txtBonificacion.getText()), 1.00, 45.00);
			// importe_bonificado, subtotal
			itemsArticulo.add(articulo);
			tblArticulos.setItems(itemsArticulo);
			limpiarCampos();
		});

		btnConfiguracion.setOnAction(e -> {
			showVentanaConfiguracion();
		});

		btnSalir.setOnAction(event -> {
			Platform.exit();
			System.exit(0);
		});

		btnFacturar.setOnAction(event -> {
			try {
				obtenerCAE();
			} catch (JRException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		
		cbProductos.selectedProperty().addListener(e -> {
			if (cbServicios.isSelected()) {
				concepto = 3;
			} else {
				concepto = 1;
			}
		});
		
		cbServicios.selectedProperty().addListener(e -> {
			if (cbProductos.isSelected()) {
				concepto = 3;
			} else {
				concepto = 2;
			}
		});

		Platform.runLater(() -> dpFechaComprobante.requestFocus());
	}

	private void checkConfiguracion() throws ClassNotFoundException, SQLException {
		if (ConfiguracionDAO.buscarConfiguracion().isEmpty()) {
			Alert alert2 = new Alert(AlertType.ERROR);
			alert2.setTitle("Sin datos de Configuración");
			alert2.setContentText("Ingrese los datos de Configuracion iniciales");
			alert2.showAndWait();

			lblConfiguracion.setText("SIN DATOS DE CONFIGURACIÓN");
			Timeline timeline = new Timeline(
					new KeyFrame(Duration.seconds(0.02), evt -> lblConfiguracion.setVisible(false)),
					new KeyFrame(Duration.seconds(0.5), evt -> lblConfiguracion.setVisible(true)));
			timeline.setCycleCount(Animation.INDEFINITE);
			timeline.play();

			cmbTipoComprobante.requestFocus();
		} else {
			lblConfiguracion.setText("CONFIGURACIÓN CORRECTA");
			configuracion = ConfiguracionDAO.getConfiguracion();
			txtPuntoVenta.setText(String.valueOf(configuracion.getPunto_venta()));
		}
	}

	private void obtenerCAE() throws JRException {
		wsfev1.cuit(Integer.valueOf(configuracion.getCuit())); // CUIT del emisor
		String key = configuracion.getPath_claveprivada();

		if (configuracion.isModo_produccion()) { // PRODUCCION
			String crt = configuracion.getPath_certproduccion();

			wsfev1.url(PURLWSW);
			if (wsfev1.login(crt, key, PURLWSAA)) {

				if (!wsfev1.sfRecuperaLastCMP(configuracion.getPunto_venta(), tipoComp.comEnumValue())) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error en Comprobantes");
					alert.setHeaderText("Error de AFIP");
					alert.setContentText(wsfev1.errorDesc());

					DialogPane dialogPane = alert.getDialogPane();
					dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
					dialogPane.getStyleClass().add("myDialog");

				} else {
					nroComp = wsfev1.sfLastCMP() + 1;
					wsfev1.reset();

					calcularVenta();

					/**
					 * Parametros Concepto (Entero): Concepto facturado. Si es producto o servicio.
					 * (1=Producto / 2=Servicio / 3=Productos y Servicios) Tipo de doc del cliente
					 * (80=Cuit / 96=DNI) Número de documento. Debe coincidir según el tipo definido
					 * en el parámetro anterior. Nro de Comprobante a autorizar (Desde) Nro de
					 * Comprobante a autorizar (Hasta) Fecha del comprobante (aaaammdd) Importe
					 * total bruto (Flotante) Importe total de servicios (solo requerido si concepto
					 * es servicio). Neto gravado. Monto exento. Fecha de servicio desde (solo
					 * requerido si concepto es servicio) Fecha de servicio hasta (solo requerido si
					 * concepto es servicio) Fecha de vencimiento del pago (solo requerido si
					 * concepto es servicio) Id de moneda. Cotización de la moneda.
					 */
					wsfev1.agregaFactura(concepto, tipoDocumento, numeroDocumento, nroComp, nroComp, fechaComprobante,
							totalBruto, 0, totalNeto, 0, "", "", "", "PES", 1);

					wsfev1.agregaIVA(5, totalBruto, totalIVA); // Ver Excel de referencias de codigos AFIP
					if (!wsfev1.autorizar(configuracion.getPunto_venta(), tipoComp.comEnumValue())) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Error en Comprobantes");
						alert.setHeaderText("Error de AFIP");
						alert.setContentText(wsfev1.errorDesc());

						System.out.println(wsfev1.errorDesc());

						DialogPane dialogPane = alert.getDialogPane();
						dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
						dialogPane.getStyleClass().add("myDialog");

					} else {
						if (wsfev1.sfResultado(0).equals("A")) {
							// System.out.println("Se ha instalado correctamente FEAFIP. CAE y Vencimiento:
							// " + wsfev1.sfcae(0) + " " + wsfev1.sfVencimiento(0));
							if (configuracion.isModo_factura()) {
								imprimirFactura(nroComp);
							} else {
								imprimirTicket(nroComp);
							}
							limpiarAtributos();
						} else {
							Alert alert = new Alert(AlertType.ERROR);
							alert.setTitle("Error en Comprobantes");
							alert.setHeaderText("Error de AFIP");
							alert.setContentText(wsfev1.autorizarRespuestaObs(0));
							DialogPane dialogPane = alert.getDialogPane();
							dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
							dialogPane.getStyleClass().add("myDialog");
						}
					}
				}
			} else {
				Alert alert = new Alert(AlertType.ERROR);
				alert.setTitle("Error en Comprobantes");
				alert.setHeaderText("Error de AFIP");
				alert.setContentText(wsfev1.errorDesc());
				DialogPane dialogPane = alert.getDialogPane();
				dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
				dialogPane.getStyleClass().add("myDialog");
			}
		} else { // HOMOLOGACIÓN
			String crt = configuracion.getPath_certhomologacion();

			wsfev1.url(HURLWSW);
			if (wsfev1.login(crt, key, HURLWSAA)) {

				if (!wsfev1.sfRecuperaLastCMP(configuracion.getPunto_venta(), tipoComp.comEnumValue())) {
					Alert alert = new Alert(AlertType.ERROR);
					alert.setTitle("Error en Comprobantes");
					alert.setHeaderText("Error de AFIP");
					alert.setContentText(wsfev1.errorDesc());

					DialogPane dialogPane = alert.getDialogPane();
					dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
					dialogPane.getStyleClass().add("myDialog");

				} else {
					nroComp = wsfev1.sfLastCMP() + 1;
					wsfev1.reset();

					calcularVenta();

					/**
					 * Parametros Concepto (Entero): Concepto facturado. Si es producto o servicio.
					 * (1=Producto / 2=Servicio / 3=Productos y Servicios) Tipo de doc del cliente
					 * (80=Cuit / 96=DNI) Número de documento. Debe coincidir según el tipo definido
					 * en el parámetro anterior. Nro de Comprobante a autorizar (Desde) Nro de
					 * Comprobante a autorizar (Hasta) Fecha del comprobante (aaaammdd) Importe
					 * total bruto (Flotante) Importe total de servicios (solo requerido si concepto
					 * es servicio). Neto gravado. Monto exento. Fecha de servicio desde (solo
					 * requerido si concepto es servicio) Fecha de servicio hasta (solo requerido si
					 * concepto es servicio) Fecha de vencimiento del pago (solo requerido si
					 * concepto es servicio) Id de moneda. Cotización de la moneda.
					 */
					wsfev1.agregaFactura(concepto, tipoDocumento, numeroDocumento, nroComp, nroComp, fechaComprobante,
							totalBruto, 0, totalNeto, 0, "", "", "", "PES", 1);

					wsfev1.agregaIVA(5, totalBruto, totalIVA); // Ver Excel de referencias de codigos AFIP
					if (!wsfev1.autorizar(configuracion.getPunto_venta(), tipoComp.comEnumValue())) {
						Alert alert = new Alert(AlertType.ERROR);
						alert.setTitle("Error en Comprobantes");
						alert.setHeaderText("Error de AFIP");
						alert.setContentText(wsfev1.errorDesc());

						System.out.println(wsfev1.errorDesc());

						DialogPane dialogPane = alert.getDialogPane();
						dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
						dialogPane.getStyleClass().add("myDialog");

					} else {
						if (wsfev1.sfResultado(0).equals("A")) {
							// System.out.println("Se ha instalado correctamente FEAFIP. CAE y Vencimiento:
							// " + wsfev1.sfcae(0) + " " + wsfev1.sfVencimiento(0));
							if (configuracion.isModo_factura()) {
								imprimirFactura(nroComp);
							} else {
								imprimirTicket(nroComp);
							}
							limpiarAtributos();
						} else {
							Alert alert = new Alert(AlertType.ERROR);
							alert.setTitle("Error en Comprobantes");
							alert.setHeaderText("Error de AFIP");
							alert.setContentText(wsfev1.autorizarRespuestaObs(0));
							DialogPane dialogPane = alert.getDialogPane();
							dialogPane.getStylesheets().add(getClass().getResource("dialogs.css").toExternalForm());
							dialogPane.getStyleClass().add("myDialog");
						}
					}
				}
			}
		};
	};
	
	private void imprimirFactura(Double nroComprobante) throws JRException {
		fechaVtoCAE = wsfev1.sfVencimiento(0).substring(6, 8) + '/' + wsfev1.sfVencimiento(0).substring(4, 6) + '/'
				+ wsfev1.sfVencimiento(0).substring(0, 4);

		String pathPDF = configuracion.getPath_facturaspdf();

		String exportFile = pathPDF + "\\pdf\\" + tipoComp + nroComprobante.toString() + '-' + wsfev1.sfcae(0) + ".pdf";
		
		// Convierto itemsArticulo a JRBeanCollectionDataSource 
        JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(itemsArticulo);
        
        // Seteo el número de copias
		List<Integer> copias = Arrays.asList(1, 2, 3);

		copias.stream().forEach(i -> {
			switch (i.intValue()) {
			case 1: {
				parameters.put("copias", "ORIGINAL");
				break;
			}
			case 2: {
				parameters.put("copias", "DUPLICADO");
				break;
			}
			case 3: {
				parameters.put("copias", "TRIPLICADO");
				break;
			}} //end switch

			try {
				setearParametrosImprimir(itemsJRBean, nroComprobante, exportFile);
			} catch (JRException e) {
				e.printStackTrace();
			}
		}); // end stream
	}

	private void imprimirTicket(Double nroComprobante) throws JRException {
		fechaVtoCAE = wsfev1.sfVencimiento(0).substring(6, 8) + '/' + wsfev1.sfVencimiento(0).substring(4, 6) + '/'
				+ wsfev1.sfVencimiento(0).substring(0, 4);

		fechaVtoCAEBD = wsfev1.sfVencimiento(0).substring(0, 4) + '-' + wsfev1.sfVencimiento(0).substring(4, 6) + '-'
				+ wsfev1.sfVencimiento(0).substring(6, 8);

		String userdir = System.getProperty("user.home");
		String bcCAE = userdir + "\\pdf\\" + "facturaB" + '-' + "6" + '-' + nroComprobante.toString() + '-'
				+ wsfev1.sfcae(0) + ".png";
		String exportFile = userdir + "\\pdf\\" + "facturaB" + '-' + "6" + '-' + nroComprobante.toString() + '-'
				+ wsfev1.sfcae(0) + ".pdf";

		IBarcode barcode = ClassFactory.createBarcode();
		try {
			barcode.generarCodigo(27321845342.0, 6, 6, wsfev1.sfcae(0), wsfev1.sfVencimiento(0), bcCAE);
			System.out.println("Código de Barra generado con éxito");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		JRDataSource ds = new JRBeanCollectionDataSource(itemsArticulo);

		Map<String, Object> parameters = new HashMap<String, Object>();
		
		if (configuracion.isModo_produccion()) {
			parameters.put("sinValor", null);
		} else {
			parameters.put("sinValor", "SIN VALOR FISCAL - HOMOLOGACIÓN");
		}

		try {
			parameters.put("barcodeCAE", new FileInputStream(bcCAE));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		parameters.put("nroFactura", nroComprobante.toString());
		parameters.put("puntoVenta", "6");
		parameters.put("Fecha", lblFecha.getText());
		parameters.put("Hora", lblHora.getText());
		parameters.put("tipoResponsable", "CONSUMIDOR FINAL");
		parameters.put("dni", "99999999");
		parameters.put("direccion", "NO CORRESPONDE");

//		itemsArticulo.forEach(item -> { 
//			parameters.put("cantPrecio", String.format("%.2f",item.getCantidad_comprada()) + " / " + String.format("%.2f", item.getSubTotal()));
//			parameters.put("alicuotaIva", "(% 21)");
//			parameters.put("descripcion", item.getLeyenda());
//			parameters.put("importe", String.format("%.2f", item.getSubTotal()));
//		});

		parameters.put("cae", wsfev1.sfcae(0));
		parameters.put("fechaVtoCae", fechaVtoCAE);

		parameters.put("importeBruto", lblSubTotalGeneral.getText());

		if (dto != null && !dto.isEmpty()) {
			parameters.put("dto", "(% " + dto + ")");
			parameters.put("importeDescuento", txtBonificacion.getText());
		} else {
			parameters.put("dto", "");
			parameters.put("importeDescuento", "");
		}

		parameters.put("importeNeto", lblTotalGeneral.getText());
		parameters.put("formaPago", pago);

		JasperPrint print = JasperFillManager.fillReport(Pos.class.getResourceAsStream("/reports/ticket80.jasper"),
				parameters, ds);

		JasperExportManager.exportReportToPdfFile(print, exportFile);
	}

	private void setearParametrosImprimir(JRBeanCollectionDataSource itemsBean, Double nroComprobante, String exportFile) throws JRException {
		if (configuracion.isModo_produccion()) {
			parameters.put("sinValor", null);
		} else {
			parameters.put("sinValor", "SIN VALOR FISCAL - HOMOLOGACIÓN");
		}

		// Datos del emisor
		parameters.put("razonSocialMAY", configuracion.getNombre_empresa().toUpperCase());
		parameters.put("puntoVenta", String.valueOf(configuracion.getPunto_venta()));
		parameters.put("nroComprobante", nroComprobante.toString());
		parameters.put("fechaEmision", fechaComprobante);
		parameters.put("razonSocialEmisor", configuracion.getNombre_empresa());
		parameters.put("cuitEmisor", configuracion.getCuit());
		parameters.put("domicilioEmisor", configuracion.getDomicilio_fiscal());
		parameters.put("ingBrutosEmisor", configuracion.getIibb_convmultilateral());
		parameters.put("condicionIVAEmisor", configuracion.getSituacion_fiscal());
		parameters.put("fechaInicioActividades", configuracion.getFecha_iactividades().toString());
		
		// Datos del Receptor
		if (txtDni.getText().isEmpty()) {
			parameters.put("dniCliente", null);
		} else {
			parameters.put("dniCliente", txtDni.getText());
		};
		
		if (txtCliente.getText().isEmpty()) {
			parameters.put("razonSocialCliente", null);
		} else {
			parameters.put("razonSocialCliente", txtCliente.getText());
		};
	
		if (cmbSituacionFiscal.getValue().isEmpty()) {
			parameters.put("condicionIVACliente", null);
		} else {
			parameters.put("condicionIVACliente", cmbSituacionFiscal.getValue().toString());
		};
		
		if (txtDomicilio.getText().isEmpty()) {
			parameters.put("domicilioCliente", null);
		} else {
			parameters.put("domicilioCliente", txtDomicilio.getText());
		};
		
		if (cmbFormaPago.getValue().isEmpty()) {
			parameters.put("condicionVenta", "Contado");
		} else {
			parameters.put("condicionVenta", cmbFormaPago.getValue().toString());
		};
		
		// Si es un Servicio o Producto y Servicio
	    if (cbServicios.isSelected()) {
	    	parameters.put("fechaDesde", dpDesde.getValue().toString());
	    	parameters.put("fechaHasta", dpHasta.getValue().toString());
	    	parameters.put("fechaVtoPago", dpVtoPago.getValue().toString());
	    } else {
	    	parameters.put("fechaDesde", null);
	    	parameters.put("fechaHasta", null);
	    	parameters.put("fechaVtoPago", null);
	    }

	    // Items
		parameters.put("ItemDataSet", itemsBean);

		// Totales
		parameters.put("subtotal", lblSubTotalGeneral.getText());
		parameters.put("total", lblTotalGeneral.getText());

		// Datos del CAE
		parameters.put("cae", wsfev1.sfcae(0));
		parameters.put("fechaVtoCae", fechaVtoCAE);

		parameters.put("importeBruto", lblSubTotalGeneral.getText());

//		if (dto != null && !dto.isEmpty()) {
//			parameters.put("dto", "(% " + dto + ")");
//			parameters.put("importeDescuento", txtBonificacion.getText());
//		} else {
//			parameters.put("dto", "");
//			parameters.put("importeDescuento", "");
//		}

		JasperPrint print = JasperFillManager.fillReport(Pos.class.getResourceAsStream("/reports/rptFactura.jasper"), parameters,
				itemsBean);

		JasperExportManager.exportReportToPdfFile(print, exportFile);

		JasperViewer.viewReport(print);
	}
	
	private void showVentanaConfiguracion() {
		try {
			FXMLLoader loader = new FXMLLoader();
			Parent root = (Parent) loader.load(getClass().getResourceAsStream("/fxml/configuracion.fxml"));

			Stage stage = new Stage();
			/**
			 * Obtengo el controlador y le "mando" el stage del fxml
			 * 
			 */
			controller.Configuracion configuracion = loader.getController();
			configuracion.setStage(stage);

			stage.setAlwaysOnTop(true);
			stage.setResizable(false);
			stage.initStyle(StageStyle.UNDECORATED);
			stage.initModality(Modality.APPLICATION_MODAL);
			Scene scene = new Scene(root);

			scene.getStylesheets().add("/styles/style.css");

			scene.setOnMousePressed(e1 -> {
				dragOffsetX = e1.getSceneX();
				dragOffsetY = e1.getSceneY();
			});

			scene.setOnMouseDragged(e1 -> {
				stage.setX(e1.getScreenX() - dragOffsetX);
				stage.setY(e1.getScreenY() - dragOffsetY);
			});

			stage.addEventHandler(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
				if (KeyCode.ESCAPE == event.getCode()) {
					stage.close();
				}
			});

			stage.setScene(scene);
			stage.centerOnScreen();
			stage.show();

		} catch (Exception e2) {
			e2.printStackTrace();
		}
	};

	private void inicializarTabla() {
		colCodigo.setCellValueFactory(new PropertyValueFactory<Articulo, String>("codigo"));
		colArticulo.setCellValueFactory(new PropertyValueFactory<Articulo, String>("articulo"));
		colCantidad.setCellValueFactory(new PropertyValueFactory<Articulo, Double>("cantidad"));
		colPrecioUnitario.setCellValueFactory(new PropertyValueFactory<Articulo, Double>("precio_unitario"));
		colBonificacion.setCellValueFactory(new PropertyValueFactory<Articulo, Double>("porc_bonificacion"));
		colImporteBonif.setCellValueFactory(new PropertyValueFactory<Articulo, Double>("importe_bonificado"));
		colSubtotal.setCellValueFactory(new PropertyValueFactory<Articulo, Double>("subtotal"));

		colPrecioUnitario.setStyle("-fx-alignment: CENTER-RIGHT;");
		colImporteBonif.setStyle("-fx-alignment: CENTER-RIGHT;");
		colCantidad.setStyle("-fx-alignment: CENTER;");
	}

	private void limpiarAtributos() {
		tblArticulos.getItems().clear();
		lblSubTotalGeneral.setText(null);
		lblSubTotalIVA.setText(null);
		txtBonificacion.clear();
		lblTotalGeneral.setText(null);
		cmbTipoComprobante.requestFocus();
	}

	private void limpiarCampos() {
		txtCodigo.clear();
		txtProducto.clear();
		txtCantidad.clear();
		txtPrecioUnitario.clear();
		txtCodigo.requestFocus();
	}

	private void calcularVenta() {
		totalBruto = itemsArticulo.stream().mapToDouble(o -> o.getPrecio_unitario()).sum();

		BigDecimal bruto = new BigDecimal(totalBruto.toString());

		if (dto != null && !dto.isEmpty()) {
			Double descuento = Double.parseDouble(dto);
			BigDecimal dto = new BigDecimal(descuento);

			BigDecimal montoDescuento = bruto.multiply(dto).divide(new BigDecimal(100));
			BigDecimal brutoConDescuento = bruto.subtract(montoDescuento);

			// calculo el IVA con el monto con descuento
			CalcularIVA calcularIVA = new CalcularIVA(brutoConDescuento.doubleValue());
			totalIVA = calcularIVA.calcular_iva();
			BigDecimal montoIVA = new BigDecimal(totalIVA);

			BigDecimal neto = brutoConDescuento.subtract(montoIVA);
			totalNeto = neto.doubleValue(); // pierdo precisión, pero preciso el tipo Double para mandar a AFIP

			lblSubTotalGeneral.setText(bruto.setScale(2, RoundingMode.HALF_EVEN).toPlainString());
			lblSubTotalIVA.setText(montoIVA.setScale(2, RoundingMode.HALF_EVEN).toPlainString());
			lblTotalGeneral.setText(String.format("%.2f", neto));
		} else {
			CalcularIVA calcularIva = new CalcularIVA(totalBruto);
			totalIVA = calcularIva.calcular_iva();
			BigDecimal montoIVA = new BigDecimal(totalIVA);

			BigDecimal neto = bruto.subtract(montoIVA);
			totalNeto = neto.doubleValue(); // pierdo precisión, pero preciso el tipo Double para mandar a AFIP

			lblSubTotalGeneral.setText(bruto.setScale(2, RoundingMode.HALF_EVEN).toPlainString());
			lblSubTotalIVA.setText(montoIVA.setScale(2, RoundingMode.HALF_EVEN).toPlainString());
			lblTotalGeneral.setText(String.format("%.2f", neto));
		}
	}

}