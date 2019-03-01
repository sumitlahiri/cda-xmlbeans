/*
 * XML Type:  x_EntityClassDocumentReceiving
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML x_EntityClassDocumentReceiving(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.State
 *     com.walgreens.rxit.ch.cda.EntityClassOrganization$Member
 *     com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving$Member
 */
public class XEntityClassDocumentReceivingImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving, com.walgreens.rxit.ch.cda.EntityClassOrganization, com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving.Member
{
    private static final long serialVersionUID = 1L;
    
    public XEntityClassDocumentReceivingImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected XEntityClassDocumentReceivingImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.XEntityClassDocumentReceiving.Member
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
