package feafip  ;

import com4j.*;

@IID("{C9194512-99E1-4404-85AB-6218E498CEED}")
public interface IIdCtaCteTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "codCtaCte"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  double codCtaCte();


  /**
   * <p>
   * Setter method for the COM property "codCtaCte"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void codCtaCte(
    double value);


  /**
   * <p>
   * Getter method for the COM property "idFactura"
   * </p>
   * @return  Returns a value of type feafip.IIdComprobanteTy
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  feafip.IIdComprobanteTy idFactura();


  /**
   * <p>
   * Setter method for the COM property "idFactura"
   * </p>
   * @param value Mandatory feafip.IIdComprobanteTy parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void idFactura(
    feafip.IIdComprobanteTy value);


  // Properties:
}
