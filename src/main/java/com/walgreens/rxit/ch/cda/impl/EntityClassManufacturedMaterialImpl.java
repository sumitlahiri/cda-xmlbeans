/*
 * XML Type:  EntityClassManufacturedMaterial
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityClassManufacturedMaterial(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityClassContainer
 *     com.walgreens.rxit.ch.cda.EntityClassDevice
 *     com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial$Member
 */
public class EntityClassManufacturedMaterialImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial, com.walgreens.rxit.ch.cda.EntityClassContainer, com.walgreens.rxit.ch.cda.EntityClassDevice, com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityClassManufacturedMaterialImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityClassManufacturedMaterialImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityClassManufacturedMaterial.Member
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
