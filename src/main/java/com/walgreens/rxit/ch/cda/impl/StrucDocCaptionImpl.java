/*
 * XML Type:  StrucDoc.Caption
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocCaption
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML StrucDoc.Caption(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocCaptionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.StrucDocCaption
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocCaptionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LINKHTML$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "linkHtml");
    private static final javax.xml.namespace.QName SUB$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sub");
    private static final javax.xml.namespace.QName SUP$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sup");
    private static final javax.xml.namespace.QName FOOTNOTE$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnote");
    private static final javax.xml.namespace.QName FOOTNOTEREF$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnoteRef");
    private static final javax.xml.namespace.QName ID$10 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$12 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$14 = 
        new javax.xml.namespace.QName("", "styleCode");
    
    
    /**
     * Gets array of all "linkHtml" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] getLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKHTML$0, targetList);
            com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] result = new com.walgreens.rxit.ch.cda.StrucDocLinkHtml[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "linkHtml" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocLinkHtml getLinkHtmlArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocLinkHtml target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "linkHtml" element
     */
    public int sizeOfLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKHTML$0);
        }
    }
    
    /**
     * Sets array of all "linkHtml" element
     */
    public void setLinkHtmlArray(com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] linkHtmlArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linkHtmlArray, LINKHTML$0);
        }
    }
    
    /**
     * Sets ith "linkHtml" element
     */
    public void setLinkHtmlArray(int i, com.walgreens.rxit.ch.cda.StrucDocLinkHtml linkHtml)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocLinkHtml target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(linkHtml);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "linkHtml" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocLinkHtml insertNewLinkHtml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocLinkHtml target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().insert_element_user(LINKHTML$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "linkHtml" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocLinkHtml addNewLinkHtml()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocLinkHtml target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().add_element_user(LINKHTML$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "linkHtml" element
     */
    public void removeLinkHtml(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKHTML$0, i);
        }
    }
    
    /**
     * Gets array of all "sub" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocSub[] getSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUB$2, targetList);
            com.walgreens.rxit.ch.cda.StrucDocSub[] result = new com.walgreens.rxit.ch.cda.StrucDocSub[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sub" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSub getSubArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSub target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().find_element_user(SUB$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sub" element
     */
    public int sizeOfSubArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUB$2);
        }
    }
    
    /**
     * Sets array of all "sub" element
     */
    public void setSubArray(com.walgreens.rxit.ch.cda.StrucDocSub[] subArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subArray, SUB$2);
        }
    }
    
    /**
     * Sets ith "sub" element
     */
    public void setSubArray(int i, com.walgreens.rxit.ch.cda.StrucDocSub sub)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSub target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().find_element_user(SUB$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sub);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sub" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSub insertNewSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSub target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().insert_element_user(SUB$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sub" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSub addNewSub()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSub target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().add_element_user(SUB$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "sub" element
     */
    public void removeSub(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUB$2, i);
        }
    }
    
    /**
     * Gets array of all "sup" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocSup[] getSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUP$4, targetList);
            com.walgreens.rxit.ch.cda.StrucDocSup[] result = new com.walgreens.rxit.ch.cda.StrucDocSup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "sup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSup getSupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().find_element_user(SUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "sup" element
     */
    public int sizeOfSupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUP$4);
        }
    }
    
    /**
     * Sets array of all "sup" element
     */
    public void setSupArray(com.walgreens.rxit.ch.cda.StrucDocSup[] supArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(supArray, SUP$4);
        }
    }
    
    /**
     * Sets ith "sup" element
     */
    public void setSupArray(int i, com.walgreens.rxit.ch.cda.StrucDocSup sup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().find_element_user(SUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "sup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSup insertNewSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().insert_element_user(SUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "sup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocSup addNewSup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocSup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().add_element_user(SUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "sup" element
     */
    public void removeSup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUP$4, i);
        }
    }
    
    /**
     * Gets array of all "footnote" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnote[] getFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTE$6, targetList);
            com.walgreens.rxit.ch.cda.StrucDocFootnote[] result = new com.walgreens.rxit.ch.cda.StrucDocFootnote[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnote" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnote getFootnoteArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnote target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().find_element_user(FOOTNOTE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnote" element
     */
    public int sizeOfFootnoteArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTE$6);
        }
    }
    
    /**
     * Sets array of all "footnote" element
     */
    public void setFootnoteArray(com.walgreens.rxit.ch.cda.StrucDocFootnote[] footnoteArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footnoteArray, FOOTNOTE$6);
        }
    }
    
    /**
     * Sets ith "footnote" element
     */
    public void setFootnoteArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnote footnote)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnote target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().find_element_user(FOOTNOTE$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footnote);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnote" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnote insertNewFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnote target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().insert_element_user(FOOTNOTE$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnote" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnote addNewFootnote()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnote target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().add_element_user(FOOTNOTE$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnote" element
     */
    public void removeFootnote(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTE$6, i);
        }
    }
    
    /**
     * Gets array of all "footnoteRef" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] getFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FOOTNOTEREF$8, targetList);
            com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] result = new com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "footnoteRef" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnoteRef getFootnoteRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnoteRef target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().find_element_user(FOOTNOTEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "footnoteRef" element
     */
    public int sizeOfFootnoteRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTNOTEREF$8);
        }
    }
    
    /**
     * Sets array of all "footnoteRef" element
     */
    public void setFootnoteRefArray(com.walgreens.rxit.ch.cda.StrucDocFootnoteRef[] footnoteRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(footnoteRefArray, FOOTNOTEREF$8);
        }
    }
    
    /**
     * Sets ith "footnoteRef" element
     */
    public void setFootnoteRefArray(int i, com.walgreens.rxit.ch.cda.StrucDocFootnoteRef footnoteRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnoteRef target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().find_element_user(FOOTNOTEREF$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(footnoteRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "footnoteRef" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnoteRef insertNewFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnoteRef target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().insert_element_user(FOOTNOTEREF$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "footnoteRef" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocFootnoteRef addNewFootnoteRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocFootnoteRef target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().add_element_user(FOOTNOTEREF$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "footnoteRef" element
     */
    public void removeFootnoteRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTNOTEREF$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
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
            return get_store().find_attribute_user(ID$10) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$10);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$10);
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
            get_store().remove_attribute(ID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$12);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$12);
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
            return get_store().find_attribute_user(LANGUAGE$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$12);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$12);
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
            get_store().remove_attribute(LANGUAGE$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$14);
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
            return get_store().find_attribute_user(STYLECODE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$14);
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
            get_store().remove_attribute(STYLECODE$14);
        }
    }
}
