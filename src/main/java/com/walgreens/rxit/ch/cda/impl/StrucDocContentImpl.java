/*
 * XML Type:  StrucDoc.Content
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StrucDocContent
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML StrucDoc.Content(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class StrucDocContentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.walgreens.rxit.ch.cda.StrucDocContent
{
    private static final long serialVersionUID = 1L;
    
    public StrucDocContentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTENT$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "content");
    private static final javax.xml.namespace.QName LINKHTML$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "linkHtml");
    private static final javax.xml.namespace.QName SUB$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sub");
    private static final javax.xml.namespace.QName SUP$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "sup");
    private static final javax.xml.namespace.QName BR$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "br");
    private static final javax.xml.namespace.QName FOOTNOTE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnote");
    private static final javax.xml.namespace.QName FOOTNOTEREF$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "footnoteRef");
    private static final javax.xml.namespace.QName RENDERMULTIMEDIA$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "renderMultiMedia");
    private static final javax.xml.namespace.QName ID$16 = 
        new javax.xml.namespace.QName("", "ID");
    private static final javax.xml.namespace.QName LANGUAGE$18 = 
        new javax.xml.namespace.QName("", "language");
    private static final javax.xml.namespace.QName STYLECODE$20 = 
        new javax.xml.namespace.QName("", "styleCode");
    private static final javax.xml.namespace.QName REVISED$22 = 
        new javax.xml.namespace.QName("", "revised");
    
    
    /**
     * Gets array of all "content" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent[] getContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CONTENT$0, targetList);
            com.walgreens.rxit.ch.cda.StrucDocContent[] result = new com.walgreens.rxit.ch.cda.StrucDocContent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "content" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent getContentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent)get_store().find_element_user(CONTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "content" element
     */
    public int sizeOfContentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTENT$0);
        }
    }
    
    /**
     * Sets array of all "content" element
     */
    public void setContentArray(com.walgreens.rxit.ch.cda.StrucDocContent[] contentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contentArray, CONTENT$0);
        }
    }
    
    /**
     * Sets ith "content" element
     */
    public void setContentArray(int i, com.walgreens.rxit.ch.cda.StrucDocContent content)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent)get_store().find_element_user(CONTENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(content);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "content" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent insertNewContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent)get_store().insert_element_user(CONTENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "content" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent addNewContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent)get_store().add_element_user(CONTENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "content" element
     */
    public void removeContent(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTENT$0, i);
        }
    }
    
    /**
     * Gets array of all "linkHtml" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocLinkHtml[] getLinkHtmlArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKHTML$2, targetList);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$2, i);
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
            return get_store().count_elements(LINKHTML$2);
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
            arraySetterHelper(linkHtmlArray, LINKHTML$2);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().find_element_user(LINKHTML$2, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().insert_element_user(LINKHTML$2, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocLinkHtml)get_store().add_element_user(LINKHTML$2);
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
            get_store().remove_element(LINKHTML$2, i);
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
            get_store().find_all_element_users(SUB$4, targetList);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().find_element_user(SUB$4, i);
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
            return get_store().count_elements(SUB$4);
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
            arraySetterHelper(subArray, SUB$4);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().find_element_user(SUB$4, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().insert_element_user(SUB$4, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSub)get_store().add_element_user(SUB$4);
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
            get_store().remove_element(SUB$4, i);
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
            get_store().find_all_element_users(SUP$6, targetList);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().find_element_user(SUP$6, i);
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
            return get_store().count_elements(SUP$6);
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
            arraySetterHelper(supArray, SUP$6);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().find_element_user(SUP$6, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().insert_element_user(SUP$6, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocSup)get_store().add_element_user(SUP$6);
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
            get_store().remove_element(SUP$6, i);
        }
    }
    
    /**
     * Gets array of all "br" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocBr[] getBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BR$8, targetList);
            com.walgreens.rxit.ch.cda.StrucDocBr[] result = new com.walgreens.rxit.ch.cda.StrucDocBr[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "br" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocBr getBrArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocBr target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocBr)get_store().find_element_user(BR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "br" element
     */
    public int sizeOfBrArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BR$8);
        }
    }
    
    /**
     * Sets array of all "br" element
     */
    public void setBrArray(com.walgreens.rxit.ch.cda.StrucDocBr[] brArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(brArray, BR$8);
        }
    }
    
    /**
     * Sets ith "br" element
     */
    public void setBrArray(int i, com.walgreens.rxit.ch.cda.StrucDocBr br)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocBr target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocBr)get_store().find_element_user(BR$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(br);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "br" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocBr insertNewBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocBr target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocBr)get_store().insert_element_user(BR$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "br" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocBr addNewBr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocBr target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocBr)get_store().add_element_user(BR$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "br" element
     */
    public void removeBr(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BR$8, i);
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
            get_store().find_all_element_users(FOOTNOTE$10, targetList);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().find_element_user(FOOTNOTE$10, i);
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
            return get_store().count_elements(FOOTNOTE$10);
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
            arraySetterHelper(footnoteArray, FOOTNOTE$10);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().find_element_user(FOOTNOTE$10, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().insert_element_user(FOOTNOTE$10, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnote)get_store().add_element_user(FOOTNOTE$10);
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
            get_store().remove_element(FOOTNOTE$10, i);
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
            get_store().find_all_element_users(FOOTNOTEREF$12, targetList);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().find_element_user(FOOTNOTEREF$12, i);
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
            return get_store().count_elements(FOOTNOTEREF$12);
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
            arraySetterHelper(footnoteRefArray, FOOTNOTEREF$12);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().find_element_user(FOOTNOTEREF$12, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().insert_element_user(FOOTNOTEREF$12, i);
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
            target = (com.walgreens.rxit.ch.cda.StrucDocFootnoteRef)get_store().add_element_user(FOOTNOTEREF$12);
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
            get_store().remove_element(FOOTNOTEREF$12, i);
        }
    }
    
    /**
     * Gets array of all "renderMultiMedia" elements
     */
    public com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[] getRenderMultiMediaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RENDERMULTIMEDIA$14, targetList);
            com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[] result = new com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "renderMultiMedia" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia getRenderMultiMediaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia)get_store().find_element_user(RENDERMULTIMEDIA$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "renderMultiMedia" element
     */
    public int sizeOfRenderMultiMediaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RENDERMULTIMEDIA$14);
        }
    }
    
    /**
     * Sets array of all "renderMultiMedia" element
     */
    public void setRenderMultiMediaArray(com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia[] renderMultiMediaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(renderMultiMediaArray, RENDERMULTIMEDIA$14);
        }
    }
    
    /**
     * Sets ith "renderMultiMedia" element
     */
    public void setRenderMultiMediaArray(int i, com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia renderMultiMedia)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia)get_store().find_element_user(RENDERMULTIMEDIA$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(renderMultiMedia);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "renderMultiMedia" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia insertNewRenderMultiMedia(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia)get_store().insert_element_user(RENDERMULTIMEDIA$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "renderMultiMedia" element
     */
    public com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia addNewRenderMultiMedia()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocRenderMultiMedia)get_store().add_element_user(RENDERMULTIMEDIA$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "renderMultiMedia" element
     */
    public void removeRenderMultiMedia(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RENDERMULTIMEDIA$14, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
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
            return get_store().find_attribute_user(ID$16) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ID$16);
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
            target = (org.apache.xmlbeans.XmlID)get_store().find_attribute_user(ID$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlID)get_store().add_attribute_user(ID$16);
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
            get_store().remove_attribute(ID$16);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$18);
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
            return get_store().find_attribute_user(LANGUAGE$18) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LANGUAGE$18);
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
            target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().find_attribute_user(LANGUAGE$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKEN)get_store().add_attribute_user(LANGUAGE$18);
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
            get_store().remove_attribute(LANGUAGE$18);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$20);
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
            return get_store().find_attribute_user(STYLECODE$20) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STYLECODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STYLECODE$20);
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
            target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().find_attribute_user(STYLECODE$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlNMTOKENS)get_store().add_attribute_user(STYLECODE$20);
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
            get_store().remove_attribute(STYLECODE$20);
        }
    }
    
    /**
     * Gets the "revised" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent.Revised.Enum getRevised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISED$22);
            if (target == null)
            {
                return null;
            }
            return (com.walgreens.rxit.ch.cda.StrucDocContent.Revised.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "revised" attribute
     */
    public com.walgreens.rxit.ch.cda.StrucDocContent.Revised xgetRevised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent.Revised target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent.Revised)get_store().find_attribute_user(REVISED$22);
            return target;
        }
    }
    
    /**
     * True if has "revised" attribute
     */
    public boolean isSetRevised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(REVISED$22) != null;
        }
    }
    
    /**
     * Sets the "revised" attribute
     */
    public void setRevised(com.walgreens.rxit.ch.cda.StrucDocContent.Revised.Enum revised)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(REVISED$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(REVISED$22);
            }
            target.setEnumValue(revised);
        }
    }
    
    /**
     * Sets (as xml) the "revised" attribute
     */
    public void xsetRevised(com.walgreens.rxit.ch.cda.StrucDocContent.Revised revised)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.StrucDocContent.Revised target = null;
            target = (com.walgreens.rxit.ch.cda.StrucDocContent.Revised)get_store().find_attribute_user(REVISED$22);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.StrucDocContent.Revised)get_store().add_attribute_user(REVISED$22);
            }
            target.set(revised);
        }
    }
    
    /**
     * Unsets the "revised" attribute
     */
    public void unsetRevised()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(REVISED$22);
        }
    }
    /**
     * An XML revised(@).
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StrucDocContent$Revised.
     */
    public static class RevisedImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.StrucDocContent.Revised
    {
        private static final long serialVersionUID = 1L;
        
        public RevisedImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected RevisedImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
