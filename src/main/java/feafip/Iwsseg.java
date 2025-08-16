package feafip  ;

import com4j.*;

/**
 * Dispatch interface for wsseg Object
 */
@IID("{B1E85685-67E8-4B99-B8B6-85A6138E4DD0}")
public interface Iwsseg extends Com4jObject {
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
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "URL"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String url();


  /**
   * <p>
   * Setter method for the COM property "URL"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  void url(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "XMLRequest"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String xmlRequest();


  /**
   * <p>
   * Getter method for the COM property "XMLResponse"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String xmlResponse();


  /**
   * @param id Mandatory int parameter.
   * @param tipo_doc Mandatory int parameter.
   * @param nro_doc Mandatory double parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory int parameter.
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
   * @param imp_otrib_prov Mandatory double parameter.
   * @param fecha_cbte Mandatory java.lang.String parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(16)
  void agregaFactura(
    int id,
    int tipo_doc,
    double nro_doc,
    int tipo_cbte,
    int punto_vta,
    int cbte_nro,
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
    double imp_otrib_prov,
    java.lang.String fecha_cbte);


  /**
   * @param poliza Mandatory java.lang.String parameter.
   * @param endoso Mandatory java.lang.String parameter.
   * @param ds Mandatory java.lang.String parameter.
   * @param qty Mandatory double parameter.
   * @param precio_uni Mandatory double parameter.
   * @param imp_bonif Mandatory double parameter.
   * @param imp_total Mandatory double parameter.
   * @param imp_valor_aseg Mandatory double parameter.
   * @param imp_moneda_vaseg Mandatory java.lang.String parameter.
   * @param iva_id Mandatory int parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(17)
  void agregaItem(
    java.lang.String poliza,
    java.lang.String endoso,
    java.lang.String ds,
    double qty,
    double precio_uni,
    double imp_bonif,
    double imp_total,
    double imp_valor_aseg,
    java.lang.String imp_moneda_vaseg,
    int iva_id);


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(18)
  boolean autorizar();


  /**
   * <p>
   * Getter method for the COM property "RespuestaAutorizarCAE"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String respuestaAutorizarCAE();


  /**
   * <p>
   * Getter method for the COM property "RespuestaAutorizarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String respuestaAutorizarVencimiento();


  /**
   * <p>
   * Getter method for the COM property "RespuestaAutorizarResultado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String respuestaAutorizarResultado();


  /**
   * <p>
   * Getter method for the COM property "RespuestaAutorizarReproceso"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String respuestaAutorizarReproceso();


  /**
   * @param pto_venta Mandatory int parameter.
   * @param tipo_cbte Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(23)
  boolean getLast_CMP(
    int pto_venta,
    int tipo_cbte);


  /**
   * <p>
   * Getter method for the COM property "RespuestaGetLast_CMPNro"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(24)
  int respuestaGetLast_CMPNro();


  /**
   * <p>
   * Getter method for the COM property "RespuestaGetLast_CMPFecha"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String respuestaGetLast_CMPFecha();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(26)
  boolean getLast_ID();


  /**
   * <p>
   * Getter method for the COM property "RespuestaGetLast_IDId"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(27)
  int respuestaGetLast_IDId();


  /**
   * @param tipo_cbte Mandatory int parameter.
   * @param punto_vta Mandatory int parameter.
   * @param cbte_nro Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(28)
  boolean getCMP(
    int tipo_cbte,
    int punto_vta,
    int cbte_nro);


  /**
   * <p>
   * Getter method for the COM property "RespuestaAutorizarObs"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String respuestaAutorizarObs();


  /**
   * @param requestFilename Mandatory java.lang.String parameter.
   * @param responseFilename Mandatory java.lang.String parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(30)
  void logTransaction(
    java.lang.String requestFilename,
    java.lang.String responseFilename);


  // Properties:
}
