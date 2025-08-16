package feafip  ;

import com4j.*;

@IID("{F0324362-5DE0-4A53-B253-D18C37D5FD5C}")
public interface IAceptarFECredRequestTy extends Com4jObject {
  // Methods:
  /**
   * @param codCtaCte Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void idCtaCte(
    double codCtaCte);


  /**
   * @param cuitEmisor Mandatory double parameter.
   * @param codTipoCmp Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param nroCmp Mandatory double parameter.
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(8)
  void idFactura(
    double cuitEmisor,
    int codTipoCmp,
    int ptoVta,
    double nroCmp);


  /**
   * @param acepta Mandatory boolean parameter.
   * @param cuitEmisor Mandatory double parameter.
   * @param codTipoCmp Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param nroCmp Mandatory double parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  void arrayConfirmarNotasDC(
    boolean acepta,
    double cuitEmisor,
    int codTipoCmp,
    int ptoVta,
    double nroCmp);


  /**
   * @param codigo Mandatory int parameter.
   * @param descripcion Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  void arrayFormasCancelacion(
    int codigo,
    java.lang.String descripcion);


  /**
   * @param codTipo Mandatory int parameter.
   * @param importe Mandatory double parameter.
   * @param porcentaje Mandatory double parameter.
   * @param descMotivo Mandatory java.lang.String parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(11)
  void arrayRetenciones(
    int codTipo,
    double importe,
    double porcentaje,
    java.lang.String descMotivo);


  /**
   * @param codigo Mandatory int parameter.
   * @param importe Mandatory double parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(12)
  void arrayAjustesOperacion(
    int codigo,
    double importe);


  /**
   * <p>
   * Getter method for the COM property "tipoCancelacion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String tipoCancelacion();


  /**
   * <p>
   * Setter method for the COM property "tipoCancelacion"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  void tipoCancelacion(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "importeCancelado"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  double importeCancelado();


  /**
   * <p>
   * Setter method for the COM property "importeCancelado"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void importeCancelado(
    double value);


  /**
   * <p>
   * Getter method for the COM property "importeTotalRetPesos"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double importeTotalRetPesos();


  /**
   * <p>
   * Setter method for the COM property "importeTotalRetPesos"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(18)
  void importeTotalRetPesos(
    double value);


  /**
   * <p>
   * Getter method for the COM property "importeEmbargoPesos"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(19)
  double importeEmbargoPesos();


  /**
   * <p>
   * Setter method for the COM property "importeEmbargoPesos"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(20)
  void importeEmbargoPesos(
    double value);


  /**
   * <p>
   * Getter method for the COM property "saldoAceptado"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(21)
  double saldoAceptado();


  /**
   * <p>
   * Setter method for the COM property "saldoAceptado"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(22)
  void saldoAceptado(
    double value);


  /**
   * <p>
   * Getter method for the COM property "codMoneda"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String codMoneda();


  /**
   * <p>
   * Setter method for the COM property "codMoneda"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(24)
  void codMoneda(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "cotizacionMonedaUlt"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(25)
  double cotizacionMonedaUlt();


  /**
   * <p>
   * Setter method for the COM property "cotizacionMonedaUlt"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(26)
  void cotizacionMonedaUlt(
    double value);


  // Properties:
}
