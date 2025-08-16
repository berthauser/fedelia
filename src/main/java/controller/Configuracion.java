package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.time.format.DateTimeFormatter;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXRadioButton;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.RequiredFieldValidator;

import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import services.ConfiguracionDAO;

public class Configuracion {

	@FXML
	private JFXRadioButton rbProduccion;
	@FXML
	private ToggleGroup tgTipo;
	@FXML
	private JFXRadioButton rbHomologacion;
	@FXML
	private JFXRadioButton rbFacturas;
	@FXML
	private ToggleGroup tgImprimir;
	@FXML
	private JFXRadioButton rbTickets;
	@FXML
	private JFXTextField txtNombreEmpresa;
	@FXML
	private JFXTextField txtEmail;
	@FXML
	private JFXTextField txtCalle;
	@FXML
	private JFXTextField txtNumero;
	@FXML
	private JFXTextField txtOficina;
	@FXML
	private JFXTextField txtLocalidad;
	@FXML
	private JFXTextField txtCodigoPostal;
	@FXML
	private JFXTextField txtTelefonoFijo;
	@FXML
	private JFXTextField txtTelefonoMovil;
	@FXML
	private JFXComboBox<String> cmbSituacionFiscal;
	@FXML
	private JFXTextField txtDomicilioFiscal;
	@FXML
	private JFXTextField txtPuntoVenta;
	@FXML
	private JFXTextField txtIIBB;
	@FXML
	private JFXTextField txtCUIT;
	@FXML
	private JFXDatePicker dpFechaInicio;
	@FXML
	private JFXButton btnCP;
	@FXML
	private JFXTextField txtDirectorioCP;
	@FXML
	private JFXButton btnClavePrivada;
	@FXML
	private JFXTextField txtDirectorioCH;
	@FXML
	private JFXButton btnCH;
	@FXML
	private JFXTextField txtDirectorioClavePrivada;
	@FXML
	private JFXButton btnFPDF;
	@FXML
	private JFXTextField txtFacturasPDF;
	@FXML
	private Button btnActualizar;
	@FXML
	private ImageView imgHeader;

	private Stage myStage;
	private Integer condicionIva;
	private static Boolean isEmpty;
	private Integer idconfiguracion;
	public static int selectedWS = 1;
	private static final String MSG = "Requerido";
	private RequiredFieldValidator validator = new RequiredFieldValidator();
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	private ObservableList<model.Configuracion> configuracion = FXCollections.observableArrayList();

	/**
	 * Propiedad boolean modifiedProperty verifica si el usuario cambio cualquiera
	 * de los atributos de texto del formulario. Reseteamos esa bandera cada vez que
	 * se selecciona algo en el tableview y la volvemos a usar en una expresión bind
	 * para controlar la propiedad disable del botón "Modificar".
	 */

	private final BooleanProperty modifiedProperty = new SimpleBooleanProperty(false);

	private ObservableList<String> listaCondicionIVA = FXCollections.observableArrayList("IVA Responsable Inscripto",
			"IVA Responsable No Inscripto", "IVA No Responsable", "IVA Sujeto Exento", "Consumidor Final",
			"Responsable Monotributo", "Sujeto No Categorizado", "Proveedor del Exterior", "IVA Liberado - Ley 19.640",
			"IVA Responsable Inscripto – Agente de Percepción", "Pequeño Contribuyente Eventual",
			"Monotributista Social", "Pequeño Contribuyente Eventual Social");

