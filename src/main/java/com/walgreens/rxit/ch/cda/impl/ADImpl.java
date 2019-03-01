/*
 * XML Type:  AD
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.AD
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML AD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public class ADImpl extends com.walgreens.rxit.ch.cda.impl.ANYImpl implements com.walgreens.rxit.ch.cda.AD
{
    private static final long serialVersionUID = 1L;
    
    public ADImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DELIMITER$0 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "delimiter");
    private static final javax.xml.namespace.QName COUNTRY$2 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "country");
    private static final javax.xml.namespace.QName STATE$4 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "state");
    private static final javax.xml.namespace.QName COUNTY$6 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "county");
    private static final javax.xml.namespace.QName CITY$8 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "city");
    private static final javax.xml.namespace.QName POSTALCODE$10 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "postalCode");
    private static final javax.xml.namespace.QName STREETADDRESSLINE$12 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetAddressLine");
    private static final javax.xml.namespace.QName HOUSENUMBER$14 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "houseNumber");
    private static final javax.xml.namespace.QName HOUSENUMBERNUMERIC$16 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "houseNumberNumeric");
    private static final javax.xml.namespace.QName DIRECTION$18 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "direction");
    private static final javax.xml.namespace.QName STREETNAME$20 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetName");
    private static final javax.xml.namespace.QName STREETNAMEBASE$22 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetNameBase");
    private static final javax.xml.namespace.QName STREETNAMETYPE$24 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "streetNameType");
    private static final javax.xml.namespace.QName ADDITIONALLOCATOR$26 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "additionalLocator");
    private static final javax.xml.namespace.QName UNITID$28 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "unitID");
    private static final javax.xml.namespace.QName UNITTYPE$30 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "unitType");
    private static final javax.xml.namespace.QName CAREOF$32 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "careOf");
    private static final javax.xml.namespace.QName CENSUSTRACT$34 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "censusTract");
    private static final javax.xml.namespace.QName DELIVERYADDRESSLINE$36 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryAddressLine");
    private static final javax.xml.namespace.QName DELIVERYINSTALLATIONTYPE$38 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryInstallationType");
    private static final javax.xml.namespace.QName DELIVERYINSTALLATIONAREA$40 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryInstallationArea");
    private static final javax.xml.namespace.QName DELIVERYINSTALLATIONQUALIFIER$42 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryInstallationQualifier");
    private static final javax.xml.namespace.QName DELIVERYMODE$44 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryMode");
    private static final javax.xml.namespace.QName DELIVERYMODEIDENTIFIER$46 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "deliveryModeIdentifier");
    private static final javax.xml.namespace.QName BUILDINGNUMBERSUFFIX$48 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "buildingNumberSuffix");
    private static final javax.xml.namespace.QName POSTBOX$50 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "postBox");
    private static final javax.xml.namespace.QName PRECINCT$52 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "precinct");
    private static final javax.xml.namespace.QName USEABLEPERIOD$54 = 
        new javax.xml.namespace.QName("urn:hl7-org:v3", "useablePeriod");
    private static final javax.xml.namespace.QName USE$56 = 
        new javax.xml.namespace.QName("", "use");
    private static final javax.xml.namespace.QName ISNOTORDERED$58 = 
        new javax.xml.namespace.QName("", "isNotOrdered");
    
    
    /**
     * Gets array of all "delimiter" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDelimiter[] getDelimiterArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIMITER$0, targetList);
            com.walgreens.rxit.ch.cda.AdxpDelimiter[] result = new com.walgreens.rxit.ch.cda.AdxpDelimiter[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "delimiter" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDelimiter getDelimiterArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDelimiter)get_store().find_element_user(DELIMITER$0, i);
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
    public void setDelimiterArray(com.walgreens.rxit.ch.cda.AdxpDelimiter[] delimiterArray)
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
    public void setDelimiterArray(int i, com.walgreens.rxit.ch.cda.AdxpDelimiter delimiter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDelimiter)get_store().find_element_user(DELIMITER$0, i);
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
    public com.walgreens.rxit.ch.cda.AdxpDelimiter insertNewDelimiter(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDelimiter)get_store().insert_element_user(DELIMITER$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDelimiter addNewDelimiter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDelimiter target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDelimiter)get_store().add_element_user(DELIMITER$0);
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
     * Gets array of all "country" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpCountry[] getCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTRY$2, targetList);
            com.walgreens.rxit.ch.cda.AdxpCountry[] result = new com.walgreens.rxit.ch.cda.AdxpCountry[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "country" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCountry getCountryArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCountry target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCountry)get_store().find_element_user(COUNTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "country" element
     */
    public int sizeOfCountryArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTRY$2);
        }
    }
    
    /**
     * Sets array of all "country" element
     */
    public void setCountryArray(com.walgreens.rxit.ch.cda.AdxpCountry[] countryArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countryArray, COUNTRY$2);
        }
    }
    
    /**
     * Sets ith "country" element
     */
    public void setCountryArray(int i, com.walgreens.rxit.ch.cda.AdxpCountry country)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCountry target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCountry)get_store().find_element_user(COUNTRY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(country);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "country" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCountry insertNewCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCountry target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCountry)get_store().insert_element_user(COUNTRY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "country" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCountry addNewCountry()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCountry target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCountry)get_store().add_element_user(COUNTRY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "country" element
     */
    public void removeCountry(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTRY$2, i);
        }
    }
    
    /**
     * Gets array of all "state" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpState[] getStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STATE$4, targetList);
            com.walgreens.rxit.ch.cda.AdxpState[] result = new com.walgreens.rxit.ch.cda.AdxpState[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "state" element
     */
    public com.walgreens.rxit.ch.cda.AdxpState getStateArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpState target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpState)get_store().find_element_user(STATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "state" element
     */
    public int sizeOfStateArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATE$4);
        }
    }
    
    /**
     * Sets array of all "state" element
     */
    public void setStateArray(com.walgreens.rxit.ch.cda.AdxpState[] stateArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(stateArray, STATE$4);
        }
    }
    
    /**
     * Sets ith "state" element
     */
    public void setStateArray(int i, com.walgreens.rxit.ch.cda.AdxpState state)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpState target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpState)get_store().find_element_user(STATE$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(state);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "state" element
     */
    public com.walgreens.rxit.ch.cda.AdxpState insertNewState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpState target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpState)get_store().insert_element_user(STATE$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "state" element
     */
    public com.walgreens.rxit.ch.cda.AdxpState addNewState()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpState target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpState)get_store().add_element_user(STATE$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "state" element
     */
    public void removeState(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATE$4, i);
        }
    }
    
    /**
     * Gets array of all "county" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpCounty[] getCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(COUNTY$6, targetList);
            com.walgreens.rxit.ch.cda.AdxpCounty[] result = new com.walgreens.rxit.ch.cda.AdxpCounty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "county" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCounty getCountyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCounty target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCounty)get_store().find_element_user(COUNTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "county" element
     */
    public int sizeOfCountyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COUNTY$6);
        }
    }
    
    /**
     * Sets array of all "county" element
     */
    public void setCountyArray(com.walgreens.rxit.ch.cda.AdxpCounty[] countyArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(countyArray, COUNTY$6);
        }
    }
    
    /**
     * Sets ith "county" element
     */
    public void setCountyArray(int i, com.walgreens.rxit.ch.cda.AdxpCounty county)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCounty target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCounty)get_store().find_element_user(COUNTY$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(county);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "county" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCounty insertNewCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCounty target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCounty)get_store().insert_element_user(COUNTY$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "county" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCounty addNewCounty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCounty target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCounty)get_store().add_element_user(COUNTY$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "county" element
     */
    public void removeCounty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COUNTY$6, i);
        }
    }
    
    /**
     * Gets array of all "city" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpCity[] getCityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CITY$8, targetList);
            com.walgreens.rxit.ch.cda.AdxpCity[] result = new com.walgreens.rxit.ch.cda.AdxpCity[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "city" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCity getCityArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCity target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCity)get_store().find_element_user(CITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "city" element
     */
    public int sizeOfCityArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CITY$8);
        }
    }
    
    /**
     * Sets array of all "city" element
     */
    public void setCityArray(com.walgreens.rxit.ch.cda.AdxpCity[] cityArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(cityArray, CITY$8);
        }
    }
    
    /**
     * Sets ith "city" element
     */
    public void setCityArray(int i, com.walgreens.rxit.ch.cda.AdxpCity city)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCity target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCity)get_store().find_element_user(CITY$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(city);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "city" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCity insertNewCity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCity target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCity)get_store().insert_element_user(CITY$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "city" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCity addNewCity()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCity target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCity)get_store().add_element_user(CITY$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "city" element
     */
    public void removeCity(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CITY$8, i);
        }
    }
    
    /**
     * Gets array of all "postalCode" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpPostalCode[] getPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSTALCODE$10, targetList);
            com.walgreens.rxit.ch.cda.AdxpPostalCode[] result = new com.walgreens.rxit.ch.cda.AdxpPostalCode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "postalCode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostalCode getPostalCodeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostalCode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostalCode)get_store().find_element_user(POSTALCODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "postalCode" element
     */
    public int sizeOfPostalCodeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTALCODE$10);
        }
    }
    
    /**
     * Sets array of all "postalCode" element
     */
    public void setPostalCodeArray(com.walgreens.rxit.ch.cda.AdxpPostalCode[] postalCodeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(postalCodeArray, POSTALCODE$10);
        }
    }
    
    /**
     * Sets ith "postalCode" element
     */
    public void setPostalCodeArray(int i, com.walgreens.rxit.ch.cda.AdxpPostalCode postalCode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostalCode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostalCode)get_store().find_element_user(POSTALCODE$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(postalCode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postalCode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostalCode insertNewPostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostalCode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostalCode)get_store().insert_element_user(POSTALCODE$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postalCode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostalCode addNewPostalCode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostalCode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostalCode)get_store().add_element_user(POSTALCODE$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "postalCode" element
     */
    public void removePostalCode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTALCODE$10, i);
        }
    }
    
    /**
     * Gets array of all "streetAddressLine" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[] getStreetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETADDRESSLINE$12, targetList);
            com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[] result = new com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetAddressLine getStreetAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetAddressLine)get_store().find_element_user(STREETADDRESSLINE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetAddressLine" element
     */
    public int sizeOfStreetAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETADDRESSLINE$12);
        }
    }
    
    /**
     * Sets array of all "streetAddressLine" element
     */
    public void setStreetAddressLineArray(com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[] streetAddressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetAddressLineArray, STREETADDRESSLINE$12);
        }
    }
    
    /**
     * Sets ith "streetAddressLine" element
     */
    public void setStreetAddressLineArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetAddressLine streetAddressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetAddressLine)get_store().find_element_user(STREETADDRESSLINE$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetAddressLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetAddressLine insertNewStreetAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetAddressLine)get_store().insert_element_user(STREETADDRESSLINE$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetAddressLine addNewStreetAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetAddressLine)get_store().add_element_user(STREETADDRESSLINE$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetAddressLine" element
     */
    public void removeStreetAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETADDRESSLINE$12, i);
        }
    }
    
    /**
     * Gets array of all "houseNumber" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumber[] getHouseNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOUSENUMBER$14, targetList);
            com.walgreens.rxit.ch.cda.AdxpHouseNumber[] result = new com.walgreens.rxit.ch.cda.AdxpHouseNumber[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "houseNumber" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumber getHouseNumberArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumber target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumber)get_store().find_element_user(HOUSENUMBER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "houseNumber" element
     */
    public int sizeOfHouseNumberArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSENUMBER$14);
        }
    }
    
    /**
     * Sets array of all "houseNumber" element
     */
    public void setHouseNumberArray(com.walgreens.rxit.ch.cda.AdxpHouseNumber[] houseNumberArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(houseNumberArray, HOUSENUMBER$14);
        }
    }
    
    /**
     * Sets ith "houseNumber" element
     */
    public void setHouseNumberArray(int i, com.walgreens.rxit.ch.cda.AdxpHouseNumber houseNumber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumber target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumber)get_store().find_element_user(HOUSENUMBER$14, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(houseNumber);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumber" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumber insertNewHouseNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumber target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumber)get_store().insert_element_user(HOUSENUMBER$14, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumber" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumber addNewHouseNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumber target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumber)get_store().add_element_user(HOUSENUMBER$14);
            return target;
        }
    }
    
    /**
     * Removes the ith "houseNumber" element
     */
    public void removeHouseNumber(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSENUMBER$14, i);
        }
    }
    
    /**
     * Gets array of all "houseNumberNumeric" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[] getHouseNumberNumericArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(HOUSENUMBERNUMERIC$16, targetList);
            com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[] result = new com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "houseNumberNumeric" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric getHouseNumberNumericArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric)get_store().find_element_user(HOUSENUMBERNUMERIC$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "houseNumberNumeric" element
     */
    public int sizeOfHouseNumberNumericArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HOUSENUMBERNUMERIC$16);
        }
    }
    
    /**
     * Sets array of all "houseNumberNumeric" element
     */
    public void setHouseNumberNumericArray(com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[] houseNumberNumericArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(houseNumberNumericArray, HOUSENUMBERNUMERIC$16);
        }
    }
    
    /**
     * Sets ith "houseNumberNumeric" element
     */
    public void setHouseNumberNumericArray(int i, com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric houseNumberNumeric)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric)get_store().find_element_user(HOUSENUMBERNUMERIC$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(houseNumberNumeric);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumberNumeric" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric insertNewHouseNumberNumeric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric)get_store().insert_element_user(HOUSENUMBERNUMERIC$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumberNumeric" element
     */
    public com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric addNewHouseNumberNumeric()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric)get_store().add_element_user(HOUSENUMBERNUMERIC$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "houseNumberNumeric" element
     */
    public void removeHouseNumberNumeric(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HOUSENUMBERNUMERIC$16, i);
        }
    }
    
    /**
     * Gets array of all "direction" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDirection[] getDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DIRECTION$18, targetList);
            com.walgreens.rxit.ch.cda.AdxpDirection[] result = new com.walgreens.rxit.ch.cda.AdxpDirection[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "direction" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDirection getDirectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDirection target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDirection)get_store().find_element_user(DIRECTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "direction" element
     */
    public int sizeOfDirectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DIRECTION$18);
        }
    }
    
    /**
     * Sets array of all "direction" element
     */
    public void setDirectionArray(com.walgreens.rxit.ch.cda.AdxpDirection[] directionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(directionArray, DIRECTION$18);
        }
    }
    
    /**
     * Sets ith "direction" element
     */
    public void setDirectionArray(int i, com.walgreens.rxit.ch.cda.AdxpDirection direction)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDirection target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDirection)get_store().find_element_user(DIRECTION$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(direction);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "direction" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDirection insertNewDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDirection target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDirection)get_store().insert_element_user(DIRECTION$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "direction" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDirection addNewDirection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDirection target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDirection)get_store().add_element_user(DIRECTION$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "direction" element
     */
    public void removeDirection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DIRECTION$18, i);
        }
    }
    
    /**
     * Gets array of all "streetName" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetName[] getStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAME$20, targetList);
            com.walgreens.rxit.ch.cda.AdxpStreetName[] result = new com.walgreens.rxit.ch.cda.AdxpStreetName[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetName" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetName getStreetNameArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetName target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetName)get_store().find_element_user(STREETNAME$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetName" element
     */
    public int sizeOfStreetNameArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAME$20);
        }
    }
    
    /**
     * Sets array of all "streetName" element
     */
    public void setStreetNameArray(com.walgreens.rxit.ch.cda.AdxpStreetName[] streetNameArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetNameArray, STREETNAME$20);
        }
    }
    
    /**
     * Sets ith "streetName" element
     */
    public void setStreetNameArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetName streetName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetName target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetName)get_store().find_element_user(STREETNAME$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetName);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetName" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetName insertNewStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetName target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetName)get_store().insert_element_user(STREETNAME$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetName" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetName addNewStreetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetName target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetName)get_store().add_element_user(STREETNAME$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetName" element
     */
    public void removeStreetName(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAME$20, i);
        }
    }
    
    /**
     * Gets array of all "streetNameBase" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameBase[] getStreetNameBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAMEBASE$22, targetList);
            com.walgreens.rxit.ch.cda.AdxpStreetNameBase[] result = new com.walgreens.rxit.ch.cda.AdxpStreetNameBase[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetNameBase" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameBase getStreetNameBaseArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameBase target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameBase)get_store().find_element_user(STREETNAMEBASE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetNameBase" element
     */
    public int sizeOfStreetNameBaseArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAMEBASE$22);
        }
    }
    
    /**
     * Sets array of all "streetNameBase" element
     */
    public void setStreetNameBaseArray(com.walgreens.rxit.ch.cda.AdxpStreetNameBase[] streetNameBaseArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetNameBaseArray, STREETNAMEBASE$22);
        }
    }
    
    /**
     * Sets ith "streetNameBase" element
     */
    public void setStreetNameBaseArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetNameBase streetNameBase)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameBase target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameBase)get_store().find_element_user(STREETNAMEBASE$22, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetNameBase);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameBase" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameBase insertNewStreetNameBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameBase target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameBase)get_store().insert_element_user(STREETNAMEBASE$22, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameBase" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameBase addNewStreetNameBase()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameBase target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameBase)get_store().add_element_user(STREETNAMEBASE$22);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetNameBase" element
     */
    public void removeStreetNameBase(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAMEBASE$22, i);
        }
    }
    
    /**
     * Gets array of all "streetNameType" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameType[] getStreetNameTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(STREETNAMETYPE$24, targetList);
            com.walgreens.rxit.ch.cda.AdxpStreetNameType[] result = new com.walgreens.rxit.ch.cda.AdxpStreetNameType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "streetNameType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameType getStreetNameTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameType)get_store().find_element_user(STREETNAMETYPE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "streetNameType" element
     */
    public int sizeOfStreetNameTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STREETNAMETYPE$24);
        }
    }
    
    /**
     * Sets array of all "streetNameType" element
     */
    public void setStreetNameTypeArray(com.walgreens.rxit.ch.cda.AdxpStreetNameType[] streetNameTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(streetNameTypeArray, STREETNAMETYPE$24);
        }
    }
    
    /**
     * Sets ith "streetNameType" element
     */
    public void setStreetNameTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetNameType streetNameType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameType)get_store().find_element_user(STREETNAMETYPE$24, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(streetNameType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameType insertNewStreetNameType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameType)get_store().insert_element_user(STREETNAMETYPE$24, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpStreetNameType addNewStreetNameType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpStreetNameType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpStreetNameType)get_store().add_element_user(STREETNAMETYPE$24);
            return target;
        }
    }
    
    /**
     * Removes the ith "streetNameType" element
     */
    public void removeStreetNameType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STREETNAMETYPE$24, i);
        }
    }
    
    /**
     * Gets array of all "additionalLocator" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[] getAdditionalLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(ADDITIONALLOCATOR$26, targetList);
            com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[] result = new com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "additionalLocator" element
     */
    public com.walgreens.rxit.ch.cda.AdxpAdditionalLocator getAdditionalLocatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpAdditionalLocator target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpAdditionalLocator)get_store().find_element_user(ADDITIONALLOCATOR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "additionalLocator" element
     */
    public int sizeOfAdditionalLocatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALLOCATOR$26);
        }
    }
    
    /**
     * Sets array of all "additionalLocator" element
     */
    public void setAdditionalLocatorArray(com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[] additionalLocatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(additionalLocatorArray, ADDITIONALLOCATOR$26);
        }
    }
    
    /**
     * Sets ith "additionalLocator" element
     */
    public void setAdditionalLocatorArray(int i, com.walgreens.rxit.ch.cda.AdxpAdditionalLocator additionalLocator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpAdditionalLocator target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpAdditionalLocator)get_store().find_element_user(ADDITIONALLOCATOR$26, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(additionalLocator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalLocator" element
     */
    public com.walgreens.rxit.ch.cda.AdxpAdditionalLocator insertNewAdditionalLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpAdditionalLocator target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpAdditionalLocator)get_store().insert_element_user(ADDITIONALLOCATOR$26, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalLocator" element
     */
    public com.walgreens.rxit.ch.cda.AdxpAdditionalLocator addNewAdditionalLocator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpAdditionalLocator target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpAdditionalLocator)get_store().add_element_user(ADDITIONALLOCATOR$26);
            return target;
        }
    }
    
    /**
     * Removes the ith "additionalLocator" element
     */
    public void removeAdditionalLocator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALLOCATOR$26, i);
        }
    }
    
    /**
     * Gets array of all "unitID" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitID[] getUnitIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNITID$28, targetList);
            com.walgreens.rxit.ch.cda.AdxpUnitID[] result = new com.walgreens.rxit.ch.cda.AdxpUnitID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unitID" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitID getUnitIDArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitID target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitID)get_store().find_element_user(UNITID$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unitID" element
     */
    public int sizeOfUnitIDArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITID$28);
        }
    }
    
    /**
     * Sets array of all "unitID" element
     */
    public void setUnitIDArray(com.walgreens.rxit.ch.cda.AdxpUnitID[] unitIDArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unitIDArray, UNITID$28);
        }
    }
    
    /**
     * Sets ith "unitID" element
     */
    public void setUnitIDArray(int i, com.walgreens.rxit.ch.cda.AdxpUnitID unitID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitID target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitID)get_store().find_element_user(UNITID$28, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unitID);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitID" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitID insertNewUnitID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitID target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitID)get_store().insert_element_user(UNITID$28, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitID" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitID addNewUnitID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitID target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitID)get_store().add_element_user(UNITID$28);
            return target;
        }
    }
    
    /**
     * Removes the ith "unitID" element
     */
    public void removeUnitID(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITID$28, i);
        }
    }
    
    /**
     * Gets array of all "unitType" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitType[] getUnitTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(UNITTYPE$30, targetList);
            com.walgreens.rxit.ch.cda.AdxpUnitType[] result = new com.walgreens.rxit.ch.cda.AdxpUnitType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "unitType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitType getUnitTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitType)get_store().find_element_user(UNITTYPE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "unitType" element
     */
    public int sizeOfUnitTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNITTYPE$30);
        }
    }
    
    /**
     * Sets array of all "unitType" element
     */
    public void setUnitTypeArray(com.walgreens.rxit.ch.cda.AdxpUnitType[] unitTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(unitTypeArray, UNITTYPE$30);
        }
    }
    
    /**
     * Sets ith "unitType" element
     */
    public void setUnitTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpUnitType unitType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitType)get_store().find_element_user(UNITTYPE$30, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(unitType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitType insertNewUnitType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitType)get_store().insert_element_user(UNITTYPE$30, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpUnitType addNewUnitType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpUnitType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpUnitType)get_store().add_element_user(UNITTYPE$30);
            return target;
        }
    }
    
    /**
     * Removes the ith "unitType" element
     */
    public void removeUnitType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNITTYPE$30, i);
        }
    }
    
    /**
     * Gets array of all "careOf" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpCareOf[] getCareOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CAREOF$32, targetList);
            com.walgreens.rxit.ch.cda.AdxpCareOf[] result = new com.walgreens.rxit.ch.cda.AdxpCareOf[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "careOf" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCareOf getCareOfArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCareOf target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCareOf)get_store().find_element_user(CAREOF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "careOf" element
     */
    public int sizeOfCareOfArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CAREOF$32);
        }
    }
    
    /**
     * Sets array of all "careOf" element
     */
    public void setCareOfArray(com.walgreens.rxit.ch.cda.AdxpCareOf[] careOfArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(careOfArray, CAREOF$32);
        }
    }
    
    /**
     * Sets ith "careOf" element
     */
    public void setCareOfArray(int i, com.walgreens.rxit.ch.cda.AdxpCareOf careOf)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCareOf target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCareOf)get_store().find_element_user(CAREOF$32, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(careOf);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "careOf" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCareOf insertNewCareOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCareOf target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCareOf)get_store().insert_element_user(CAREOF$32, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "careOf" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCareOf addNewCareOf()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCareOf target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCareOf)get_store().add_element_user(CAREOF$32);
            return target;
        }
    }
    
    /**
     * Removes the ith "careOf" element
     */
    public void removeCareOf(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CAREOF$32, i);
        }
    }
    
    /**
     * Gets array of all "censusTract" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpCensusTract[] getCensusTractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CENSUSTRACT$34, targetList);
            com.walgreens.rxit.ch.cda.AdxpCensusTract[] result = new com.walgreens.rxit.ch.cda.AdxpCensusTract[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "censusTract" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCensusTract getCensusTractArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCensusTract target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCensusTract)get_store().find_element_user(CENSUSTRACT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "censusTract" element
     */
    public int sizeOfCensusTractArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CENSUSTRACT$34);
        }
    }
    
    /**
     * Sets array of all "censusTract" element
     */
    public void setCensusTractArray(com.walgreens.rxit.ch.cda.AdxpCensusTract[] censusTractArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(censusTractArray, CENSUSTRACT$34);
        }
    }
    
    /**
     * Sets ith "censusTract" element
     */
    public void setCensusTractArray(int i, com.walgreens.rxit.ch.cda.AdxpCensusTract censusTract)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCensusTract target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCensusTract)get_store().find_element_user(CENSUSTRACT$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(censusTract);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "censusTract" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCensusTract insertNewCensusTract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCensusTract target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCensusTract)get_store().insert_element_user(CENSUSTRACT$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "censusTract" element
     */
    public com.walgreens.rxit.ch.cda.AdxpCensusTract addNewCensusTract()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpCensusTract target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpCensusTract)get_store().add_element_user(CENSUSTRACT$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "censusTract" element
     */
    public void removeCensusTract(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CENSUSTRACT$34, i);
        }
    }
    
    /**
     * Gets array of all "deliveryAddressLine" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[] getDeliveryAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYADDRESSLINE$36, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine getDeliveryAddressLineArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine)get_store().find_element_user(DELIVERYADDRESSLINE$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryAddressLine" element
     */
    public int sizeOfDeliveryAddressLineArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYADDRESSLINE$36);
        }
    }
    
    /**
     * Sets array of all "deliveryAddressLine" element
     */
    public void setDeliveryAddressLineArray(com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[] deliveryAddressLineArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryAddressLineArray, DELIVERYADDRESSLINE$36);
        }
    }
    
    /**
     * Sets ith "deliveryAddressLine" element
     */
    public void setDeliveryAddressLineArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine deliveryAddressLine)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine)get_store().find_element_user(DELIVERYADDRESSLINE$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryAddressLine);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine insertNewDeliveryAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine)get_store().insert_element_user(DELIVERYADDRESSLINE$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryAddressLine" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine addNewDeliveryAddressLine()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine)get_store().add_element_user(DELIVERYADDRESSLINE$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryAddressLine" element
     */
    public void removeDeliveryAddressLine(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYADDRESSLINE$36, i);
        }
    }
    
    /**
     * Gets array of all "deliveryInstallationType" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[] getDeliveryInstallationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYINSTALLATIONTYPE$38, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryInstallationType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType getDeliveryInstallationTypeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType)get_store().find_element_user(DELIVERYINSTALLATIONTYPE$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryInstallationType" element
     */
    public int sizeOfDeliveryInstallationTypeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYINSTALLATIONTYPE$38);
        }
    }
    
    /**
     * Sets array of all "deliveryInstallationType" element
     */
    public void setDeliveryInstallationTypeArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[] deliveryInstallationTypeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryInstallationTypeArray, DELIVERYINSTALLATIONTYPE$38);
        }
    }
    
    /**
     * Sets ith "deliveryInstallationType" element
     */
    public void setDeliveryInstallationTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType deliveryInstallationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType)get_store().find_element_user(DELIVERYINSTALLATIONTYPE$38, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryInstallationType);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType insertNewDeliveryInstallationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType)get_store().insert_element_user(DELIVERYINSTALLATIONTYPE$38, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationType" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType addNewDeliveryInstallationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType)get_store().add_element_user(DELIVERYINSTALLATIONTYPE$38);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryInstallationType" element
     */
    public void removeDeliveryInstallationType(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYINSTALLATIONTYPE$38, i);
        }
    }
    
    /**
     * Gets array of all "deliveryInstallationArea" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[] getDeliveryInstallationAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYINSTALLATIONAREA$40, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryInstallationArea" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea getDeliveryInstallationAreaArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea)get_store().find_element_user(DELIVERYINSTALLATIONAREA$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryInstallationArea" element
     */
    public int sizeOfDeliveryInstallationAreaArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYINSTALLATIONAREA$40);
        }
    }
    
    /**
     * Sets array of all "deliveryInstallationArea" element
     */
    public void setDeliveryInstallationAreaArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[] deliveryInstallationAreaArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryInstallationAreaArray, DELIVERYINSTALLATIONAREA$40);
        }
    }
    
    /**
     * Sets ith "deliveryInstallationArea" element
     */
    public void setDeliveryInstallationAreaArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea deliveryInstallationArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea)get_store().find_element_user(DELIVERYINSTALLATIONAREA$40, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryInstallationArea);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationArea" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea insertNewDeliveryInstallationArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea)get_store().insert_element_user(DELIVERYINSTALLATIONAREA$40, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationArea" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea addNewDeliveryInstallationArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea)get_store().add_element_user(DELIVERYINSTALLATIONAREA$40);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryInstallationArea" element
     */
    public void removeDeliveryInstallationArea(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYINSTALLATIONAREA$40, i);
        }
    }
    
    /**
     * Gets array of all "deliveryInstallationQualifier" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[] getDeliveryInstallationQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYINSTALLATIONQUALIFIER$42, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryInstallationQualifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier getDeliveryInstallationQualifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier)get_store().find_element_user(DELIVERYINSTALLATIONQUALIFIER$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryInstallationQualifier" element
     */
    public int sizeOfDeliveryInstallationQualifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYINSTALLATIONQUALIFIER$42);
        }
    }
    
    /**
     * Sets array of all "deliveryInstallationQualifier" element
     */
    public void setDeliveryInstallationQualifierArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[] deliveryInstallationQualifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryInstallationQualifierArray, DELIVERYINSTALLATIONQUALIFIER$42);
        }
    }
    
    /**
     * Sets ith "deliveryInstallationQualifier" element
     */
    public void setDeliveryInstallationQualifierArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier deliveryInstallationQualifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier)get_store().find_element_user(DELIVERYINSTALLATIONQUALIFIER$42, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryInstallationQualifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationQualifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier insertNewDeliveryInstallationQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier)get_store().insert_element_user(DELIVERYINSTALLATIONQUALIFIER$42, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationQualifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier addNewDeliveryInstallationQualifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier)get_store().add_element_user(DELIVERYINSTALLATIONQUALIFIER$42);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryInstallationQualifier" element
     */
    public void removeDeliveryInstallationQualifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYINSTALLATIONQUALIFIER$42, i);
        }
    }
    
    /**
     * Gets array of all "deliveryMode" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryMode[] getDeliveryModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYMODE$44, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryMode[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryMode[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryMode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryMode getDeliveryModeArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryMode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryMode)get_store().find_element_user(DELIVERYMODE$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryMode" element
     */
    public int sizeOfDeliveryModeArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYMODE$44);
        }
    }
    
    /**
     * Sets array of all "deliveryMode" element
     */
    public void setDeliveryModeArray(com.walgreens.rxit.ch.cda.AdxpDeliveryMode[] deliveryModeArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryModeArray, DELIVERYMODE$44);
        }
    }
    
    /**
     * Sets ith "deliveryMode" element
     */
    public void setDeliveryModeArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryMode deliveryMode)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryMode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryMode)get_store().find_element_user(DELIVERYMODE$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryMode);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryMode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryMode insertNewDeliveryMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryMode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryMode)get_store().insert_element_user(DELIVERYMODE$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryMode" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryMode addNewDeliveryMode()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryMode target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryMode)get_store().add_element_user(DELIVERYMODE$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryMode" element
     */
    public void removeDeliveryMode(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYMODE$44, i);
        }
    }
    
    /**
     * Gets array of all "deliveryModeIdentifier" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[] getDeliveryModeIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(DELIVERYMODEIDENTIFIER$46, targetList);
            com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[] result = new com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "deliveryModeIdentifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier getDeliveryModeIdentifierArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier)get_store().find_element_user(DELIVERYMODEIDENTIFIER$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "deliveryModeIdentifier" element
     */
    public int sizeOfDeliveryModeIdentifierArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYMODEIDENTIFIER$46);
        }
    }
    
    /**
     * Sets array of all "deliveryModeIdentifier" element
     */
    public void setDeliveryModeIdentifierArray(com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[] deliveryModeIdentifierArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(deliveryModeIdentifierArray, DELIVERYMODEIDENTIFIER$46);
        }
    }
    
    /**
     * Sets ith "deliveryModeIdentifier" element
     */
    public void setDeliveryModeIdentifierArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier deliveryModeIdentifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier)get_store().find_element_user(DELIVERYMODEIDENTIFIER$46, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(deliveryModeIdentifier);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryModeIdentifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier insertNewDeliveryModeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier)get_store().insert_element_user(DELIVERYMODEIDENTIFIER$46, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryModeIdentifier" element
     */
    public com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier addNewDeliveryModeIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier)get_store().add_element_user(DELIVERYMODEIDENTIFIER$46);
            return target;
        }
    }
    
    /**
     * Removes the ith "deliveryModeIdentifier" element
     */
    public void removeDeliveryModeIdentifier(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYMODEIDENTIFIER$46, i);
        }
    }
    
    /**
     * Gets array of all "buildingNumberSuffix" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[] getBuildingNumberSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(BUILDINGNUMBERSUFFIX$48, targetList);
            com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[] result = new com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "buildingNumberSuffix" element
     */
    public com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix getBuildingNumberSuffixArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix)get_store().find_element_user(BUILDINGNUMBERSUFFIX$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "buildingNumberSuffix" element
     */
    public int sizeOfBuildingNumberSuffixArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BUILDINGNUMBERSUFFIX$48);
        }
    }
    
    /**
     * Sets array of all "buildingNumberSuffix" element
     */
    public void setBuildingNumberSuffixArray(com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[] buildingNumberSuffixArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(buildingNumberSuffixArray, BUILDINGNUMBERSUFFIX$48);
        }
    }
    
    /**
     * Sets ith "buildingNumberSuffix" element
     */
    public void setBuildingNumberSuffixArray(int i, com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix buildingNumberSuffix)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix)get_store().find_element_user(BUILDINGNUMBERSUFFIX$48, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(buildingNumberSuffix);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "buildingNumberSuffix" element
     */
    public com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix insertNewBuildingNumberSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix)get_store().insert_element_user(BUILDINGNUMBERSUFFIX$48, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "buildingNumberSuffix" element
     */
    public com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix addNewBuildingNumberSuffix()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix)get_store().add_element_user(BUILDINGNUMBERSUFFIX$48);
            return target;
        }
    }
    
    /**
     * Removes the ith "buildingNumberSuffix" element
     */
    public void removeBuildingNumberSuffix(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BUILDINGNUMBERSUFFIX$48, i);
        }
    }
    
    /**
     * Gets array of all "postBox" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpPostBox[] getPostBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(POSTBOX$50, targetList);
            com.walgreens.rxit.ch.cda.AdxpPostBox[] result = new com.walgreens.rxit.ch.cda.AdxpPostBox[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "postBox" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostBox getPostBoxArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostBox target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostBox)get_store().find_element_user(POSTBOX$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "postBox" element
     */
    public int sizeOfPostBoxArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POSTBOX$50);
        }
    }
    
    /**
     * Sets array of all "postBox" element
     */
    public void setPostBoxArray(com.walgreens.rxit.ch.cda.AdxpPostBox[] postBoxArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(postBoxArray, POSTBOX$50);
        }
    }
    
    /**
     * Sets ith "postBox" element
     */
    public void setPostBoxArray(int i, com.walgreens.rxit.ch.cda.AdxpPostBox postBox)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostBox target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostBox)get_store().find_element_user(POSTBOX$50, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(postBox);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postBox" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostBox insertNewPostBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostBox target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostBox)get_store().insert_element_user(POSTBOX$50, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postBox" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPostBox addNewPostBox()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPostBox target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPostBox)get_store().add_element_user(POSTBOX$50);
            return target;
        }
    }
    
    /**
     * Removes the ith "postBox" element
     */
    public void removePostBox(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POSTBOX$50, i);
        }
    }
    
    /**
     * Gets array of all "precinct" elements
     */
    public com.walgreens.rxit.ch.cda.AdxpPrecinct[] getPrecinctArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRECINCT$52, targetList);
            com.walgreens.rxit.ch.cda.AdxpPrecinct[] result = new com.walgreens.rxit.ch.cda.AdxpPrecinct[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "precinct" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPrecinct getPrecinctArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPrecinct target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPrecinct)get_store().find_element_user(PRECINCT$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "precinct" element
     */
    public int sizeOfPrecinctArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRECINCT$52);
        }
    }
    
    /**
     * Sets array of all "precinct" element
     */
    public void setPrecinctArray(com.walgreens.rxit.ch.cda.AdxpPrecinct[] precinctArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(precinctArray, PRECINCT$52);
        }
    }
    
    /**
     * Sets ith "precinct" element
     */
    public void setPrecinctArray(int i, com.walgreens.rxit.ch.cda.AdxpPrecinct precinct)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPrecinct target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPrecinct)get_store().find_element_user(PRECINCT$52, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(precinct);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precinct" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPrecinct insertNewPrecinct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPrecinct target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPrecinct)get_store().insert_element_user(PRECINCT$52, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precinct" element
     */
    public com.walgreens.rxit.ch.cda.AdxpPrecinct addNewPrecinct()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.AdxpPrecinct target = null;
            target = (com.walgreens.rxit.ch.cda.AdxpPrecinct)get_store().add_element_user(PRECINCT$52);
            return target;
        }
    }
    
    /**
     * Removes the ith "precinct" element
     */
    public void removePrecinct(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRECINCT$52, i);
        }
    }
    
    /**
     * Gets array of all "useablePeriod" elements
     */
    public com.walgreens.rxit.ch.cda.SXCMTS[] getUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(USEABLEPERIOD$54, targetList);
            com.walgreens.rxit.ch.cda.SXCMTS[] result = new com.walgreens.rxit.ch.cda.SXCMTS[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS getUseablePeriodArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(USEABLEPERIOD$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "useablePeriod" element
     */
    public int sizeOfUseablePeriodArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USEABLEPERIOD$54);
        }
    }
    
    /**
     * Sets array of all "useablePeriod" element
     */
    public void setUseablePeriodArray(com.walgreens.rxit.ch.cda.SXCMTS[] useablePeriodArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(useablePeriodArray, USEABLEPERIOD$54);
        }
    }
    
    /**
     * Sets ith "useablePeriod" element
     */
    public void setUseablePeriodArray(int i, com.walgreens.rxit.ch.cda.SXCMTS useablePeriod)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().find_element_user(USEABLEPERIOD$54, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(useablePeriod);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS insertNewUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().insert_element_user(USEABLEPERIOD$54, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useablePeriod" element
     */
    public com.walgreens.rxit.ch.cda.SXCMTS addNewUseablePeriod()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SXCMTS target = null;
            target = (com.walgreens.rxit.ch.cda.SXCMTS)get_store().add_element_user(USEABLEPERIOD$54);
            return target;
        }
    }
    
    /**
     * Removes the ith "useablePeriod" element
     */
    public void removeUseablePeriod(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USEABLEPERIOD$54, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$56);
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
    public com.walgreens.rxit.ch.cda.SetPostalAddressUse xgetUse()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetPostalAddressUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetPostalAddressUse)get_store().find_attribute_user(USE$56);
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
            return get_store().find_attribute_user(USE$56) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(USE$56);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(USE$56);
            }
            target.setListValue(use);
        }
    }
    
    /**
     * Sets (as xml) the "use" attribute
     */
    public void xsetUse(com.walgreens.rxit.ch.cda.SetPostalAddressUse use)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.SetPostalAddressUse target = null;
            target = (com.walgreens.rxit.ch.cda.SetPostalAddressUse)get_store().find_attribute_user(USE$56);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.SetPostalAddressUse)get_store().add_attribute_user(USE$56);
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
            get_store().remove_attribute(USE$56);
        }
    }
    
    /**
     * Gets the "isNotOrdered" attribute
     */
    public boolean getIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNOTORDERED$58);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "isNotOrdered" attribute
     */
    public com.walgreens.rxit.ch.cda.Bl2 xgetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(ISNOTORDERED$58);
            return target;
        }
    }
    
    /**
     * True if has "isNotOrdered" attribute
     */
    public boolean isSetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ISNOTORDERED$58) != null;
        }
    }
    
    /**
     * Sets the "isNotOrdered" attribute
     */
    public void setIsNotOrdered(boolean isNotOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ISNOTORDERED$58);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ISNOTORDERED$58);
            }
            target.setBooleanValue(isNotOrdered);
        }
    }
    
    /**
     * Sets (as xml) the "isNotOrdered" attribute
     */
    public void xsetIsNotOrdered(com.walgreens.rxit.ch.cda.Bl2 isNotOrdered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.walgreens.rxit.ch.cda.Bl2 target = null;
            target = (com.walgreens.rxit.ch.cda.Bl2)get_store().find_attribute_user(ISNOTORDERED$58);
            if (target == null)
            {
                target = (com.walgreens.rxit.ch.cda.Bl2)get_store().add_attribute_user(ISNOTORDERED$58);
            }
            target.set(isNotOrdered);
        }
    }
    
    /**
     * Unsets the "isNotOrdered" attribute
     */
    public void unsetIsNotOrdered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ISNOTORDERED$58);
        }
    }
}
