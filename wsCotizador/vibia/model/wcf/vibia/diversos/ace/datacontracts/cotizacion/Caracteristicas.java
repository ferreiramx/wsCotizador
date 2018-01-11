/**
 * Caracteristicas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package model.wcf.vibia.diversos.ace.datacontracts.cotizacion;


/**
 *  Caracteristicas bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class Caracteristicas implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = Caracteristicas
       Namespace URI = http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion
       Namespace Prefix = ns1
     */

    /**
     * field for TipoMuroId
     */
    protected int localTipoMuroId;

    /**
     * field for TipoTechoId
     */
    protected int localTipoTechoId;

    /**
     * field for RiesgoDesc
     */
    protected java.lang.String localRiesgoDesc;

    /**
     * field for TipoHabitacionalId
     */
    protected int localTipoHabitacionalId;

    /**
     * field for CantNiveles
     */
    protected int localCantNiveles;

    /**
     * field for CantSotanos
     */
    protected int localCantSotanos;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localCantSotanosTracker = false;

    /**
     * field for NoPiso
     */
    protected int localNoPiso;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoPisoTracker = false;

    /**
     * field for NoPisoAsegurado
     */
    protected int localNoPisoAsegurado;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localNoPisoAseguradoTracker = false;

    /**
     * field for MedidasSeguridad
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad localMedidasSeguridad;

    /*  This tracker boolean wil be used to detect whether the user called the set method
     *   for this attribute. It will be used to determine whether to include this field
     *   in the serialized XML
     */
    protected boolean localMedidasSeguridadTracker = false;

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTipoMuroId() {
        return localTipoMuroId;
    }

    /**
     * Auto generated setter method
     * @param param TipoMuroId
     */
    public void setTipoMuroId(int param) {
        this.localTipoMuroId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTipoTechoId() {
        return localTipoTechoId;
    }

    /**
     * Auto generated setter method
     * @param param TipoTechoId
     */
    public void setTipoTechoId(int param) {
        this.localTipoTechoId = param;
    }

    /**
     * Auto generated getter method
     * @return java.lang.String
     */
    public java.lang.String getRiesgoDesc() {
        return localRiesgoDesc;
    }

    /**
     * Auto generated setter method
     * @param param RiesgoDesc
     */
    public void setRiesgoDesc(java.lang.String param) {
        this.localRiesgoDesc = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getTipoHabitacionalId() {
        return localTipoHabitacionalId;
    }

    /**
     * Auto generated setter method
     * @param param TipoHabitacionalId
     */
    public void setTipoHabitacionalId(int param) {
        this.localTipoHabitacionalId = param;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getCantNiveles() {
        return localCantNiveles;
    }

    /**
     * Auto generated setter method
     * @param param CantNiveles
     */
    public void setCantNiveles(int param) {
        this.localCantNiveles = param;
    }

    public boolean isCantSotanosSpecified() {
        return localCantSotanosTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getCantSotanos() {
        return localCantSotanos;
    }

    /**
     * Auto generated setter method
     * @param param CantSotanos
     */
    public void setCantSotanos(int param) {
        // setting primitive attribute tracker to true
        localCantSotanosTracker = param != java.lang.Integer.MIN_VALUE;

        this.localCantSotanos = param;
    }

    public boolean isNoPisoSpecified() {
        return localNoPisoTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNoPiso() {
        return localNoPiso;
    }

    /**
     * Auto generated setter method
     * @param param NoPiso
     */
    public void setNoPiso(int param) {
        // setting primitive attribute tracker to true
        localNoPisoTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNoPiso = param;
    }

    public boolean isNoPisoAseguradoSpecified() {
        return localNoPisoAseguradoTracker;
    }

    /**
     * Auto generated getter method
     * @return int
     */
    public int getNoPisoAsegurado() {
        return localNoPisoAsegurado;
    }

    /**
     * Auto generated setter method
     * @param param NoPisoAsegurado
     */
    public void setNoPisoAsegurado(int param) {
        // setting primitive attribute tracker to true
        localNoPisoAseguradoTracker = param != java.lang.Integer.MIN_VALUE;

        this.localNoPisoAsegurado = param;
    }

    public boolean isMedidasSeguridadSpecified() {
        return localMedidasSeguridadTracker;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad getMedidasSeguridad() {
        return localMedidasSeguridad;
    }

    /**
     * Auto generated setter method
     * @param param MedidasSeguridad
     */
    public void setMedidasSeguridad(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad param) {
        localMedidasSeguridadTracker = true;

        this.localMedidasSeguridad = param;
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
                    namespacePrefix + ":Caracteristicas", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "Caracteristicas", xmlWriter);
            }
        }

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "TipoMuroId", xmlWriter);

        if (localTipoMuroId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "TipoMuroId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTipoMuroId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "TipoTechoId", xmlWriter);

        if (localTipoTechoId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "TipoTechoId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTipoTechoId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "RiesgoDesc", xmlWriter);

        if (localRiesgoDesc == null) {
            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
        } else {
            xmlWriter.writeCharacters(localRiesgoDesc);
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "TipoHabitacionalId", xmlWriter);

        if (localTipoHabitacionalId == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "TipoHabitacionalId cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localTipoHabitacionalId));
        }

        xmlWriter.writeEndElement();

        namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
        writeStartElement(null, namespace, "CantNiveles", xmlWriter);

        if (localCantNiveles == java.lang.Integer.MIN_VALUE) {
            throw new org.apache.axis2.databinding.ADBException(
                "CantNiveles cannot be null!!");
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    localCantNiveles));
        }

        xmlWriter.writeEndElement();

        if (localCantSotanosTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "CantSotanos", xmlWriter);

            if (localCantSotanos == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "CantSotanos cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localCantSotanos));
            }

            xmlWriter.writeEndElement();
        }

        if (localNoPisoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "NoPiso", xmlWriter);

            if (localNoPiso == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NoPiso cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNoPiso));
            }

            xmlWriter.writeEndElement();
        }

        if (localNoPisoAseguradoTracker) {
            namespace = "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion";
            writeStartElement(null, namespace, "NoPisoAsegurado", xmlWriter);

            if (localNoPisoAsegurado == java.lang.Integer.MIN_VALUE) {
                throw new org.apache.axis2.databinding.ADBException(
                    "NoPisoAsegurado cannot be null!!");
            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        localNoPisoAsegurado));
            }

            xmlWriter.writeEndElement();
        }

        if (localMedidasSeguridadTracker) {
            if (localMedidasSeguridad == null) {
                writeStartElement(null,
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "MedidasSeguridad", xmlWriter);

                // write the nil attribute
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "nil", "1",
                    xmlWriter);
                xmlWriter.writeEndElement();
            } else {
                localMedidasSeguridad.serialize(new javax.xml.namespace.QName(
                        "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                        "MedidasSeguridad"), xmlWriter);
            }
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
        public static Caracteristicas parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            Caracteristicas object = new Caracteristicas();

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

                        if (!"Caracteristicas".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (Caracteristicas) model.wcf.vibia.diversos.ace.services.cotizacion.imports.ExtensionMapper.getTypeObject(nsUri,
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
                            "TipoMuroId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TipoMuroId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoMuroId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                            "TipoTechoId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TipoTechoId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoTechoId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                            "RiesgoDesc").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if (!"true".equals(nillableValue) &&
                            !"1".equals(nillableValue)) {
                        java.lang.String content = reader.getElementText();

                        object.setRiesgoDesc(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                content));
                    } else {
                        reader.getElementText(); // throw away text nodes if any.
                    }

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
                            "TipoHabitacionalId").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "TipoHabitacionalId" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setTipoHabitacionalId(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                            "CantNiveles").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CantNiveles" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCantNiveles(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
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
                            "CantSotanos").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "CantSotanos" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setCantSotanos(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setCantSotanos(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "NoPiso").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NoPiso" + "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNoPiso(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNoPiso(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "NoPisoAsegurado").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        throw new org.apache.axis2.databinding.ADBException(
                            "The element: " + "NoPisoAsegurado" +
                            "  cannot be null");
                    }

                    java.lang.String content = reader.getElementText();

                    object.setNoPisoAsegurado(org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(
                            content));

                    reader.next();
                } // End of if for expected property start element

                else {
                    object.setNoPisoAsegurado(java.lang.Integer.MIN_VALUE);
                }

                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                if (reader.isStartElement() &&
                        new javax.xml.namespace.QName(
                            "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                            "MedidasSeguridad").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setMedidasSeguridad(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setMedidasSeguridad(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.ArrayOfMedidaSeguridad.Factory.parse(
                                reader));

                        reader.next();
                    }
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
