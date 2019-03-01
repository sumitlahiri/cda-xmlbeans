/*
 * XML Type:  GLIST_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.GLISTPQ
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML GLIST_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class GLISTPQImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.GLISTPQ
{
    private static final long serialVersionUID = 1L;
    
    public GLISTPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName HEAD$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "head");
    private static final javax.xml.namespace.QName INCREMENT$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "increment");
    private static final javax.xml.namespace.QName PERIOD$4 = 
        new javax.xml.namespace.QName("", "period");
    private static final javax.xml.namespace.QName DENOMINATOR$6 = 
        new javax.xml.namespace.QName("", "denominator");
    
    
    /**
     * Gets the "head" element
     */
    public com.walgreens.rxit.ch.cda.PQ getHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "head" element
     */
    public void setHead(com.walgreens.rxit.ch.cda.PQ head)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(HEAD$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(HEAD$0);
            }
            target.set(head);
        }
    }
    
    /**
     * Appends and returns a new empty "head" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewHead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(HEAD$0);
            return target;
        }
    }
    
    /**
     * Gets the "increment" element
     */
    public com.walgreens.rxit.ch.cda.PQ getIncrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(INCREMENT$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "increment" element
     */
    public void setIncrement(com.walgreens.rxit.ch.cda.PQ increment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(INCREMENT$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(INCREMENT$2);
            }
            target.set(increment);
        }
    }
    
    /**
     * Appends and returns a new empty "increment" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewIncrement()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(INCREMENT$2);
            return target;
        }
    }
    
    /**
     * Gets the "period" attribute
     */
    public java.math.BigInteger getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "period" attribute
     */
    public com.walgreens.rxit.ch.cda.Int2 xgetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(PERIOD$4);
            return target;
        }
    }
    
    /**
     * True if has "period" attribute
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(PERIOD$4) != null;
        }
    }
    
    /**
     * Sets the "period" attribute
     */
    public void setPeriod(java.math.BigInteger period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(PERIOD$4);
            }
            target.setBigIntegerValue(period);
        }
    }
    
    /**
     * Sets (as xml) the "period" attribute
     */
    public void xsetPeriod(com.walgreens.rxit.ch.cda.Int2 period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(PERIOD$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Int2)get_store().add_attribute_user(PERIOD$4);
            }
            target.set(period);
        }
    }
    
    /**
     * Unsets the "period" attribute
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(PERIOD$4);
        }
    }
    
    /**
     * Gets the "denominator" attribute
     */
    public java.math.BigInteger getDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "denominator" attribute
     */
    public com.walgreens.rxit.ch.cda.Int2 xgetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(DENOMINATOR$6);
            return target;
        }
    }
    
    /**
     * True if has "denominator" attribute
     */
    public boolean isSetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DENOMINATOR$6) != null;
        }
    }
    
    /**
     * Sets the "denominator" attribute
     */
    public void setDenominator(java.math.BigInteger denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DENOMINATOR$6);
            }
            target.setBigIntegerValue(denominator);
        }
    }
    
    /**
     * Sets (as xml) the "denominator" attribute
     */
    public void xsetDenominator(com.walgreens.rxit.ch.cda.Int2 denominator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(DENOMINATOR$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Int2)get_store().add_attribute_user(DENOMINATOR$6);
            }
            target.set(denominator);
        }
    }
    
    /**
     * Unsets the "denominator" attribute
     */
    public void unsetDenominator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DENOMINATOR$6);
        }
    }
}
