/*
 * XML Type:  TelecommunicationAddressUse
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.TelecommunicationAddressUse
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML TelecommunicationAddressUse(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.HomeAddressUse
 *     com.walgreens.rxit.ch.cda.WorkPlaceAddressUse
 *     com.walgreens.rxit.ch.cda.AddressUse$Member
 *     com.walgreens.rxit.ch.cda.TelecommunicationAddressUse$Member
 */
public class TelecommunicationAddressUseImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.TelecommunicationAddressUse, com.walgreens.rxit.ch.cda.AddressUse, com.walgreens.rxit.ch.cda.TelecommunicationAddressUse.Member
{
    private static final long serialVersionUID = 1L;
    
    public TelecommunicationAddressUseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected TelecommunicationAddressUseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.TelecommunicationAddressUse$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.TelecommunicationAddressUse.Member
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
