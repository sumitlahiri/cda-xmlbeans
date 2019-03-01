/*
 * XML Type:  ED
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ED
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ED(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EDImpl extends com.walgreens.rxit.ch.cda.impl.BINImpl implements com.walgreens.rxit.ch.cda.ED
{
    private static final long serialVersionUID = 1L;
    
    public EDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REFERENCE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "reference");
    private static final javax.xml.namespace.QName THUMBNAIL$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "thumbnail");
    private static final javax.xml.namespace.QName MEDIATYPE$4 = 
        new javax.xml.namespace.QName("", "mediaType");
    private static final javax.xml.namespace.QName LANGUAGE$6 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName COMPRESSION$8 = 
        new javax.xml.namespace.QName("", "compression");
    private static final javax.xml.namespace.QName INTEGRITYCHECK$10 = 
        new javax.xml.namespace.QName("", "integrityCheck");
    private static final javax.xml.namespace.QName INTEGRITYCHECKALGORITHM$12 = 
        new javax.xml.namespace.QName("", "integrityCheckAlgorithm");
    
    
    /**
     * Gets the "reference" element
     */
    public com.walgreens.rxit.ch.cda.TEL getReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "reference" element
     */
    public boolean isSetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFERENCE$0) != 0;
        }
    }
    
    /**
     * Sets the "reference" element
     */
    public void setReference(com.walgreens.rxit.ch.cda.TEL reference)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().find_element_user(REFERENCE$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.TEL)get_store().add_element_user(REFERENCE$0);
            }
            target.set(reference);
        }
    }
    
    /**
     * Appends and returns a new empty "reference" element
     */
    public com.walgreens.rxit.ch.cda.TEL addNewReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TEL target = null;
            target = (com.walgreens.rxit.ch.cda.TEL)get_store().add_element_user(REFERENCE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "reference" element
     */
    public void unsetReference()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFERENCE$0, 0);
        }
    }
    
    /**
     * Gets the "thumbnail" element
     */
    public com.walgreens.rxit.ch.cda.Thumbnail getThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Thumbnail target = null;
            target = (com.walgreens.rxit.ch.cda.Thumbnail)get_store().find_element_user(THUMBNAIL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thumbnail" element
     */
    public boolean isSetThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THUMBNAIL$2) != 0;
        }
    }
    
    /**
     * Sets the "thumbnail" element
     */
    public void setThumbnail(com.walgreens.rxit.ch.cda.Thumbnail thumbnail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Thumbnail target = null;
            target = (com.walgreens.rxit.ch.cda.Thumbnail)get_store().find_element_user(THUMBNAIL$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Thumbnail)get_store().add_element_user(THUMBNAIL$2);
            }
            target.set(thumbnail);
        }
    }
    
    /**
     * Appends and returns a new empty "thumbnail" element
     */
    public com.walgreens.rxit.ch.cda.Thumbnail addNewThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Thumbnail target = null;
            target = (com.walgreens.rxit.ch.cda.Thumbnail)get_store().add_element_user(THUMBNAIL$2);
            return target;
        }
    }
    
    /**
     * Unsets the "thumbnail" element
     */
    public void unsetThumbnail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THUMBNAIL$2, 0);
        }
    }
    
    /**
     * Gets the "mediaType" attribute
     */
    public java.lang.String getMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(MEDIATYPE$4);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "mediaType" attribute
     */
    public com.walgreens.rxit.ch.cda.Cs2 xgetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Cs2)get_default_attribute_value(MEDIATYPE$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "mediaType" attribute
     */
    public boolean isSetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(MEDIATYPE$4) != null;
        }
    }
    
    /**
     * Sets the "mediaType" attribute
     */
    public void setMediaType(java.lang.String mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(MEDIATYPE$4);
            }
            target.setStringValue(mediaType);
        }
    }
    
    /**
     * Sets (as xml) the "mediaType" attribute
     */
    public void xsetMediaType(com.walgreens.rxit.ch.cda.Cs2 mediaType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(MEDIATYPE$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Cs2)get_store().add_attribute_user(MEDIATYPE$4);
            }
            target.set(mediaType);
        }
    }
    
    /**
     * Unsets the "mediaType" attribute
     */
    public void unsetMediaType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(MEDIATYPE$4);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public com.walgreens.rxit.ch.cda.Cs2 xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(LANGUAGE$6);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$6) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(com.walgreens.rxit.ch.cda.Cs2 language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Cs2)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$6);
        }
    }
    
    /**
     * Gets the "compression" attribute
     */
    public com.walgreens.rxit.ch.cda.CompressionAlgorithm.Enum getCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.CompressionAlgorithm.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "compression" attribute
     */
    public com.walgreens.rxit.ch.cda.CompressionAlgorithm xgetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CompressionAlgorithm target = null;
            target = (com.walgreens.rxit.ch.cda.CompressionAlgorithm)get_store().find_attribute_user(COMPRESSION$8);
            return target;
        }
    }
    
    /**
     * True if has "compression" attribute
     */
    public boolean isSetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COMPRESSION$8) != null;
        }
    }
    
    /**
     * Sets the "compression" attribute
     */
    public void setCompression(com.walgreens.rxit.ch.cda.CompressionAlgorithm.Enum compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COMPRESSION$8);
            }
            target.setEnumValue(compression);
        }
    }
    
    /**
     * Sets (as xml) the "compression" attribute
     */
    public void xsetCompression(com.walgreens.rxit.ch.cda.CompressionAlgorithm compression)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CompressionAlgorithm target = null;
            target = (com.walgreens.rxit.ch.cda.CompressionAlgorithm)get_store().find_attribute_user(COMPRESSION$8);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CompressionAlgorithm)get_store().add_attribute_user(COMPRESSION$8);
            }
            target.set(compression);
        }
    }
    
    /**
     * Unsets the "compression" attribute
     */
    public void unsetCompression()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COMPRESSION$8);
        }
    }
    
    /**
     * Gets the "integrityCheck" attribute
     */
    public byte[] getIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                return null;
            }
            return target.getByteArrayValue();
        }
    }
    
    /**
     * Gets (as xml) the "integrityCheck" attribute
     */
    public com.walgreens.rxit.ch.cda.Bin2 xgetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bin2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bin2)get_store().find_attribute_user(INTEGRITYCHECK$10);
            return target;
        }
    }
    
    /**
     * True if has "integrityCheck" attribute
     */
    public boolean isSetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGRITYCHECK$10) != null;
        }
    }
    
    /**
     * Sets the "integrityCheck" attribute
     */
    public void setIntegrityCheck(byte[] integrityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGRITYCHECK$10);
            }
            target.setByteArrayValue(integrityCheck);
        }
    }
    
    /**
     * Sets (as xml) the "integrityCheck" attribute
     */
    public void xsetIntegrityCheck(com.walgreens.rxit.ch.cda.Bin2 integrityCheck)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bin2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bin2)get_store().find_attribute_user(INTEGRITYCHECK$10);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bin2)get_store().add_attribute_user(INTEGRITYCHECK$10);
            }
            target.set(integrityCheck);
        }
    }
    
    /**
     * Unsets the "integrityCheck" attribute
     */
    public void unsetIntegrityCheck()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGRITYCHECK$10);
        }
    }
    
    /**
     * Gets the "integrityCheckAlgorithm" attribute
     */
    public com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm.Enum getIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INTEGRITYCHECKALGORITHM$12);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "integrityCheckAlgorithm" attribute
     */
    public com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm xgetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm target = null;
            target = (com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm)get_default_attribute_value(INTEGRITYCHECKALGORITHM$12);
            }
            return target;
        }
    }
    
    /**
     * True if has "integrityCheckAlgorithm" attribute
     */
    public boolean isSetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12) != null;
        }
    }
    
    /**
     * Sets the "integrityCheckAlgorithm" attribute
     */
    public void setIntegrityCheckAlgorithm(com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm.Enum integrityCheckAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INTEGRITYCHECKALGORITHM$12);
            }
            target.setEnumValue(integrityCheckAlgorithm);
        }
    }
    
    /**
     * Sets (as xml) the "integrityCheckAlgorithm" attribute
     */
    public void xsetIntegrityCheckAlgorithm(com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm integrityCheckAlgorithm)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm target = null;
            target = (com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm)get_store().find_attribute_user(INTEGRITYCHECKALGORITHM$12);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IntegrityCheckAlgorithm)get_store().add_attribute_user(INTEGRITYCHECKALGORITHM$12);
            }
            target.set(integrityCheckAlgorithm);
        }
    }
    
    /**
     * Unsets the "integrityCheckAlgorithm" attribute
     */
    public void unsetIntegrityCheckAlgorithm()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INTEGRITYCHECKALGORITHM$12);
        }
    }
}
