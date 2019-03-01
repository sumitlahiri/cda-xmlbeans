/*
 * XML Type:  uid
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.Uid
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML uid(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.Oid
 *     com.walgreens.rxit.ch.cda.Uuid
 *     com.walgreens.rxit.ch.cda.Ruid
 */
public class UidImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.Uid, com.walgreens.rxit.ch.cda.Oid, com.walgreens.rxit.ch.cda.Uuid, com.walgreens.rxit.ch.cda.Ruid
{
    private static final long serialVersionUID = 1L;
    
    public UidImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected UidImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
