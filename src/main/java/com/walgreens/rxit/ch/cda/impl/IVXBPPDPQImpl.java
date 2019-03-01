/*
 * XML Type:  IVXB_PPD_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.IVXBPPDPQ
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML IVXB_PPD_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVXBPPDPQImpl extends com.walgreens.rxit.ch.cda.impl.PPDPQImpl implements com.walgreens.rxit.ch.cda.IVXBPPDPQ
{
    private static final long serialVersionUID = 1L;
    
    public IVXBPPDPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName INCLUSIVE$0 = 
        new javax.xml.namespace.QName("", "inclusive");
    
    
    /**
     * Gets the "inclusive" attribute
     */
    public boolean getInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INCLUSIVE$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "inclusive" attribute
     */
    public com.walgreens.rxit.ch.cda.Bl2 xgetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_default_attribute_value(INCLUSIVE$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "inclusive" attribute
     */
    public boolean isSetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INCLUSIVE$0) != null;
        }
    }
    
    /**
     * Sets the "inclusive" attribute
     */
    public void setInclusive(boolean inclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INCLUSIVE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INCLUSIVE$0);
            }
            target.setBooleanValue(inclusive);
        }
    }
    
    /**
     * Sets (as xml) the "inclusive" attribute
     */
    public void xsetInclusive(com.walgreens.rxit.ch.cda.Bl2 inclusive)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(INCLUSIVE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_store().add_attribute_user(INCLUSIVE$0);
            }
            target.set(inclusive);
        }
    }
    
    /**
     * Unsets the "inclusive" attribute
     */
    public void unsetInclusive()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INCLUSIVE$0);
        }
    }
}
