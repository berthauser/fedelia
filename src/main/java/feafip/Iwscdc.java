package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wscdc Object
 */
@IID("{201C6546-D660-4171-A3D3-839583F7969E}")
public interface Iwscdc extends Com4jObject {
  // Methods:
  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada,
    java.lang.String url);


  /**
   * @param cbteModo Mandatory java.lang.String parameter.
   * @param cuitEmisor Mandatory double parameter.
   * @param ptoVta Mandatory int parameter.
   * @param cbteTipo Mandatory int parameter.
   * @param cbteNro Mandatory double parameter.
   * @param cbteFch Mandatory java.lang.String parameter.
   * @param imptotal Mandatory double parameter.
   * @param codAutorizacion Mandatory java.lang.String parameter.
   * @param docTipoReceptor Mandatory java.lang.String parameter.
   * @param docNroReceptor Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  boolean comprobanteConstatar(
    java.lang.String cbteModo,
    double cuitEmisor,
    int ptoVta,
    int cbteTipo,
    double cbteNro,
    java.lang.String cbteFch,
    double imptotal,
    java.lang.String codAutorizacion,
    java.lang.String docTipoReceptor,
    java.lang.String docNroReceptor);


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "Depurar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  boolean depurar();


  /**
   * <p>
   * Setter method for the COM property "Depurar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void depurar(
    boolean value);


  // Properties:
}
