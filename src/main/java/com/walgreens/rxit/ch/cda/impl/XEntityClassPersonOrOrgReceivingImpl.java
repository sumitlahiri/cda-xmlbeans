/*
 * XML Type:  x_EntityClassPersonOrOrgReceiving
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML x_EntityClassPersonOrOrgReceiving(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.State
 *     com.walgreens.rxit.ch.cda.EntityClassOrganization$Member
 *     com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving$Member
 */
public class XEntityClassPersonOrOrgReceivingImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving, com.walgreens.rxit.ch.cda.EntityClassOrganization, com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving.Member
{
    private static final long serialVersionUID = 1L;
    
    public XEntityClassPersonOrOrgReceivingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected XEntityClassPersonOrOrgReceivingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.XEntityClassPersonOrOrgReceiving.Member
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
