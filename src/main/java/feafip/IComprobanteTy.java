package feafip  ;

import com4j.*;

@IID("{E4EF8C5E-D0D5-4C0A-A1AA-AFDC93A8D4E7}")
public interface IComprobanteTy extends Com4jObject {
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
   * Getter method for the COM property "razonSocialEmi"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(202) //= 0xca. The runtime will prefer the VTID if present
  @VTID(8)
  java.lang.String razonSocialEmi();


  /**
   * <p>
   * Getter method for the COM property "codTipoCmp"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(203) //= 0xcb. The runtime will prefer the VTID if present
  @VTID(9)
  int codTipoCmp();


  /**
   * <p>
   * Getter method for the COM property "PtoVta"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(204) //= 0xcc. The runtime will prefer the VTID if present
  @VTID(10)
  int ptoVta();


  /**
   * <p>
   * Getter method for the COM property "nroCmp"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(205) //= 0xcd. The runtime will prefer the VTID if present
  @VTID(11)
  double nroCmp();


  /**
   * <p>
   * Getter method for the COM property "cuitReceptor"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(206) //= 0xce. The runtime will prefer the VTID if present
  @VTID(12)
  double cuitReceptor();


  /**
   * <p>
   * Getter method for the COM property "razonSocialRecep"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(207) //= 0xcf. The runtime will prefer the VTID if present
  @VTID(13)
  java.lang.String razonSocialRecep();


  /**
   * <p>
   * Getter method for the COM property "tipoCodAuto"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(208) //= 0xd0. The runtime will prefer the VTID if present
  @VTID(14)
  java.lang.String tipoCodAuto();


  /**
   * <p>
   * Getter method for the COM property "CodAutorizacion"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(209) //= 0xd1. The runtime will prefer the VTID if present
  @VTID(15)
  double codAutorizacion();


  /**
   * <p>
   * Getter method for the COM property "fechaEmision"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(210) //= 0xd2. The runtime will prefer the VTID if present
  @VTID(16)
  java.lang.String fechaEmision();


  /**
   * <p>
   * Getter method for the COM property "fechaPuestaDispo"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(211) //= 0xd3. The runtime will prefer the VTID if present
  @VTID(17)
  java.lang.String fechaPuestaDispo();


  /**
   * <p>
   * Getter method for the COM property "fechaVenPago"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(212) //= 0xd4. The runtime will prefer the VTID if present
  @VTID(18)
  java.lang.String fechaVenPago();


  /**
   * <p>
   * Getter method for the COM property "fechaVenAcep"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(213) //= 0xd5. The runtime will prefer the VTID if present
  @VTID(19)
  java.lang.String fechaVenAcep();


  /**
   * <p>
   * Getter method for the COM property "importeTotal"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(214) //= 0xd6. The runtime will prefer the VTID if present
  @VTID(20)
  double importeTotal();


  /**
   * <p>
   * Getter method for the COM property "codMoneda"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(215) //= 0xd7. The runtime will prefer the VTID if present
  @VTID(21)
  java.lang.String codMoneda();


  /**
   * <p>
   * Getter method for the COM property "cotizacionMoneda"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(216) //= 0xd8. The runtime will prefer the VTID if present
  @VTID(22)
  double cotizacionMoneda();


  /**
   * <p>
   * Getter method for the COM property "CBUEmisor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(217) //= 0xd9. The runtime will prefer the VTID if present
  @VTID(23)
  java.lang.String cbuEmisor();


  /**
   * <p>
   * Getter method for the COM property "AliasEmisor"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(218) //= 0xda. The runtime will prefer the VTID if present
  @VTID(24)
  java.lang.String aliasEmisor();


  /**
   * <p>
   * Getter method for the COM property "esAnulacion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(219) //= 0xdb. The runtime will prefer the VTID if present
  @VTID(25)
  boolean esAnulacion();


  /**
   * <p>
   * Getter method for the COM property "esPostAceptacion"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(220) //= 0xdc. The runtime will prefer the VTID if present
  @VTID(26)
  boolean esPostAceptacion();


  /**
   * <p>
   * Getter method for the COM property "idComprobanteAsociado"
   * </p>
   * @return  Returns a value of type feafip.IIdComprobanteTy
   */

  @DISPID(221) //= 0xdd. The runtime will prefer the VTID if present
  @VTID(27)
  feafip.IIdComprobanteTy idComprobanteAsociado();


  /**
   * <p>
   * Getter method for the COM property "referenciasComerciales"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(222) //= 0xde. The runtime will prefer the VTID if present
  @VTID(28)
  java.lang.String referenciasComerciales();


  /**
   * <p>
   * Getter method for the COM property "arraySubtotalesIVA"
   * </p>
   * @param indice Mandatory int parameter.
   * @return  Returns a value of type feafip.ISubtotalIVATy
   */

