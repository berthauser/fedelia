package feafip  ;

import com4j.*;

@IID("{3417F5A9-B0F6-4CF9-B30B-055E17860895}")
public interface IObs extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Code"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int code();


  /**
   * <p>
   * Getter method for the COM property "Msg"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String msg();


  // Properties:
}
