package feafip  ;

import com4j.*;

@IID("{161A74B4-F8B8-408F-934B-2D2D32E492E2}")
public interface Iwsct extends Com4jObject {
  // Methods:
  /**
   * @param codigoTipoComprobante Mandatory int parameter.
   * @param numeroPuntoVenta Mandatory int parameter.
   * @param numeroComprobante Mandatory double parameter.
   * @param fechaEmision Mandatory java.lang.String parameter.
   * @param codigoTipoAutorizacion Mandatory java.lang.String parameter.
   * @param codigoAutorizacion Mandatory double parameter.
   * @param fechaVencimiento Mandatory java.lang.String parameter.
   * @param codigoTipoDocumento Mandatory int parameter.
   * @param numeroDocumento Mandatory java.lang.String parameter.
   * @param idImpositivo Mandatory java.lang.String parameter.
   * @param codigoPais Mandatory int parameter.
   * @param domicilioReceptor Mandatory java.lang.String parameter.
   * @param codigoRelacionEmisorReceptor Mandatory int parameter.
   * @param importeGravado Mandatory double parameter.
   * @param importeNoGravado Mandatory double parameter.
   * @param importeExento Mandatory double parameter.
   * @param importeOtrosTributos Mandatory double parameter.
   * @param importeReintegro Mandatory double parameter.
   * @param importeTotal Mandatory double parameter.
   * @param codigoMoneda Mandatory java.lang.String parameter.
   * @param cotizacionMoneda Mandatory double parameter.
   * @param observaciones Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void agregaFactura(
    int codigoTipoComprobante,
    int numeroPuntoVenta,
    double numeroComprobante,
    java.lang.String fechaEmision,
    java.lang.String codigoTipoAutorizacion,
    double codigoAutorizacion,
    java.lang.String fechaVencimiento,
    int codigoTipoDocumento,
    java.lang.String numeroDocumento,
    java.lang.String idImpositivo,
    int codigoPais,
    java.lang.String domicilioReceptor,
    int codigoRelacionEmisorReceptor,
    double importeGravado,
    double importeNoGravado,
    double importeExento,
    double importeOtrosTributos,
    double importeReintegro,
    double importeTotal,
    java.lang.String codigoMoneda,
    double cotizacionMoneda,
    java.lang.String observaciones);


  /**
   * @param tipo Mandatory int parameter.
   * @param codigoTurismo Mandatory int parameter.
   * @param codigo Mandatory java.lang.String parameter.
   * @param descripcion Mandatory java.lang.String parameter.
   * @param codigoAlicuotaIVA Mandatory int parameter.
   * @param importeIVA Mandatory double parameter.
   * @param importeItem Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void agregaItem(
    int tipo,
    int codigoTurismo,
    java.lang.String codigo,
    java.lang.String descripcion,
    int codigoAlicuotaIVA,
    double importeIVA,
    double importeItem);


  /**
   * @param codigoTipoComprobante Mandatory int parameter.
   * @param numeroPuntoVenta Mandatory int parameter.
   * @param numeroComprobante Mandatory double parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void agregaComprobanteAsociado(
    int codigoTipoComprobante,
    int numeroPuntoVenta,
    double numeroComprobante);


  /**
   * @param codigo Mandatory int parameter.
   * @param descripcion Mandatory java.lang.String parameter.
   * @param baseImponible Mandatory double parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  void agregaTributo(
    int codigo,
    java.lang.String descripcion,
    double baseImponible,
    double importe);


  /**
   * @param codigo Mandatory int parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  void agregaIVA(
    int codigo,
    double importe);


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
  @VTID(12)
  void agregaDatoAdicional(
    int t,
    java.lang.String c1,
    java.lang.String c2,
    java.lang.String c3,
    java.lang.String c4,
    java.lang.String c5,
    java.lang.String c6);


  /**
   * @param codigo Mandatory int parameter.
   * @param tipoTarjeta Mandatory int parameter.
   * @param numeroTarjeta Mandatory double parameter.
   * @param swiftCode Mandatory java.lang.String parameter.
   * @param tipoCuenta Mandatory int parameter.
   * @param numeroCuenta Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  void agregaFormaDePago(
    int codigo,
    int tipoTarjeta,
    double numeroTarjeta,
    java.lang.String swiftCode,
    int tipoCuenta,
    double numeroCuenta);


  /**
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  void reset();


  /**
   * @return  Returns a value of type boolean
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  boolean autorizar();


  /**
   * @param certificado Mandatory java.lang.String parameter.
   * @param clavePrivada Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  boolean login(
    java.lang.String certificado,
    java.lang.String clavePrivada);


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  double cuit();


  /**
   * <p>
   * Setter method for the COM property "CUIT"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(20)
  void cuit(
    double value);


  /**
   * <p>
   * Getter method for the COM property "Depurar"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(21)
  boolean depurar();


  /**
   * <p>
   * Setter method for the COM property "Depurar"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(22)
  void depurar(
    boolean value);


  /**
   * @param codigoTipoComprobante Mandatory int parameter.
   * @param numeroPuntoVenta Mandatory int parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(23)
  boolean consultarUltimoComprobante(
    int codigoTipoComprobante,
    int numeroPuntoVenta);


  /**
   * <p>
   * Getter method for the COM property "ConsultarUltimoComprobanteNumero"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(24)
  int consultarUltimoComprobanteNumero();


  /**
   * <p>
   * Getter method for the COM property "ConsultarUltimoComprobanteFecha"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(25)
  java.lang.String consultarUltimoComprobanteFecha();


  /**
   * @param nombreArchivo Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(26)
  boolean descargarCodigos(
    java.lang.String nombreArchivo);


  /**
   * <p>
   * Getter method for the COM property "AutorizarCAE"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(27)
  double autorizarCAE();


  /**
   * <p>
   * Getter method for the COM property "AutorizarVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String autorizarVencimiento();


  /**
   * <p>
   * Getter method for the COM property "AutorizarObservaciones"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String autorizarObservaciones();


  /**
   * <p>
   * Getter method for the COM property "ModoProduccion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(30)
  boolean modoProduccion();


  /**
   * <p>
   * Setter method for the COM property "ModoProduccion"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(31)
  void modoProduccion(
    boolean value);


  // Properties:
}
