package feafip  ;

import com4j.*;

@IID("{0CEB0878-6393-4701-8C86-2CA793CDCB0D}")
public interface IwsPadron extends Com4jObject {
  // Methods:
  /**
   * @param cuit Mandatory double parameter.
   * @param contribuyenteResult Mandatory feafip.IContribuyente parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean consultar(
    double cuit,
    feafip.IContribuyente contribuyenteResult);


  /**
   * @param cuit Mandatory double parameter.
   * @param archivoDestino Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  boolean descargarConstancia(
    double cuit,
    java.lang.String archivoDestino);


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String errorDesc();


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "ModoProduccion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  boolean modoProduccion();


  /**
   * <p>
   * Setter method for the COM property "ModoProduccion"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(14)
  void modoProduccion(
    boolean value);


  /**
   * @param licencia Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  void cargarLicencia(
    java.lang.String licencia);


  /**
   * @param cuit Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  boolean sfConsultar(
    double cuit);


  /**
   * <p>
   * Getter method for the COM property "Contribuyente"
   * </p>
   * @return  Returns a value of type feafip.IContribuyente
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  feafip.IContribuyente contribuyente();


  // Properties:
}
