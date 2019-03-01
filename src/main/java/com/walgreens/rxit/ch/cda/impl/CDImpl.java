/*
 * XML Type:  CD
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CD
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML CD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class CDImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.CD
{
    private static final long serialVersionUID = 1L;
    
    public CDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORIGINALTEXT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "originalText");
    private static final javax.xml.namespace.QName QUALIFIER$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "qualifier");
    private static final javax.xml.namespace.QName TRANSLATION$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "translation");
    private static final javax.xml.namespace.QName CODE$6 = 
        new javax.xml.namespace.QName("", "code");
    private static final javax.xml.namespace.QName CODESYSTEM$8 = 
        new javax.xml.namespace.QName("", "codeSystem");
    private static final javax.xml.namespace.QName CODESYSTEMNAME$10 = 
        new javax.xml.namespace.QName("", "codeSystemName");
    private static final javax.xml.namespace.QName CODESYSTEMVERSION$12 = 
        new javax.xml.namespace.QName("", "codeSystemVersion");
    private static final javax.xml.namespace.QName DISPLAYNAME$14 = 
        new javax.xml.namespace.QName("", "displayName");
    
    
    /**
     * Gets the "originalText" element
     */
    public com.walgreens.rxit.ch.cda.ED getOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().find_element_user(ORIGINALTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "originalText" element
     */
    public boolean isSetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ORIGINALTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "originalText" element
     */
    public void setOriginalText(com.walgreens.rxit.ch.cda.ED originalText)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().find_element_user(ORIGINALTEXT$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.ED)get_store().add_element_user(ORIGINALTEXT$0);
            }
            target.set(originalText);
        }
    }
    
    /**
     * Appends and returns a new empty "originalText" element
     */
    public com.walgreens.rxit.ch.cda.ED addNewOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.ED target = null;
            target = (com.walgreens.rxit.ch.cda.ED)get_store().add_element_user(ORIGINALTEXT$0);
            return target;
        }
    }
    
    /**
     * Unsets the "originalText" element
     */
    public void unsetOriginalText()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ORIGINALTEXT$0, 0);
        }
    }
    
    /**
     * Gets array of all "qualifier" elements
     */
    public com.walgreens.rxit.ch.cda.CR[] getQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(QUALIFIER$2, targetList);
            com.walgreens.rxit.ch.cda.CR[] result = new com.walgreens.rxit.ch.cda.CR[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "qualifier" element
     */
    public com.walgreens.rxit.ch.cda.CR getQualifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CR target = null;
            target = (com.walgreens.rxit.ch.cda.CR)get_store().find_element_user(QUALIFIER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "qualifier" element
     */
    public int sizeOfQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUALIFIER$2);
        }
    }
    
    /**
     * Sets array of all "qualifier" element
     */
    public void setQualifierArray(com.walgreens.rxit.ch.cda.CR[] qualifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(qualifierArray, QUALIFIER$2);
        }
    }
    
    /**
     * Sets ith "qualifier" element
     */
    public void setQualifierArray(int i, com.walgreens.rxit.ch.cda.CR qualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CR target = null;
            target = (com.walgreens.rxit.ch.cda.CR)get_store().find_element_user(QUALIFIER$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(qualifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "qualifier" element
     */
    public com.walgreens.rxit.ch.cda.CR insertNewQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CR target = null;
            target = (com.walgreens.rxit.ch.cda.CR)get_store().insert_element_user(QUALIFIER$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "qualifier" element
     */
    public com.walgreens.rxit.ch.cda.CR addNewQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CR target = null;
            target = (com.walgreens.rxit.ch.cda.CR)get_store().add_element_user(QUALIFIER$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "qualifier" element
     */
    public void removeQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUALIFIER$2, i);
        }
    }
    
    /**
     * Gets array of all "translation" elements
     */
    public com.walgreens.rxit.ch.cda.CD[] getTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TRANSLATION$4, targetList);
            com.walgreens.rxit.ch.cda.CD[] result = new com.walgreens.rxit.ch.cda.CD[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "translation" element
     */
    public com.walgreens.rxit.ch.cda.CD getTranslationArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(TRANSLATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "translation" element
     */
    public int sizeOfTranslationArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRANSLATION$4);
        }
    }
    
    /**
     * Sets array of all "translation" element
     */
    public void setTranslationArray(com.walgreens.rxit.ch.cda.CD[] translationArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(translationArray, TRANSLATION$4);
        }
    }
    
    /**
     * Sets ith "translation" element
     */
    public void setTranslationArray(int i, com.walgreens.rxit.ch.cda.CD translation)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().find_element_user(TRANSLATION$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(translation);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "translation" element
     */
    public com.walgreens.rxit.ch.cda.CD insertNewTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().insert_element_user(TRANSLATION$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "translation" element
     */
    public com.walgreens.rxit.ch.cda.CD addNewTranslation()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.CD target = null;
            target = (com.walgreens.rxit.ch.cda.CD)get_store().add_element_user(TRANSLATION$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "translation" element
     */
    public void removeTranslation(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRANSLATION$4, i);
        }
    }
    
    /**
     * Gets the "code" attribute
     */
    public java.lang.String getCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
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
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(CODE$6);
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
            return get_store().find_attribute_user(CODE$6) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODE$6);
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
            target = (com.walgreens.rxit.ch.cda.Cs2)get_store().find_attribute_user(CODE$6);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Cs2)get_store().add_attribute_user(CODE$6);
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
            get_store().remove_attribute(CODE$6);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$8);
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
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$8);
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
            return get_store().find_attribute_user(CODESYSTEM$8) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEM$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEM$8);
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
            target = (com.walgreens.rxit.ch.cda.Uid)get_store().find_attribute_user(CODESYSTEM$8);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Uid)get_store().add_attribute_user(CODESYSTEM$8);
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
            get_store().remove_attribute(CODESYSTEM$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$10);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$10);
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
            return get_store().find_attribute_user(CODESYSTEMNAME$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMNAME$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMNAME$10);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMNAME$10);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(CODESYSTEMNAME$10);
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
            get_store().remove_attribute(CODESYSTEMNAME$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$12);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMVERSION$12);
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
            return get_store().find_attribute_user(CODESYSTEMVERSION$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CODESYSTEMVERSION$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CODESYSTEMVERSION$12);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(CODESYSTEMVERSION$12);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(CODESYSTEMVERSION$12);
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
            get_store().remove_attribute(CODESYSTEMVERSION$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$14);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(DISPLAYNAME$14);
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
            return get_store().find_attribute_user(DISPLAYNAME$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$14);
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
            target = (com.walgreens.rxit.ch.cda.St2)get_store().find_attribute_user(DISPLAYNAME$14);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.St2)get_store().add_attribute_user(DISPLAYNAME$14);
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
            get_store().remove_attribute(DISPLAYNAME$14);
        }
    }
}
