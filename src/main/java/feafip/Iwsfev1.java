package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsfev1 Object
 */
@IID("{E0A95BBC-E328-4AA6-84E2-405C10AD41A2}")
public interface Iwsfev1 extends Com4jObject {
  // Methods:
  /**
   * @param concepto Mandatory int parameter.
   * @param docTipo Mandatory int parameter.
   * @param docNro Mandatory double parameter.
   * @param cbtedesde Mandatory double parameter.
   * @param cbtehasta Mandatory double parameter.
   * @param cbteFch Mandatory java.lang.String parameter.
   * @param imptotal Mandatory double parameter.
   * @param impTotalConc Mandatory double parameter.
   * @param impNeto Mandatory double parameter.
   * @param impOpEx Mandatory double parameter.
   * @param fechaServDesde Mandatory java.lang.String parameter.
   * @param fechaServHasta Mandatory java.lang.String parameter.
   * @param fechaVencPago Mandatory java.lang.String parameter.
   * @param monId Mandatory java.lang.String parameter.
   * @param monCotiz Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void agregaFactura(
    int concepto,
    int docTipo,
    double docNro,
    double cbtedesde,
    double cbtehasta,
    java.lang.String cbteFch,
    double imptotal,
    double impTotalConc,
    double impNeto,
    double impOpEx,
    java.lang.String fechaServDesde,
    java.lang.String fechaServHasta,
    java.lang.String fechaVencPago,
    java.lang.String monId,
    double monCotiz);


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada,
    java.lang.String url);


  /**
   * @param ptoVenta Mandatory int parameter.
   * @param cbteTipo Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autorizar(
    int ptoVenta,
    int cbteTipo);


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String errorDesc();


  /**
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  void reset();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(15)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "AutorizarRespCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  int autorizarRespCount();


  /**
   * @param indice Mandatory int parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @param reproceso Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(18)
  boolean autorizarRespuesta(
    int indice,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento,
    Holder<java.lang.String> resultado,
    Holder<java.lang.String> reproceso);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @param cmp Mandatory Holder<Double> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(19)
  boolean recuperaLastCMP(
    int ptoVta,
    int tipoComp,
    Holder<Double> cmp);


  /**
   * @param qty Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(20)
  boolean recuperaQTYRequest(
    int qty);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(21)
  boolean cmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento);


  /**
   * @param appserver Mandatory Holder<java.lang.String> parameter.
   * @param authserver Mandatory Holder<java.lang.String> parameter.
   * @param dbserver Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(22)
  boolean dummy(
    Holder<java.lang.String> appserver,
    Holder<java.lang.String> authserver,
    Holder<java.lang.String> dbserver);


  /**
   * @param periodo Mandatory int parameter.
   * @param orden Mandatory int parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param fchVigDesde Mandatory Holder<java.lang.String> parameter.
   * @param fchVigHasta Mandatory Holder<java.lang.String> parameter.
   * @param fchTopeInf Mandatory Holder<java.lang.String> parameter.
   * @param fchProceso Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(23)
  boolean caeaSolicitar(
    int periodo,
    int orden,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> fchVigDesde,
    Holder<java.lang.String> fchVigHasta,
    Holder<java.lang.String> fchTopeInf,
    Holder<java.lang.String> fchProceso);


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String autorizarRespuestaObs(
    int indice);


  /**
   * @param periodo Mandatory int parameter.
   * @param orden Mandatory int parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param fchVigDesde Mandatory Holder<java.lang.String> parameter.
   * @param fchVigHasta Mandatory Holder<java.lang.String> parameter.
   * @param fchTopeInf Mandatory Holder<java.lang.String> parameter.
   * @param fchProceso Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(25)
  boolean caeaConsultar(
    int periodo,
    int orden,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> fchVigDesde,
    Holder<java.lang.String> fchVigHasta,
    Holder<java.lang.String> fchTopeInf,
    Holder<java.lang.String> fchProceso);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param caea Mandatory java.lang.String parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(26)
  boolean caeaSinMovimientoInformar(
    int ptoVta,
    java.lang.String caea,
    Holder<java.lang.String> resultado);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param caea Mandatory java.lang.String parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(27)
  boolean caeaSinMovimientoConsultar(
    int ptoVta,
    java.lang.String caea,
    Holder<java.lang.String> resultado);


  /**
   * @param monId Mandatory java.lang.String parameter.
   * @param monCotiz Mandatory Holder<Double> parameter.
   * @param fchCotiz Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(28)
  boolean paramGetCotizacion(
    java.lang.String monId,
    Holder<Double> monCotiz,
    Holder<java.lang.String> fchCotiz);


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(29)
  boolean paramGetTiposConcepto(
    Holder<java.lang.String> resultado);


  /**
   * @param id Mandatory int parameter.
   * @param desc Mandatory java.lang.String parameter.
   * @param baseImp Mandatory double parameter.
   * @param alic Mandatory double parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(30)
  void agregaTributo(
    int id,
    java.lang.String desc,
    double baseImp,
    double alic,
    double importe);


  /**
   * @param id Mandatory int parameter.
   * @param baseImp Mandatory double parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(31)
  void agregaIVA(
    int id,
    double baseImp,
    double importe);


  /**
   * @param tipo Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param nro Mandatory double parameter.
   * @param cuit Optional parameter. Default value is 0.0
   * @param cbteFch Optional parameter. Default value is ""
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(32)
  void agregaCompAsoc(
    int tipo,
    int ptoVta,
    double nro,
    @Optional double cuit,
    @Optional java.lang.String cbteFch);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param valor Mandatory java.lang.String parameter.
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(33)
  void agregaOpcional(
    java.lang.String id,
    java.lang.String valor);


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(34)
  boolean paramGetTiposMonedas(
    Holder<java.lang.String> resultado);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String xmlResponse();


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String token();


  /**
   * <p>
   * Setter method for the COM property "Token"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(38)
  void token(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String sign();


  /**
   * <p>
   * Setter method for the COM property "Sign"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(40)
  void sign(
    java.lang.String value);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(41)
  boolean sfRecuperaLastCMP(
    int ptoVta,
    int tipoComp);


  /**
   * <p>
   * Getter method for the COM property "SFLastCMP"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(42)
  double sfLastCMP();


  /**
   * <p>
   * Getter method for the COM property "SFCAE"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(43)
  java.lang.String sfcae(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "SFVencimiento"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String sfVencimiento(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "SFResultado"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(45)
  java.lang.String sfResultado(
    int indice);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(46)
  boolean sfCmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro);


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String sfCmpConsultarCAE();


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String sfCmpConsultarVencimiento();


  /**
   * @param ptoVenta Mandatory int parameter.
   * @param cbteTipo Mandatory int parameter.
   * @param cae Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(49)
  boolean caeaInformar(
    int ptoVenta,
    int cbteTipo,
    java.lang.String cae);


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(50)
  java.lang.String autorizarRespuestaObsCode(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "Proxy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(51)
  java.lang.String proxy();


  /**
   * <p>
   * Setter method for the COM property "Proxy"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(52)
  void proxy(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyUserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(242) //= 0xf2. The runtime will prefer the VTID if present
  @VTID(53)
  java.lang.String proxyUserName();


  /**
   * <p>
   * Setter method for the COM property "ProxyUserName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(242) //= 0xf2. The runtime will prefer the VTID if present
  @VTID(54)
  void proxyUserName(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(243) //= 0xf3. The runtime will prefer the VTID if present
  @VTID(55)
  java.lang.String proxyPassword();


  /**
   * <p>
   * Setter method for the COM property "ProxyPassword"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(243) //= 0xf3. The runtime will prefer the VTID if present
  @VTID(56)
  void proxyPassword(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(244) //= 0xf4. The runtime will prefer the VTID if present
  @VTID(57)
  boolean proxyEnabled();


  /**
   * <p>
   * Setter method for the COM property "ProxyEnabled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(244) //= 0xf4. The runtime will prefer the VTID if present
  @VTID(58)
  void proxyEnabled(
    boolean value);


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(245) //= 0xf5. The runtime will prefer the VTID if present
  @VTID(59)
  boolean paramGetTiposDoc(
    Holder<java.lang.String> resultado);


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(246) //= 0xf6. The runtime will prefer the VTID if present
  @VTID(60)
  boolean paramGetTiposCbte(
    Holder<java.lang.String> resultado);


  /**
   * @param requestFilename Mandatory java.lang.String parameter.
   * @param responseFilename Mandatory java.lang.String parameter.
   */

