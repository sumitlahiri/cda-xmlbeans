/*
 * XML Type:  IVL_PPD_PQ
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.IVLPPDPQ
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML IVL_PPD_PQ(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVLPPDPQImpl extends com.walgreens.rxit.ch.cda.impl.SXCMPPDPQImpl implements com.walgreens.rxit.ch.cda.IVLPPDPQ
{
    private static final long serialVersionUID = 1L;
    
    public IVLPPDPQImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LOW$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "low");
    private static final javax.xml.namespace.QName WIDTH$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "width");
    private static final javax.xml.namespace.QName HIGH$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "high");
    private static final javax.xml.namespace.QName CENTER$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "center");
    
    
    /**
     * Gets the "low" element
     */
    public com.walgreens.rxit.ch.cda.IVXBPPDPQ getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "low" element
     */
    public boolean isSetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LOW$0) != 0;
        }
    }
    
    /**
     * Sets the "low" element
     */
    public void setLow(com.walgreens.rxit.ch.cda.IVXBPPDPQ low)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().add_element_user(LOW$0);
            }
            target.set(low);
        }
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public com.walgreens.rxit.ch.cda.IVXBPPDPQ addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().add_element_user(LOW$0);
            return target;
        }
    }
    
    /**
     * Unsets the "low" element
     */
    public void unsetLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LOW$0, 0);
        }
    }
    
    /**
     * Gets the "width" element
     */
    public com.walgreens.rxit.ch.cda.PPDPQ getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().find_element_user(WIDTH$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "width" element
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(WIDTH$2) != 0;
        }
    }
    
    /**
     * Sets the "width" element
     */
    public void setWidth(com.walgreens.rxit.ch.cda.PPDPQ width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().find_element_user(WIDTH$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().add_element_user(WIDTH$2);
            }
            target.set(width);
        }
    }
    
    /**
     * Appends and returns a new empty "width" element
     */
    public com.walgreens.rxit.ch.cda.PPDPQ addNewWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().add_element_user(WIDTH$2);
            return target;
        }
    }
    
    /**
     * Unsets the "width" element
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(WIDTH$2, 0);
        }
    }
    
    /**
     * Gets the "high" element
     */
    public com.walgreens.rxit.ch.cda.IVXBPPDPQ getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().find_element_user(HIGH$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "high" element
     */
    public boolean isSetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HIGH$4) != 0;
        }
    }
    
    /**
     * Sets the "high" element
     */
    public void setHigh(com.walgreens.rxit.ch.cda.IVXBPPDPQ high)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().find_element_user(HIGH$4, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().add_element_user(HIGH$4);
            }
            target.set(high);
        }
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public com.walgreens.rxit.ch.cda.IVXBPPDPQ addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBPPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBPPDPQ)get_store().add_element_user(HIGH$4);
            return target;
        }
    }
    
    /**
     * Unsets the "high" element
     */
    public void unsetHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HIGH$4, 0);
        }
    }
    
    /**
     * Gets the "center" element
     */
    public com.walgreens.rxit.ch.cda.PPDPQ getCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().find_element_user(CENTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "center" element
     */
    public boolean isSetCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENTER$6) != 0;
        }
    }
    
    /**
     * Sets the "center" element
     */
    public void setCenter(com.walgreens.rxit.ch.cda.PPDPQ center)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().find_element_user(CENTER$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().add_element_user(CENTER$6);
            }
            target.set(center);
        }
    }
    
    /**
     * Appends and returns a new empty "center" element
     */
    public com.walgreens.rxit.ch.cda.PPDPQ addNewCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PPDPQ target = null;
            target = (com.walgreens.rxit.ch.cda.PPDPQ)get_store().add_element_user(CENTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "center" element
     */
    public void unsetCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENTER$6, 0);
        }
    }
}
