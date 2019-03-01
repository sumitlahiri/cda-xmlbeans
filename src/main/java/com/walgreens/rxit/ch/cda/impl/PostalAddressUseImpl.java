/*
 * XML Type:  PostalAddressUse
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.PostalAddressUse
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML PostalAddressUse(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.HomeAddressUse
 *     com.walgreens.rxit.ch.cda.WorkPlaceAddressUse
 *     com.walgreens.rxit.ch.cda.AddressUse$Member
 *     com.walgreens.rxit.ch.cda.NameRepresentationUse
 *     com.walgreens.rxit.ch.cda.PostalAddressUse$Member
 */
public class PostalAddressUseImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.PostalAddressUse, com.walgreens.rxit.ch.cda.AddressUse, com.walgreens.rxit.ch.cda.NameRepresentationUse, com.walgreens.rxit.ch.cda.PostalAddressUse.Member
{
    private static final long serialVersionUID = 1L;
    
    public PostalAddressUseImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PostalAddressUseImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.PostalAddressUse$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.PostalAddressUse.Member
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
