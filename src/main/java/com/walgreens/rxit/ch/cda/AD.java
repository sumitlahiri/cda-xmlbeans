/*
 * XML Type:  AD
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.AD
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda;


/**
 * An XML AD(@urn:hl7-org:v3).
 *
 * This is a complex type.
 */
public interface AD extends com.walgreens.rxit.ch.cda.ANY
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AD.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sC6C932674B7EAA12634C8FB37603AE38").resolveHandle("ad624atype");
    
    /**
     * Gets array of all "delimiter" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDelimiter[] getDelimiterArray();
    
    /**
     * Gets ith "delimiter" element
     */
    com.walgreens.rxit.ch.cda.AdxpDelimiter getDelimiterArray(int i);
    
    /**
     * Returns number of "delimiter" element
     */
    int sizeOfDelimiterArray();
    
    /**
     * Sets array of all "delimiter" element
     */
    void setDelimiterArray(com.walgreens.rxit.ch.cda.AdxpDelimiter[] delimiterArray);
    
    /**
     * Sets ith "delimiter" element
     */
    void setDelimiterArray(int i, com.walgreens.rxit.ch.cda.AdxpDelimiter delimiter);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "delimiter" element
     */
    com.walgreens.rxit.ch.cda.AdxpDelimiter insertNewDelimiter(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "delimiter" element
     */
    com.walgreens.rxit.ch.cda.AdxpDelimiter addNewDelimiter();
    
    /**
     * Removes the ith "delimiter" element
     */
    void removeDelimiter(int i);
    
    /**
     * Gets array of all "country" elements
     */
    com.walgreens.rxit.ch.cda.AdxpCountry[] getCountryArray();
    
    /**
     * Gets ith "country" element
     */
    com.walgreens.rxit.ch.cda.AdxpCountry getCountryArray(int i);
    
    /**
     * Returns number of "country" element
     */
    int sizeOfCountryArray();
    
    /**
     * Sets array of all "country" element
     */
    void setCountryArray(com.walgreens.rxit.ch.cda.AdxpCountry[] countryArray);
    
    /**
     * Sets ith "country" element
     */
    void setCountryArray(int i, com.walgreens.rxit.ch.cda.AdxpCountry country);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "country" element
     */
    com.walgreens.rxit.ch.cda.AdxpCountry insertNewCountry(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "country" element
     */
    com.walgreens.rxit.ch.cda.AdxpCountry addNewCountry();
    
    /**
     * Removes the ith "country" element
     */
    void removeCountry(int i);
    
    /**
     * Gets array of all "state" elements
     */
    com.walgreens.rxit.ch.cda.AdxpState[] getStateArray();
    
    /**
     * Gets ith "state" element
     */
    com.walgreens.rxit.ch.cda.AdxpState getStateArray(int i);
    
    /**
     * Returns number of "state" element
     */
    int sizeOfStateArray();
    
    /**
     * Sets array of all "state" element
     */
    void setStateArray(com.walgreens.rxit.ch.cda.AdxpState[] stateArray);
    
    /**
     * Sets ith "state" element
     */
    void setStateArray(int i, com.walgreens.rxit.ch.cda.AdxpState state);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "state" element
     */
    com.walgreens.rxit.ch.cda.AdxpState insertNewState(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "state" element
     */
    com.walgreens.rxit.ch.cda.AdxpState addNewState();
    
    /**
     * Removes the ith "state" element
     */
    void removeState(int i);
    
    /**
     * Gets array of all "county" elements
     */
    com.walgreens.rxit.ch.cda.AdxpCounty[] getCountyArray();
    
    /**
     * Gets ith "county" element
     */
    com.walgreens.rxit.ch.cda.AdxpCounty getCountyArray(int i);
    
    /**
     * Returns number of "county" element
     */
    int sizeOfCountyArray();
    
    /**
     * Sets array of all "county" element
     */
    void setCountyArray(com.walgreens.rxit.ch.cda.AdxpCounty[] countyArray);
    
    /**
     * Sets ith "county" element
     */
    void setCountyArray(int i, com.walgreens.rxit.ch.cda.AdxpCounty county);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "county" element
     */
    com.walgreens.rxit.ch.cda.AdxpCounty insertNewCounty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "county" element
     */
    com.walgreens.rxit.ch.cda.AdxpCounty addNewCounty();
    
    /**
     * Removes the ith "county" element
     */
    void removeCounty(int i);
    
    /**
     * Gets array of all "city" elements
     */
    com.walgreens.rxit.ch.cda.AdxpCity[] getCityArray();
    
    /**
     * Gets ith "city" element
     */
    com.walgreens.rxit.ch.cda.AdxpCity getCityArray(int i);
    
    /**
     * Returns number of "city" element
     */
    int sizeOfCityArray();
    
    /**
     * Sets array of all "city" element
     */
    void setCityArray(com.walgreens.rxit.ch.cda.AdxpCity[] cityArray);
    
    /**
     * Sets ith "city" element
     */
    void setCityArray(int i, com.walgreens.rxit.ch.cda.AdxpCity city);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "city" element
     */
    com.walgreens.rxit.ch.cda.AdxpCity insertNewCity(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "city" element
     */
    com.walgreens.rxit.ch.cda.AdxpCity addNewCity();
    
    /**
     * Removes the ith "city" element
     */
    void removeCity(int i);
    
    /**
     * Gets array of all "postalCode" elements
     */
    com.walgreens.rxit.ch.cda.AdxpPostalCode[] getPostalCodeArray();
    
    /**
     * Gets ith "postalCode" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostalCode getPostalCodeArray(int i);
    
    /**
     * Returns number of "postalCode" element
     */
    int sizeOfPostalCodeArray();
    
    /**
     * Sets array of all "postalCode" element
     */
    void setPostalCodeArray(com.walgreens.rxit.ch.cda.AdxpPostalCode[] postalCodeArray);
    
    /**
     * Sets ith "postalCode" element
     */
    void setPostalCodeArray(int i, com.walgreens.rxit.ch.cda.AdxpPostalCode postalCode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postalCode" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostalCode insertNewPostalCode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postalCode" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostalCode addNewPostalCode();
    
    /**
     * Removes the ith "postalCode" element
     */
    void removePostalCode(int i);
    
    /**
     * Gets array of all "streetAddressLine" elements
     */
    com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[] getStreetAddressLineArray();
    
    /**
     * Gets ith "streetAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetAddressLine getStreetAddressLineArray(int i);
    
    /**
     * Returns number of "streetAddressLine" element
     */
    int sizeOfStreetAddressLineArray();
    
    /**
     * Sets array of all "streetAddressLine" element
     */
    void setStreetAddressLineArray(com.walgreens.rxit.ch.cda.AdxpStreetAddressLine[] streetAddressLineArray);
    
    /**
     * Sets ith "streetAddressLine" element
     */
    void setStreetAddressLineArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetAddressLine streetAddressLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetAddressLine insertNewStreetAddressLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetAddressLine addNewStreetAddressLine();
    
    /**
     * Removes the ith "streetAddressLine" element
     */
    void removeStreetAddressLine(int i);
    
    /**
     * Gets array of all "houseNumber" elements
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumber[] getHouseNumberArray();
    
    /**
     * Gets ith "houseNumber" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumber getHouseNumberArray(int i);
    
    /**
     * Returns number of "houseNumber" element
     */
    int sizeOfHouseNumberArray();
    
    /**
     * Sets array of all "houseNumber" element
     */
    void setHouseNumberArray(com.walgreens.rxit.ch.cda.AdxpHouseNumber[] houseNumberArray);
    
    /**
     * Sets ith "houseNumber" element
     */
    void setHouseNumberArray(int i, com.walgreens.rxit.ch.cda.AdxpHouseNumber houseNumber);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumber" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumber insertNewHouseNumber(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumber" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumber addNewHouseNumber();
    
    /**
     * Removes the ith "houseNumber" element
     */
    void removeHouseNumber(int i);
    
    /**
     * Gets array of all "houseNumberNumeric" elements
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[] getHouseNumberNumericArray();
    
    /**
     * Gets ith "houseNumberNumeric" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric getHouseNumberNumericArray(int i);
    
    /**
     * Returns number of "houseNumberNumeric" element
     */
    int sizeOfHouseNumberNumericArray();
    
    /**
     * Sets array of all "houseNumberNumeric" element
     */
    void setHouseNumberNumericArray(com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric[] houseNumberNumericArray);
    
    /**
     * Sets ith "houseNumberNumeric" element
     */
    void setHouseNumberNumericArray(int i, com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric houseNumberNumeric);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "houseNumberNumeric" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric insertNewHouseNumberNumeric(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "houseNumberNumeric" element
     */
    com.walgreens.rxit.ch.cda.AdxpHouseNumberNumeric addNewHouseNumberNumeric();
    
    /**
     * Removes the ith "houseNumberNumeric" element
     */
    void removeHouseNumberNumeric(int i);
    
    /**
     * Gets array of all "direction" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDirection[] getDirectionArray();
    
    /**
     * Gets ith "direction" element
     */
    com.walgreens.rxit.ch.cda.AdxpDirection getDirectionArray(int i);
    
    /**
     * Returns number of "direction" element
     */
    int sizeOfDirectionArray();
    
    /**
     * Sets array of all "direction" element
     */
    void setDirectionArray(com.walgreens.rxit.ch.cda.AdxpDirection[] directionArray);
    
    /**
     * Sets ith "direction" element
     */
    void setDirectionArray(int i, com.walgreens.rxit.ch.cda.AdxpDirection direction);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "direction" element
     */
    com.walgreens.rxit.ch.cda.AdxpDirection insertNewDirection(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "direction" element
     */
    com.walgreens.rxit.ch.cda.AdxpDirection addNewDirection();
    
    /**
     * Removes the ith "direction" element
     */
    void removeDirection(int i);
    
    /**
     * Gets array of all "streetName" elements
     */
    com.walgreens.rxit.ch.cda.AdxpStreetName[] getStreetNameArray();
    
    /**
     * Gets ith "streetName" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetName getStreetNameArray(int i);
    
    /**
     * Returns number of "streetName" element
     */
    int sizeOfStreetNameArray();
    
    /**
     * Sets array of all "streetName" element
     */
    void setStreetNameArray(com.walgreens.rxit.ch.cda.AdxpStreetName[] streetNameArray);
    
    /**
     * Sets ith "streetName" element
     */
    void setStreetNameArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetName streetName);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetName" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetName insertNewStreetName(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetName" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetName addNewStreetName();
    
    /**
     * Removes the ith "streetName" element
     */
    void removeStreetName(int i);
    
    /**
     * Gets array of all "streetNameBase" elements
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameBase[] getStreetNameBaseArray();
    
    /**
     * Gets ith "streetNameBase" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameBase getStreetNameBaseArray(int i);
    
    /**
     * Returns number of "streetNameBase" element
     */
    int sizeOfStreetNameBaseArray();
    
    /**
     * Sets array of all "streetNameBase" element
     */
    void setStreetNameBaseArray(com.walgreens.rxit.ch.cda.AdxpStreetNameBase[] streetNameBaseArray);
    
    /**
     * Sets ith "streetNameBase" element
     */
    void setStreetNameBaseArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetNameBase streetNameBase);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameBase" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameBase insertNewStreetNameBase(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameBase" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameBase addNewStreetNameBase();
    
    /**
     * Removes the ith "streetNameBase" element
     */
    void removeStreetNameBase(int i);
    
    /**
     * Gets array of all "streetNameType" elements
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameType[] getStreetNameTypeArray();
    
    /**
     * Gets ith "streetNameType" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameType getStreetNameTypeArray(int i);
    
    /**
     * Returns number of "streetNameType" element
     */
    int sizeOfStreetNameTypeArray();
    
    /**
     * Sets array of all "streetNameType" element
     */
    void setStreetNameTypeArray(com.walgreens.rxit.ch.cda.AdxpStreetNameType[] streetNameTypeArray);
    
    /**
     * Sets ith "streetNameType" element
     */
    void setStreetNameTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpStreetNameType streetNameType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "streetNameType" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameType insertNewStreetNameType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "streetNameType" element
     */
    com.walgreens.rxit.ch.cda.AdxpStreetNameType addNewStreetNameType();
    
    /**
     * Removes the ith "streetNameType" element
     */
    void removeStreetNameType(int i);
    
    /**
     * Gets array of all "additionalLocator" elements
     */
    com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[] getAdditionalLocatorArray();
    
    /**
     * Gets ith "additionalLocator" element
     */
    com.walgreens.rxit.ch.cda.AdxpAdditionalLocator getAdditionalLocatorArray(int i);
    
    /**
     * Returns number of "additionalLocator" element
     */
    int sizeOfAdditionalLocatorArray();
    
    /**
     * Sets array of all "additionalLocator" element
     */
    void setAdditionalLocatorArray(com.walgreens.rxit.ch.cda.AdxpAdditionalLocator[] additionalLocatorArray);
    
    /**
     * Sets ith "additionalLocator" element
     */
    void setAdditionalLocatorArray(int i, com.walgreens.rxit.ch.cda.AdxpAdditionalLocator additionalLocator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "additionalLocator" element
     */
    com.walgreens.rxit.ch.cda.AdxpAdditionalLocator insertNewAdditionalLocator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "additionalLocator" element
     */
    com.walgreens.rxit.ch.cda.AdxpAdditionalLocator addNewAdditionalLocator();
    
    /**
     * Removes the ith "additionalLocator" element
     */
    void removeAdditionalLocator(int i);
    
    /**
     * Gets array of all "unitID" elements
     */
    com.walgreens.rxit.ch.cda.AdxpUnitID[] getUnitIDArray();
    
    /**
     * Gets ith "unitID" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitID getUnitIDArray(int i);
    
    /**
     * Returns number of "unitID" element
     */
    int sizeOfUnitIDArray();
    
    /**
     * Sets array of all "unitID" element
     */
    void setUnitIDArray(com.walgreens.rxit.ch.cda.AdxpUnitID[] unitIDArray);
    
    /**
     * Sets ith "unitID" element
     */
    void setUnitIDArray(int i, com.walgreens.rxit.ch.cda.AdxpUnitID unitID);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitID" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitID insertNewUnitID(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitID" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitID addNewUnitID();
    
    /**
     * Removes the ith "unitID" element
     */
    void removeUnitID(int i);
    
    /**
     * Gets array of all "unitType" elements
     */
    com.walgreens.rxit.ch.cda.AdxpUnitType[] getUnitTypeArray();
    
    /**
     * Gets ith "unitType" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitType getUnitTypeArray(int i);
    
    /**
     * Returns number of "unitType" element
     */
    int sizeOfUnitTypeArray();
    
    /**
     * Sets array of all "unitType" element
     */
    void setUnitTypeArray(com.walgreens.rxit.ch.cda.AdxpUnitType[] unitTypeArray);
    
    /**
     * Sets ith "unitType" element
     */
    void setUnitTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpUnitType unitType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "unitType" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitType insertNewUnitType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "unitType" element
     */
    com.walgreens.rxit.ch.cda.AdxpUnitType addNewUnitType();
    
    /**
     * Removes the ith "unitType" element
     */
    void removeUnitType(int i);
    
    /**
     * Gets array of all "careOf" elements
     */
    com.walgreens.rxit.ch.cda.AdxpCareOf[] getCareOfArray();
    
    /**
     * Gets ith "careOf" element
     */
    com.walgreens.rxit.ch.cda.AdxpCareOf getCareOfArray(int i);
    
    /**
     * Returns number of "careOf" element
     */
    int sizeOfCareOfArray();
    
    /**
     * Sets array of all "careOf" element
     */
    void setCareOfArray(com.walgreens.rxit.ch.cda.AdxpCareOf[] careOfArray);
    
    /**
     * Sets ith "careOf" element
     */
    void setCareOfArray(int i, com.walgreens.rxit.ch.cda.AdxpCareOf careOf);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "careOf" element
     */
    com.walgreens.rxit.ch.cda.AdxpCareOf insertNewCareOf(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "careOf" element
     */
    com.walgreens.rxit.ch.cda.AdxpCareOf addNewCareOf();
    
    /**
     * Removes the ith "careOf" element
     */
    void removeCareOf(int i);
    
    /**
     * Gets array of all "censusTract" elements
     */
    com.walgreens.rxit.ch.cda.AdxpCensusTract[] getCensusTractArray();
    
    /**
     * Gets ith "censusTract" element
     */
    com.walgreens.rxit.ch.cda.AdxpCensusTract getCensusTractArray(int i);
    
    /**
     * Returns number of "censusTract" element
     */
    int sizeOfCensusTractArray();
    
    /**
     * Sets array of all "censusTract" element
     */
    void setCensusTractArray(com.walgreens.rxit.ch.cda.AdxpCensusTract[] censusTractArray);
    
    /**
     * Sets ith "censusTract" element
     */
    void setCensusTractArray(int i, com.walgreens.rxit.ch.cda.AdxpCensusTract censusTract);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "censusTract" element
     */
    com.walgreens.rxit.ch.cda.AdxpCensusTract insertNewCensusTract(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "censusTract" element
     */
    com.walgreens.rxit.ch.cda.AdxpCensusTract addNewCensusTract();
    
    /**
     * Removes the ith "censusTract" element
     */
    void removeCensusTract(int i);
    
    /**
     * Gets array of all "deliveryAddressLine" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[] getDeliveryAddressLineArray();
    
    /**
     * Gets ith "deliveryAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine getDeliveryAddressLineArray(int i);
    
    /**
     * Returns number of "deliveryAddressLine" element
     */
    int sizeOfDeliveryAddressLineArray();
    
    /**
     * Sets array of all "deliveryAddressLine" element
     */
    void setDeliveryAddressLineArray(com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine[] deliveryAddressLineArray);
    
    /**
     * Sets ith "deliveryAddressLine" element
     */
    void setDeliveryAddressLineArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine deliveryAddressLine);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine insertNewDeliveryAddressLine(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryAddressLine" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryAddressLine addNewDeliveryAddressLine();
    
    /**
     * Removes the ith "deliveryAddressLine" element
     */
    void removeDeliveryAddressLine(int i);
    
    /**
     * Gets array of all "deliveryInstallationType" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[] getDeliveryInstallationTypeArray();
    
    /**
     * Gets ith "deliveryInstallationType" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType getDeliveryInstallationTypeArray(int i);
    
    /**
     * Returns number of "deliveryInstallationType" element
     */
    int sizeOfDeliveryInstallationTypeArray();
    
    /**
     * Sets array of all "deliveryInstallationType" element
     */
    void setDeliveryInstallationTypeArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType[] deliveryInstallationTypeArray);
    
    /**
     * Sets ith "deliveryInstallationType" element
     */
    void setDeliveryInstallationTypeArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType deliveryInstallationType);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationType" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType insertNewDeliveryInstallationType(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationType" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationType addNewDeliveryInstallationType();
    
    /**
     * Removes the ith "deliveryInstallationType" element
     */
    void removeDeliveryInstallationType(int i);
    
    /**
     * Gets array of all "deliveryInstallationArea" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[] getDeliveryInstallationAreaArray();
    
    /**
     * Gets ith "deliveryInstallationArea" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea getDeliveryInstallationAreaArray(int i);
    
    /**
     * Returns number of "deliveryInstallationArea" element
     */
    int sizeOfDeliveryInstallationAreaArray();
    
    /**
     * Sets array of all "deliveryInstallationArea" element
     */
    void setDeliveryInstallationAreaArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea[] deliveryInstallationAreaArray);
    
    /**
     * Sets ith "deliveryInstallationArea" element
     */
    void setDeliveryInstallationAreaArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea deliveryInstallationArea);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationArea" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea insertNewDeliveryInstallationArea(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationArea" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationArea addNewDeliveryInstallationArea();
    
    /**
     * Removes the ith "deliveryInstallationArea" element
     */
    void removeDeliveryInstallationArea(int i);
    
    /**
     * Gets array of all "deliveryInstallationQualifier" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[] getDeliveryInstallationQualifierArray();
    
    /**
     * Gets ith "deliveryInstallationQualifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier getDeliveryInstallationQualifierArray(int i);
    
    /**
     * Returns number of "deliveryInstallationQualifier" element
     */
    int sizeOfDeliveryInstallationQualifierArray();
    
    /**
     * Sets array of all "deliveryInstallationQualifier" element
     */
    void setDeliveryInstallationQualifierArray(com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier[] deliveryInstallationQualifierArray);
    
    /**
     * Sets ith "deliveryInstallationQualifier" element
     */
    void setDeliveryInstallationQualifierArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier deliveryInstallationQualifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryInstallationQualifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier insertNewDeliveryInstallationQualifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryInstallationQualifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryInstallationQualifier addNewDeliveryInstallationQualifier();
    
    /**
     * Removes the ith "deliveryInstallationQualifier" element
     */
    void removeDeliveryInstallationQualifier(int i);
    
    /**
     * Gets array of all "deliveryMode" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryMode[] getDeliveryModeArray();
    
    /**
     * Gets ith "deliveryMode" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryMode getDeliveryModeArray(int i);
    
    /**
     * Returns number of "deliveryMode" element
     */
    int sizeOfDeliveryModeArray();
    
    /**
     * Sets array of all "deliveryMode" element
     */
    void setDeliveryModeArray(com.walgreens.rxit.ch.cda.AdxpDeliveryMode[] deliveryModeArray);
    
    /**
     * Sets ith "deliveryMode" element
     */
    void setDeliveryModeArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryMode deliveryMode);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryMode" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryMode insertNewDeliveryMode(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryMode" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryMode addNewDeliveryMode();
    
    /**
     * Removes the ith "deliveryMode" element
     */
    void removeDeliveryMode(int i);
    
    /**
     * Gets array of all "deliveryModeIdentifier" elements
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[] getDeliveryModeIdentifierArray();
    
    /**
     * Gets ith "deliveryModeIdentifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier getDeliveryModeIdentifierArray(int i);
    
    /**
     * Returns number of "deliveryModeIdentifier" element
     */
    int sizeOfDeliveryModeIdentifierArray();
    
    /**
     * Sets array of all "deliveryModeIdentifier" element
     */
    void setDeliveryModeIdentifierArray(com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier[] deliveryModeIdentifierArray);
    
    /**
     * Sets ith "deliveryModeIdentifier" element
     */
    void setDeliveryModeIdentifierArray(int i, com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier deliveryModeIdentifier);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "deliveryModeIdentifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier insertNewDeliveryModeIdentifier(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "deliveryModeIdentifier" element
     */
    com.walgreens.rxit.ch.cda.AdxpDeliveryModeIdentifier addNewDeliveryModeIdentifier();
    
    /**
     * Removes the ith "deliveryModeIdentifier" element
     */
    void removeDeliveryModeIdentifier(int i);
    
    /**
     * Gets array of all "buildingNumberSuffix" elements
     */
    com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[] getBuildingNumberSuffixArray();
    
    /**
     * Gets ith "buildingNumberSuffix" element
     */
    com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix getBuildingNumberSuffixArray(int i);
    
    /**
     * Returns number of "buildingNumberSuffix" element
     */
    int sizeOfBuildingNumberSuffixArray();
    
    /**
     * Sets array of all "buildingNumberSuffix" element
     */
    void setBuildingNumberSuffixArray(com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix[] buildingNumberSuffixArray);
    
    /**
     * Sets ith "buildingNumberSuffix" element
     */
    void setBuildingNumberSuffixArray(int i, com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix buildingNumberSuffix);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "buildingNumberSuffix" element
     */
    com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix insertNewBuildingNumberSuffix(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "buildingNumberSuffix" element
     */
    com.walgreens.rxit.ch.cda.AdxpBuildingNumberSuffix addNewBuildingNumberSuffix();
    
    /**
     * Removes the ith "buildingNumberSuffix" element
     */
    void removeBuildingNumberSuffix(int i);
    
    /**
     * Gets array of all "postBox" elements
     */
    com.walgreens.rxit.ch.cda.AdxpPostBox[] getPostBoxArray();
    
    /**
     * Gets ith "postBox" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostBox getPostBoxArray(int i);
    
    /**
     * Returns number of "postBox" element
     */
    int sizeOfPostBoxArray();
    
    /**
     * Sets array of all "postBox" element
     */
    void setPostBoxArray(com.walgreens.rxit.ch.cda.AdxpPostBox[] postBoxArray);
    
    /**
     * Sets ith "postBox" element
     */
    void setPostBoxArray(int i, com.walgreens.rxit.ch.cda.AdxpPostBox postBox);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "postBox" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostBox insertNewPostBox(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "postBox" element
     */
    com.walgreens.rxit.ch.cda.AdxpPostBox addNewPostBox();
    
    /**
     * Removes the ith "postBox" element
     */
    void removePostBox(int i);
    
    /**
     * Gets array of all "precinct" elements
     */
    com.walgreens.rxit.ch.cda.AdxpPrecinct[] getPrecinctArray();
    
    /**
     * Gets ith "precinct" element
     */
    com.walgreens.rxit.ch.cda.AdxpPrecinct getPrecinctArray(int i);
    
    /**
     * Returns number of "precinct" element
     */
    int sizeOfPrecinctArray();
    
    /**
     * Sets array of all "precinct" element
     */
    void setPrecinctArray(com.walgreens.rxit.ch.cda.AdxpPrecinct[] precinctArray);
    
    /**
     * Sets ith "precinct" element
     */
    void setPrecinctArray(int i, com.walgreens.rxit.ch.cda.AdxpPrecinct precinct);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "precinct" element
     */
    com.walgreens.rxit.ch.cda.AdxpPrecinct insertNewPrecinct(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "precinct" element
     */
    com.walgreens.rxit.ch.cda.AdxpPrecinct addNewPrecinct();
    
    /**
     * Removes the ith "precinct" element
     */
    void removePrecinct(int i);
    
    /**
     * Gets array of all "useablePeriod" elements
     */
    com.walgreens.rxit.ch.cda.SXCMTS[] getUseablePeriodArray();
    
    /**
     * Gets ith "useablePeriod" element
     */
    com.walgreens.rxit.ch.cda.SXCMTS getUseablePeriodArray(int i);
    
    /**
     * Returns number of "useablePeriod" element
     */
    int sizeOfUseablePeriodArray();
    
    /**
     * Sets array of all "useablePeriod" element
     */
    void setUseablePeriodArray(com.walgreens.rxit.ch.cda.SXCMTS[] useablePeriodArray);
    
    /**
     * Sets ith "useablePeriod" element
     */
    void setUseablePeriodArray(int i, com.walgreens.rxit.ch.cda.SXCMTS useablePeriod);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "useablePeriod" element
     */
    com.walgreens.rxit.ch.cda.SXCMTS insertNewUseablePeriod(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "useablePeriod" element
     */
    com.walgreens.rxit.ch.cda.SXCMTS addNewUseablePeriod();
    
    /**
     * Removes the ith "useablePeriod" element
     */
    void removeUseablePeriod(int i);
    
    /**
     * Gets the "use" attribute
     */
    java.util.List getUse();
    
    /**
     * Gets (as xml) the "use" attribute
     */
    com.walgreens.rxit.ch.cda.SetPostalAddressUse xgetUse();
    
    /**
     * True if has "use" attribute
     */
    boolean isSetUse();
    
    /**
     * Sets the "use" attribute
     */
    void setUse(java.util.List use);
    
    /**
     * Sets (as xml) the "use" attribute
     */
    void xsetUse(com.walgreens.rxit.ch.cda.SetPostalAddressUse use);
    
    /**
     * Unsets the "use" attribute
     */
    void unsetUse();
    
    /**
     * Gets the "isNotOrdered" attribute
     */
    boolean getIsNotOrdered();
    
    /**
     * Gets (as xml) the "isNotOrdered" attribute
     */
    com.walgreens.rxit.ch.cda.Bl2 xgetIsNotOrdered();
    
    /**
     * True if has "isNotOrdered" attribute
     */
    boolean isSetIsNotOrdered();
    
    /**
     * Sets the "isNotOrdered" attribute
     */
    void setIsNotOrdered(boolean isNotOrdered);
    
    /**
     * Sets (as xml) the "isNotOrdered" attribute
     */
    void xsetIsNotOrdered(com.walgreens.rxit.ch.cda.Bl2 isNotOrdered);
    
    /**
     * Unsets the "isNotOrdered" attribute
     */
    void unsetIsNotOrdered();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.walgreens.rxit.ch.cda.AD newInstance() {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.walgreens.rxit.ch.cda.AD parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.walgreens.rxit.ch.cda.AD parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.AD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.walgreens.rxit.ch.cda.AD parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.walgreens.rxit.ch.cda.AD) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
