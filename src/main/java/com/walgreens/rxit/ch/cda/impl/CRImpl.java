/*
 * XML Type:  CR
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CR
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML CR(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CRImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.CR
{
    private static final long serialVersionUID = 1L;
    
    public CRImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "value");
    private static final javax.xml.namespace.QName INVERTED$4 = 
        new javax.xml.namespace.QName("", "inverted");
    
    
    /**
     * Gets the "name" element
     */
    public com.walgreens.rxit.ch.cda.CV getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CV target = null;
            target = (com.walgreens.rxit.ch.cda.CV)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "name" element
     */
    public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$0) != 0;
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(com.walgreens.rxit.ch.cda.CV name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CV target = null;
            target = (com.walgreens.rxit.ch.cda.CV)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CV)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public com.walgreens.rxit.ch.cda.CV addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CV target = null;
            target = (com.walgreens.rxit.ch.cda.CV)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Unsets the "name" element
     */
    public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$0, 0);
        }
    }
    
    /**
     * Gets the "value" element
     */
    public com.walgreens.rxit.ch.cda.CD getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "value" element
     */
    public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$2) != 0;
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(com.walgreens.rxit.ch.cda.CD value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CD)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public com.walgreens.rxit.ch.cda.CD addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Unsets the "value" element
     */
    public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$2, 0);
        }
    }
    
    /**
     * Gets the "inverted" attribute
     */
    public boolean getInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INVERTED$4);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "inverted" attribute
     */
    public com.walgreens.rxit.ch.cda.Bn2 xgetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bn2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bn2)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bn2)get_default_attribute_value(INVERTED$4);
            }
            return target;
        }
    }
    
    /**
     * True if has "inverted" attribute
     */
    public boolean isSetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INVERTED$4) != null;
        }
    }
    
    /**
     * Sets the "inverted" attribute
     */
    public void setInverted(boolean inverted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INVERTED$4);
            }
            target.setBooleanValue(inverted);
        }
    }
    
    /**
     * Sets (as xml) the "inverted" attribute
     */
    public void xsetInverted(com.walgreens.rxit.ch.cda.Bn2 inverted)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bn2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bn2)get_store().find_attribute_user(INVERTED$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bn2)get_store().add_attribute_user(INVERTED$4);
            }
            target.set(inverted);
        }
    }
    
    /**
     * Unsets the "inverted" attribute
     */
    public void unsetInverted()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INVERTED$4);
        }
    }
}
