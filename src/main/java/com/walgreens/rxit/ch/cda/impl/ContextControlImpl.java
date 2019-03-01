/*
 * XML Type:  ContextControl
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.ContextControl
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML ContextControl(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ContextControlAdditive
 *     com.walgreens.rxit.ch.cda.ContextControlNonPropagating
 *     com.walgreens.rxit.ch.cda.ContextControlOverriding
 *     com.walgreens.rxit.ch.cda.ContextControlPropagating
 */
public class ContextControlImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.ContextControl, com.walgreens.rxit.ch.cda.ContextControlAdditive, com.walgreens.rxit.ch.cda.ContextControlNonPropagating, com.walgreens.rxit.ch.cda.ContextControlOverriding, com.walgreens.rxit.ch.cda.ContextControlPropagating
{
    private static final long serialVersionUID = 1L;
    
    public ContextControlImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected ContextControlImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
