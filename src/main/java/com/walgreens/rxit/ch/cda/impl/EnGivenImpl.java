/*
 * XML Type:  en.given
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EnGiven
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML en.given(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EnGivenImpl extends com.walgreens.rxit.ch.cda.impl.ENXPImpl implements com.walgreens.rxit.ch.cda.EnGiven
{
    private static final long serialVersionUID = 1L;
    
    public EnGivenImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PARTTYPE$0 = 
        new javax.xml.namespace.QName("", "partType");
    
    
    /**
     * Gets the "partType" attribute
     */
    public java.lang.String getPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(PARTTYPE$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "partType" attribute
     */
    public com.walgreens.rxit.ch.cda.EntityNamePartType xgetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityNamePartType target = null;
            target = (com.walgreens.rxit.ch.cda.EntityNamePartType)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityNamePartType)get_default_attribute_value(PARTTYPE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "partType" attribute
     */
    public boolean isSetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PARTTYPE$0) != null;
        }
    }
    
    /**
     * Sets the "partType" attribute
     */
    public void setPartType(java.lang.String partType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PARTTYPE$0);
            }
            target.setStringValue(partType);
        }
    }
    
    /**
     * Sets (as xml) the "partType" attribute
     */
    public void xsetPartType(com.walgreens.rxit.ch.cda.EntityNamePartType partType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EntityNamePartType target = null;
            target = (com.walgreens.rxit.ch.cda.EntityNamePartType)get_store().find_attribute_user(PARTTYPE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EntityNamePartType)get_store().add_attribute_user(PARTTYPE$0);
            }
            target.set(partType);
        }
    }
    
    /**
     * Unsets the "partType" attribute
     */
    public void unsetPartType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PARTTYPE$0);
        }
    }
}
