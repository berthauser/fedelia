package feafip  ;

import com4j.*;

@IID("{30EBD9FB-D607-484D-A5E8-8AD7522DA407}")
public interface IRechazarFECredRequestTy extends Com4jObject {
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
   * @param codMotivo Mandatory int parameter.
   * @param descMotivo Mandatory java.lang.String parameter.
   * @param justificacion Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  void arrayMotivosRechazo(
    int codMotivo,
    java.lang.String descMotivo,
    java.lang.String justificacion);


  // Properties:
}
