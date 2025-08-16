package feafip  ;

import com4j.*;

@IID("{A70570EB-65D9-4117-A7AB-A57B902E3407}")
public interface IConsultarCtaCteReturnTy extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "codCtaCte"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int codCtaCte();


  /**
   * <p>
   * Getter method for the COM property "estadoCtaCte"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String estadoCtaCte();


  /**
   * <p>
   * Getter method for the COM property "factura"
   * </p>
   * @return  Returns a value of type feafip.IComprobanteTy
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  feafip.IComprobanteTy factura();


  /**
   * <p>
   * Getter method for the COM property "importeInicial"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  double importeInicial();


  /**
   * <p>
   * Getter method for the COM property "importeTotalNotasDC"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  double importeTotalNotasDC();


  /**
   * <p>
   * Getter method for the COM property "importeCancelado"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  double importeCancelado();


  /**
   * <p>
   * Getter method for the COM property "importeTotalRetPesos"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  double importeTotalRetPesos();


  /**
   * <p>
   * Getter method for the COM property "importeEmbargoPesos"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  double importeEmbargoPesos();


  /**
   * <p>
   * Getter method for the COM property "saldoAceptado"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  double saldoAceptado();


  /**
   * <p>
   * Getter method for the COM property "saldo"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  double saldo();


  /**
   * <p>
   * Getter method for the COM property "codMoneda"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String codMoneda();


  /**
   * <p>
   * Getter method for the COM property "cotizacionMonedaUlt"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  double cotizacionMonedaUlt();


  // Properties:
}
