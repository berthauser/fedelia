package feafip  ;

import com4j.*;

@IID("{EC378410-896F-4CF2-84A8-53E61AE3D6CF}")
public interface IDomicilio extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "direccion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String direccion();


  /**
   * <p>
   * Getter method for the COM property "localidad"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String localidad();


  /**
   * <p>
   * Getter method for the COM property "codPostal"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String codPostal();


  /**
   * <p>
   * Getter method for the COM property "idProvincia"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int idProvincia();


  /**
   * <p>
   * Getter method for the COM property "provincia"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String provincia();


  // Properties:
}
