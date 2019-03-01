/*
 * XML Type:  EN
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EN
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EN(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ENImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.EN
{
    private static final long serialVersionUID = 1L;
    
    public ENImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIMITER$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "delimiter");
    private static final javax.xml.namespace.QName FAMILY$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "family");
    private static final javax.xml.namespace.QName GIVEN$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "given");
    private static final javax.xml.namespace.QName PREFIX$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "prefix");
    private static final javax.xml.namespace.QName SUFFIX$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "suffix");
    private static final javax.xml.namespace.QName VALIDTIME$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "validTime");
    private static final javax.xml.namespace.QName USE$12 = 
        new javax.xml.namespace.QName("", "use");
    
    
    /**
     * Gets array of all "delimiter" elements
     */
    public com.walgreens.rxit.ch.cda.EnDelimiter[] getDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIMITER$0, targetList);
            com.walgreens.rxit.ch.cda.EnDelimiter[] result = new com.walgreens.rxit.ch.cda.EnDelimiter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delimiter" element
     */
    public com.walgreens.rxit.ch.cda.EnDelimiter getDelimiterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.EnDelimiter)get_store().find_element_user(DELIMITER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "delimiter" element
     */
    public int sizeOfDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIMITER$0);
        }
    }
    
    /**
     * Sets array of all "delimiter" element
     */
    public void setDelimiterArray(com.walgreens.rxit.ch.cda.EnDelimiter[] delimiterArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(delimiterArray, DELIMITER$0);
        }
    }
    
    /**
     * Sets ith "delimiter" element
     */
    public void setDelimiterArray(int i, com.walgreens.rxit.ch.cda.EnDelimiter delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.EnDelimiter)get_store().find_element_user(DELIMITER$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(delimiter);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    public com.walgreens.rxit.ch.cda.EnDelimiter insertNewDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.EnDelimiter)get_store().insert_element_user(DELIMITER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    public com.walgreens.rxit.ch.cda.EnDelimiter addNewDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.EnDelimiter)get_store().add_element_user(DELIMITER$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "delimiter" element
     */
    public void removeDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIMITER$0, i);
        }
    }
    
    /**
     * Gets array of all "family" elements
     */
    public com.walgreens.rxit.ch.cda.EnFamily[] getFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(FAMILY$2, targetList);
            com.walgreens.rxit.ch.cda.EnFamily[] result = new com.walgreens.rxit.ch.cda.EnFamily[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "family" element
     */
    public com.walgreens.rxit.ch.cda.EnFamily getFamilyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnFamily target = null;
            target = (com.walgreens.rxit.ch.cda.EnFamily)get_store().find_element_user(FAMILY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "family" element
     */
    public int sizeOfFamilyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAMILY$2);
        }
    }
    
    /**
     * Sets array of all "family" element
     */
    public void setFamilyArray(com.walgreens.rxit.ch.cda.EnFamily[] familyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(familyArray, FAMILY$2);
        }
    }
    
    /**
     * Sets ith "family" element
     */
    public void setFamilyArray(int i, com.walgreens.rxit.ch.cda.EnFamily family)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnFamily target = null;
            target = (com.walgreens.rxit.ch.cda.EnFamily)get_store().find_element_user(FAMILY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(family);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "family" element
     */
    public com.walgreens.rxit.ch.cda.EnFamily insertNewFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnFamily target = null;
            target = (com.walgreens.rxit.ch.cda.EnFamily)get_store().insert_element_user(FAMILY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "family" element
     */
    public com.walgreens.rxit.ch.cda.EnFamily addNewFamily()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnFamily target = null;
            target = (com.walgreens.rxit.ch.cda.EnFamily)get_store().add_element_user(FAMILY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "family" element
     */
    public void removeFamily(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAMILY$2, i);
        }
    }
    
    /**
     * Gets array of all "given" elements
     */
    public com.walgreens.rxit.ch.cda.EnGiven[] getGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(GIVEN$4, targetList);
            com.walgreens.rxit.ch.cda.EnGiven[] result = new com.walgreens.rxit.ch.cda.EnGiven[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "given" element
     */
    public com.walgreens.rxit.ch.cda.EnGiven getGivenArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnGiven target = null;
            target = (com.walgreens.rxit.ch.cda.EnGiven)get_store().find_element_user(GIVEN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "given" element
     */
    public int sizeOfGivenArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GIVEN$4);
        }
    }
    
    /**
     * Sets array of all "given" element
     */
    public void setGivenArray(com.walgreens.rxit.ch.cda.EnGiven[] givenArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(givenArray, GIVEN$4);
        }
    }
    
    /**
     * Sets ith "given" element
     */
    public void setGivenArray(int i, com.walgreens.rxit.ch.cda.EnGiven given)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnGiven target = null;
            target = (com.walgreens.rxit.ch.cda.EnGiven)get_store().find_element_user(GIVEN$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(given);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "given" element
     */
    public com.walgreens.rxit.ch.cda.EnGiven insertNewGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnGiven target = null;
            target = (com.walgreens.rxit.ch.cda.EnGiven)get_store().insert_element_user(GIVEN$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "given" element
     */
    public com.walgreens.rxit.ch.cda.EnGiven addNewGiven()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnGiven target = null;
            target = (com.walgreens.rxit.ch.cda.EnGiven)get_store().add_element_user(GIVEN$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "given" element
     */
    public void removeGiven(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GIVEN$4, i);
        }
    }
    
    /**
     * Gets array of all "prefix" elements
     */
    public com.walgreens.rxit.ch.cda.EnPrefix[] getPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PREFIX$6, targetList);
            com.walgreens.rxit.ch.cda.EnPrefix[] result = new com.walgreens.rxit.ch.cda.EnPrefix[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "prefix" element
     */
    public com.walgreens.rxit.ch.cda.EnPrefix getPrefixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnPrefix target = null;
            target = (com.walgreens.rxit.ch.cda.EnPrefix)get_store().find_element_user(PREFIX$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "prefix" element
     */
    public int sizeOfPrefixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREFIX$6);
        }
    }
    
    /**
     * Sets array of all "prefix" element
     */
    public void setPrefixArray(com.walgreens.rxit.ch.cda.EnPrefix[] prefixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(prefixArray, PREFIX$6);
        }
    }
    
    /**
     * Sets ith "prefix" element
     */
    public void setPrefixArray(int i, com.walgreens.rxit.ch.cda.EnPrefix prefix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnPrefix target = null;
            target = (com.walgreens.rxit.ch.cda.EnPrefix)get_store().find_element_user(PREFIX$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(prefix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "prefix" element
     */
    public com.walgreens.rxit.ch.cda.EnPrefix insertNewPrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnPrefix target = null;
            target = (com.walgreens.rxit.ch.cda.EnPrefix)get_store().insert_element_user(PREFIX$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "prefix" element
     */
    public com.walgreens.rxit.ch.cda.EnPrefix addNewPrefix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnPrefix target = null;
            target = (com.walgreens.rxit.ch.cda.EnPrefix)get_store().add_element_user(PREFIX$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "prefix" element
     */
    public void removePrefix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREFIX$6, i);
        }
    }
    
    /**
     * Gets array of all "suffix" elements
     */
    public com.walgreens.rxit.ch.cda.EnSuffix[] getSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUFFIX$8, targetList);
            com.walgreens.rxit.ch.cda.EnSuffix[] result = new com.walgreens.rxit.ch.cda.EnSuffix[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "suffix" element
     */
    public com.walgreens.rxit.ch.cda.EnSuffix getSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.EnSuffix)get_store().find_element_user(SUFFIX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "suffix" element
     */
    public int sizeOfSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUFFIX$8);
        }
    }
    
    /**
     * Sets array of all "suffix" element
     */
    public void setSuffixArray(com.walgreens.rxit.ch.cda.EnSuffix[] suffixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(suffixArray, SUFFIX$8);
        }
    }
    
    /**
     * Sets ith "suffix" element
     */
    public void setSuffixArray(int i, com.walgreens.rxit.ch.cda.EnSuffix suffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.EnSuffix)get_store().find_element_user(SUFFIX$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(suffix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "suffix" element
     */
    public com.walgreens.rxit.ch.cda.EnSuffix insertNewSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.EnSuffix)get_store().insert_element_user(SUFFIX$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "suffix" element
     */
    public com.walgreens.rxit.ch.cda.EnSuffix addNewSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.EnSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.EnSuffix)get_store().add_element_user(SUFFIX$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "suffix" element
     */
    public void removeSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUFFIX$8, i);
        }
    }
    
    /**
     * Gets the "validTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS getValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(VALIDTIME$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "validTime" element
     */
    public boolean isSetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALIDTIME$10) != 0;
        }
    }
    
    /**
     * Sets the "validTime" element
     */
    public void setValidTime(com.walgreens.rxit.ch.cda.IVLTS validTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().find_element_user(VALIDTIME$10, 0);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(VALIDTIME$10);
            }
            target.set(validTime);
        }
    }
    
    /**
     * Appends and returns a new empty "validTime" element
     */
    public com.walgreens.rxit.ch.cda.IVLTS addNewValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.IVLTS target = null;
            target = (com.walgreens.rxit.ch.cda.IVLTS)get_store().add_element_user(VALIDTIME$10);
            return target;
        }
    }
    
    /**
     * Unsets the "validTime" element
     */
    public void unsetValidTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALIDTIME$10, 0);
        }
    }
    
    /**
     * Gets the "use" attribute
     */
    public java.util.List getUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$12);
            if (target == null)
            {
                return null;
            }
            return target.getListValue();
        }
    }
    
    /**
     * Gets (as xml) the "use" attribute
     */
    public com.walgreens.rxit.ch.cda.SetEntityNameUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetEntityNameUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetEntityNameUse)get_store().find_attribute_user(USE$12);
            return target;
        }
    }
    
    /**
     * True if has "use" attribute
     */
    public boolean isSetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(USE$12) != null;
        }
    }
    
    /**
     * Sets the "use" attribute
     */
    public void setUse(java.util.List use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$12);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(com.walgreens.rxit.ch.cda.SetEntityNameUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetEntityNameUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetEntityNameUse)get_store().find_attribute_user(USE$12);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.SetEntityNameUse)get_store().add_attribute_user(USE$12);
            }
            target.set(use);
        }
    }
    
    /**
     * Unsets the "use" attribute
     */
    public void unsetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(USE$12);
        }
    }
}
