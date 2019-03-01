/*
 * XML Type:  BXIT_CD
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.BXITCD
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML BXIT_CD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class BXITCDImpl extends com.walgreens.rxit.ch.cda.impl.CDImpl implements com.walgreens.rxit.ch.cda.BXITCD
{
    private static final long serialVersionUID = 1L;
    
    public BXITCDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName QTY$0 = 
        new javax.xml.namespace.QName("", "qty");
    
    
    /**
     * Gets the "qty" attribute
     */
    public java.math.BigInteger getQty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QTY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(QTY$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getBigIntegerValue();
        }
    }
    
    /**
     * Gets (as xml) the "qty" attribute
     */
    public com.walgreens.rxit.ch.cda.Int2 xgetQty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(QTY$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Int2)get_default_attribute_value(QTY$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "qty" attribute
     */
    public boolean isSetQty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(QTY$0) != null;
        }
    }
    
    /**
     * Sets the "qty" attribute
     */
    public void setQty(java.math.BigInteger qty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(QTY$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(QTY$0);
            }
            target.setBigIntegerValue(qty);
        }
    }
    
    /**
     * Sets (as xml) the "qty" attribute
     */
    public void xsetQty(com.walgreens.rxit.ch.cda.Int2 qty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Int2 target = null;
            target = (com.walgreens.rxit.ch.cda.Int2)get_store().find_attribute_user(QTY$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Int2)get_store().add_attribute_user(QTY$0);
            }
            target.set(qty);
        }
    }
    
    /**
     * Unsets the "qty" attribute
     */
    public void unsetQty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(QTY$0);
        }
    }
}
