/*
 * XML Type:  PPD_TS
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.PPDTS
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML PPD_TS(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class PPDTSImpl extends com.walgreens.rxit.ch.cda.impl.TSImpl implements com.walgreens.rxit.ch.cda.PPDTS
{
    private static final long serialVersionUID = 1L;
    
    public PPDTSImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STANDARDDEVIATION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "standardDeviation");
    private static final javax.xml.namespace.QName DISTRIBUTIONTYPE$2 = 
        new javax.xml.namespace.QName("", "distributionType");
    
    
    /**
     * Gets the "standardDeviation" element
     */
    public com.walgreens.rxit.ch.cda.PQ getStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(STANDARDDEVIATION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "standardDeviation" element
     */
    public boolean isSetStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STANDARDDEVIATION$0) != 0;
        }
    }
    
    /**
     * Sets the "standardDeviation" element
     */
    public void setStandardDeviation(com.walgreens.rxit.ch.cda.PQ standardDeviation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().find_element_user(STANDARDDEVIATION$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(STANDARDDEVIATION$0);
            }
            target.set(standardDeviation);
        }
    }
    
    /**
     * Appends and returns a new empty "standardDeviation" element
     */
    public com.walgreens.rxit.ch.cda.PQ addNewStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.PQ target = null;
            target = (com.walgreens.rxit.ch.cda.PQ)get_store().add_element_user(STANDARDDEVIATION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "standardDeviation" element
     */
    public void unsetStandardDeviation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STANDARDDEVIATION$0, 0);
        }
    }
    
    /**
     * Gets the "distributionType" attribute
     */
    public com.walgreens.rxit.ch.cda.ProbabilityDistributionType.Enum getDistributionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTRIBUTIONTYPE$2);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.ProbabilityDistributionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "distributionType" attribute
     */
    public com.walgreens.rxit.ch.cda.ProbabilityDistributionType xgetDistributionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ProbabilityDistributionType target = null;
            target = (com.walgreens.rxit.ch.cda.ProbabilityDistributionType)get_store().find_attribute_user(DISTRIBUTIONTYPE$2);
            return target;
        }
    }
    
    /**
     * True if has "distributionType" attribute
     */
    public boolean isSetDistributionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISTRIBUTIONTYPE$2) != null;
        }
    }
    
    /**
     * Sets the "distributionType" attribute
     */
    public void setDistributionType(com.walgreens.rxit.ch.cda.ProbabilityDistributionType.Enum distributionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISTRIBUTIONTYPE$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISTRIBUTIONTYPE$2);
            }
            target.setEnumValue(distributionType);
        }
    }
    
    /**
     * Sets (as xml) the "distributionType" attribute
     */
    public void xsetDistributionType(com.walgreens.rxit.ch.cda.ProbabilityDistributionType distributionType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ProbabilityDistributionType target = null;
            target = (com.walgreens.rxit.ch.cda.ProbabilityDistributionType)get_store().find_attribute_user(DISTRIBUTIONTYPE$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ProbabilityDistributionType)get_store().add_attribute_user(DISTRIBUTIONTYPE$2);
            }
            target.set(distributionType);
        }
    }
    
    /**
     * Unsets the "distributionType" attribute
     */
    public void unsetDistributionType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISTRIBUTIONTYPE$2);
        }
    }
}
