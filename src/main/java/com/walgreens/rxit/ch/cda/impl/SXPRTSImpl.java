/*
 * XML Type:  SXPR_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.SXPRTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML SXPR_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SXPRTSImpl extends com.walgreens.rxit.ch.cda.impl.SXCMTSImpl implements com.walgreens.rxit.ch.cda.SXPRTS
{
    private static final long serialVersionUID = 1L;
    
    public SXPRTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMP$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "comp");
    
    
    /**
     * Gets array of all "comp" elements
     */
    public com.walgreens.rxit.ch.cda.SXCMTS[] getCompArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COMP$0, targetList);
            com.walgreens.rxit.ch.cda.SXCMTS[] result = new com.walgreens.rxit.ch.cda.SXCMTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "comp" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS getCompArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(COMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "comp" element
     */
    public int sizeOfCompArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMP$0);
        }
    }
    
    /**
     * Sets array of all "comp" element
     */
    public void setCompArray(com.walgreens.rxit.ch.cda.SXCMTS[] compArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(compArray, COMP$0);
        }
    }
    
    /**
     * Sets ith "comp" element
     */
    public void setCompArray(int i, com.walgreens.rxit.ch.cda.SXCMTS comp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(COMP$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comp);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "comp" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS insertNewComp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().insert_element_user(COMP$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "comp" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS addNewComp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().add_element_user(COMP$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "comp" element
     */
    public void removeComp(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMP$0, i);
        }
    }
}
