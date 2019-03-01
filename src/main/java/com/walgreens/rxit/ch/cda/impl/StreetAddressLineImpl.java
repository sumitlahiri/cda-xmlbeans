/*
 * XML Type:  StreetAddressLine
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.StreetAddressLine
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML StreetAddressLine(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.BuildingNumber
 *     com.walgreens.rxit.ch.cda.StreetName
 *     com.walgreens.rxit.ch.cda.StreetAddressLine$Member
 */
public class StreetAddressLineImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.StreetAddressLine, com.walgreens.rxit.ch.cda.BuildingNumber, com.walgreens.rxit.ch.cda.StreetName, com.walgreens.rxit.ch.cda.StreetAddressLine.Member
{
    private static final long serialVersionUID = 1L;
    
    public StreetAddressLineImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected StreetAddressLineImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.StreetAddressLine$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.StreetAddressLine.Member
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
