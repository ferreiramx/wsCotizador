/**
 * Paquete.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package model.wcf.vibia.diversos.ace.datacontracts.cotizacion;


/**
 *  Paquete bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Paquete implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Paquete
       Namespace URI = http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion
       Namespace Prefix = ns1
     */

    /**
     * field for Id
     */
    protected int localId;

    /**
     * field for FormaPagoId
     */
    protected int localFormaPagoId;

    /**
     * field for TipoCalculoId
     */
    protected int localTipoCalculoId;

    /**
     * field for TipoDeducibleId
     */
    protected int localTipoDeducibleId;

    /**
     * field for Coberturas
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura localCoberturas;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCoberturasTracker = false;

    /**
     * field for PrimaNetaMonto
     */
    protected java.math.BigDecimal localPrimaNetaMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimaNetaMontoTracker = false;

    /**
     * field for PrimaNetaLabel
     */
    protected java.lang.String localPrimaNetaLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimaNetaLabelTracker = false;

    /**
     * field for RecargosFPMonto
     */
    protected java.math.BigDecimal localRecargosFPMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecargosFPMontoTracker = false;

    /**
     * field for RecargosFPLabel
     */
    protected java.lang.String localRecargosFPLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecargosFPLabelTracker = false;

    /**
     * field for DerechosMonto
     */
    protected java.math.BigDecimal localDerechosMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDerechosMontoTracker = false;

    /**
     * field for DerechosLabel
     */
    protected java.lang.String localDerechosLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localDerechosLabelTracker = false;

    /**
     * field for SubTotalMonto
     */
    protected java.math.BigDecimal localSubTotalMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubTotalMontoTracker = false;

    /**
     * field for SubTotalLabel
     */
    protected java.lang.String localSubTotalLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localSubTotalLabelTracker = false;

    /**
     * field for IVAMonto
     */
    protected java.math.BigDecimal localIVAMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIVAMontoTracker = false;

    /**
     * field for IVALabel
     */
    protected java.lang.String localIVALabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIVALabelTracker = false;

    /**
     * field for PrimaTotalMonto
     */
    protected java.math.BigDecimal localPrimaTotalMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimaTotalMontoTracker = false;

    /**
     * field for PrimaTotalLabel
     */
    protected java.lang.String localPrimaTotalLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimaTotalLabelTracker = false;

    /**
     * field for ComisionMonto
     */
    protected java.math.BigDecimal localComisionMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComisionMontoTracker = false;

    /**
     * field for ComisionLabel
     */
    protected java.lang.String localComisionLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localComisionLabelTracker = false;

    /**
     * field for PrimerReciboMonto
     */
    protected java.math.BigDecimal localPrimerReciboMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimerReciboMontoTracker = false;

    /**
     * field for PrimerReciboLabel
     */
    protected java.lang.String localPrimerReciboLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localPrimerReciboLabelTracker = false;

    /**
     * field for RecibosSubsMonto
     */
    protected java.math.BigDecimal localRecibosSubsMonto;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecibosSubsMontoTracker = false;

    /**
     * field for RecibosSubsLabel
     */
    protected java.lang.String localRecibosSubsLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localRecibosSubsLabelTracker = false;

    /**
     * field for NoRecibosSubsLabel
     */
    protected int localNoRecibosSubsLabel;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoRecibosSubsLabelTracker = false;

    /**
     * field for IsCasaCampo
     */
    protected boolean localIsCasaCampo;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localIsCasaCampoTracker = false;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getId() {
        return localId;
    }

    /**
     * Auto generated setter method
     * @param param Id
     */
    public void setId(int param) {
        this.localId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getFormaPagoId() {
        return localFormaPagoId;
    }

    /**
     * Auto generated setter method
     * @param param FormaPagoId
     */
    public void setFormaPagoId(int param) {
        this.localFormaPagoId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTipoCalculoId() {
        return localTipoCalculoId;
    }

    /**
     * Auto generated setter method
     * @param param TipoCalculoId
     */
    public void setTipoCalculoId(int param) {
        this.localTipoCalculoId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTipoDeducibleId() {
        return localTipoDeducibleId;
    }

    /**
     * Auto generated setter method
     * @param param TipoDeducibleId
     */
    public void setTipoDeducibleId(int param) {
        this.localTipoDeducibleId = param;
    }

    public boolean isCoberturasSpecified() {
        return localCoberturasTracker;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura getCoberturas() {
        return localCoberturas;
    }

    /**
     * Auto generated setter method
     * @param param Coberturas
     */
    public void setCoberturas(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura param) {
        localCoberturasTracker = true;

        this.localCoberturas = param;
    }

    public boolean isPrimaNetaMontoSpecified() {
        return localPrimaNetaMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPrimaNetaMonto() {
        return localPrimaNetaMonto;
    }

    /**
     * Auto generated setter method
     * @param param PrimaNetaMonto
     */
    public void setPrimaNetaMonto(java.math.BigDecimal param) {
        localPrimaNetaMontoTracker = param != null;

        this.localPrimaNetaMonto = param;
    }

    public boolean isPrimaNetaLabelSpecified() {
        return localPrimaNetaLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrimaNetaLabel() {
        return localPrimaNetaLabel;
    }

    /**
     * Auto generated setter method
     * @param param PrimaNetaLabel
     */
    public void setPrimaNetaLabel(java.lang.String param) {
        localPrimaNetaLabelTracker = true;

        this.localPrimaNetaLabel = param;
    }

    public boolean isRecargosFPMontoSpecified() {
        return localRecargosFPMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getRecargosFPMonto() {
        return localRecargosFPMonto;
    }

    /**
     * Auto generated setter method
     * @param param RecargosFPMonto
     */
    public void setRecargosFPMonto(java.math.BigDecimal param) {
        localRecargosFPMontoTracker = param != null;

        this.localRecargosFPMonto = param;
    }

    public boolean isRecargosFPLabelSpecified() {
        return localRecargosFPLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRecargosFPLabel() {
        return localRecargosFPLabel;
    }

    /**
     * Auto generated setter method
     * @param param RecargosFPLabel
     */
    public void setRecargosFPLabel(java.lang.String param) {
        localRecargosFPLabelTracker = true;

        this.localRecargosFPLabel = param;
    }

    public boolean isDerechosMontoSpecified() {
        return localDerechosMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getDerechosMonto() {
        return localDerechosMonto;
    }

    /**
     * Auto generated setter method
     * @param param DerechosMonto
     */
    public void setDerechosMonto(java.math.BigDecimal param) {
        localDerechosMontoTracker = param != null;

        this.localDerechosMonto = param;
    }

    public boolean isDerechosLabelSpecified() {
        return localDerechosLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getDerechosLabel() {
        return localDerechosLabel;
    }

    /**
     * Auto generated setter method
     * @param param DerechosLabel
     */
    public void setDerechosLabel(java.lang.String param) {
        localDerechosLabelTracker = true;

        this.localDerechosLabel = param;
    }

    public boolean isSubTotalMontoSpecified() {
        return localSubTotalMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getSubTotalMonto() {
        return localSubTotalMonto;
    }

    /**
     * Auto generated setter method
     * @param param SubTotalMonto
     */
    public void setSubTotalMonto(java.math.BigDecimal param) {
        localSubTotalMontoTracker = param != null;

        this.localSubTotalMonto = param;
    }

    public boolean isSubTotalLabelSpecified() {
        return localSubTotalLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getSubTotalLabel() {
        return localSubTotalLabel;
    }

    /**
     * Auto generated setter method
     * @param param SubTotalLabel
     */
    public void setSubTotalLabel(java.lang.String param) {
        localSubTotalLabelTracker = true;

        this.localSubTotalLabel = param;
    }

    public boolean isIVAMontoSpecified() {
        return localIVAMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getIVAMonto() {
        return localIVAMonto;
    }

    /**
     * Auto generated setter method
     * @param param IVAMonto
     */
    public void setIVAMonto(java.math.BigDecimal param) {
        localIVAMontoTracker = param != null;

        this.localIVAMonto = param;
    }

    public boolean isIVALabelSpecified() {
        return localIVALabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getIVALabel() {
        return localIVALabel;
    }

    /**
     * Auto generated setter method
     * @param param IVALabel
     */
    public void setIVALabel(java.lang.String param) {
        localIVALabelTracker = true;

        this.localIVALabel = param;
    }

    public boolean isPrimaTotalMontoSpecified() {
        return localPrimaTotalMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPrimaTotalMonto() {
        return localPrimaTotalMonto;
    }

    /**
     * Auto generated setter method
     * @param param PrimaTotalMonto
     */
    public void setPrimaTotalMonto(java.math.BigDecimal param) {
        localPrimaTotalMontoTracker = param != null;

        this.localPrimaTotalMonto = param;
    }

    public boolean isPrimaTotalLabelSpecified() {
        return localPrimaTotalLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrimaTotalLabel() {
        return localPrimaTotalLabel;
    }

    /**
     * Auto generated setter method
     * @param param PrimaTotalLabel
     */
    public void setPrimaTotalLabel(java.lang.String param) {
        localPrimaTotalLabelTracker = true;

        this.localPrimaTotalLabel = param;
    }

    public boolean isComisionMontoSpecified() {
        return localComisionMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getComisionMonto() {
        return localComisionMonto;
    }

    /**
     * Auto generated setter method
     * @param param ComisionMonto
     */
    public void setComisionMonto(java.math.BigDecimal param) {
        localComisionMontoTracker = param != null;

        this.localComisionMonto = param;
    }

    public boolean isComisionLabelSpecified() {
        return localComisionLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getComisionLabel() {
        return localComisionLabel;
    }

    /**
     * Auto generated setter method
     * @param param ComisionLabel
     */
    public void setComisionLabel(java.lang.String param) {
        localComisionLabelTracker = true;

        this.localComisionLabel = param;
    }

    public boolean isPrimerReciboMontoSpecified() {
        return localPrimerReciboMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getPrimerReciboMonto() {
        return localPrimerReciboMonto;
    }

    /**
     * Auto generated setter method
     * @param param PrimerReciboMonto
     */
    public void setPrimerReciboMonto(java.math.BigDecimal param) {
        localPrimerReciboMontoTracker = param != null;

        this.localPrimerReciboMonto = param;
    }

    public boolean isPrimerReciboLabelSpecified() {
        return localPrimerReciboLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getPrimerReciboLabel() {
        return localPrimerReciboLabel;
    }

    /**
     * Auto generated setter method
     * @param param PrimerReciboLabel
     */
    public void setPrimerReciboLabel(java.lang.String param) {
        localPrimerReciboLabelTracker = true;

        this.localPrimerReciboLabel = param;
    }

    public boolean isRecibosSubsMontoSpecified() {
        return localRecibosSubsMontoTracker;
    }

    /**
     * Auto generated getter method
     * @return java.math.BigDecimal
     */
    public java.math.BigDecimal getRecibosSubsMonto() {
        return localRecibosSubsMonto;
    }

    /**
     * Auto generated setter method
     * @param param RecibosSubsMonto
     */
    public void setRecibosSubsMonto(java.math.BigDecimal param) {
        localRecibosSubsMontoTracker = param != null;

        this.localRecibosSubsMonto = param;
    }

    public boolean isRecibosSubsLabelSpecified() {
        return localRecibosSubsLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRecibosSubsLabel() {
        return localRecibosSubsLabel;
    }

    /**
     * Auto generated setter method
     * @param param RecibosSubsLabel
     */
    public void setRecibosSubsLabel(java.lang.String param) {
        localRecibosSubsLabelTracker = true;

        this.localRecibosSubsLabel = param;
    }

    public boolean isNoRecibosSubsLabelSpecified() {
        return localNoRecibosSubsLabelTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNoRecibosSubsLabel() {
        return localNoRecibosSubsLabel;
    }

    /**
     * Auto generated setter method
     * @param param NoRecibosSubsLabel
     */
    public void setNoRecibosSubsLabel(int param) {
        // setting primitive attribute tracker to true
        localNoRecibosSubsLabelTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNoRecibosSubsLabel = param;
    }

    public boolean isIsCasaCampoSpecified() {
        return localIsCasaCampoTracker;
    }

    /**
     * Auto generated getter method
     * @return boolean
     */
    public boolean getIsCasaCampo() {
        return localIsCasaCampo;
    }

    /**
     * Auto generated setter method
     * @param param IsCasaCampo
     */
    public void setIsCasaCampo(boolean param) {
        // setting primitive attribute tracker to true
        localIsCasaCampoTracker = true;

        this.localIsCasaCampo = param;
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, parentQName));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        java.lang.String prefix = null;
        java.lang.String namespace = null;

        prefix = parentQName.getPrefix();
        namespace = parentQName.getNamespaceURI();
        writeStartElement(prefix, namespace, parentQName.getLocalPart(),
            xmlWriter);

        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":Paquete", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Paquete", xmlWriter);
            }
        }

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "Id", xmlWriter);

        if (localId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "Id cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "FormaPagoId", xmlWriter);

        if (localFormaPagoId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "FormaPagoId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localFormaPagoId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "TipoCalculoId", xmlWriter);

        if (localTipoCalculoId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "TipoCalculoId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTipoCalculoId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "TipoDeducibleId", xmlWriter);

        if (localTipoDeducibleId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "TipoDeducibleId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTipoDeducibleId));
        }

        xmlWriter.writeEndElement();

        if (localCoberturasTracker) {
            if (localCoberturas == null) {
                writeStartElement(null,
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "Coberturas", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localCoberturas.serialize(new javax.xml.namespace.QName(
                        "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                        "Coberturas"), xmlWriter);
            }
        }

        if (localPrimaNetaMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimaNetaMonto", xmlWriter);

            if (localPrimaNetaMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PrimaNetaMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPrimaNetaMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localPrimaNetaLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimaNetaLabel", xmlWriter);

            if (localPrimaNetaLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localPrimaNetaLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localRecargosFPMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "RecargosFPMonto", xmlWriter);

            if (localRecargosFPMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RecargosFPMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRecargosFPMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localRecargosFPLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "RecargosFPLabel", xmlWriter);

            if (localRecargosFPLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localRecargosFPLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localDerechosMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "DerechosMonto", xmlWriter);

            if (localDerechosMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "DerechosMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localDerechosMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localDerechosLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "DerechosLabel", xmlWriter);

            if (localDerechosLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localDerechosLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localSubTotalMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "SubTotalMonto", xmlWriter);

            if (localSubTotalMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "SubTotalMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localSubTotalMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localSubTotalLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "SubTotalLabel", xmlWriter);

            if (localSubTotalLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localSubTotalLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localIVAMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "IVAMonto", xmlWriter);

            if (localIVAMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "IVAMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIVAMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localIVALabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "IVALabel", xmlWriter);

            if (localIVALabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localIVALabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localPrimaTotalMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimaTotalMonto", xmlWriter);

            if (localPrimaTotalMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PrimaTotalMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPrimaTotalMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localPrimaTotalLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimaTotalLabel", xmlWriter);

            if (localPrimaTotalLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localPrimaTotalLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localComisionMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "ComisionMonto", xmlWriter);

            if (localComisionMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "ComisionMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localComisionMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localComisionLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "ComisionLabel", xmlWriter);

            if (localComisionLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localComisionLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localPrimerReciboMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimerReciboMonto", xmlWriter);

            if (localPrimerReciboMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "PrimerReciboMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localPrimerReciboMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localPrimerReciboLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "PrimerReciboLabel", xmlWriter);

            if (localPrimerReciboLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localPrimerReciboLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localRecibosSubsMontoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "RecibosSubsMonto", xmlWriter);

            if (localRecibosSubsMonto == null) {
                // write the nil attribute
                throw new org.apache.axis2.databinding.ADBException(
                    "RecibosSubsMonto cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localRecibosSubsMonto));
            }

            xmlWriter.writeEndElement();
        }

        if (localRecibosSubsLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "RecibosSubsLabel", xmlWriter);

            if (localRecibosSubsLabel == null) {
                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
            } else {
                xmlWriter.writeCharacters(localRecibosSubsLabel);
            }

            xmlWriter.writeEndElement();
        }

        if (localNoRecibosSubsLabelTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "NoRecibosSubsLabel", xmlWriter);

            if (localNoRecibosSubsLabel == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NoRecibosSubsLabel cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNoRecibosSubsLabel));
            }

            xmlWriter.writeEndElement();
        }

        if (localIsCasaCampoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "IsCasaCampo", xmlWriter);

            if (false) {
                throw new org.apache.axis2.databinding.ADBException(
                    "IsCasaCampo cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localIsCasaCampo));
            }

            xmlWriter.writeEndElement();
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static Paquete parse(javax.xml.stream.XMLStreamReader reader)
            throws java.lang.Exception {
            Paquete object = new Paquete();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                if (reader.getAttributeValue(
                            "http://www.w3.org/2001/XMLSchema-instance", "type") != null) {
                    java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "type");

                    if (fullTypeName != null) {
                        java.lang.String nsPrefix = null;

                        if (fullTypeName.indexOf(":") > -1) {
                            nsPrefix = fullTypeName.substring(0,
                                    fullTypeName.indexOf(":"));
                        }

                        nsPrefix = (nsPrefix == null) ? "" : nsPrefix;

                        java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(
                                    ":") + 1);

                        if (!"Paquete".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Paquete) model.wcf.vibia.diversos.ace.services.cotizacion.imports.ExtensionMapper.getTypeObject(nsUri,
                                type, reader);
                        }
                    }
                }

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                reader.next();

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "Id").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "Id" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "FormaPagoId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "FormaPagoId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setFormaPagoId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "TipoCalculoId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TipoCalculoId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoCalculoId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "TipoDeducibleId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TipoDeducibleId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoDeducibleId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "Coberturas").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setCoberturas(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setCoberturas(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfCobertura.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimaNetaMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PrimaNetaMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPrimaNetaMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimaNetaLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setPrimaNetaLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "RecargosFPMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RecargosFPMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRecargosFPMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "RecargosFPLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setRecargosFPLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "DerechosMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "DerechosMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setDerechosMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "DerechosLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setDerechosLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "SubTotalMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "SubTotalMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setSubTotalMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "SubTotalLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setSubTotalLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "IVAMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IVAMonto" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIVAMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "IVALabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setIVALabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimaTotalMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PrimaTotalMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPrimaTotalMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimaTotalLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setPrimaTotalLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "ComisionMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "ComisionMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setComisionMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "ComisionLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setComisionLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimerReciboMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "PrimerReciboMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setPrimerReciboMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "PrimerReciboLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setPrimerReciboLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "RecibosSubsMonto").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "RecibosSubsMonto" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setRecibosSubsMonto(org.apache.axis2.databinding.utils.ConverterUtil.convertToDecimal(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "RecibosSubsLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setRecibosSubsLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "NoRecibosSubsLabel").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NoRecibosSubsLabel" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNoRecibosSubsLabel(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNoRecibosSubsLabel(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "IsCasaCampo").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "IsCasaCampo" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setIsCasaCampo(org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement()) {
                    // 2 - A start element we are not expecting indicates a trailing invalid property
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
                }
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
