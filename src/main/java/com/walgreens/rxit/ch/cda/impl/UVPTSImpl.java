/*
 * XML Type:  UVP_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.UVPTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML UVP_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class UVPTSImpl extends com.walgreens.rxit.ch.cda.impl.TSImpl implements com.walgreens.rxit.ch.cda.UVPTS
{
    private static final long serialVersionUID = 1L;
    
    public UVPTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PROBABILITY$0 = 
        new javax.xml.namespace.QName("", "probability");
    
    
    /**
     * Gets the "probability" attribute
     */
    public double getProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROBABILITY$0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "probability" attribute
     */
    public com.walgreens.rxit.ch.cda.Probability xgetProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Probability target = null;
            target = (com.walgreens.rxit.ch.cda.Probability)get_store().find_attribute_user(PROBABILITY$0);
            return target;
        }
    }
    
    /**
     * True if has "probability" attribute
     */
    public boolean isSetProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PROBABILITY$0) != null;
        }
    }
    
    /**
     * Sets the "probability" attribute
     */
    public void setProbability(double probability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PROBABILITY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PROBABILITY$0);
            }
            target.setDoubleValue(probability);
        }
    }
    
    /**
     * Sets (as xml) the "probability" attribute
     */
    public void xsetProbability(com.walgreens.rxit.ch.cda.Probability probability)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Probability target = null;
            target = (com.walgreens.rxit.ch.cda.Probability)get_store().find_attribute_user(PROBABILITY$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Probability)get_store().add_attribute_user(PROBABILITY$0);
            }
            target.set(probability);
        }
    }
    
    /**
     * Unsets the "probability" attribute
     */
    public void unsetProbability()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PROBABILITY$0);
        }
    }
}
