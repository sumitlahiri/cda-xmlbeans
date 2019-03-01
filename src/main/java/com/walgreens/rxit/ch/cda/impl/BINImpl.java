/*
 * XML Type:  BIN
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.BIN
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML BIN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class BINImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.BIN
{
    private static final long serialVersionUID = 1L;
    
    public BINImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REPRESENTATION$0 = 
        new javax.xml.namespace.QName("", "representation");
    
    
    /**
     * Gets the "representation" attribute
     */
    public com.walgreens.rxit.ch.cda.BinaryDataEncoding.Enum getRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(REPRESENTATION$0);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.BinaryDataEncoding.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "representation" attribute
     */
    public com.walgreens.rxit.ch.cda.BinaryDataEncoding xgetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BinaryDataEncoding target = null;
            target = (com.walgreens.rxit.ch.cda.BinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.BinaryDataEncoding)get_default_attribute_value(REPRESENTATION$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "representation" attribute
     */
    public boolean isSetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REPRESENTATION$0) != null;
        }
    }
    
    /**
     * Sets the "representation" attribute
     */
    public void setRepresentation(com.walgreens.rxit.ch.cda.BinaryDataEncoding.Enum representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REPRESENTATION$0);
            }
            target.setEnumValue(representation);
        }
    }
    
    /**
     * Sets (as xml) the "representation" attribute
     */
    public void xsetRepresentation(com.walgreens.rxit.ch.cda.BinaryDataEncoding representation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.BinaryDataEncoding target = null;
            target = (com.walgreens.rxit.ch.cda.BinaryDataEncoding)get_store().find_attribute_user(REPRESENTATION$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.BinaryDataEncoding)get_store().add_attribute_user(REPRESENTATION$0);
            }
            target.set(representation);
        }
    }
    
    /**
     * Unsets the "representation" attribute
     */
    public void unsetRepresentation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REPRESENTATION$0);
        }
    }
}
