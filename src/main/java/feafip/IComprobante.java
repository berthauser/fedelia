package feafip  ;

import com4j.*;

@IID("{DC4152DF-68E8-4C5C-804F-22B28CF4C726}")
public interface IComprobante extends Com4jObject {
  // Methods:
  /**
   * <p>
   * Getter method for the COM property "Concepto"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(201) //= 0xc9. The runtime will prefer the VTID if present
  @VTID(7)
  int concepto();


  /**
   * <p>
   * Getter method for the COM property "DocTipo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  int docTipo();


  /**
   * <p>
   * Getter method for the COM property "DocNro"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  double docNro();


  /**
   * <p>
   * Getter method for the COM property "Cbtedesde"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  double cbtedesde();


  /**
   * <p>
   * Getter method for the COM property "Cbtehasta"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  double cbtehasta();


  /**
   * <p>
   * Getter method for the COM property "CbteFch"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  java.lang.String cbteFch();


  /**
   * <p>
   * Getter method for the COM property "Imptotal"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  double imptotal();


  /**
   * <p>
   * Getter method for the COM property "ImpTotConc"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  double impTotConc();


  /**
   * <p>
   * Getter method for the COM property "ImpNeto"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  double impNeto();


  /**
   * <p>
   * Getter method for the COM property "ImpOpEx"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  double impOpEx();


  /**
   * <p>
   * Getter method for the COM property "ImpTrib"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  double impTrib();


  /**
   * <p>
   * Getter method for the COM property "ImpIVA"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  double impIVA();


  /**
   * <p>
   * Getter method for the COM property "FchServDesde"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String fchServDesde();


  /**
   * <p>
   * Getter method for the COM property "FchServHasta"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  java.lang.String fchServHasta();


  /**
   * <p>
   * Getter method for the COM property "FchVtoPago"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String fchVtoPago();


  /**
   * <p>
   * Getter method for the COM property "MonId"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  java.lang.String monId();


  /**
   * <p>
   * Getter method for the COM property "MonCotiz"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  double monCotiz();


  /**
   * <p>
   * Getter method for the COM property "CbtesAsocCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  int cbtesAsocCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.ICbteAsoc
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  feafip.ICbteAsoc cbtesAsoc(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "TributosCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(26)
  int tributosCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.ITributo
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(27)
  feafip.ITributo tributos(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "IvaCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(28)
  int ivaCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.IAlicIva
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(29)
  feafip.IAlicIva iva(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "OpcionalesCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(30)
  int opcionalesCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.IOpcional
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(31)
  feafip.IOpcional opcionales(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "Resultado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(32)
  java.lang.String resultado();


  /**
   * <p>
   * Getter method for the COM property "CodAutorizacion"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(33)
  java.lang.String codAutorizacion();


  /**
   * <p>
   * Getter method for the COM property "EmisionTipo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(34)
  java.lang.String emisionTipo();


  /**
   * <p>
   * Getter method for the COM property "FchVto"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String fchVto();


  /**
   * <p>
   * Getter method for the COM property "FchProceso"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String fchProceso();


  /**
   * <p>
   * Getter method for the COM property "ObservacionesCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(37)
  int observacionesCount();


  /**
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.IObs
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(38)
  feafip.IObs observaciones(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "PtoVta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(39)
  int ptoVta();


  /**
   * <p>
   * Getter method for the COM property "CbteTipo"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(40)
  int cbteTipo();


  // Properties:
}
