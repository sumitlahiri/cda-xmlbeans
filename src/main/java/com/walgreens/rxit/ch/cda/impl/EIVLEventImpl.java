/*
 * XML Type:  EIVL.event
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EIVLEvent
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EIVL.event(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class EIVLEventImpl extends com.walgreens.rxit.ch.cda.impl.CEImpl implements com.walgreens.rxit.ch.cda.EIVLEvent
{
    private static final long serialVersionUID = 1L;
    
    public EIVLEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODESYSTEM$0 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName CODESYSTEMNAME$2 = 
        new javax.xml.namespace.QName("", "codeSystemName");
    
    
    /**
     * Gets the "codeSystem" attribute
     */
    public java.lang.String getCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODESYSTEM$0);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystem" attribute
     */
    public com.walgreens.rxit.ch.cda.Uid xgetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Uid target = null;
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Uid)get_default_attribute_value(CODESYSTEM$0);
            }
            return target;
        }
    }
    
    /**
     * True if has "codeSystem" attribute
     */
    public boolean isSetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEM$0) != null;
        }
    }
    
    /**
     * Sets the "codeSystem" attribute
     */
    public void setCodeSystem(java.lang.String codeSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$0);
            }
            target.setStringValue(codeSystem);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystem" attribute
     */
    public void xsetCodeSystem(com.walgreens.rxit.ch.cda.Uid codeSystem)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Uid target = null;
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Uid)get_store().add_attribute_user(CODESYSTEM$0);
            }
            target.set(codeSystem);
        }
    }
    
    /**
     * Unsets the "codeSystem" attribute
     */
    public void unsetCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEM$0);
        }
    }
    
    /**
     * Gets the "codeSystemName" attribute
     */
    public java.lang.String getCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(CODESYSTEMNAME$2);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystemName" attribute
     */
    public com.walgreens.rxit.ch.cda.St2 xgetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_default_attribute_value(CODESYSTEMNAME$2);
            }
            return target;
        }
    }
    
    /**
     * True if has "codeSystemName" attribute
     */
    public boolean isSetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEMNAME$2) != null;
        }
    }
    
    /**
     * Sets the "codeSystemName" attribute
     */
    public void setCodeSystemName(java.lang.String codeSystemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMNAME$2);
            }
            target.setStringValue(codeSystemName);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystemName" attribute
     */
    public void xsetCodeSystemName(com.walgreens.rxit.ch.cda.St2 codeSystemName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(CODESYSTEMNAME$2);
            }
            target.set(codeSystemName);
        }
    }
    
    /**
     * Unsets the "codeSystemName" attribute
     */
    public void unsetCodeSystemName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEMNAME$2);
        }
    }
}
