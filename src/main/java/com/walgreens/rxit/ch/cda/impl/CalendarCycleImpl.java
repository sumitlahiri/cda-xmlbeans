/*
 * XML Type:  CalendarCycle
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.CalendarCycle
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML CalendarCycle(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.CalendarCycleOneLetter
 *     com.walgreens.rxit.ch.cda.GregorianCalendarCycle
 *     com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter$Member
 */
public class CalendarCycleImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.CalendarCycle, com.walgreens.rxit.ch.cda.CalendarCycleOneLetter, com.walgreens.rxit.ch.cda.CalendarCycleTwoLetter
{
    private static final long serialVersionUID = 1L;
    
    public CalendarCycleImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected CalendarCycleImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
