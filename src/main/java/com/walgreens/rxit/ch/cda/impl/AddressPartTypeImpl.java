/*
 * XML Type:  AddressPartType
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.AddressPartType
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML AddressPartType(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.AdditionalLocator
 *     com.walgreens.rxit.ch.cda.DeliveryAddressLine
 *     com.walgreens.rxit.ch.cda.BuildingNumber
 *     com.walgreens.rxit.ch.cda.StreetName
 *     com.walgreens.rxit.ch.cda.StreetAddressLine$Member
 *     com.walgreens.rxit.ch.cda.AddressPartType$Member
 */
public class AddressPartTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.AddressPartType, com.walgreens.rxit.ch.cda.AdditionalLocator, com.walgreens.rxit.ch.cda.DeliveryAddressLine, com.walgreens.rxit.ch.cda.StreetAddressLine, com.walgreens.rxit.ch.cda.AddressPartType.Member
{
    private static final long serialVersionUID = 1L;
    
    public AddressPartTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected AddressPartTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.AddressPartType$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.AddressPartType.Member
    {
        private static final long serialVersionUID = 1L;
        
        public MemberImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected MemberImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
