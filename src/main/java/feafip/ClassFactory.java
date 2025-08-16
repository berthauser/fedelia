package feafip  ;

import com4j.*;

/**
 * Defines methods to create COM objects
 */
public abstract class ClassFactory {
  private ClassFactory() {} // instanciation is not allowed


  public static feafip.Iwsaa createwsaa() {
    return COM4J.createInstance( feafip.Iwsaa.class, "{33B45EE7-0219-4BE1-A9CA-2B57CA4FD209}" );
  }

  public static feafip.Iwsfexv1 createwsfexv1() {
    return COM4J.createInstance( feafip.Iwsfexv1.class, "{CBC36AD9-1D16-4590-A82C-2ED017AAAB4C}" );
  }

  public static feafip.Iwsfev1 createwsfev1() {
    return COM4J.createInstance( feafip.Iwsfev1.class, "{6804CFD5-32DD-43AE-A463-CB64FCBE32D2}" );
  }

  public static feafip.Iwsbfev1 createwsbfev1() {
    return COM4J.createInstance( feafip.Iwsbfev1.class, "{2E472E22-AD8A-4071-8C62-D2D9B8CE47D3}" );
  }

  /**
   * wsmtxca Object
   */
  public static feafip.Iwsmtxca createwsmtxca() {
    return COM4J.createInstance( feafip.Iwsmtxca.class, "{C3DD12A3-EAA2-4F45-8F5D-4A25CBD19838}" );
  }

  /**
   * wsseg Object
   */
  public static feafip.Iwsseg createwsseg() {
    return COM4J.createInstance( feafip.Iwsseg.class, "{5B4092EF-B311-4CDD-A9F8-61A0AEC7E54C}" );
  }

  public static feafip.IwsPadron createwsPadron() {
    return COM4J.createInstance( feafip.IwsPadron.class, "{F57D2D12-E231-4AF7-BB54-3CDDFB52713B}" );
  }

  public static feafip.IComprobante createComprobante() {
    return COM4J.createInstance( feafip.IComprobante.class, "{A9B8A44F-99B4-4D18-8A54-A66CC5C39BEB}" );
  }

  public static feafip.ICbteAsoc createCbteAsoc() {
    return COM4J.createInstance( feafip.ICbteAsoc.class, "{259527D7-6AE5-411F-89EC-9C9A480A41F9}" );
  }

  public static feafip.ITributo createTributo() {
    return COM4J.createInstance( feafip.ITributo.class, "{FD8F306C-CE28-460C-810C-57CE15C35A37}" );
  }

  public static feafip.IAlicIva createAlicIva() {
    return COM4J.createInstance( feafip.IAlicIva.class, "{DA06EFB8-3B19-4061-A544-157036E2CB57}" );
  }

  public static feafip.IOpcional createOpcional() {
    return COM4J.createInstance( feafip.IOpcional.class, "{74473C21-FABC-49EB-B268-7D6B33D8C728}" );
  }

  public static feafip.IObs createObs() {
    return COM4J.createInstance( feafip.IObs.class, "{C778E764-6411-4086-A488-14FC22B1BA4A}" );
  }

  public static feafip.IContribuyente createContribuyente() {
    return COM4J.createInstance( feafip.IContribuyente.class, "{0214EC04-2B59-4CDA-BE4F-6212C9B65F02}" );
  }

  public static feafip.IDomicilio createDomicilio() {
    return COM4J.createInstance( feafip.IDomicilio.class, "{0370A743-18E0-424E-8124-9CA27A80EB16}" );
  }

  public static feafip.IwsPadronARBA createwsPadronARBA() {
    return COM4J.createInstance( feafip.IwsPadronARBA.class, "{6F042FCF-8D78-498B-8630-61346537279F}" );
  }

  public static feafip.IConsultaAlicuotaRespuesta createConsultaAlicuotaRespuesta() {
    return COM4J.createInstance( feafip.IConsultaAlicuotaRespuesta.class, "{E17927E3-019B-4B2E-BB5B-CD6DA8A61F59}" );
  }

  public static feafip.ICertificado createCertificado() {
    return COM4J.createInstance( feafip.ICertificado.class, "{189DA0FB-8B57-4C51-834E-666BE83E5878}" );
  }

  /**
   * wscdc Object
   */
  public static feafip.Iwscdc createwscdc() {
    return COM4J.createInstance( feafip.Iwscdc.class, "{FDFE6850-8AE7-4B58-8D03-7655A9F28402}" );
  }

  /**
   * Barcode Object
   */
  public static feafip.IBarcode createBarcode() {
    return COM4J.createInstance( feafip.IBarcode.class, "{C53215BA-E553-4742-8D17-193B041996F9}" );
  }

