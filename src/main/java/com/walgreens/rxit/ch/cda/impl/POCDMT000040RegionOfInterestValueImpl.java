/*
 * XML Type:  POCD_MT000040.RegionOfInterest.value
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterestValue
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML POCD_MT000040.RegionOfInterest.value(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class POCDMT000040RegionOfInterestValueImpl extends com.walgreens.rxit.ch.cda.impl.INTImpl implements com.walgreens.rxit.ch.cda.POCDMT000040RegionOfInterestValue
{
    private static final long serialVersionUID = 1L;
    
    public POCDMT000040RegionOfInterestValueImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName UNSORTED$0 = 
        new javax.xml.namespace.QName("", "unsorted");
    
    
    /**
     * Gets the "unsorted" attribute
     */
    public boolean getUnsorted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNSORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(UNSORTED$0);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "unsorted" attribute
     */
    public org.apache.xmlbeans.XmlBoolean xgetUnsorted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNSORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_default_attribute_value(UNSORTED$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "unsorted" attribute
     */
    public boolean isSetUnsorted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(UNSORTED$0) != null;
        }
    }
    
    /**
     * Sets the "unsorted" attribute
     */
    public void setUnsorted(boolean unsorted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(UNSORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(UNSORTED$0);
            }
            target.setBooleanValue(unsorted);
        }
    }
    
    /**
     * Sets (as xml) the "unsorted" attribute
     */
    public void xsetUnsorted(org.apache.xmlbeans.XmlBoolean unsorted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_attribute_user(UNSORTED$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_attribute_user(UNSORTED$0);
            }
            target.set(unsorted);
        }
    }
    
    /**
     * Unsets the "unsorted" attribute
     */
    public void unsetUnsorted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(UNSORTED$0);
        }
    }
}