	@FXML
	public void initialize() throws FileNotFoundException, ClassNotFoundException, SQLException {

		imgHeader.setImage(new Image("/images/gear-flat.png"));
		imgHeader.setSmooth(true);
		imgHeader.setPreserveRatio(true);

		validator.setMessage(MSG);

		rbHomologacion.setOnAction(e -> {
			selectedWS = 1;
		});

		rbProduccion.setOnAction(e -> {
			selectedWS = 0;
		});

		if (!ConfiguracionDAO.buscarConfiguracion().isEmpty()) { // existe un registro en la tabla de Configuracion
			isEmpty = false;
			model.Configuracion configuracion = ConfiguracionDAO.getConfiguracion();
			idconfiguracion = configuracion.getIdconfiguracion();
			txtNombreEmpresa.setText(configuracion.getNombre_empresa());
			txtEmail.setText(configuracion.getEmail());
			txtCalle.setText(configuracion.getCalle());
			txtNumero.setText(String.valueOf(configuracion.getNumero()));
			txtOficina.setText(configuracion.getOficina());
			txtLocalidad.setText(configuracion.getLocalidad());
			txtCodigoPostal.setText(configuracion.getCodigo_postal());
			txtTelefonoFijo.setText(configuracion.getTelefono_movil());
			txtTelefonoMovil.setText(configuracion.getTelefono_movil());
			cmbSituacionFiscal.setValue(configuracion.getSituacion_fiscal());
			txtDomicilioFiscal.setText(configuracion.getDomicilio_fiscal());
			txtPuntoVenta.setText(String.valueOf(configuracion.getPunto_venta()));
			txtIIBB.setText(configuracion.getIibb_convmultilateral());
			txtCUIT.setText(configuracion.getCuit());
			dpFechaInicio.setValue(configuracion.getFecha_iactividades());

			if (configuracion.isModo_produccion()) {
				rbProduccion.setSelected(true);
			} else {
				rbHomologacion.setSelected(false);
			}

			if (configuracion.isModo_factura()) {
				rbFacturas.setSelected(true);
			} else {
				rbTickets.setSelected(false);
			}

			txtDirectorioCP.setText(configuracion.getPath_certproduccion());
			txtDirectorioCH.setText(configuracion.getPath_certhomologacion());
			txtDirectorioClavePrivada.setText(configuracion.getPath_claveprivada());
			txtFacturasPDF.setText(configuracion.getPath_facturaspdf());
			btnActualizar.disableProperty().unbind();
		} else {
			isEmpty = true;
		}

		txtNombreEmpresa.getValidators().add(validator);

		txtNombreEmpresa.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtNombreEmpresa.validate();
			}
		});

		txtNombreEmpresa.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtCalle.getValidators().add(validator);

		txtCalle.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtCalle.validate();
			}
		});

		txtCalle.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtNumero.getValidators().add(validator);

		txtNumero.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtNumero.validate();
			}
		});

		txtNumero.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtLocalidad.getValidators().add(validator);

		txtLocalidad.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtLocalidad.validate();
			}
		});

		txtLocalidad.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtCodigoPostal.getValidators().add(validator);

		txtCodigoPostal.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtCodigoPostal.validate();
			}
		});

		txtCodigoPostal.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		cmbSituacionFiscal.setItems(listaCondicionIVA);

		cmbSituacionFiscal.getValidators().add(validator);

		cmbSituacionFiscal.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				cmbSituacionFiscal.validate();
			}
		});

		cmbSituacionFiscal.valueProperty().addListener((obs, oldItem, newItem) -> {
			if (!(newItem == null)) {
				switch (newItem) {
				case "IVA Responsable Inscripto":
					condicionIva = 1;
					break;
				case "IVA Responsable No Inscripto":
					condicionIva = 2;
					break;
				case "IVA No Responsable":
					condicionIva = 4;
					break;
				case "IVA Sujeto Exento":
					condicionIva = 5;
					break;
				case "Consumidor Final":
					condicionIva = 6;
					break;
				case "Responsable Monotributo":
					condicionIva = 7;
					break;
				case "Sujeto No Categorizado":
					condicionIva = 8;
					break;
				case "Proveedor del Exterior":
					condicionIva = 9;
					break;
				case "IVA Liberado - Ley 19.640":
					condicionIva = 10;
					break;
				case "IVA Responsable Inscripto – Agente de Percepción":
					condicionIva = 11;
					break;
				case "Pequeño Contribuyente Eventual":
					condicionIva = 12;
					break;
				case "Monotributista Social":
					condicionIva = 13;
					break;
				case "Pequeño Contribuyente Eventual Social":
					condicionIva = 14;
					break;
				default:
					condicionIva = 6;
				}
				modifiedProperty.set(true);
			}
		});

		txtDomicilioFiscal.getValidators().add(validator);

		txtDomicilioFiscal.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtDomicilioFiscal.validate();
			}
		});

		txtDomicilioFiscal.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtPuntoVenta.getValidators().add(validator);

		txtPuntoVenta.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtPuntoVenta.validate();
			}
		});

		txtPuntoVenta.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtIIBB.getValidators().add(validator);

		txtIIBB.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtIIBB.validate();
			}
		});

		txtIIBB.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtCUIT.getValidators().add(validator);

		txtCUIT.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtCUIT.validate();
			}
		});

		txtCUIT.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtCUIT.textProperty().bind(txtIIBB.textProperty());

		dpFechaInicio.getValidators().add(validator);

		dpFechaInicio.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				dpFechaInicio.validate();
			}
		});

		dpFechaInicio.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtDirectorioCP.getValidators().add(validator);

		txtDirectorioCP.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtDirectorioCP.validate();
			}
		});

		txtDirectorioCP.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtDirectorioClavePrivada.getValidators().add(validator);

		txtDirectorioClavePrivada.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtDirectorioClavePrivada.validate();
			}
		});

		txtDirectorioClavePrivada.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtDirectorioCH.getValidators().add(validator);

		txtDirectorioCH.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtDirectorioCH.validate();
			}
		});

		txtDirectorioCH.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		txtFacturasPDF.getValidators().add(validator);

		txtFacturasPDF.focusedProperty().addListener((o, oldVal, newVal) -> {
			if (!newVal) {
				txtFacturasPDF.validate();
			}
		});

		txtFacturasPDF.setOnKeyReleased(e -> {
			modifiedProperty.set(true);
		});

		Platform.runLater(() -> txtNombreEmpresa.requestFocus());

		btnActualizar.disableProperty()
				.bind((txtNombreEmpresa.textProperty().isEmpty()).or(txtCalle.textProperty().isEmpty())
						.or(txtNumero.textProperty().isEmpty()).or(txtLocalidad.textProperty().isEmpty())
						.or(txtCodigoPostal.textProperty().isEmpty()).or(cmbSituacionFiscal.valueProperty().isNull())
						.or(txtDomicilioFiscal.textProperty().isEmpty()).or(txtPuntoVenta.textProperty().isEmpty())
						.or(txtIIBB.textProperty().isEmpty()).or(txtCUIT.textProperty().isEmpty())
						.or(dpFechaInicio.valueProperty().isNull()).or(txtDirectorioCP.textProperty().isEmpty())
						.or(txtDirectorioClavePrivada.textProperty().isEmpty())
						.or(txtDirectorioCH.textProperty().isEmpty()).or(txtFacturasPDF.textProperty().isEmpty()));

		btnActualizar.setOnAction(event -> {
			try {
				if (isEmpty == false) {
					modificarConfiguracion(idconfiguracion);
				} else {
					insertarConfiguracion();
				}
				myStage.close(); // el stage de Configuración
			} catch (ClassNotFoundException | SQLException e1) {
				e1.printStackTrace();
			}
		});

		btnCP.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("Certificados de Seguridad", "*.crt"),
					new FileChooser.ExtensionFilter("Claves Privadas", "*.key"));
			/**
			 * Esta es otra opción para recuperar el stage
			 * 
			 * Node source = (Node) e.getSource(); Window theStage =
			 * source.getScene().getWindow();
			 */
			File selectedFile = fileChooser.showOpenDialog(myStage);
			txtDirectorioCP.setText(String.valueOf(selectedFile));
		});

		btnCH.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("Certificados de Seguridad", "*.crt"),
					new FileChooser.ExtensionFilter("Claves Privadas", "*.key"));
			File selectedFile = fileChooser.showOpenDialog(myStage);
			txtDirectorioCH.setText(String.valueOf(selectedFile));
		});

		btnClavePrivada.setOnAction(e -> {
			FileChooser fileChooser = new FileChooser();
			fileChooser.getExtensionFilters().addAll(
					new FileChooser.ExtensionFilter("Claves Privadas", "*.key"));
			File selectedFile = fileChooser.showOpenDialog(myStage);
			txtDirectorioClavePrivada.setText(String.valueOf(selectedFile));
		});

		btnFPDF.setOnAction(e -> {
			DirectoryChooser directoryChooser = new DirectoryChooser();
//			directoryChooser.setInitialDirectory(new File("src"));
			File selectedDirectory = directoryChooser.showDialog(myStage);
			txtFacturasPDF.setText(selectedDirectory.getAbsolutePath());
		});

	}

	public void setStage(Stage stage) {
		myStage = stage;
	}

	private void insertarConfiguracion() throws SQLException, ClassNotFoundException {
		try {
			ConfiguracionDAO.insertarConfiguracion(txtNombreEmpresa.getText().trim(), txtEmail.getText().trim(),
					txtCalle.getText().trim(), Integer.valueOf(txtNumero.getText().trim()), txtOficina.getText().trim(),
					txtTelefonoFijo.getText().trim(), txtTelefonoMovil.getText().trim(), txtLocalidad.getText().trim(),
					txtCodigoPostal.getText().trim(), cmbSituacionFiscal.getValue(),
					txtDomicilioFiscal.getText().trim(), Integer.valueOf(txtPuntoVenta.getText().trim()),
					txtIIBB.getText().trim(), txtCUIT.getText().trim(), dpFechaInicio.getValue().format(dtf),
					tgTipo.getSelectedToggle().isSelected(), tgImprimir.getSelectedToggle().isSelected(),
					txtFacturasPDF.getText().trim(), txtDirectorioCP.getText().trim(), txtDirectorioCH.getText().trim(),
					txtDirectorioClavePrivada.getText().trim());
		} catch (SQLException e) {
			throw e;
		}
	};

	private void modificarConfiguracion(Integer idconfiguracion) throws SQLException, ClassNotFoundException {
		try {
			if (idconfiguracion != null) {
				ConfiguracionDAO.modificarConfiguracion(idconfiguracion, txtNombreEmpresa.getText().trim(),
						txtEmail.getText().trim(), txtCalle.getText().trim(),
						Integer.valueOf(txtNumero.getText().trim()), txtOficina.getText().trim(),
						txtTelefonoFijo.getText().trim(), txtTelefonoMovil.getText().trim(),
						txtLocalidad.getText().trim(), txtCodigoPostal.getText().trim(),
						cmbSituacionFiscal.getValue().trim(), txtDomicilioFiscal.getText().trim(),
						Integer.valueOf(txtPuntoVenta.getText().trim()), txtIIBB.getText().trim(),
						txtCUIT.getText().trim(), dpFechaInicio.getValue().format(dtf),
						tgTipo.getSelectedToggle().isSelected(), tgImprimir.getSelectedToggle().isSelected(),
						txtFacturasPDF.getText().trim(), txtDirectorioCP.getText().trim(),
						txtDirectorioCH.getText().trim(), txtDirectorioClavePrivada.getText().trim());
			} else {
				Alert alert2 = new Alert(AlertType.INFORMATION);
				alert2.setTitle("Error de SQL");
				alert2.setContentText("Seleccione una Configuración para modificarla");
				alert2.showAndWait();
			}
		} catch (SQLException e) {
			throw e;
		}
	}

}