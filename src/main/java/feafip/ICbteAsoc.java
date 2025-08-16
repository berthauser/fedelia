package feafip  ;

import com4j.*;

@IID("{43E44C59-376E-4A27-93D2-ADC712D2BA2E}")
public interface ICbteAsoc extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Tipo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int tipo();


  /**
   * <p>
   * Getter method for the COM property "PtoVta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int ptoVta();


  /**
   * <p>
   * Getter method for the COM property "Nro"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  double nro();


  // Properties:
}
