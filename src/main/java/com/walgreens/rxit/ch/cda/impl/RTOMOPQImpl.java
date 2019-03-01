/*
 * XML Type:  RTO_MO_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.RTOMOPQ
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML RTO_MO_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class RTOMOPQImpl extends com.walgreens.rxit.ch.cda.impl.QTYImpl implements com.walgreens.rxit.ch.cda.RTOMOPQ
{
    private static final long serialVersionUID = 1L;
    
    public RTOMOPQImpl(org.apache.xmlbeans.SchemaType sType)
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
    public com.walgreens.rxit.ch.cda.MO getNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.MO target = null;
            target = (com.walgreens.rxit.ch.cda.MO)get_store().find_element_user(NUMERATOR$0, 0);
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
    public void setNumerator(com.walgreens.rxit.ch.cda.MO numerator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.MO target = null;
            target = (com.walgreens.rxit.ch.cda.MO)get_store().find_element_user(NUMERATOR$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.MO)get_store().add_element_user(NUMERATOR$0);
            }
            target.set(numerator);
        }
    }
    
    /**
     * Appends and returns a new empty "numerator" element
     */
    public com.walgreens.rxit.ch.cda.MO addNewNumerator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.MO target = null;
            target = (com.walgreens.rxit.ch.cda.MO)get_store().add_element_user(NUMERATOR$0);
            return target;
        }
    }
    
    /**
     * Gets the "denominator" element
     */
    public com.walgreens.rxit.ch.cda.PQ getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(DENOMINATOR$2, 0);
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
    public void setDenominator(com.walgreens.rxit.ch.cda.PQ denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(DENOMINATOR$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(DENOMINATOR$2);
            }
            target.set(denominator);
        }
    }
    
    /**
     * Appends and returns a new empty "denominator" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(DENOMINATOR$2);
            return target;
        }
    }
}
