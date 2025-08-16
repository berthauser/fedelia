package feafip  ;

import com4j.*;

@IID("{8C1BE2D0-B8B0-442E-A8D6-8BBBE941DB0C}")
public interface ITributo extends Com4jObject {
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
   * Getter method for the COM property "Desc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String desc();


  /**
   * <p>
   * Getter method for the COM property "BaseImp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  double baseImp();


  /**
   * <p>
   * Getter method for the COM property "Alic"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  double alic();


  /**
   * <p>
   * Getter method for the COM property "Importe"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  double importe();


  // Properties:
}
