/**
 * InputGetCotizacion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.7  Built on : Nov 20, 2017 (11:41:50 GMT)
 */
package model.wcf.vibia.diversos.ace.datacontracts.cotizacion;


/**
 *  InputGetCotizacion bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class InputGetCotizacion implements org.apache.axis2.databinding.ADBBean {
    /* This type was generated from the piece of schema that had
       name = InputGetCotizacion
       Namespace URI = http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion
       Namespace Prefix = ns1
     */

    /**
     * field for DatosGenerales
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales localDatosGenerales;

    /**
     * field for Caracteristicas
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas localCaracteristicas;

    /**
     * field for Ubicacion
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion localUbicacion;

    /**
     * field for Paquete
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete localPaquete;

    /**
     * field for DatosExtras
     */
    protected model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras localDatosExtras;

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales getDatosGenerales() {
        return localDatosGenerales;
    }

    /**
     * Auto generated setter method
     * @param param DatosGenerales
     */
    public void setDatosGenerales(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales param) {
        this.localDatosGenerales = param;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas getCaracteristicas() {
        return localCaracteristicas;
    }

    /**
     * Auto generated setter method
     * @param param Caracteristicas
     */
    public void setCaracteristicas(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas param) {
        this.localCaracteristicas = param;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion getUbicacion() {
        return localUbicacion;
    }

    /**
     * Auto generated setter method
     * @param param Ubicacion
     */
    public void setUbicacion(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion param) {
        this.localUbicacion = param;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete getPaquete() {
        return localPaquete;
    }

    /**
     * Auto generated setter method
     * @param param Paquete
     */
    public void setPaquete(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete param) {
        this.localPaquete = param;
    }

    /**
     * Auto generated getter method
     * @return model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras
     */
    public model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras getDatosExtras() {
        return localDatosExtras;
    }

    /**
     * Auto generated setter method
     * @param param DatosExtras
     */
    public void setDatosExtras(
        model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras param) {
        this.localDatosExtras = param;
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
                    namespacePrefix + ":InputGetCotizacion", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "InputGetCotizacion", xmlWriter);
            }
        }

        if (localDatosGenerales == null) {
            writeStartElement(null,
                "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                "DatosGenerales", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localDatosGenerales.serialize(new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "DatosGenerales"), xmlWriter);
        }

        if (localCaracteristicas == null) {
            writeStartElement(null,
                "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                "Caracteristicas", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localCaracteristicas.serialize(new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "Caracteristicas"), xmlWriter);
        }

        if (localUbicacion == null) {
            writeStartElement(null,
                "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                "Ubicacion", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localUbicacion.serialize(new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "Ubicacion"), xmlWriter);
        }

        if (localPaquete == null) {
            writeStartElement(null,
                "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                "Paquete", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localPaquete.serialize(new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "Paquete"), xmlWriter);
        }

        if (localDatosExtras == null) {
            writeStartElement(null,
                "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                "DatosExtras", xmlWriter);

            // write the nil attribute
            writeAttribute("xsi", "http://www.w3.org/2001/XMLSchema-instance",
                "nil", "1", xmlWriter);
            xmlWriter.writeEndElement();
        } else {
            localDatosExtras.serialize(new javax.xml.namespace.QName(
                    "http://ace.diversos.vibia.wcf.model/datacontracts/cotizacion",
                    "DatosExtras"), xmlWriter);
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
        public static InputGetCotizacion parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            InputGetCotizacion object = new InputGetCotizacion();

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

                        if (!"InputGetCotizacion".equals(type)) {
                            //find namespace for the prefix
                            java.lang.String nsUri = reader.getNamespaceContext()
                                                           .getNamespaceURI(nsPrefix);

                            return (InputGetCotizacion) model.wcf.vibia.diversos.ace.services.cotizacion.imports.ExtensionMapper.getTypeObject(nsUri,
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
                            "DatosGenerales").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDatosGenerales(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDatosGenerales(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosGenerales.Factory.parse(
                                reader));

                        reader.next();
                    }
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
                            "Caracteristicas").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setCaracteristicas(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setCaracteristicas(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Caracteristicas.Factory.parse(
                                reader));

                        reader.next();
                    }
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
                            "Ubicacion").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setUbicacion(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setUbicacion(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Ubicacion.Factory.parse(
                                reader));

                        reader.next();
                    }
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
                            "Paquete").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setPaquete(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setPaquete(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.Paquete.Factory.parse(
                                reader));

                        reader.next();
                    }
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
                            "DatosExtras").equals(reader.getName())) {
                    nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                            "nil");

                    if ("true".equals(nillableValue) ||
                            "1".equals(nillableValue)) {
                        object.setDatosExtras(null);
                        reader.next();

                        reader.next();
                    } else {
                        object.setDatosExtras(model.wcf.vibia.diversos.ace.datacontracts.cotizacion.DatosExtras.Factory.parse(
                                reader));

                        reader.next();
                    }
                } // End of if for expected property start element

                else {
                    // 1 - A start element we are not expecting indicates an invalid parameter was passed
                    throw new org.apache.axis2.databinding.ADBException(
                        "Unexpected subelement " + reader.getName());
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