  @DISPID(247) //= 0xf7. The runtime will prefer the VTID if present
  @VTID(61)
  void logTransaction(
    java.lang.String requestFilename,
    java.lang.String responseFilename);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param cbte_info_result Mandatory feafip.IComprobante parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(249) //= 0xf9. The runtime will prefer the VTID if present
  @VTID(62)
  boolean cmpConsultarEx(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    feafip.IComprobante cbte_info_result);


  /**
   * <p>
   * Getter method for the COM property "CmpConsultarCbte"
   * </p>
   * @return  Returns a value of type feafip.IComprobante
   */

  @DISPID(248) //= 0xf8. The runtime will prefer the VTID if present
  @VTID(63)
  feafip.IComprobante cmpConsultarCbte();


  /**
   * @param docTipo Mandatory int parameter.
   * @param docNro Mandatory double parameter.
   * @param porcentaje Mandatory double parameter.
   */

  @DISPID(250) //= 0xfa. The runtime will prefer the VTID if present
  @VTID(64)
  void agregaComprador(
    int docTipo,
    double docNro,
    double porcentaje);


  /**
   * <p>
   * Getter method for the COM property "Depurar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(251) //= 0xfb. The runtime will prefer the VTID if present
  @VTID(65)
  boolean depurar();


  /**
   * <p>
   * Setter method for the COM property "Depurar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(251) //= 0xfb. The runtime will prefer the VTID if present
  @VTID(66)
  void depurar(
    boolean value);


  /**
   * @param licencia Mandatory java.lang.String parameter.
   */

  @DISPID(252) //= 0xfc. The runtime will prefer the VTID if present
  @VTID(67)
  void cargarLicencia(
    java.lang.String licencia);


  /**
   * <p>
   * Getter method for the COM property "Path"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(253) //= 0xfd. The runtime will prefer the VTID if present
  @VTID(68)
  java.lang.String path();


  /**
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(254) //= 0xfe. The runtime will prefer the VTID if present
  @VTID(69)
  boolean paramGetPtosVenta(
    Holder<java.lang.String> resultado);


  /**
   * @param fchDesde Mandatory java.lang.String parameter.
   * @param fchHasta Mandatory java.lang.String parameter.
   */

  @DISPID(255) //= 0xff. The runtime will prefer the VTID if present
  @VTID(70)
  void periodoAsoc(
    java.lang.String fchDesde,
    java.lang.String fchHasta);


  // Properties:
}
