package feafip  ;

import com4j.*;

@IID("{A5C9683D-3D72-4392-AD49-A4DFB83D8C63}")
public interface Iwsbfev1 extends Com4jObject {
  // Methods:
  /**
   * @param id Mandatory double parameter.
   * @param tipo_doc Mandatory int parameter.
   * @param nro_doc Mandatory double parameter.
   * @param zona Mandatory int parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param imp_total Mandatory double parameter.
   * @param imp_tot_conc Mandatory double parameter.
   * @param imp_neto Mandatory double parameter.
   * @param impto_liq Mandatory double parameter.
   * @param impto_liq_rni Mandatory double parameter.
   * @param imp_op_ex Mandatory double parameter.
   * @param imp_perc Mandatory double parameter.
   * @param imp_iibb Mandatory double parameter.
   * @param imp_perc_mun Mandatory double parameter.
   * @param imp_internos Mandatory double parameter.
   * @param imp_moneda_Id Mandatory java.lang.String parameter.
   * @param imp_moneda_ctz Mandatory double parameter.
   * @param fecha_cbte Mandatory java.lang.String parameter.
   * @param fecha_vto_pago Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void agregaFactura(
    double id,
    int tipo_doc,
    double nro_doc,
    int zona,
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    double imp_total,
    double imp_tot_conc,
    double imp_neto,
    double impto_liq,
    double impto_liq_rni,
    double imp_op_ex,
    double imp_perc,
    double imp_iibb,
    double imp_perc_mun,
    double imp_internos,
    java.lang.String imp_moneda_Id,
    double imp_moneda_ctz,
    java.lang.String fecha_cbte,
    java.lang.String fecha_vto_pago);


  /**
   * @param id Mandatory java.lang.String parameter.
   * @param valor Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void agregaOpcional(
    java.lang.String id,
    java.lang.String valor);


  /**
   * @param pro_codigo_ncm Mandatory java.lang.String parameter.
   * @param pro_codigo_sec Mandatory java.lang.String parameter.
   * @param pro_ds Mandatory java.lang.String parameter.
   * @param pro_qty Mandatory double parameter.
   * @param pro_umed Mandatory int parameter.
   * @param pro_precio_uni Mandatory double parameter.
   * @param imp_bonif Mandatory double parameter.
   * @param imp_total Mandatory double parameter.
   * @param iva_id Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void agregaItem(
    java.lang.String pro_codigo_ncm,
    java.lang.String pro_codigo_sec,
    java.lang.String pro_ds,
    double pro_qty,
    int pro_umed,
    double pro_precio_uni,
    double imp_bonif,
    double imp_total,
    int iva_id);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  boolean autorizar();


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada,
    java.lang.String url);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String token();


  /**
   * <p>
   * Setter method for the COM property "Token"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  void token(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String sign();


  /**
   * <p>
   * Setter method for the COM property "Sign"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  void sign(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(20)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String errorDesc();


  /**
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(22)
  void reset();


  /**
   * @param pto_venta Mandatory int parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @param cbte_nro Mandatory Holder<Double> parameter.
   * @param cbte_fecha Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(23)
  boolean recuperaLastCMP(
    int pto_venta,
    int tipo_cbte,
    Holder<Double> cbte_nro,
    Holder<java.lang.String> cbte_fecha);


  /**
   * @param pto_venta Mandatory int parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(24)
  boolean sfRecuperaLastCMP(
    int pto_venta,
    int tipo_cbte);


  /**
   * <p>
   * Getter method for the COM property "SFLastCMP"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(25)
  double sfLastCMP();


  /**
   * <p>
   * Getter method for the COM property "SFLastFecha"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String sfLastFecha();


  /**
   * @param id Mandatory Holder<Double> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(27)
  boolean recuperaLastID(
    Holder<Double> id);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(28)
  boolean sfRecuperaLastID();


  /**
   * <p>
   * Getter method for the COM property "SFLastId"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(29)
  double sfLastId();


  /**
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @param reproceso Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(30)
  boolean autorizarRespuesta(
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento,
    Holder<java.lang.String> resultado,
    Holder<java.lang.String> reproceso);


  /**
   * <p>
   * Getter method for the COM property "SFCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String sfcae();


  /**
   * <p>
   * Getter method for the COM property "SFVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String sfVencimiento();


  /**
   * <p>
   * Getter method for the COM property "SFResultado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String sfResultado();


  /**
   * <p>
   * Getter method for the COM property "SFReproceso"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String sfReproceso();


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String autorizarRespuestaObs();


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(36)
  boolean cmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(37)
  boolean sfCmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbte_nro);


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(38)
  java.lang.String sfCmpConsultarCAE();


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String sfCmpConsultarVencimiento();


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String xmlResponse();


  /**
   * <p>
   * Getter method for the COM property "Proxy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String proxy();


  /**
   * <p>
   * Setter method for the COM property "Proxy"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(43)
  void proxy(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyUserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String proxyUserName();


  /**
   * <p>
   * Setter method for the COM property "ProxyUserName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(45)
  void proxyUserName(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String proxyPassword();


  /**
   * <p>
   * Setter method for the COM property "ProxyPassword"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(47)
  void proxyPassword(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(48)
  boolean proxyEnabled();


  /**
   * <p>
   * Setter method for the COM property "ProxyEnabled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(49)
  void proxyEnabled(
    boolean value);


  /**
   * @param zonas Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(50)
  boolean paramGetZonas(
    Holder<java.lang.String> zonas);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory double parameter.
   * @param cuit Mandatory double parameter.
   * @param fecha_cbte Mandatory java.lang.String parameter.
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(51)
  void agregaCompAsoc(
    int tipo_cbte,
    int punto_vta,
    double cbte_nro,
    double cuit,
    java.lang.String fecha_cbte);


  // Properties:
}
