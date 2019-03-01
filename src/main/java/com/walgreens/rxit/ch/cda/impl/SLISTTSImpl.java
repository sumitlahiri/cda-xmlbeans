/*
 * XML Type:  SLIST_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.SLISTTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML SLIST_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SLISTTSImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.SLISTTS
{
    private static final long serialVersionUID = 1L;
    
    public SLISTTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGIN$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "origin");
    private static final javax.xml.namespace.QName SCALE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "scale");
    private static final javax.xml.namespace.QName DIGITS$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "digits");
    
    
    /**
     * Gets the "origin" element
     */
    public com.walgreens.rxit.ch.cda.TS getOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "origin" element
     */
    public void setOrigin(com.walgreens.rxit.ch.cda.TS origin)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().find_element_user(ORIGIN$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(ORIGIN$0);
            }
            target.set(origin);
        }
    }
    
    /**
     * Appends and returns a new empty "origin" element
     */
    public com.walgreens.rxit.ch.cda.TS addNewOrigin()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.TS target = null;
            target = (com.walgreens.rxit.ch.cda.TS)get_store().add_element_user(ORIGIN$0);
            return target;
        }
    }
    
    /**
     * Gets the "scale" element
     */
    public com.walgreens.rxit.ch.cda.PQ getScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(SCALE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "scale" element
     */
    public void setScale(com.walgreens.rxit.ch.cda.PQ scale)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(SCALE$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(SCALE$2);
            }
            target.set(scale);
        }
    }
    
    /**
     * Appends and returns a new empty "scale" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewScale()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(SCALE$2);
            return target;
        }
    }
    
    /**
     * Gets the "digits" element
     */
    public java.util.List getDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "digits" element
     */
    public com.walgreens.rxit.ch.cda.ListInt xgetDigits()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ListInt target = null;
            target = (com.walgreens.rxit.ch.cda.ListInt)get_store().find_element_user(DIGITS$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "digits" element
     */
    public void setDigits(java.util.List digits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DIGITS$4);
            }
            target.setListValue(digits);
        }
    }
    
    /**
     * Sets (as xml) the "digits" element
     */
    public void xsetDigits(com.walgreens.rxit.ch.cda.ListInt digits)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ListInt target = null;
            target = (com.walgreens.rxit.ch.cda.ListInt)get_store().find_element_user(DIGITS$4, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ListInt)get_store().add_element_user(DIGITS$4);
            }
            target.set(digits);
        }
    }
}
