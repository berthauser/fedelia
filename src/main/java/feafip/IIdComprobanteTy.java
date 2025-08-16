package feafip  ;

import com4j.*;

@IID("{3ABD3582-6764-4A05-BFDE-CFED3D4A1143}")
public interface IIdComprobanteTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "CuitEmisor"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  double cuitEmisor();


  /**
   * <p>
   * Setter method for the COM property "CuitEmisor"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(8)
  void cuitEmisor(
    double value);


  /**
   * <p>
   * Getter method for the COM property "codTipoCmp"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  int codTipoCmp();


  /**
   * <p>
   * Setter method for the COM property "codTipoCmp"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(10)
  void codTipoCmp(
    int value);


  /**
   * <p>
   * Getter method for the COM property "PtoVta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  int ptoVta();


  /**
   * <p>
   * Setter method for the COM property "PtoVta"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(12)
  void ptoVta(
    int value);


  /**
   * <p>
   * Getter method for the COM property "nroCmp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  double nroCmp();


  /**
   * <p>
   * Setter method for the COM property "nroCmp"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(14)
  void nroCmp(
    double value);


  // Properties:
}
