package com.sun.xml.bind;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * {@link XmlAdapter} useful for mapping interfaces.
 *
 * See <a href="https://jaxb.dev.java.net/guide/Mapping_interfaces.html">The JAXB user's guide</a>
 * for more about this adapter class.
 *
 * @author Kohsuke Kawaguchi
 * @since JAXB 2.1
 */
public final class AnyTypeAdapter extends XmlAdapter<Object,Object> {
    /**
     * Noop. Just returns the object given as the argument.
     */
    public Object unmarshal(Object v) {
        return v;
    }

    /**
     * Noop. Just returns the object given as the argument.
     */
    public Object marshal(Object v) {
        return v;
    }
}
