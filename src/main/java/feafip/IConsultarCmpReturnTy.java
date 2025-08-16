package feafip  ;

import com4j.*;

@IID("{BB315EBC-4D6F-4542-BC1D-B4878E91A9EF}")
public interface IConsultarCmpReturnTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "arrayComprobantes"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.IComprobanteTy
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  feafip.IComprobanteTy arrayComprobantes(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "arrayComprobantesCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int arrayComprobantesCount();


  // Properties:
}
