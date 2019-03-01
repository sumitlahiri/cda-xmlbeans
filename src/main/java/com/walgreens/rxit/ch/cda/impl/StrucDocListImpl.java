/*
 * XML Type:  StrucDoc.List
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocList
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML StrucDoc.List(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocListImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.StrucDocList
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocListImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPTION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "caption");
    private static final javax.xml.namespace.QName ITEM$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "item");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$6 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$8 = 
        new javax.xml.namespace.QName("", "styleCode");
    private static final javax.xml.namespace.QName LISTTYPE$10 = 
        new javax.xml.namespace.QName("", "listType");
    
    
    /**
     * Gets the "caption" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocCaption getCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCaption target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCaption)get_store().find_element_user(CAPTION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "caption" element
     */
    public boolean isSetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAPTION$0) != 0;
        }
    }
    
    /**
     * Sets the "caption" element
     */
    public void setCaption(com.walgreens.rxit.ch.cda.StrucDocCaption caption)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCaption target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCaption)get_store().find_element_user(CAPTION$0, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocCaption)get_store().add_element_user(CAPTION$0);
            }
            target.set(caption);
        }
    }
    
    /**
     * Appends and returns a new empty "caption" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocCaption addNewCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCaption target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCaption)get_store().add_element_user(CAPTION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "caption" element
     */
    public void unsetCaption()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAPTION$0, 0);
        }
    }
    
    /**
     * Gets array of all "item" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocItem[] getItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ITEM$2, targetList);
            com.walgreens.rxit.ch.cda.StrucDocItem[] result = new com.walgreens.rxit.ch.cda.StrucDocItem[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "item" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocItem getItemArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocItem target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocItem)get_store().find_element_user(ITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "item" element
     */
    public int sizeOfItemArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ITEM$2);
        }
    }
    
    /**
     * Sets array of all "item" element
     */
    public void setItemArray(com.walgreens.rxit.ch.cda.StrucDocItem[] itemArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(itemArray, ITEM$2);
        }
    }
    
    /**
     * Sets ith "item" element
     */
    public void setItemArray(int i, com.walgreens.rxit.ch.cda.StrucDocItem item)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocItem target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocItem)get_store().find_element_user(ITEM$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(item);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "item" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocItem insertNewItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocItem target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocItem)get_store().insert_element_user(ITEM$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "item" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocItem addNewItem()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocItem target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocItem)get_store().add_element_user(ITEM$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "item" element
     */
    public void removeItem(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ITEM$2, i);
        }
    }
    
    /**
     * Gets the "ID" attribute
     */
    public java.lang.String getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" attribute
     */
    public org.apache.xmlbeans.XmlID xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            return target;
        }
    }
    
    /**
     * True if has "ID" attribute
     */
    public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ID$4) != null;
        }
    }
    
    /**
     * Sets the "ID" attribute
     */
    public void setID(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" attribute
     */
    public void xsetID(org.apache.xmlbeans.XmlID id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlID target = null;
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" attribute
     */
    public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ID$4);
        }
    }
    
    /**
     * Gets the "language" attribute
     */
    public java.lang.String getLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "language" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKEN xgetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$6);
            return target;
        }
    }
    
    /**
     * True if has "language" attribute
     */
    public boolean isSetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LANGUAGE$6) != null;
        }
    }
    
    /**
     * Sets the "language" attribute
     */
    public void setLanguage(java.lang.String language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.setStringValue(language);
        }
    }
    
    /**
     * Sets (as xml) the "language" attribute
     */
    public void xsetLanguage(org.apache.xmlbeans.XmlNMTOKEN language)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKEN target = null;
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$6);
            }
            target.set(language);
        }
    }
    
    /**
     * Unsets the "language" attribute
     */
    public void unsetLanguage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LANGUAGE$6);
        }
    }
    
    /**
     * Gets the "styleCode" attribute
     */
    public java.util.List getStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$8);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "styleCode" attribute
     */
    public org.apache.xmlbeans.XmlNMTOKENS xgetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$8);
            return target;
        }
    }
    
    /**
     * True if has "styleCode" attribute
     */
    public boolean isSetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STYLECODE$8) != null;
        }
    }
    
    /**
     * Sets the "styleCode" attribute
     */
    public void setStyleCode(java.util.List styleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$8);
            }
            target.setListValue(styleCode);
        }
    }
    
    /**
     * Sets (as xml) the "styleCode" attribute
     */
    public void xsetStyleCode(org.apache.xmlbeans.XmlNMTOKENS styleCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlNMTOKENS target = null;
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$8);
            }
            target.set(styleCode);
        }
    }
    
    /**
     * Unsets the "styleCode" attribute
     */
    public void unsetStyleCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STYLECODE$8);
        }
    }
    
    /**
     * Gets the "listType" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocList.ListType.Enum getListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(LISTTYPE$10);
            }
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.StrucDocList.ListType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "listType" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocList.ListType xgetListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocList.ListType target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocList.ListType)get_store().find_attribute_user(LISTTYPE$10);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocList.ListType)get_default_attribute_value(LISTTYPE$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "listType" attribute
     */
    public boolean isSetListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LISTTYPE$10) != null;
        }
    }
    
    /**
     * Sets the "listType" attribute
     */
    public void setListType(com.walgreens.rxit.ch.cda.StrucDocList.ListType.Enum listType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LISTTYPE$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LISTTYPE$10);
            }
            target.setEnumValue(listType);
        }
    }
    
    /**
     * Sets (as xml) the "listType" attribute
     */
    public void xsetListType(com.walgreens.rxit.ch.cda.StrucDocList.ListType listType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocList.ListType target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocList.ListType)get_store().find_attribute_user(LISTTYPE$10);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocList.ListType)get_store().add_attribute_user(LISTTYPE$10);
            }
            target.set(listType);
        }
    }
    
    /**
     * Unsets the "listType" attribute
     */
    public void unsetListType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LISTTYPE$10);
        }
    }
    /**
     * An XML listType(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocList$ListType.
     */
    public static class ListTypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.StrucDocList.ListType
    {
        private static final long serialVersionUID = 1L;
        
        public ListTypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected ListTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