  public static feafip.Iwsct createwsct() {
    return COM4J.createInstance( feafip.Iwsct.class, "{0C0A8678-5679-4F36-A995-85DA19D90CF5}" );
  }

  /**
   * wsfecred Object
   */
  public static feafip.Iwsfecred createwsfecred() {
    return COM4J.createInstance( feafip.Iwsfecred.class, "{A9EFDBFE-92AC-4D25-B52E-053810AAEB03}" );
  }

  public static feafip.IIdCtaCteTy createIdCtaCteTy() {
    return COM4J.createInstance( feafip.IIdCtaCteTy.class, "{B27AFDD3-1232-49BB-B143-8D6B9CDD2AC5}" );
  }

  public static feafip.IIdComprobanteTy createIdComprobanteTy() {
    return COM4J.createInstance( feafip.IIdComprobanteTy.class, "{02CD78F9-A667-49EA-8508-CFC2F476AB45}" );
  }

  public static feafip.IAceptarFECredRequestTy createAceptarFECredRequestTy() {
    return COM4J.createInstance( feafip.IAceptarFECredRequestTy.class, "{4516C1D1-6EC6-4017-BCB7-75E2C45C45D3}" );
  }

  public static feafip.IConsultarCmpReturnTy createConsultarCmpReturnTy() {
    return COM4J.createInstance( feafip.IConsultarCmpReturnTy.class, "{C2B0F281-F728-47D0-ACD5-30F614857DD6}" );
  }

  public static feafip.IComprobanteTy createComprobanteTy() {
    return COM4J.createInstance( feafip.IComprobanteTy.class, "{5088161C-D4C5-4804-B3D2-ADBB7105F6CD}" );
  }

  public static feafip.ISubtotalIVATy createSubtotalIVATy() {
    return COM4J.createInstance( feafip.ISubtotalIVATy.class, "{6AB7D1ED-1C7B-498D-B0CB-639178F5E98F}" );
  }

  public static feafip.IOtroTributoTy createOtroTributoTy() {
    return COM4J.createInstance( feafip.IOtroTributoTy.class, "{DAA88209-E23C-4E71-922B-1F4A2789119A}" );
  }

  public static feafip.IItemTy createItemTy() {
    return COM4J.createInstance( feafip.IItemTy.class, "{2FA6E1A5-A1F8-4A90-9B4F-2C8A722AD481}" );
  }

  public static feafip.IMotivoRechazoTy createMotivoRechazoType() {
    return COM4J.createInstance( feafip.IMotivoRechazoTy.class, "{519CBF25-50EE-42E6-A732-A7CC2AC99A1C}" );
  }

  public static feafip.IInformarFacturaAgtDptoCltvRequestTy createInformarFacturaAgtDptoCltvRequestTy() {
    return COM4J.createInstance( feafip.IInformarFacturaAgtDptoCltvRequestTy.class, "{CD68CB93-ECDF-42BE-9854-02FA02E8B30C}" );
  }

  public static feafip.IRechazarFECredRequestTy createRechazarFECredRequestTy() {
    return COM4J.createInstance( feafip.IRechazarFECredRequestTy.class, "{28C2A13F-C5BE-49BE-8DA4-635CF9529B93}" );
  }

  public static feafip.IconsultarObligadoRecepcionReturnTy createconsultarObligadoRecepcionReturnTy() {
    return COM4J.createInstance( feafip.IconsultarObligadoRecepcionReturnTy.class, "{6A3EF1B1-656A-43F8-B80A-E2C375D42615}" );
  }

  public static feafip.IConsultarMontoObligadoRecepcionReturnTy createConsultarMontoObligadoRecepcionReturnTy() {
    return COM4J.createInstance( feafip.IConsultarMontoObligadoRecepcionReturnTy.class, "{0DB7F725-8B5C-4024-8B15-A5CD5588B8A6}" );
  }

  public static feafip.IConsultarCtasCtesReturnTy createConsultarCtasCtesReturnTy() {
    return COM4J.createInstance( feafip.IConsultarCtasCtesReturnTy.class, "{87058F67-F2AA-4258-A232-B7B4DB2D5AD4}" );
  }

  public static feafip.IInfoCtaCteTy createInfoCtaCteTy() {
    return COM4J.createInstance( feafip.IInfoCtaCteTy.class, "{B1311E00-BDEE-41B0-A6A5-C7D51F70A30E}" );
  }

  public static feafip.IConsultarCtaCteReturnTy createConsultarCtaCteReturnTy() {
    return COM4J.createInstance( feafip.IConsultarCtaCteReturnTy.class, "{F4BAAC5D-D8F1-4435-B8DC-085AF2DF2803}" );
  }
}
