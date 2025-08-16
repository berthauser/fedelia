package feafip  ;

import com4j.*;

@IID("{9E84530B-FB93-4225-BB57-8BA22738ED6A}")
public interface IConsultarCtasCtesReturnTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "arrayInfosCtaCte"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.IInfoCtaCteTy
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  feafip.IInfoCtaCteTy arrayInfosCtaCte(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "arrayInfosCtaCteCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int arrayInfosCtaCteCount();


  // Properties:
}
