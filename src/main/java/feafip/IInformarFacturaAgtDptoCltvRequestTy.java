package feafip  ;

import com4j.*;

@IID("{3DEF5AFE-1202-4B92-BEBB-4B006E29C02F}")
public interface IInformarFacturaAgtDptoCltvRequestTy extends Com4jObject {
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

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  void idFactura(
    double cuitEmisor,
    int codTipoCmp,
    int ptoVta,
    double nroCmp);


  /**
   * @param cuentaDepositante Mandatory int parameter.
   * @param subcuentaComitente Mandatory double parameter.
   * @param denominacion Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void ctaComitente(
    int cuentaDepositante,
    double subcuentaComitente,
    java.lang.String denominacion);


  // Properties:
}
