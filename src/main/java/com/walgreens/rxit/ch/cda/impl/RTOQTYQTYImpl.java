/*
 * XML Type:  RTO_QTY_QTY
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RTOQTYQTY
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RTO_QTY_QTY(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class RTOQTYQTYImpl extends com.walgreens.rxit.ch.cda.impl.QTYImpl implements com.walgreens.rxit.ch.cda.RTOQTYQTY
{
    private static final long serialVersionUID = 1L;
    
    public RTOQTYQTYImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMERATOR$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "numerator");
    private static final javax.xml.namespace.QName DENOMINATOR$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "denominator");
    
    
    /**
     * Gets the "numerator" element
     */
    public com.walgreens.rxit.ch.cda.QTY getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "numerator" element
     */
    public void setNumerator(com.walgreens.rxit.ch.cda.QTY numerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.QTY)get_store().add_element_user(NUMERATOR$0);
            }
            target.set(numerator);
        }
    }
    
    /**
     * Appends and returns a new empty "numerator" element
     */
    public com.walgreens.rxit.ch.cda.QTY addNewNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().add_element_user(NUMERATOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "denominator" element
     */
    public com.walgreens.rxit.ch.cda.QTY getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().find_element_user(DENOMINATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "denominator" element
     */
    public void setDenominator(com.walgreens.rxit.ch.cda.QTY denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().find_element_user(DENOMINATOR$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.QTY)get_store().add_element_user(DENOMINATOR$2);
            }
            target.set(denominator);
        }
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public com.walgreens.rxit.ch.cda.QTY addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.QTY target = null;
            target = (com.walgreens.rxit.ch.cda.QTY)get_store().add_element_user(DENOMINATOR$2);
            return target;
        }
    }
}
