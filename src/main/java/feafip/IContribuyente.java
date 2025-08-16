package feafip  ;

import com4j.*;

@IID("{19A25CC6-4F15-4C2E-AF88-7AD7901B23A9}")
public interface IContribuyente extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "idPersona"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  java.lang.String idPersona();


  /**
   * <p>
   * Getter method for the COM property "tipoPersona"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String tipoPersona();


  /**
   * <p>
   * Getter method for the COM property "tipoClave"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  java.lang.String tipoClave();


  /**
   * <p>
   * Getter method for the COM property "estadoClave"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  java.lang.String estadoClave();


  /**
   * <p>
   * Getter method for the COM property "nombre"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  java.lang.String nombre();


  /**
   * <p>
   * Getter method for the COM property "tipoDocumento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String tipoDocumento();


  /**
   * <p>
   * Getter method for the COM property "numeroDocumento"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String numeroDocumento();


  /**
   * <p>
   * Getter method for the COM property "domicilioFiscal"
   * </p>
   * @return  Returns a value of type feafip.IDomicilio
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  feafip.IDomicilio domicilioFiscal();


  /**
   * <p>
   * Getter method for the COM property "idDependencia"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  int idDependencia();


  /**
   * <p>
   * Getter method for the COM property "mesCierre"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  int mesCierre();


  /**
   * <p>
   * Getter method for the COM property "fechaInscripcion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fechaInscripcion();


  /**
   * <p>
   * Getter method for the COM property "idCatAutonomo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  int idCatAutonomo();


  /**
   * <p>
   * Getter method for the COM property "impuestosCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  int impuestosCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  int impuestos(
    int indice);


  /**
   * @return  Returns a value of type int
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  int categoriasMonotributoCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  int categoriasMonotributo(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "actividadesCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  int actividadesCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  int actividades(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "condicionIVA"
   * </p>
   * @return  Returns a value of type feafip.TipoResponsable
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  feafip.TipoResponsable condicionIVA();


  /**
   * <p>
   * Getter method for the COM property "condicionIVADesc"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(26)
  java.lang.String condicionIVADesc();


  /**
   * <p>
   * Getter method for the COM property "SolicitarConstanciaInscripcion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(27)
  boolean solicitarConstanciaInscripcion();


  /**
   * @param inidice Mandatory int parameter.
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String actividadesDesc(
    int inidice);


  /**
   * <p>
   * Getter method for the COM property "observaciones"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(29)
  java.lang.String observaciones();


  /**
   * <p>
   * Getter method for the COM property "nombreSimple"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(30)
  java.lang.String nombreSimple();


  /**
   * <p>
   * Getter method for the COM property "apellido"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(31)
  java.lang.String apellido();


  // Properties:
}
