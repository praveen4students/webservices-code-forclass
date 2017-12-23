//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.10.11 at 12:03:45 PM IST 
//


package com.dyasha.mywebapp.entity.google;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.dyasha.mywebapp.entity.google package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.dyasha.mywebapp.entity.google
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result }
     * 
     */
    public GeocodeResponse.Result createGeocodeResponseResult() {
        return new GeocodeResponse.Result();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry }
     * 
     */
    public GeocodeResponse.Result.Geometry createGeocodeResponseResultGeometry() {
        return new GeocodeResponse.Result.Geometry();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds }
     * 
     */
    public GeocodeResponse.Result.Geometry.Bounds createGeocodeResponseResultGeometryBounds() {
        return new GeocodeResponse.Result.Geometry.Bounds();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport }
     * 
     */
    public GeocodeResponse.Result.Geometry.Viewport createGeocodeResponseResultGeometryViewport() {
        return new GeocodeResponse.Result.Geometry.Viewport();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.AddressComponent }
     * 
     */
    public GeocodeResponse.Result.AddressComponent createGeocodeResponseResultAddressComponent() {
        return new GeocodeResponse.Result.AddressComponent();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Location }
     * 
     */
    public GeocodeResponse.Result.Geometry.Location createGeocodeResponseResultGeometryLocation() {
        return new GeocodeResponse.Result.Geometry.Location();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds.Southwest }
     * 
     */
    public GeocodeResponse.Result.Geometry.Bounds.Southwest createGeocodeResponseResultGeometryBoundsSouthwest() {
        return new GeocodeResponse.Result.Geometry.Bounds.Southwest();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Bounds.Northeast }
     * 
     */
    public GeocodeResponse.Result.Geometry.Bounds.Northeast createGeocodeResponseResultGeometryBoundsNortheast() {
        return new GeocodeResponse.Result.Geometry.Bounds.Northeast();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport.Southwest }
     * 
     */
    public GeocodeResponse.Result.Geometry.Viewport.Southwest createGeocodeResponseResultGeometryViewportSouthwest() {
        return new GeocodeResponse.Result.Geometry.Viewport.Southwest();
    }

    /**
     * Create an instance of {@link GeocodeResponse.Result.Geometry.Viewport.Northeast }
     * 
     */
    public GeocodeResponse.Result.Geometry.Viewport.Northeast createGeocodeResponseResultGeometryViewportNortheast() {
        return new GeocodeResponse.Result.Geometry.Viewport.Northeast();
    }

}
