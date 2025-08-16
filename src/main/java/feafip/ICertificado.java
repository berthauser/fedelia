package feafip  ;

import com4j.*;

@IID("{CAD1F637-CD57-45DF-8A39-EB2227E34D93}")
public interface ICertificado extends Com4jObject {
  // Methods:
  /**
   * @param archivoCertificado Mandatory java.lang.String parameter.
   * @param archivoClavePrivada Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  boolean cargarInformacionCertificado(
    java.lang.String archivoCertificado,
    java.lang.String archivoClavePrivada);


  /**
   * @param o Mandatory java.lang.String parameter.
   * @param cn Mandatory java.lang.String parameter.
   * @param cuit Mandatory double parameter.
   * @param archivoSolicitud Mandatory java.lang.String parameter.
   * @param archivoClavePrivada Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(8)
  boolean generarNuevoCertificado(
    java.lang.String o,
    java.lang.String cn,
    double cuit,
    java.lang.String archivoSolicitud,
    java.lang.String archivoClavePrivada);


  /**
   * @param archivoSolicitud Mandatory java.lang.String parameter.
   * @return  Returns a value of type boolean
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(9)
  boolean renovarCertificado(
    java.lang.String archivoSolicitud);


  /**
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(10)
  void mostrarInformacionCertificado();


  /**
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(11)
  void mostrarGenerarCertificado();


  /**
   * <p>
   * Getter method for the COM property "ErrorCode"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(12)
  int errorCode();


  /**
   * <p>
   * Getter method for the COM property "ErrorDesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String errorDesc();


  /**
   * <p>
   * Getter method for the COM property "IC_Organizacion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String iC_Organizacion();


  /**
   * <p>
   * Getter method for the COM property "IC_NombreComun"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(15)
  java.lang.String iC_NombreComun();


  /**
   * <p>
   * Getter method for the COM property "IC_FechaVencimiento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String iC_FechaVencimiento();


  /**
   * <p>
   * Getter method for the COM property "IC_CUIT"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(17)
  double iC_CUIT();


  // Properties:
}
