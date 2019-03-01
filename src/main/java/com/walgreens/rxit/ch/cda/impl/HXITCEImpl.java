/*
 * XML Type:  HXIT_CE
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.HXITCE
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML HXIT_CE(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class HXITCEImpl extends com.walgreens.rxit.ch.cda.impl.CEImpl implements com.walgreens.rxit.ch.cda.HXITCE
{
    private static final long serialVersionUID = 1L;
    
    public HXITCEImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALIDTIME$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "validTime");
    
    
    /**
     * Gets the "validTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validTime" element
     */
    public boolean isSetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTIME$0) != 0;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    public void setValidTime(com.walgreens.rxit.ch.cda.IVLTS validTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(VALIDTIME$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(VALIDTIME$0);
            }
            target.set(validTime);
        }
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(VALIDTIME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "validTime" element
     */
    public void unsetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTIME$0, 0);
        }
    }
}
