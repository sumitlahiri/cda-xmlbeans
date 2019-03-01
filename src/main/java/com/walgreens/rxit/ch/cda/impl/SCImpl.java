/*
 * XML Type:  SC
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.SC
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML SC(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class SCImpl extends com.walgreens.rxit.ch.cda.impl.STImpl implements com.walgreens.rxit.ch.cda.SC
{
    private static final long serialVersionUID = 1L;
    
    public SCImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CODE$0 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName CODESYSTEM$2 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName CODESYSTEMNAME$4 = 
        new javax.xml.namespace.QName("", "codeSystemName");
    private static final javax.xml.namespace.QName CODESYSTEMVERSION$6 = 
        new javax.xml.namespace.QName("", "codeSystemVersion");
    private static final javax.xml.namespace.QName DISPLAYNAME$8 = 
        new javax.xml.namespace.QName("", "displayName");
    
    
    /**
     * Gets the "code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "code" attribute
     */
    public com.walgreens.rxit.ch.cda.Cs2 xgetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(CODE$0);
            return target;
        }
    }
    
    /**
     * True if has "code" attribute
     */
    public boolean isSetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODE$0) != null;
        }
    }
    
    /**
     * Sets the "code" attribute
     */
    public void setCode(java.lang.String code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$0);
            }
            target.setStringValue(code);
        }
    }
    
    /**
     * Sets (as xml) the "code" attribute
     */
    public void xsetCode(com.walgreens.rxit.ch.cda.Cs2 code)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Cs2 target = null;
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(CODE$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Cs2)get_store().add_attribute_user(CODE$0);
            }
            target.set(code);
        }
    }
    
    /**
     * Unsets the "code" attribute
     */
    public void unsetCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODE$0);
        }
    }
    
    /**
     * Gets the "codeSystem" attribute
     */
    public java.lang.String getCodeSystem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
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
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$2);
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
            return get_store().find_attribute_user(CODESYSTEM$2) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$2);
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
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Uid)get_store().add_attribute_user(CODESYSTEM$2);
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
            get_store().remove_attribute(CODESYSTEM$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$4);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$4);
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
            return get_store().find_attribute_user(CODESYSTEMNAME$4) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMNAME$4);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(CODESYSTEMNAME$4);
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
            get_store().remove_attribute(CODESYSTEMNAME$4);
        }
    }
    
    /**
     * Gets the "codeSystemVersion" attribute
     */
    public java.lang.String getCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "codeSystemVersion" attribute
     */
    public com.walgreens.rxit.ch.cda.St2 xgetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMVERSION$6);
            return target;
        }
    }
    
    /**
     * True if has "codeSystemVersion" attribute
     */
    public boolean isSetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CODESYSTEMVERSION$6) != null;
        }
    }
    
    /**
     * Sets the "codeSystemVersion" attribute
     */
    public void setCodeSystemVersion(java.lang.String codeSystemVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMVERSION$6);
            }
            target.setStringValue(codeSystemVersion);
        }
    }
    
    /**
     * Sets (as xml) the "codeSystemVersion" attribute
     */
    public void xsetCodeSystemVersion(com.walgreens.rxit.ch.cda.St2 codeSystemVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMVERSION$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(CODESYSTEMVERSION$6);
            }
            target.set(codeSystemVersion);
        }
    }
    
    /**
     * Unsets the "codeSystemVersion" attribute
     */
    public void unsetCodeSystemVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CODESYSTEMVERSION$6);
        }
    }
    
    /**
     * Gets the "displayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$8);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    public com.walgreens.rxit.ch.cda.St2 xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(DISPLAYNAME$8);
            return target;
        }
    }
    
    /**
     * True if has "displayName" attribute
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYNAME$8) != null;
        }
    }
    
    /**
     * Sets the "displayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$8);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    public void xsetDisplayName(com.walgreens.rxit.ch.cda.St2 displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(DISPLAYNAME$8);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(DISPLAYNAME$8);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "displayName" attribute
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYNAME$8);
        }
    }
}