  @DISPID(223) //= 0xdf. The runtime will prefer the VTID if present
  @VTID(29)
  feafip.ISubtotalIVATy arraySubtotalesIVA(
    int indice);


  /**
   * <p>
   * Getter method for the COM property "arraySubtotalesIVACount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(224) //= 0xe0. The runtime will prefer the VTID if present
  @VTID(30)
  int arraySubtotalesIVACount();


  /**
   * <p>
   * Getter method for the COM property "arrayOtrosTributos"
   * </p>
   * @return  Returns a value of type feafip.IOtroTributoTy
   */

  @DISPID(225) //= 0xe1. The runtime will prefer the VTID if present
  @VTID(31)
  feafip.IOtroTributoTy arrayOtrosTributos();


  /**
   * <p>
   * Getter method for the COM property "arrayOtrosTributosCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(226) //= 0xe2. The runtime will prefer the VTID if present
  @VTID(32)
  int arrayOtrosTributosCount();


  /**
   * <p>
   * Getter method for the COM property "arrayItems"
   * </p>
   * @return  Returns a value of type feafip.IItemTy
   */

  @DISPID(227) //= 0xe3. The runtime will prefer the VTID if present
  @VTID(33)
  feafip.IItemTy arrayItems();


  /**
   * <p>
   * Getter method for the COM property "arrayItemsCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(228) //= 0xe4. The runtime will prefer the VTID if present
  @VTID(34)
  int arrayItemsCount();


  /**
   * <p>
   * Getter method for the COM property "datosGenerales"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(229) //= 0xe5. The runtime will prefer the VTID if present
  @VTID(35)
  java.lang.String datosGenerales();


  /**
   * <p>
   * Getter method for the COM property "datosComerciales"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(230) //= 0xe6. The runtime will prefer the VTID if present
  @VTID(36)
  java.lang.String datosComerciales();


  /**
   * <p>
   * Getter method for the COM property "leyendaComercial"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(231) //= 0xe7. The runtime will prefer the VTID if present
  @VTID(37)
  java.lang.String leyendaComercial();


  /**
   * <p>
   * Getter method for the COM property "codCtaCte"
   * </p>
   * @return  Returns a value of type double
   */

  @DISPID(232) //= 0xe8. The runtime will prefer the VTID if present
  @VTID(38)
  double codCtaCte();


  /**
   * <p>
   * Getter method for the COM property "estado_estado"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(233) //= 0xe9. The runtime will prefer the VTID if present
  @VTID(39)
  java.lang.String estado_estado();


  /**
   * <p>
   * Getter method for the COM property "estado_fecha"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(234) //= 0xea. The runtime will prefer the VTID if present
  @VTID(40)
  java.lang.String estado_fecha();


  /**
   * <p>
   * Getter method for the COM property "tipoAcep"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(235) //= 0xeb. The runtime will prefer the VTID if present
  @VTID(41)
  java.lang.String tipoAcep();


  /**
   * <p>
   * Getter method for the COM property "fechaHoraAcep"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(236) //= 0xec. The runtime will prefer the VTID if present
  @VTID(42)
  java.lang.String fechaHoraAcep();


  /**
   * <p>
   * Getter method for the COM property "arrayMotivosRechazo"
   * </p>
   * @return  Returns a value of type feafip.IMotivoRechazoTy
   */

  @DISPID(237) //= 0xed. The runtime will prefer the VTID if present
  @VTID(43)
  feafip.IMotivoRechazoTy arrayMotivosRechazo();


  /**
   * <p>
   * Getter method for the COM property "arrayMotivosRechazoCount"
   * </p>
   * @return  Returns a value of type int
   */

  @DISPID(238) //= 0xee. The runtime will prefer the VTID if present
  @VTID(44)
  int arrayMotivosRechazoCount();


  /**
   * <p>
   * Getter method for the COM property "infoAgDtpoCltv"
   * </p>
   * @return  Returns a value of type boolean
   */

  @DISPID(239) //= 0xef. The runtime will prefer the VTID if present
  @VTID(45)
  boolean infoAgDtpoCltv();


  /**
   * <p>
   * Getter method for the COM property "fechaInfoAgDptoCltv"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(240) //= 0xf0. The runtime will prefer the VTID if present
  @VTID(46)
  java.lang.String fechaInfoAgDptoCltv();


  /**
   * <p>
   * Getter method for the COM property "idPagoAgDptoCltv"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(241) //= 0xf1. The runtime will prefer the VTID if present
  @VTID(47)
  java.lang.String idPagoAgDptoCltv();


  /**
   * <p>
   * Getter method for the COM property "CBUdePago"
   * </p>
   * @return  Returns a value of type java.lang.String
   */

  @DISPID(242) //= 0xf2. The runtime will prefer the VTID if present
  @VTID(48)
  java.lang.String cbUdePago();


  // Properties:
}
