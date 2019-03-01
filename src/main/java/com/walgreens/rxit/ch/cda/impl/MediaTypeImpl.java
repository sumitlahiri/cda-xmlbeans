/*
 * XML Type:  MediaType
 * Namespace: urn:hl7-org:v3
 * Java type: com.walgreens.rxit.ch.cda.MediaType
 *
 * Automatically generated - do not modify.
 */
package com.walgreens.rxit.ch.cda.impl;
/**
 * An XML MediaType(@urn:hl7-org:v3).
 *
 * This is a union type. Instances are of one of the following types:
 *     com.walgreens.rxit.ch.cda.ApplicationMediaType
 *     com.walgreens.rxit.ch.cda.AudioMediaType
 *     com.walgreens.rxit.ch.cda.ImageMediaType
 *     com.walgreens.rxit.ch.cda.ModelMediaType
 *     com.walgreens.rxit.ch.cda.MultipartMediaType
 *     com.walgreens.rxit.ch.cda.TextMediaType
 *     com.walgreens.rxit.ch.cda.VideoMediaType
 */
public class MediaTypeImpl extends org.apache.xmlbeans.impl.values.XmlUnionImpl implements com.walgreens.rxit.ch.cda.MediaType, com.walgreens.rxit.ch.cda.ApplicationMediaType, com.walgreens.rxit.ch.cda.AudioMediaType, com.walgreens.rxit.ch.cda.ImageMediaType, com.walgreens.rxit.ch.cda.ModelMediaType, com.walgreens.rxit.ch.cda.MultipartMediaType, com.walgreens.rxit.ch.cda.TextMediaType, com.walgreens.rxit.ch.cda.VideoMediaType
{
    private static final long serialVersionUID = 1L;
    
    public MediaTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType, false);
    }
    
    protected MediaTypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
    {
        super(sType, b);
    }
}
