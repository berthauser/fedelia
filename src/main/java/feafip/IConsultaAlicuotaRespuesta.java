package feafip  ;

import com4j.*;

@IID("{2589E4FF-0788-4FEF-9565-0F05095F1356}")
public interface IConsultaAlicuotaRespuesta extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "AlicuotaPercepcion"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  double alicuotaPercepcion();


  /**
   * <p>
   * Getter method for the COM property "AlicuotaRetencion"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  double alicuotaRetencion();


  /**
   * <p>
   * Getter method for the COM property "GrupoPercepcion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int grupoPercepcion();


  /**
   * <p>
   * Getter method for the COM property "GrupoRetencion"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int grupoRetencion();


  // Properties:
}
