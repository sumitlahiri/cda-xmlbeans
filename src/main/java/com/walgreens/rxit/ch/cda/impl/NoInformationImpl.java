/*
 * XML Type:  NoInformation
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.NoInformation
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML NoInformation(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.Other
 *     com.walgreens.rxit.ch.cda.AskedButUnknown
 *     com.walgreens.rxit.ch.cda.Unknown$Member
 *     com.walgreens.rxit.ch.cda.NoInformation$Member
 */
public class NoInformationImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.NoInformation, com.walgreens.rxit.ch.cda.Other, com.walgreens.rxit.ch.cda.Unknown, com.walgreens.rxit.ch.cda.NoInformation.Member
{
    private static final long serialVersionUID = 1L;
    
    public NoInformationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected NoInformationImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.NoInformation$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.NoInformation.Member
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
