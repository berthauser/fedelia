package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsfexv1 Object
 */
@IID("{10891378-BAE5-4F40-AF39-70C54F4E8175}")
public interface Iwsfexv1 extends Com4jObject {
  // Methods:
  /**
   * @param id Mandatory double parameter.
   * @param fecha_cbte Mandatory java.lang.String parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory double parameter.
   * @param tipo_expo Mandatory int parameter.
   * @param permiso_existente Mandatory java.lang.String parameter.
   * @param dst_cmp Mandatory int parameter.
   * @param cliente Mandatory java.lang.String parameter.
   * @param cuit_pais_cliente Mandatory double parameter.
   * @param domicilio_cliente Mandatory java.lang.String parameter.
   * @param id_impositivo Mandatory java.lang.String parameter.
   * @param moneda_Id Mandatory java.lang.String parameter.
   * @param moneda_ctz Mandatory double parameter.
   * @param obs_comerciales Mandatory java.lang.String parameter.
   * @param imp_total Mandatory double parameter.
   * @param obs Mandatory java.lang.String parameter.
   * @param forma_pago Mandatory java.lang.String parameter.
   * @param incoterms Mandatory java.lang.String parameter.
   * @param incoterms_ds Mandatory java.lang.String parameter.
   * @param idioma_cbte Mandatory int parameter.
   * @param fecha_pago Mandatory java.lang.String parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(7)
  void agregaFactura(
    double id,
    java.lang.String fecha_cbte,
    int tipo_cbte,
    int punto_vta,
    double cbte_nro,
    int tipo_expo,
    java.lang.String permiso_existente,
    int dst_cmp,
    java.lang.String cliente,
    double cuit_pais_cliente,
    java.lang.String domicilio_cliente,
    java.lang.String id_impositivo,
    java.lang.String moneda_Id,
    double moneda_ctz,
    java.lang.String obs_comerciales,
    double imp_total,
    java.lang.String obs,
    java.lang.String forma_pago,
    java.lang.String incoterms,
    java.lang.String incoterms_ds,
    int idioma_cbte,
    java.lang.String fecha_pago);


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @param url Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(102) //= 0x66. The runtime will prefer the VTID if present
  @VTID(8)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada,
    java.lang.String url);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(9)
  boolean autorizar();


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(10)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(13)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(14)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(15)
  void cuit(
    double value);


  /**
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param fch_venc_Cae Mandatory Holder<java.lang.String> parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @param reproceso Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(16)
  boolean autorizarRespuesta(
    Holder<java.lang.String> cae,
    Holder<java.lang.String> fch_venc_Cae,
    Holder<java.lang.String> resultado,
    Holder<java.lang.String> reproceso);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @param cbte_nro Mandatory Holder<Double> parameter.
   * @param cbte_fecha Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(111) //= 0x6f. The runtime will prefer the VTID if present
  @VTID(17)
  boolean recuperaLastCMP(
    int ptoVta,
    int tipoComp,
    Holder<Double> cbte_nro,
    Holder<java.lang.String> cbte_fecha);


  /**
   * @param id_permiso Mandatory java.lang.String parameter.
   * @param dst_merc Mandatory int parameter.
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(18)
  void agregaPermiso(
    java.lang.String id_permiso,
    int dst_merc);


  /**
   * @param cbte_tipo Mandatory int parameter.
   * @param cbte_punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory double parameter.
   * @param cbte_cuit Mandatory double parameter.
   */

  @DISPID(113) //= 0x71. The runtime will prefer the VTID if present
  @VTID(19)
  void agregaCompAsoc(
    int cbte_tipo,
    int cbte_punto_vta,
    double cbte_nro,
    double cbte_cuit);


  /**
   * @param pro_codigo Mandatory java.lang.String parameter.
   * @param pro_ds Mandatory java.lang.String parameter.
   * @param pro_qty Mandatory double parameter.
   * @param pro_umed Mandatory int parameter.
   * @param pro_precio_uni Mandatory double parameter.
   * @param pro_total_item Mandatory double parameter.
   * @param pro_bonificacion Mandatory double parameter.
   */

  @DISPID(114) //= 0x72. The runtime will prefer the VTID if present
  @VTID(20)
  void agregaItem(
    java.lang.String pro_codigo,
    java.lang.String pro_ds,
    double pro_qty,
    int pro_umed,
    double pro_precio_uni,
    double pro_total_item,
    double pro_bonificacion);


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String token();


  /**
   * <p>
   * Setter method for the COM property "Token"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(22)
  void token(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String sign();


  /**
   * <p>
   * Setter method for the COM property "Sign"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(24)
  void sign(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String xmlResponse();


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(27)
  boolean sfRecuperaLastCMP(
    int ptoVta,
    int tipoComp);


  /**
   * <p>
   * Getter method for the COM property "SFLastCMP"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(28)
  double sfLastCMP();


  /**
   * <p>
   * Getter method for the COM property "SFCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String sfcae();


  /**
   * <p>
   * Getter method for the COM property "SFVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String sfVencimiento();


  /**
   * <p>
   * Getter method for the COM property "SFResultado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String sfResultado();


  /**
   * <p>
   * Getter method for the COM property "SFReproceso"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String sfReproceso();


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(33)
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

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String sfCmpConsultarCAE();


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String sfCmpConsultarVencimiento();


  /**
   * @param resultado Mandatory Holder<Double> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(115) //= 0x73. The runtime will prefer the VTID if present
  @VTID(36)
  boolean ultimoIdTrans(
    Holder<Double> resultado);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String autorizarRespuestaObs();


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(38)
  boolean cmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(39)
  boolean sfUltimoIdTrans();


  /**
   * <p>
   * Getter method for the COM property "SFLastId"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(40)
  double sfLastId();


  /**
   * @param monId Mandatory java.lang.String parameter.
   * @param monCtz Mandatory Holder<Double> parameter.
   * @param monFecha Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(41)
  boolean paramGetCotizacion(
    java.lang.String monId,
    Holder<Double> monCtz,
    Holder<java.lang.String> monFecha);


  /**
   * <p>
   * Getter method for the COM property "Proxy"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String proxy();


  /**
   * <p>
   * Setter method for the COM property "Proxy"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(43)
  void proxy(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyUserName"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(44)
  java.lang.String proxyUserName();


  /**
   * <p>
   * Setter method for the COM property "ProxyUserName"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(45)
  void proxyUserName(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyPassword"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String proxyPassword();


  /**
   * <p>
   * Setter method for the COM property "ProxyPassword"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(47)
  void proxyPassword(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ProxyEnabled"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(48)
  boolean proxyEnabled();


  /**
   * <p>
   * Setter method for the COM property "ProxyEnabled"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(49)
  void proxyEnabled(
    boolean value);


  /**
   * @param licencia Mandatory java.lang.String parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(50)
  void cargarLicencia(
    java.lang.String licencia);


  // Properties:
}
