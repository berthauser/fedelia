package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsaa Object
 */
@IID("{47BE3547-1C9B-4BCA-9F4E-A65234F2C129}")
public interface Iwsaa extends Com4jObject {
  // Methods:
  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @param url Mandatory java.lang.String parameter.
   * @param servicio Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(7)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada,
    java.lang.String url,
    java.lang.String servicio);


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String token();


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String sign();


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(10)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  void cuit(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String xmlResponse();


  /**
   * <p>
   * Getter method for the COM property "Proxy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String proxy();


  /**
   * <p>
   * Setter method for the COM property "Proxy"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(17)
  void proxy(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyUserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String proxyUserName();


  /**
   * <p>
   * Setter method for the COM property "ProxyUserName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(19)
  void proxyUserName(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String proxyPassword();


  /**
   * <p>
   * Setter method for the COM property "ProxyPassword"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(21)
  void proxyPassword(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(22)
  boolean proxyEnabled();


  /**
   * <p>
   * Setter method for the COM property "ProxyEnabled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(23)
  void proxyEnabled(
    boolean value);


  /**
   * @param licencia Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(24)
  void cargarLicencia(
    java.lang.String licencia);


  // Properties:
}
