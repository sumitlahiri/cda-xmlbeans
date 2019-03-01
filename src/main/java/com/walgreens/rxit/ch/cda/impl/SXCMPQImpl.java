/*
 * XML Type:  SXCM_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.SXCMPQ
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML SXCM_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SXCMPQImpl extends com.walgreens.rxit.ch.cda.impl.PQImpl implements com.walgreens.rxit.ch.cda.SXCMPQ
{
    private static final long serialVersionUID = 1L;
    
    public SXCMPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPERATOR$0 = 
        new javax.xml.namespace.QName("", "operator");
    
    
    /**
     * Gets the "operator" attribute
     */
    public com.walgreens.rxit.ch.cda.SetOperator.Enum getOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(OPERATOR$0);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.SetOperator.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "operator" attribute
     */
    public com.walgreens.rxit.ch.cda.SetOperator xgetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetOperator target = null;
            target = (com.walgreens.rxit.ch.cda.SetOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.SetOperator)get_default_attribute_value(OPERATOR$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "operator" attribute
     */
    public boolean isSetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(OPERATOR$0) != null;
        }
    }
    
    /**
     * Sets the "operator" attribute
     */
    public void setOperator(com.walgreens.rxit.ch.cda.SetOperator.Enum operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(OPERATOR$0);
            }
            target.setEnumValue(operator);
        }
    }
    
    /**
     * Sets (as xml) the "operator" attribute
     */
    public void xsetOperator(com.walgreens.rxit.ch.cda.SetOperator operator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetOperator target = null;
            target = (com.walgreens.rxit.ch.cda.SetOperator)get_store().find_attribute_user(OPERATOR$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.SetOperator)get_store().add_attribute_user(OPERATOR$0);
            }
            target.set(operator);
        }
    }
    
    /**
     * Unsets the "operator" attribute
     */
    public void unsetOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(OPERATOR$0);
        }
    }
}
