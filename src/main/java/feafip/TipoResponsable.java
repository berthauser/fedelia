package feafip  ;

import com4j.*;

/**
 */
public enum TipoResponsable implements ComEnum {
  /**
   * <p>
   * The value of this constant is 1
   * </p>
   */
  trInscripto(1),
  /**
   * <p>
   * The value of this constant is 2
   * </p>
   */
  trNoInscripto(2),
  /**
   * <p>
   * The value of this constant is 3
   * </p>
   */
  trNoResponsable(3),
  /**
   * <p>
   * The value of this constant is 4
   * </p>
   */
  trExento(4),
  /**
   * <p>
   * The value of this constant is 5
   * </p>
   */
  trConsumidorFinal(5),
  /**
   * <p>
   * The value of this constant is 6
   * </p>
   */
  trMonotributo(6),
  /**
   * <p>
   * The value of this constant is 7
   * </p>
   */
  trNoCategorizado(7),
  /**
   * <p>
   * The value of this constant is 8
   * </p>
   */
  trProveedorExterior(8),
  /**
   * <p>
   * The value of this constant is 9
   * </p>
   */
  trClienteExterior(9),
  /**
   * <p>
   * The value of this constant is 10
   * </p>
   */
  trIVALiberado(10),
  /**
   * <p>
   * The value of this constant is 11
   * </p>
   */
  trInscriptoAgentePerc(11),
  /**
   * <p>
   * The value of this constant is 12
   * </p>
   */
  trPequenioEventual(12),
  /**
   * <p>
   * The value of this constant is 13
   * </p>
   */
  trMonotribSocial(13),
  /**
   * <p>
   * The value of this constant is 14
   * </p>
   */
  trPequenioContribSocial(14),
  ;

  private final int value;
  TipoResponsable(int value) { this.value=value; }
  public int comEnumValue() { return value; }
}
