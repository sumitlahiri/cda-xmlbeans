/*
 * XML Type:  PIVL_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.PIVLTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML PIVL_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class PIVLTSImpl extends com.walgreens.rxit.ch.cda.impl.SXCMTSImpl implements com.walgreens.rxit.ch.cda.PIVLTS
{
    private static final long serialVersionUID = 1L;
    
    public PIVLTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PHASE$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "phase");
    private static final javax.xml.namespace.QName PERIOD$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "period");
    private static final javax.xml.namespace.QName ALIGNMENT$4 = 
        new javax.xml.namespace.QName("", "alignment");
    private static final javax.xml.namespace.QName INSTITUTIONSPECIFIED$6 = 
        new javax.xml.namespace.QName("", "institutionSpecified");
    
    
    /**
     * Gets the "phase" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(PHASE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "phase" element
     */
    public boolean isSetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PHASE$0) != 0;
        }
    }
    
    /**
     * Sets the "phase" element
     */
    public void setPhase(com.walgreens.rxit.ch.cda.IVLTS phase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(PHASE$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(PHASE$0);
            }
            target.set(phase);
        }
    }
    
    /**
     * Appends and returns a new empty "phase" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS addNewPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(PHASE$0);
            return target;
        }
    }
    
    /**
     * Unsets the "phase" element
     */
    public void unsetPhase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PHASE$0, 0);
        }
    }
    
    /**
     * Gets the "period" element
     */
    public com.walgreens.rxit.ch.cda.PQ getPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "period" element
     */
    public boolean isSetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PERIOD$2) != 0;
        }
    }
    
    /**
     * Sets the "period" element
     */
    public void setPeriod(com.walgreens.rxit.ch.cda.PQ period)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(PERIOD$2, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(PERIOD$2);
            }
            target.set(period);
        }
    }
    
    /**
     * Appends and returns a new empty "period" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(PERIOD$2);
            return target;
        }
    }
    
    /**
     * Unsets the "period" element
     */
    public void unsetPeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PERIOD$2, 0);
        }
    }
    
    /**
     * Gets the "alignment" attribute
     */
    public java.lang.String getAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "alignment" attribute
     */
    public com.walgreens.rxit.ch.cda.CalendarCycle xgetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CalendarCycle target = null;
            target = (com.walgreens.rxit.ch.cda.CalendarCycle)get_store().find_attribute_user(ALIGNMENT$4);
            return target;
        }
    }
    
    /**
     * True if has "alignment" attribute
     */
    public boolean isSetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ALIGNMENT$4) != null;
        }
    }
    
    /**
     * Sets the "alignment" attribute
     */
    public void setAlignment(java.lang.String alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.setStringValue(alignment);
        }
    }
    
    /**
     * Sets (as xml) the "alignment" attribute
     */
    public void xsetAlignment(com.walgreens.rxit.ch.cda.CalendarCycle alignment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CalendarCycle target = null;
            target = (com.walgreens.rxit.ch.cda.CalendarCycle)get_store().find_attribute_user(ALIGNMENT$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.CalendarCycle)get_store().add_attribute_user(ALIGNMENT$4);
            }
            target.set(alignment);
        }
    }
    
    /**
     * Unsets the "alignment" attribute
     */
    public void unsetAlignment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ALIGNMENT$4);
        }
    }
    
    /**
     * Gets the "institutionSpecified" attribute
     */
    public boolean getInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(INSTITUTIONSPECIFIED$6);
            }
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "institutionSpecified" attribute
     */
    public com.walgreens.rxit.ch.cda.Bl2 xgetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_default_attribute_value(INSTITUTIONSPECIFIED$6);
            }
            return target;
        }
    }
    
    /**
     * True if has "institutionSpecified" attribute
     */
    public boolean isSetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(INSTITUTIONSPECIFIED$6) != null;
        }
    }
    
    /**
     * Sets the "institutionSpecified" attribute
     */
    public void setInstitutionSpecified(boolean institutionSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(INSTITUTIONSPECIFIED$6);
            }
            target.setBooleanValue(institutionSpecified);
        }
    }
    
    /**
     * Sets (as xml) the "institutionSpecified" attribute
     */
    public void xsetInstitutionSpecified(com.walgreens.rxit.ch.cda.Bl2 institutionSpecified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(INSTITUTIONSPECIFIED$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_store().add_attribute_user(INSTITUTIONSPECIFIED$6);
            }
            target.set(institutionSpecified);
        }
    }
    
    /**
     * Unsets the "institutionSpecified" attribute
     */
    public void unsetInstitutionSpecified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(INSTITUTIONSPECIFIED$6);
        }
    }
}
