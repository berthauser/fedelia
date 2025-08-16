package feafip  ;

import com4j.*;

/**
 */
public enum TipoComprobante implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  tcFacturaA(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  tcNotaDebitoA(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  tcNotaCreditoA(3),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  tcFacturaB(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  tcNotaDebitoB(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  tcNotaCreditoB(8),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  tcFacturaC(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  tcNotaDebitoC(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  tcNotaCreditoC(13),
  ;

  private final int value;
  TipoComprobante(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
