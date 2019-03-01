/*
 * XML Type:  EntityClass
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityClass
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityClass(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityClassNonPersonLivingSubject
 *     com.walgreens.rxit.ch.cda.EntityClassLivingSubject$Member
 *     com.walgreens.rxit.ch.cda.EntityClassContainer
 *     com.walgreens.rxit.ch.cda.EntityClassDevice
 *     com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial$Member
 *     com.walgreens.rxit.ch.cda.EntityClassMaterial$Member
 *     com.walgreens.rxit.ch.cda.State
 *     com.walgreens.rxit.ch.cda.EntityClassOrganization$Member
 *     com.walgreens.rxit.ch.cda.EntityClassPlace
 *     com.walgreens.rxit.ch.cda.EntityClassRoot$Member
 *     com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving$Member
 *     com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving$Member
 */
public class EntityClassImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityClass, com.walgreens.rxit.ch.cda.EntityClassRoot, com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving, com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
