package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsfecred Object
 */
@IID("{32EF8E70-4CB3-40FD-A66C-BBB03E147C37}")
public interface Iwsfecred extends Com4jObject {
  // Methods:
  /**
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void dummy();


  /**
   * @param rolCUITRepresentada Mandatory java.lang.String parameter.
   * @param cuitContraparte Mandatory double parameter.
   * @param codTipoCmp Mandatory int parameter.
   * @param estadoCmp Mandatory java.lang.String parameter.
   * @param fecha_tipo Mandatory java.lang.String parameter.
   * @param fecha_desde Mandatory java.lang.String parameter.
   * @param fecha_hasta Mandatory java.lang.String parameter.
   * @param codCtaCte Mandatory double parameter.
   * @param estadoCtaCte Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  boolean consultarComprobantes(
    java.lang.String rolCUITRepresentada,
    double cuitContraparte,
    int codTipoCmp,
    java.lang.String estadoCmp,
    java.lang.String fecha_tipo,
    java.lang.String fecha_desde,
    java.lang.String fecha_hasta,
    double codCtaCte,
    java.lang.String estadoCtaCte);


  /**
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void rechazarNotaDC();


  /**
   * @param rolCUITRepresentada Mandatory java.lang.String parameter.
   * @param cuitContraparte Mandatory double parameter.
   * @param fecha Mandatory java.lang.String parameter.
   * @param estadoCtaCte Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  boolean consultarCtasCtes(
    java.lang.String rolCUITRepresentada,
    double cuitContraparte,
    java.lang.String fecha,
    java.lang.String estadoCtaCte);


  /**
   * @param codCtaCte Mandatory int parameter.
   * @param cuitEmisor Mandatory double parameter.
   * @param codTipoCmp Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param nroCmp Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  boolean consultarCtaCte(
    int codCtaCte,
    double cuitEmisor,
    int codTipoCmp,
    int ptoVta,
    double nroCmp);


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  void informarCancelacionTotalFECred();


  /**
   * @param request Mandatory feafip.IAceptarFECredRequestTy parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  boolean aceptarFECred(
    feafip.IAceptarFECredRequestTy request);


  /**
   * @param request Mandatory feafip.IRechazarFECredRequestTy parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  boolean rechazarFECred(
    feafip.IRechazarFECredRequestTy request);


  /**
   * @param request Mandatory feafip.IInformarFacturaAgtDptoCltvRequestTy parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  boolean informarFacturaAgtDptoCltv(
    feafip.IInformarFacturaAgtDptoCltvRequestTy request);


  /**
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  void consultarFacturasAgtDptoCltv();


  /**
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  void consultarCuentasComitente();


  /**
   * @param cuitConsultada Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  boolean consultarObligadoRecepcion(
    double cuitConsultada);


  /**
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  void consultarTiposRetenciones();


  /**
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  void consultarTiposMotivosRechazo();


  /**
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  void consultarTiposFormasCancelacion();


  /**
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  void obtenerRemitos();


  /**
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  void consultarHistorialEstadosComprobante();


  /**
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  void consultarHistorialEstadosCtaCte();


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada);


  /**
   * @param licencia Mandatory java.lang.String parameter.
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(26)
  void cargarLicencia(
    java.lang.String licencia);


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(27)
  java.lang.String token();


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String sign();


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(29)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(31)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(32)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String xmlResponse();


  /**
   * <p>
   * Getter method for the COM property "Depurar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(35)
  boolean depurar();


  /**
   * <p>
   * Setter method for the COM property "Depurar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(36)
  void depurar(
    boolean value);


  /**
   * @return  Returns a value of type feafip.IAceptarFECredRequestTy
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(37)
  feafip.IAceptarFECredRequestTy nuevoAceptarFECredRequestTy();


  /**
   * <p>
   * Getter method for the COM property "ModoProduccion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(38)
  boolean modoProduccion();


  /**
   * <p>
   * Setter method for the COM property "ModoProduccion"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(39)
  void modoProduccion(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "consultarCmpReturn"
   * </p>
   * @return  Returns a value of type feafip.IConsultarCmpReturnTy
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(40)
  feafip.IConsultarCmpReturnTy consultarCmpReturn();


  /**
   * @return  Returns a value of type feafip.IInformarFacturaAgtDptoCltvRequestTy
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(41)
  feafip.IInformarFacturaAgtDptoCltvRequestTy nuevoInformarFacturaAgtDptoCltvRequestTy();


  /**
   * @return  Returns a value of type feafip.IRechazarFECredRequestTy
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(42)
  feafip.IRechazarFECredRequestTy nuevoRechazarFECredRequestTy();


  /**
   * <p>
   * Getter method for the COM property "consultarObligadoRecepcionReturn"
   * </p>
   * @return  Returns a value of type feafip.IconsultarObligadoRecepcionReturnTy
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(43)
  feafip.IconsultarObligadoRecepcionReturnTy consultarObligadoRecepcionReturn();


  /**
   * @param cuitConsultada Mandatory double parameter.
   * @param fechaEmision Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(44)
  boolean consultarMontoObligadoRecepcion(
    double cuitConsultada,
    java.lang.String fechaEmision);


  /**
   * <p>
   * Getter method for the COM property "consultarMontoObligadoRecepcionReturn"
   * </p>
   * @return  Returns a value of type feafip.IConsultarMontoObligadoRecepcionReturnTy
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(45)
  feafip.IConsultarMontoObligadoRecepcionReturnTy consultarMontoObligadoRecepcionReturn();


  /**
   * <p>
   * Getter method for the COM property "consultarCtasCtesReturn"
   * </p>
   * @return  Returns a value of type feafip.IConsultarCtasCtesReturnTy
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(46)
  feafip.IConsultarCtasCtesReturnTy consultarCtasCtesReturn();


  /**
   * <p>
   * Getter method for the COM property "consultarCtaCteReturn"
   * </p>
   * @return  Returns a value of type feafip.IConsultarCtaCteReturnTy
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(47)
  feafip.IConsultarCtaCteReturnTy consultarCtaCteReturn();


  // Properties:
}
