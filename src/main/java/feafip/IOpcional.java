package feafip  ;

import com4j.*;

@IID("{7689C644-3F89-44FE-97CF-EAF233A262C8}")
public interface IOpcional extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Id"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String id();


  /**
   * <p>
   * Getter method for the COM property "Valor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String valor();


  // Properties:
}
