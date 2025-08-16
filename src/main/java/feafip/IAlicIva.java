package feafip  ;

import com4j.*;

@IID("{ADE1B3EE-2618-461B-B8D3-F048B400330A}")
public interface IAlicIva extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int id();


  /**
   * <p>
   * Getter method for the COM property "BaseImp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  double baseImp();


  /**
   * <p>
   * Getter method for the COM property "Importe"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  double importe();


  // Properties:
}
