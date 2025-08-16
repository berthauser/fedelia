package feafip  ;

import com4j.*;

@IID("{924DCE98-B918-42E4-A00A-76FD1D8D483A}")
public interface IwsPadronARBA extends Com4jObject {
  // Methods:
  /**
   * @param fechaDesde Mandatory java.lang.String parameter.
   * @param fechaHasta Mandatory java.lang.String parameter.
   * @param cuit Mandatory double parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean consultaAlicuota(
    java.lang.String fechaDesde,
    java.lang.String fechaHasta,
    double cuit);


  /**
   * <p>
   * Getter method for the COM property "User"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String user();


  /**
   * <p>
   * Setter method for the COM property "User"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  void user(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "Password"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String password();


  /**
   * <p>
   * Setter method for the COM property "Password"
   * </p>
   * @param value Mandatory java.lang.String parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  void password(
    java.lang.String value);


  /**
   * <p>
   * Getter method for the COM property "ConsultaAlicuotaRespuesta"
   * </p>
   * @return  Returns a value of type feafip.IConsultaAlicuotaRespuesta
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  feafip.IConsultaAlicuotaRespuesta consultaAlicuotaRespuesta();


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "ModoProduccion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  boolean modoProduccion();


  /**
   * <p>
   * Setter method for the COM property "ModoProduccion"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(16)
  void modoProduccion(
    boolean value);


  // Properties:
}
