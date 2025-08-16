package feafip  ;

import com4j.*;

@IID("{24CDB620-0B79-4E7D-943A-3F55F1E26C95}")
public interface IConsultarMontoObligadoRecepcionReturnTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "obligado"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean obligado();


  /**
   * <p>
   * Getter method for the COM property "montoDesde"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  double montoDesde();


  // Properties:
}
