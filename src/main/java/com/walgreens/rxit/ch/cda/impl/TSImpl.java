/*
 * XML Type:  TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.TS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class TSImpl extends com.walgreens.rxit.ch.cda.impl.QTYImpl implements com.walgreens.rxit.ch.cda.TS
{
    private static final long serialVersionUID = 1L;
    
    public TSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "value" attribute
     */
    public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "value" attribute
     */
    public com.walgreens.rxit.ch.cda.Ts2 xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Ts2 target = null;
            target = (com.walgreens.rxit.ch.cda.Ts2)get_store().find_attribute_user(VALUE$0);
            return target;
        }
    }
    
    /**
     * True if has "value" attribute
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(VALUE$0) != null;
        }
    }
    
    /**
     * Sets the "value" attribute
     */
    public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "value" attribute
     */
    public void xsetValue(com.walgreens.rxit.ch.cda.Ts2 value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Ts2 target = null;
            target = (com.walgreens.rxit.ch.cda.Ts2)get_store().find_attribute_user(VALUE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Ts2)get_store().add_attribute_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "value" attribute
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(VALUE$0);
        }
    }
}
