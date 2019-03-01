/*
 * XML Type:  StrucDoc.Table
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocTable
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML StrucDoc.Table(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocTableImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.StrucDocTable
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocTableImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CAPTION$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "caption");
    private static final javax.xml.namespace.QName COL$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "col");
    private static final javax.xml.namespace.QName COLGROUP$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "colgroup");
    private static final javax.xml.namespace.QName THEAD$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "thead");
    private static final javax.xml.namespace.QName TFOOT$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "tfoot");
    private static final javax.xml.namespace.QName TBODY$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "tbody");
    private static final javax.xml.namespace.QName ID$12 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$14 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$16 = 
        new javax.xml.namespace.QName("", "styleCode");
    private static final javax.xml.namespace.QName SUMMARY$18 = 
        new javax.xml.namespace.QName("", "summary");
    private static final javax.xml.namespace.QName WIDTH$20 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName BORDER$22 = 
        new javax.xml.namespace.QName("", "border");
    private static final javax.xml.namespace.QName FRAME$24 = 
        new javax.xml.namespace.QName("", "frame");
    private static final javax.xml.namespace.QName RULES$26 = 
        new javax.xml.namespace.QName("", "rules");
    private static final javax.xml.namespace.QName CELLSPACING$28 = 
        new javax.xml.namespace.QName("", "cellspacing");
    private static final javax.xml.namespace.QName CELLPADDING$30 = 
        new javax.xml.namespace.QName("", "cellpadding");
    
    
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
     * Gets array of all "col" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocCol[] getColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COL$2, targetList);
            com.walgreens.rxit.ch.cda.StrucDocCol[] result = new com.walgreens.rxit.ch.cda.StrucDocCol[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "col" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocCol getColArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCol target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCol)get_store().find_element_user(COL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "col" element
     */
    public int sizeOfColArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COL$2);
        }
    }
    
    /**
     * Sets array of all "col" element
     */
    public void setColArray(com.walgreens.rxit.ch.cda.StrucDocCol[] colArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colArray, COL$2);
        }
    }
    
    /**
     * Sets ith "col" element
     */
    public void setColArray(int i, com.walgreens.rxit.ch.cda.StrucDocCol col)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCol target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCol)get_store().find_element_user(COL$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(col);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "col" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocCol insertNewCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCol target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCol)get_store().insert_element_user(COL$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "col" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocCol addNewCol()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocCol target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocCol)get_store().add_element_user(COL$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "col" element
     */
    public void removeCol(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COL$2, i);
        }
    }
    
    /**
     * Gets array of all "colgroup" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocColgroup[] getColgroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COLGROUP$4, targetList);
            com.walgreens.rxit.ch.cda.StrucDocColgroup[] result = new com.walgreens.rxit.ch.cda.StrucDocColgroup[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "colgroup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocColgroup getColgroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocColgroup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocColgroup)get_store().find_element_user(COLGROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "colgroup" element
     */
    public int sizeOfColgroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COLGROUP$4);
        }
    }
    
    /**
     * Sets array of all "colgroup" element
     */
    public void setColgroupArray(com.walgreens.rxit.ch.cda.StrucDocColgroup[] colgroupArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(colgroupArray, COLGROUP$4);
        }
    }
    
    /**
     * Sets ith "colgroup" element
     */
    public void setColgroupArray(int i, com.walgreens.rxit.ch.cda.StrucDocColgroup colgroup)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocColgroup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocColgroup)get_store().find_element_user(COLGROUP$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(colgroup);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "colgroup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocColgroup insertNewColgroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocColgroup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocColgroup)get_store().insert_element_user(COLGROUP$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "colgroup" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocColgroup addNewColgroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocColgroup target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocColgroup)get_store().add_element_user(COLGROUP$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "colgroup" element
     */
    public void removeColgroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COLGROUP$4, i);
        }
    }
    
    /**
     * Gets the "thead" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocThead getThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocThead target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocThead)get_store().find_element_user(THEAD$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "thead" element
     */
    public boolean isSetThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(THEAD$6) != 0;
        }
    }
    
    /**
     * Sets the "thead" element
     */
    public void setThead(com.walgreens.rxit.ch.cda.StrucDocThead thead)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocThead target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocThead)get_store().find_element_user(THEAD$6, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocThead)get_store().add_element_user(THEAD$6);
            }
            target.set(thead);
        }
    }
    
    /**
     * Appends and returns a new empty "thead" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocThead addNewThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocThead target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocThead)get_store().add_element_user(THEAD$6);
            return target;
        }
    }
    
    /**
     * Unsets the "thead" element
     */
    public void unsetThead()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(THEAD$6, 0);
        }
    }
    
    /**
     * Gets the "tfoot" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTfoot getTfoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTfoot target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTfoot)get_store().find_element_user(TFOOT$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "tfoot" element
     */
    public boolean isSetTfoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TFOOT$8) != 0;
        }
    }
    
    /**
     * Sets the "tfoot" element
     */
    public void setTfoot(com.walgreens.rxit.ch.cda.StrucDocTfoot tfoot)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTfoot target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTfoot)get_store().find_element_user(TFOOT$8, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocTfoot)get_store().add_element_user(TFOOT$8);
            }
            target.set(tfoot);
        }
    }
    
    /**
     * Appends and returns a new empty "tfoot" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTfoot addNewTfoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTfoot target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTfoot)get_store().add_element_user(TFOOT$8);
            return target;
        }
    }
    
    /**
     * Unsets the "tfoot" element
     */
    public void unsetTfoot()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TFOOT$8, 0);
        }
    }
    
    /**
     * Gets array of all "tbody" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocTbody[] getTbodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(TBODY$10, targetList);
            com.walgreens.rxit.ch.cda.StrucDocTbody[] result = new com.walgreens.rxit.ch.cda.StrucDocTbody[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "tbody" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTbody getTbodyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTbody target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTbody)get_store().find_element_user(TBODY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "tbody" element
     */
    public int sizeOfTbodyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TBODY$10);
        }
    }
    
    /**
     * Sets array of all "tbody" element
     */
    public void setTbodyArray(com.walgreens.rxit.ch.cda.StrucDocTbody[] tbodyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(tbodyArray, TBODY$10);
        }
    }
    
    /**
     * Sets ith "tbody" element
     */
    public void setTbodyArray(int i, com.walgreens.rxit.ch.cda.StrucDocTbody tbody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTbody target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTbody)get_store().find_element_user(TBODY$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(tbody);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "tbody" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTbody insertNewTbody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTbody target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTbody)get_store().insert_element_user(TBODY$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "tbody" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocTbody addNewTbody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTbody target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTbody)get_store().add_element_user(TBODY$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "tbody" element
     */
    public void removeTbody(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TBODY$10, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
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
            return get_store().find_attribute_user(ID$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$12);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$12);
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
            get_store().remove_attribute(ID$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$14);
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
            return get_store().find_attribute_user(LANGUAGE$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$14);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$14);
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
            get_store().remove_attribute(LANGUAGE$14);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$16);
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
            return get_store().find_attribute_user(STYLECODE$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$16);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$16);
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
            get_store().remove_attribute(STYLECODE$16);
        }
    }
    
    /**
     * Gets the "summary" attribute
     */
    public java.lang.String getSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "summary" attribute
     */
    public org.apache.xmlbeans.XmlString xgetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUMMARY$18);
            return target;
        }
    }
    
    /**
     * True if has "summary" attribute
     */
    public boolean isSetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(SUMMARY$18) != null;
        }
    }
    
    /**
     * Sets the "summary" attribute
     */
    public void setSummary(java.lang.String summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(SUMMARY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(SUMMARY$18);
            }
            target.setStringValue(summary);
        }
    }
    
    /**
     * Sets (as xml) the "summary" attribute
     */
    public void xsetSummary(org.apache.xmlbeans.XmlString summary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(SUMMARY$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(SUMMARY$18);
            }
            target.set(summary);
        }
    }
    
    /**
     * Unsets the "summary" attribute
     */
    public void unsetSummary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(SUMMARY$18);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public java.lang.String getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public org.apache.xmlbeans.XmlString xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDTH$20);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$20) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(java.lang.String width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$20);
            }
            target.setStringValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(org.apache.xmlbeans.XmlString width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(WIDTH$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(WIDTH$20);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$20);
        }
    }
    
    /**
     * Gets the "border" attribute
     */
    public java.lang.String getBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDER$22);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "border" attribute
     */
    public org.apache.xmlbeans.XmlString xgetBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDER$22);
            return target;
        }
    }
    
    /**
     * True if has "border" attribute
     */
    public boolean isSetBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(BORDER$22) != null;
        }
    }
    
    /**
     * Sets the "border" attribute
     */
    public void setBorder(java.lang.String border)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(BORDER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(BORDER$22);
            }
            target.setStringValue(border);
        }
    }
    
    /**
     * Sets (as xml) the "border" attribute
     */
    public void xsetBorder(org.apache.xmlbeans.XmlString border)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(BORDER$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(BORDER$22);
            }
            target.set(border);
        }
    }
    
    /**
     * Unsets the "border" attribute
     */
    public void unsetBorder()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(BORDER$22);
        }
    }
    
    /**
     * Gets the "frame" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocTable.Frame.Enum getFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$24);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.StrucDocTable.Frame.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "frame" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocTable.Frame xgetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTable.Frame target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTable.Frame)get_store().find_attribute_user(FRAME$24);
            return target;
        }
    }
    
    /**
     * True if has "frame" attribute
     */
    public boolean isSetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(FRAME$24) != null;
        }
    }
    
    /**
     * Sets the "frame" attribute
     */
    public void setFrame(com.walgreens.rxit.ch.cda.StrucDocTable.Frame.Enum frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(FRAME$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(FRAME$24);
            }
            target.setEnumValue(frame);
        }
    }
    
    /**
     * Sets (as xml) the "frame" attribute
     */
    public void xsetFrame(com.walgreens.rxit.ch.cda.StrucDocTable.Frame frame)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTable.Frame target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTable.Frame)get_store().find_attribute_user(FRAME$24);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocTable.Frame)get_store().add_attribute_user(FRAME$24);
            }
            target.set(frame);
        }
    }
    
    /**
     * Unsets the "frame" attribute
     */
    public void unsetFrame()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(FRAME$24);
        }
    }
    
    /**
     * Gets the "rules" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocTable.Rules.Enum getRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULES$26);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.StrucDocTable.Rules.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "rules" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocTable.Rules xgetRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTable.Rules target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTable.Rules)get_store().find_attribute_user(RULES$26);
            return target;
        }
    }
    
    /**
     * True if has "rules" attribute
     */
    public boolean isSetRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(RULES$26) != null;
        }
    }
    
    /**
     * Sets the "rules" attribute
     */
    public void setRules(com.walgreens.rxit.ch.cda.StrucDocTable.Rules.Enum rules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RULES$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RULES$26);
            }
            target.setEnumValue(rules);
        }
    }
    
    /**
     * Sets (as xml) the "rules" attribute
     */
    public void xsetRules(com.walgreens.rxit.ch.cda.StrucDocTable.Rules rules)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocTable.Rules target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocTable.Rules)get_store().find_attribute_user(RULES$26);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocTable.Rules)get_store().add_attribute_user(RULES$26);
            }
            target.set(rules);
        }
    }
    
    /**
     * Unsets the "rules" attribute
     */
    public void unsetRules()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(RULES$26);
        }
    }
    
    /**
     * Gets the "cellspacing" attribute
     */
    public java.lang.String getCellspacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLSPACING$28);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellspacing" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCellspacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLSPACING$28);
            return target;
        }
    }
    
    /**
     * True if has "cellspacing" attribute
     */
    public boolean isSetCellspacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLSPACING$28) != null;
        }
    }
    
    /**
     * Sets the "cellspacing" attribute
     */
    public void setCellspacing(java.lang.String cellspacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLSPACING$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLSPACING$28);
            }
            target.setStringValue(cellspacing);
        }
    }
    
    /**
     * Sets (as xml) the "cellspacing" attribute
     */
    public void xsetCellspacing(org.apache.xmlbeans.XmlString cellspacing)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLSPACING$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CELLSPACING$28);
            }
            target.set(cellspacing);
        }
    }
    
    /**
     * Unsets the "cellspacing" attribute
     */
    public void unsetCellspacing()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLSPACING$28);
        }
    }
    
    /**
     * Gets the "cellpadding" attribute
     */
    public java.lang.String getCellpadding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLPADDING$30);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "cellpadding" attribute
     */
    public org.apache.xmlbeans.XmlString xgetCellpadding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLPADDING$30);
            return target;
        }
    }
    
    /**
     * True if has "cellpadding" attribute
     */
    public boolean isSetCellpadding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CELLPADDING$30) != null;
        }
    }
    
    /**
     * Sets the "cellpadding" attribute
     */
    public void setCellpadding(java.lang.String cellpadding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CELLPADDING$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CELLPADDING$30);
            }
            target.setStringValue(cellpadding);
        }
    }
    
    /**
     * Sets (as xml) the "cellpadding" attribute
     */
    public void xsetCellpadding(org.apache.xmlbeans.XmlString cellpadding)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(CELLPADDING$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(CELLPADDING$30);
            }
            target.set(cellpadding);
        }
    }
    
    /**
     * Unsets the "cellpadding" attribute
     */
    public void unsetCellpadding()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CELLPADDING$30);
        }
    }
    /**
     * An XML frame(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocTable$Frame.
     */
    public static class FrameImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.StrucDocTable.Frame
    {
        private static final long serialVersionUID = 1L;
        
        public FrameImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected FrameImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
    /**
     * An XML rules(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocTable$Rules.
     */
    public static class RulesImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.StrucDocTable.Rules
    {
        private static final long serialVersionUID = 1L;
        
        public RulesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RulesImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
