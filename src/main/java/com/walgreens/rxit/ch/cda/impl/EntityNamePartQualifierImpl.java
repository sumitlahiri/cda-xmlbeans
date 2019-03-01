/*
 * XML Type:  EntityNamePartQualifier
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityNamePartQualifier
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityNamePartQualifier(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.OrganizationNamePartQualifier
 *     com.walgreens.rxit.ch.cda.PersonNamePartAffixTypes
 *     com.walgreens.rxit.ch.cda.PersonNamePartChangeQualifier
 *     com.walgreens.rxit.ch.cda.PersonNamePartMiscQualifier
 *     com.walgreens.rxit.ch.cda.PersonNamePartQualifier$Member
 */
public class EntityNamePartQualifierImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityNamePartQualifier, com.walgreens.rxit.ch.cda.OrganizationNamePartQualifier, com.walgreens.rxit.ch.cda.PersonNamePartQualifier
{
    private static final long serialVersionUID = 1L;
    
    public EntityNamePartQualifierImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityNamePartQualifierImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
