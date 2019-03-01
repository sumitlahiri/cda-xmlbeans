/*
 * XML Type:  II
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.II
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML II(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class IIImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.II
{
    private static final long serialVersionUID = 1L;
    
    public IIImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ROOT$0 = 
        new javax.xml.namespace.QName("", "root");
    private static final javax.xml.namespace.QName EXTENSION$2 = 
        new javax.xml.namespace.QName("", "extension");
    private static final javax.xml.namespace.QName ASSIGNINGAUTHORITYNAME$4 = 
        new javax.xml.namespace.QName("", "assigningAuthorityName");
    private static final javax.xml.namespace.QName DISPLAYABLE$6 = 
        new javax.xml.namespace.QName("", "displayable");
    
    
    /**
     * Gets the "root" attribute
     */
    public java.lang.String getRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "root" attribute
     */
    public com.walgreens.rxit.ch.cda.Uid xgetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Uid target = null;
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(ROOT$0);
            return target;
        }
    }
    
    /**
     * True if has "root" attribute
     */
    public boolean isSetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ROOT$0) != null;
        }
    }
    
    /**
     * Sets the "root" attribute
     */
    public void setRoot(java.lang.String root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ROOT$0);
            }
            target.setStringValue(root);
        }
    }
    
    /**
     * Sets (as xml) the "root" attribute
     */
    public void xsetRoot(com.walgreens.rxit.ch.cda.Uid root)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Uid target = null;
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(ROOT$0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Uid)get_store().add_attribute_user(ROOT$0);
            }
            target.set(root);
        }
    }
    
    /**
     * Unsets the "root" attribute
     */
    public void unsetRoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ROOT$0);
        }
    }
    
    /**
     * Gets the "extension" attribute
     */
    public java.lang.String getExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "extension" attribute
     */
    public com.walgreens.rxit.ch.cda.St2 xgetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(EXTENSION$2);
            return target;
        }
    }
    
    /**
     * True if has "extension" attribute
     */
    public boolean isSetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(EXTENSION$2) != null;
        }
    }
    
    /**
     * Sets the "extension" attribute
     */
    public void setExtension(java.lang.String extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(EXTENSION$2);
            }
            target.setStringValue(extension);
        }
    }
    
    /**
     * Sets (as xml) the "extension" attribute
     */
    public void xsetExtension(com.walgreens.rxit.ch.cda.St2 extension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(EXTENSION$2);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(EXTENSION$2);
            }
            target.set(extension);
        }
    }
    
    /**
     * Unsets the "extension" attribute
     */
    public void unsetExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(EXTENSION$2);
        }
    }
    
    /**
     * Gets the "assigningAuthorityName" attribute
     */
    public java.lang.String getAssigningAuthorityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "assigningAuthorityName" attribute
     */
    public com.walgreens.rxit.ch.cda.St2 xgetAssigningAuthorityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            return target;
        }
    }
    
    /**
     * True if has "assigningAuthorityName" attribute
     */
    public boolean isSetAssigningAuthorityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ASSIGNINGAUTHORITYNAME$4) != null;
        }
    }
    
    /**
     * Sets the "assigningAuthorityName" attribute
     */
    public void setAssigningAuthorityName(java.lang.String assigningAuthorityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            }
            target.setStringValue(assigningAuthorityName);
        }
    }
    
    /**
     * Sets (as xml) the "assigningAuthorityName" attribute
     */
    public void xsetAssigningAuthorityName(com.walgreens.rxit.ch.cda.St2 assigningAuthorityName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.St2 target = null;
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(ASSIGNINGAUTHORITYNAME$4);
            }
            target.set(assigningAuthorityName);
        }
    }
    
    /**
     * Unsets the "assigningAuthorityName" attribute
     */
    public void unsetAssigningAuthorityName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ASSIGNINGAUTHORITYNAME$4);
        }
    }
    
    /**
     * Gets the "displayable" attribute
     */
    public boolean getDisplayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYABLE$6);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayable" attribute
     */
    public com.walgreens.rxit.ch.cda.Bl2 xgetDisplayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(DISPLAYABLE$6);
            return target;
        }
    }
    
    /**
     * True if has "displayable" attribute
     */
    public boolean isSetDisplayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYABLE$6) != null;
        }
    }
    
    /**
     * Sets the "displayable" attribute
     */
    public void setDisplayable(boolean displayable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYABLE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYABLE$6);
            }
            target.setBooleanValue(displayable);
        }
    }
    
    /**
     * Sets (as xml) the "displayable" attribute
     */
    public void xsetDisplayable(com.walgreens.rxit.ch.cda.Bl2 displayable)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(DISPLAYABLE$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_store().add_attribute_user(DISPLAYABLE$6);
            }
            target.set(displayable);
        }
    }
    
    /**
     * Unsets the "displayable" attribute
     */
    public void unsetDisplayable()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYABLE$6);
        }
    }
}
