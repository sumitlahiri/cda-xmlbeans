/*
 * XML Type:  PersonNamePartQualifier
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.PersonNamePartQualifier
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML PersonNamePartQualifier(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.PersonNamePartAffixTypes
 *     com.walgreens.rxit.ch.cda.PersonNamePartChangeQualifier
 *     com.walgreens.rxit.ch.cda.PersonNamePartMiscQualifier
 *     com.walgreens.rxit.ch.cda.PersonNamePartQualifier$Member
 */
public class PersonNamePartQualifierImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.PersonNamePartQualifier, com.walgreens.rxit.ch.cda.PersonNamePartAffixTypes, com.walgreens.rxit.ch.cda.PersonNamePartChangeQualifier, com.walgreens.rxit.ch.cda.PersonNamePartMiscQualifier, com.walgreens.rxit.ch.cda.PersonNamePartQualifier.Member
{
    private static final long serialVersionUID = 1L;
    
    public PersonNamePartQualifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected PersonNamePartQualifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.PersonNamePartQualifier$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.PersonNamePartQualifier.Member
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
