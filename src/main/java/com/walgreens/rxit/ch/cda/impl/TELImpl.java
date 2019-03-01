/*
 * XML Type:  TEL
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.TEL
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML TEL(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class TELImpl extends com.walgreens.rxit.ch.cda.impl.URLImpl implements com.walgreens.rxit.ch.cda.TEL
{
    private static final long serialVersionUID = 1L;
    
    public TELImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName USEABLEPERIOD$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "useablePeriod");
    private static final javax.xml.namespace.QName USE$2 = 
        new javax.xml.namespace.QName("", "use");
    
    
    /**
     * Gets array of all "useablePeriod" elements
     */
    public com.walgreens.rxit.ch.cda.SXCMTS[] getUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEABLEPERIOD$0, targetList);
            com.walgreens.rxit.ch.cda.SXCMTS[] result = new com.walgreens.rxit.ch.cda.SXCMTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS getUseablePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(USEABLEPERIOD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useablePeriod" element
     */
    public int sizeOfUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEABLEPERIOD$0);
        }
    }
    
    /**
     * Sets array of all "useablePeriod" element
     */
    public void setUseablePeriodArray(com.walgreens.rxit.ch.cda.SXCMTS[] useablePeriodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(useablePeriodArray, USEABLEPERIOD$0);
        }
    }
    
    /**
     * Sets ith "useablePeriod" element
     */
    public void setUseablePeriodArray(int i, com.walgreens.rxit.ch.cda.SXCMTS useablePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(USEABLEPERIOD$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(useablePeriod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS insertNewUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().insert_element_user(USEABLEPERIOD$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS addNewUseablePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().add_element_user(USEABLEPERIOD$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "useablePeriod" element
     */
    public void removeUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEABLEPERIOD$0, i);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public java.util.List getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse)get_store().find_attribute_user(USE$2);
            return target;
        }
    }
    
    /**
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$2) != null;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(java.util.List use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$2);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse)get_store().find_attribute_user(USE$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.SetTelecommunicationAddressUse)get_store().add_attribute_user(USE$2);
            }
            target.set(use);
        }
    }
    
    /**
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$2);
        }
    }
}
