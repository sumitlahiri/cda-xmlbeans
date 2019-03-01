/*
 * XML Type:  IVL_REAL
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.IVLREAL
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML IVL_REAL(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IVLREALImpl extends com.walgreens.rxit.ch.cda.impl.SXCMREALImpl implements com.walgreens.rxit.ch.cda.IVLREAL
{
    private static final long serialVersionUID = 1L;
    
    public IVLREALImpl(org.apache.xmlbeans.SchemaType sType)
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
    public com.walgreens.rxit.ch.cda.IVXBREAL getLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().find_element_user(LOW$0, 0);
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
    public void setLow(com.walgreens.rxit.ch.cda.IVXBREAL low)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().find_element_user(LOW$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().add_element_user(LOW$0);
            }
            target.set(low);
        }
    }
    
    /**
     * Appends and returns a new empty "low" element
     */
    public com.walgreens.rxit.ch.cda.IVXBREAL addNewLow()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().add_element_user(LOW$0);
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
    public com.walgreens.rxit.ch.cda.REAL getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().find_element_user(WIDTH$2, 0);
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
    public void setWidth(com.walgreens.rxit.ch.cda.REAL width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().find_element_user(WIDTH$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.REAL)get_store().add_element_user(WIDTH$2);
            }
            target.set(width);
        }
    }
    
    /**
     * Appends and returns a new empty "width" element
     */
    public com.walgreens.rxit.ch.cda.REAL addNewWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().add_element_user(WIDTH$2);
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
    public com.walgreens.rxit.ch.cda.IVXBREAL getHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().find_element_user(HIGH$4, 0);
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
    public void setHigh(com.walgreens.rxit.ch.cda.IVXBREAL high)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().find_element_user(HIGH$4, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().add_element_user(HIGH$4);
            }
            target.set(high);
        }
    }
    
    /**
     * Appends and returns a new empty "high" element
     */
    public com.walgreens.rxit.ch.cda.IVXBREAL addNewHigh()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVXBREAL target = null;
            target = (com.walgreens.rxit.ch.cda.IVXBREAL)get_store().add_element_user(HIGH$4);
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
    public com.walgreens.rxit.ch.cda.REAL getCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().find_element_user(CENTER$6, 0);
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
    public void setCenter(com.walgreens.rxit.ch.cda.REAL center)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().find_element_user(CENTER$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.REAL)get_store().add_element_user(CENTER$6);
            }
            target.set(center);
        }
    }
    
    /**
     * Appends and returns a new empty "center" element
     */
    public com.walgreens.rxit.ch.cda.REAL addNewCenter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.REAL target = null;
            target = (com.walgreens.rxit.ch.cda.REAL)get_store().add_element_user(CENTER$6);
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
