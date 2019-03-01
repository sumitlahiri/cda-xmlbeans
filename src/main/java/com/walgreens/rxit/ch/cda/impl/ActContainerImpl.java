/*
 * XML Type:  ActContainer
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ActContainer
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ActContainer(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ActClinicalDocument1
 *     com.walgreens.rxit.ch.cda.ActClassDocument1$Member
 *     com.walgreens.rxit.ch.cda.ActClassComposition$Member
 *     com.walgreens.rxit.ch.cda.ActClassEntry
 *     com.walgreens.rxit.ch.cda.ActClassExtract
 *     com.walgreens.rxit.ch.cda.ActClassOrganizer
 *     com.walgreens.rxit.ch.cda.ActContainer$Member
 */
public class ActContainerImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ActContainer, com.walgreens.rxit.ch.cda.ActClassComposition, com.walgreens.rxit.ch.cda.ActClassEntry, com.walgreens.rxit.ch.cda.ActClassExtract, com.walgreens.rxit.ch.cda.ActClassOrganizer, com.walgreens.rxit.ch.cda.ActContainer.Member
{
    private static final long serialVersionUID = 1L;
    
    public ActContainerImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ActContainerImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
    /**
     * An anonymous inner XML type.
     *
     * This is an atomic type that is a restriction of com.walgreens.rxit.ch.cda.ActContainer$Member.
     */
    public static class MemberImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.walgreens.rxit.ch.cda.ActContainer.Member
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
