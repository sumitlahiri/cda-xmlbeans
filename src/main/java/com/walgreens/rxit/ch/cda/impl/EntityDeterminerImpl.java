/*
 * XML Type:  EntityDeterminer
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.EntityDeterminer
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML EntityDeterminer(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.EntityDeterminerDetermined
 *     com.walgreens.rxit.ch.cda.XDeterminerInstanceKind
 *     com.walgreens.rxit.ch.cda.EntityDeterminer$Member
 */
public class EntityDeterminerImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.EntityDeterminer, com.walgreens.rxit.ch.cda.EntityDeterminerDetermined, com.walgreens.rxit.ch.cda.XDeterminerInstanceKind, com.walgreens.rxit.ch.cda.EntityDeterminer.Member
{
    private static final long serialVersionUID = 1L;
    
    public EntityDeterminerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected EntityDeterminerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.EntityDeterminer$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.EntityDeterminer.Member
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
