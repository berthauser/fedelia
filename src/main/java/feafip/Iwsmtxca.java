package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsmtxca Object
 */
@IID("{C297BD2B-A528-446B-BF55-FAF195383E0E}")
public interface Iwsmtxca extends Com4jObject {
  // Methods:
  /**
   * @param codigoTipoComprobante Mandatory int parameter.
   * @param numeroPuntoVenta Mandatory int parameter.
   * @param numeroComprobante Mandatory double parameter.
   * @param fechaEmision Mandatory java.lang.String parameter.
   * @param codigoTipoDocumento Mandatory int parameter.
   * @param numeroDocumento Mandatory double parameter.
   * @param importeGravado Mandatory double parameter.
   * @param importeNoGravado Mandatory double parameter.
   * @param importeExento Mandatory double parameter.
   * @param importeSubtotal Mandatory double parameter.
   * @param importeOtrosTributos Mandatory double parameter.
   * @param importeTotal Mandatory double parameter.
   * @param codigoMoneda Mandatory java.lang.String parameter.
   * @param cotizacionMoneda Mandatory double parameter.
   * @param observaciones Mandatory java.lang.String parameter.
   * @param codigoConcepto Mandatory int parameter.
   * @param fechaServicioDesde Mandatory java.lang.String parameter.
   * @param fechaServicioHasta Mandatory java.lang.String parameter.
   * @param fechaVencimientoPago Mandatory java.lang.String parameter.
   */

  @DISPID(101) //= 0x65. The runtime will prefer the VTID if present
  @VTID(7)
  void agregaFactura(
    int codigoTipoComprobante,
    int numeroPuntoVenta,
    double numeroComprobante,
    java.lang.String fechaEmision,
    int codigoTipoDocumento,
    double numeroDocumento,
    double importeGravado,
    double importeNoGravado,
    double importeExento,
    double importeSubtotal,
    double importeOtrosTributos,
    double importeTotal,
    java.lang.String codigoMoneda,
    double cotizacionMoneda,
    java.lang.String observaciones,
    int codigoConcepto,
    java.lang.String fechaServicioDesde,
    java.lang.String fechaServicioHasta,
    java.lang.String fechaVencimientoPago);


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
   * @param id Mandatory int parameter.
   * @param desc Mandatory java.lang.String parameter.
   * @param baseImp Mandatory double parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(9)
  void agregaTributo(
    int id,
    java.lang.String desc,
    double baseImp,
    double importe);


  /**
   * @param codigo Mandatory int parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(10)
  void agregaIVA(
    int codigo,
    double importe);


  /**
   * @param tipo Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param nro Mandatory double parameter.
   * @param cuit Mandatory double parameter.
   * @param fechaEmision Mandatory java.lang.String parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(11)
  void agregaCompAsoc(
    int tipo,
    int ptoVta,
    double nro,
    double cuit,
    java.lang.String fechaEmision);


  /**
   * @param unidadesMtx Mandatory int parameter.
   * @param codigoMtx Mandatory java.lang.String parameter.
   * @param codigo Mandatory java.lang.String parameter.
   * @param descripcion Mandatory java.lang.String parameter.
   * @param cantidad Mandatory double parameter.
   * @param codigoUnidadMedida Mandatory int parameter.
   * @param precioUnitario Mandatory double parameter.
   * @param importeBonificacion Mandatory double parameter.
   * @param codigoCondicionIVA Mandatory int parameter.
   * @param importeIVA Mandatory double parameter.
   * @param importeItem Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(12)
  void agregaItem(
    int unidadesMtx,
    java.lang.String codigoMtx,
    java.lang.String codigo,
    java.lang.String descripcion,
    double cantidad,
    int codigoUnidadMedida,
    double precioUnitario,
    double importeBonificacion,
    int codigoCondicionIVA,
    double importeIVA,
    double importeItem);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(103) //= 0x67. The runtime will prefer the VTID if present
  @VTID(13)
  boolean autorizar();


  /**
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @param resultado Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(110) //= 0x6e. The runtime will prefer the VTID if present
  @VTID(14)
  boolean autorizarRespuesta(
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento,
    Holder<java.lang.String> resultado);


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(104) //= 0x68. The runtime will prefer the VTID if present
  @VTID(15)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(105) //= 0x69. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(107) //= 0x6b. The runtime will prefer the VTID if present
  @VTID(18)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(19)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(108) //= 0x6c. The runtime will prefer the VTID if present
  @VTID(20)
  void cuit(
    double value);


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @param cmp Mandatory Holder<Double> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(112) //= 0x70. The runtime will prefer the VTID if present
  @VTID(21)
  boolean recuperaLastCMP(
    int ptoVta,
    int tipoComp,
    Holder<Double> cmp);


  /**
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String autorizarRespuestaObs();


  /**
   * <p>
   * Getter method for the COM property "Token"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String token();


  /**
   * <p>
   * Setter method for the COM property "Token"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(24)
  void token(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Sign"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String sign();


  /**
   * <p>
   * Setter method for the COM property "Sign"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(26)
  void sign(
    java.lang.String value);


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(27)
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

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String sfCmpConsultarCAE();


  /**
   * <p>
   * Getter method for the COM property "SFCmpConsultarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String sfCmpConsultarVencimiento();


  /**
   * @param ptoVta Mandatory int parameter.
   * @param tipoComp Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(30)
  boolean sfRecuperaLastCMP(
    int ptoVta,
    int tipoComp);


  /**
   * <p>
   * Getter method for the COM property "SFLastCMP"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(31)
  double sfLastCMP();


  /**
   * <p>
   * Getter method for the COM property "SFCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String sfcae();


  /**
   * <p>
   * Getter method for the COM property "SFVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String sfVencimiento();


  /**
   * <p>
   * Getter method for the COM property "SFResultado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String sfResultado();


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbt_nro Mandatory double parameter.
   * @param cae Mandatory Holder<java.lang.String> parameter.
   * @param vencimiento Mandatory Holder<java.lang.String> parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(35)
  boolean cmpConsultar(
    int tipo_cbte,
    int punto_vta,
    double cbt_nro,
    Holder<java.lang.String> cae,
    Holder<java.lang.String> vencimiento);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String xmlResponse();


  /**
   * <p>
   * Getter method for the COM property "Depurar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(38)
  boolean depurar();


  /**
   * <p>
   * Setter method for the COM property "Depurar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(39)
  void depurar(
    boolean value);


  /**
   * @param t Mandatory int parameter.
   * @param c1 Mandatory java.lang.String parameter.
   * @param c2 Mandatory java.lang.String parameter.
   * @param c3 Mandatory java.lang.String parameter.
   * @param c4 Mandatory java.lang.String parameter.
   * @param c5 Mandatory java.lang.String parameter.
   * @param c6 Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(40)
  void agregaDatoAdicional(
    int t,
    java.lang.String c1,
    java.lang.String c2,
    java.lang.String c3,
    java.lang.String c4,
    java.lang.String c5,
    java.lang.String c6);


  /**
   * @param fechaDesde Mandatory java.lang.String parameter.
   * @param fechaHasta Mandatory java.lang.String parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(41)
  void periodoCompAsoc(
    java.lang.String fechaDesde,
    java.lang.String fechaHasta);


  /**
   * @param codigoTipoDocumento Mandatory int parameter.
   * @param numeroDocumento Mandatory double parameter.
   * @param porcentaje Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(42)
  void agregaComprador(
    int codigoTipoDocumento,
    double numeroDocumento,
    double porcentaje);


  // Properties:
}
