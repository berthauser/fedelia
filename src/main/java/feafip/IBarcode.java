package feafip  ;

import com4j.*;

/**
 * Dispatch interface for Barcode Object
 */
@IID("{01F6CFB9-A47D-401E-8A89-1C3962BB9364}")
public interface IBarcode extends Com4jObject {
  // Methods:
  /**
   * @param cuit Mandatory double parameter.
   * @param tipoCbte Mandatory int parameter.
   * @param ptoVta Mandatory int parameter.
   * @param cae Mandatory java.lang.String parameter.
   * @param vto Mandatory java.lang.String parameter.
   * @param archivoDestino Mandatory java.lang.String parameter.
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  void generarCodigo(
    double cuit,
    int tipoCbte,
    int ptoVta,
    java.lang.String cae,
    java.lang.String vto,
    java.lang.String archivoDestino);


  /**
   * <p>
   * Getter method for the COM property "Modulo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int modulo();


  /**
   * <p>
   * Setter method for the COM property "Modulo"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(9)
  void modulo(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Proporcion"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(10)
  double proporcion();


  /**
   * <p>
   * Setter method for the COM property "Proporcion"
   * </p>
   * @param value Mandatory double parameter.
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(11)
  void proporcion(
    double value);


  /**
   * <p>
   * Getter method for the COM property "Altura"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  int altura();


  /**
   * <p>
   * Setter method for the COM property "Altura"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(13)
  void altura(
    int value);


  /**
   * <p>
   * Getter method for the COM property "MostrarTexto"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(14)
  boolean mostrarTexto();


  /**
   * <p>
   * Setter method for the COM property "MostrarTexto"
   * </p>
   * @param value Mandatory boolean parameter.
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(15)
  void mostrarTexto(
    boolean value);


  /**
   * <p>
   * Getter method for the COM property "TamanioFuente"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(16)
  int tamanioFuente();


  /**
   * <p>
   * Setter method for the COM property "TamanioFuente"
   * </p>
   * @param value Mandatory int parameter.
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(17)
  void tamanioFuente(
    int value);


  /**
   * <p>
   * Getter method for the COM property "Texto"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String texto();


  /**
   * @param texto Mandatory java.lang.String parameter.
   * @param archivoDestino Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(19)
  boolean interleave25(
    java.lang.String texto,
    java.lang.String archivoDestino);


  // Properties:
}
