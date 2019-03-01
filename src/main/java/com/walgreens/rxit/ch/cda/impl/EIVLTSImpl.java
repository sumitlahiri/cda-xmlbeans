/*
 * XML Type:  EIVL_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EIVLTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EIVL_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EIVLTSImpl extends com.walgreens.rxit.ch.cda.impl.SXCMTSImpl implements com.walgreens.rxit.ch.cda.EIVLTS
{
    private static final long serialVersionUID = 1L;
    
    public EIVLTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EVENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "event");
    private static final javax.xml.namespace.QName OFFSET$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "offset");
    
    
    /**
     * Gets the "event" element
     */
    public com.walgreens.rxit.ch.cda.EIVLEvent getEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EIVLEvent target = null;
            target = (com.walgreens.rxit.ch.cda.EIVLEvent)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "event" element
     */
    public boolean isSetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENT$0) != 0;
        }
    }
    
    /**
     * Sets the "event" element
     */
    public void setEvent(com.walgreens.rxit.ch.cda.EIVLEvent event)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EIVLEvent target = null;
            target = (com.walgreens.rxit.ch.cda.EIVLEvent)get_store().find_element_user(EVENT$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.EIVLEvent)get_store().add_element_user(EVENT$0);
            }
            target.set(event);
        }
    }
    
    /**
     * Appends and returns a new empty "event" element
     */
    public com.walgreens.rxit.ch.cda.EIVLEvent addNewEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EIVLEvent target = null;
            target = (com.walgreens.rxit.ch.cda.EIVLEvent)get_store().add_element_user(EVENT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "event" element
     */
    public void unsetEvent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENT$0, 0);
        }
    }
    
    /**
     * Gets the "offset" element
     */
    public com.walgreens.rxit.ch.cda.IVLPQ getOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVLPQ)get_store().find_element_user(OFFSET$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "offset" element
     */
    public boolean isSetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OFFSET$2) != 0;
        }
    }
    
    /**
     * Sets the "offset" element
     */
    public void setOffset(com.walgreens.rxit.ch.cda.IVLPQ offset)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVLPQ)get_store().find_element_user(OFFSET$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLPQ)get_store().add_element_user(OFFSET$2);
            }
            target.set(offset);
        }
    }
    
    /**
     * Appends and returns a new empty "offset" element
     */
    public com.walgreens.rxit.ch.cda.IVLPQ addNewOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVLPQ)get_store().add_element_user(OFFSET$2);
            return target;
        }
    }
    
    /**
     * Unsets the "offset" element
     */
    public void unsetOffset()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OFFSET$2, 0);
        }
    }
}
