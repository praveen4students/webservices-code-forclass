//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.29 at 01:04:34 AM IST 
//


package com.assingment.test.dto;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
		"status",
		"result"
})
@XmlRootElement(name = "GeocodeResponse")
public class GeocodeResponse {

	@XmlElement(required = true)
	protected String status;
	@XmlElement(required = true)
	protected GeocodeResponse.Result result;


	public String getStatus() {
		return status;
	}


	public void setStatus(String value) {
		this.status = value;
	}


	public GeocodeResponse.Result getResult() {
		return result;
	}


	public void setResult(GeocodeResponse.Result value) {
		this.result = value;
	}



	@XmlAccessorType(XmlAccessType.FIELD)
	@XmlType(name = "", propOrder = {
			"type",
			"formattedAddress",
			"addressComponent",
			"geometry",
			"placeId"
	})
	public static class Result {
		@Override
		public String toString() {
			return "Result [type=" + type + "\n" + formattedAddress + "\n"
					+addressComponent + "\n" + geometry + "\nplaceId=" + placeId + "]";
		}
		@XmlElement(required = true)
		protected List<String> type;
		@XmlElement(name = "formatted_address", required = true)
		protected String formattedAddress;
		@XmlElement(name = "address_component", required = true)
		protected List<GeocodeResponse.Result.AddressComponent> addressComponent;
		@XmlElement(required = true)
		protected GeocodeResponse.Result.Geometry geometry;
		@XmlElement(name = "place_id", required = true)
		protected String placeId;


		public List<String> getType() {
			if (type == null) {
				type = new ArrayList<String>();
			}
			return this.type;
		}


		public String getFormattedAddress() {
			return formattedAddress;
		}


		public void setFormattedAddress(String value) {
			this.formattedAddress = value;
		}


		public List<GeocodeResponse.Result.AddressComponent> getAddressComponent() {
			if (addressComponent == null) {
				addressComponent = new ArrayList<GeocodeResponse.Result.AddressComponent>();
			}
			return this.addressComponent;
		}


		public GeocodeResponse.Result.Geometry getGeometry() {
			return geometry;
		}


		public void setGeometry(GeocodeResponse.Result.Geometry value) {
			this.geometry = value;
		}


		public String getPlaceId() {
			return placeId;
		}



		public void setPlaceId(String value) {
			this.placeId = value;
		}



		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"longName",
				"shortName",
				"type"
		})
		public static class AddressComponent {

			@Override
			public String toString() {
				return "\nAddressComponent [longName=" + longName + "\nshortName=" + shortName + "\ntype=" + type + "]";
			}

			@XmlElement(name = "long_name", required = true)
			protected String longName;
			@XmlElement(name = "short_name", required = true)
			protected String shortName;
			@XmlElement(required = true)
			protected List<String> type;


			public String getLongName() {
				return longName;
			}


			public void setLongName(String value) {
				this.longName = value;
			}



			public String getShortName() {
				return shortName;
			}


			public void setShortName(String value) {
				this.shortName = value;
			}


			public List<String> getType() {
				if (type == null) {
					type = new ArrayList<String>();
				}
				return this.type;
			}

		}


		@XmlAccessorType(XmlAccessType.FIELD)
		@XmlType(name = "", propOrder = {
				"location",
				"locationType",
				"viewport",
				"bounds"
		})
		public static class Geometry {

			@Override
			public String toString() {
				return "\nGeometry [location=" + location + "\nlocationType=" + locationType + "\n" + viewport
						+ "\n" + bounds + "]";
			}


			@XmlElement(required = true)
			protected GeocodeResponse.Result.Geometry.Location location;
			@XmlElement(name = "location_type", required = true)
			protected String locationType;
			@XmlElement(required = true)
			protected GeocodeResponse.Result.Geometry.Viewport viewport;
			@XmlElement(required = true)
			protected GeocodeResponse.Result.Geometry.Bounds bounds;


			public GeocodeResponse.Result.Geometry.Location getLocation() {
				return location;
			}


			public void setLocation(GeocodeResponse.Result.Geometry.Location value) {
				this.location = value;
			}


			public String getLocationType() {
				return locationType;
			}


			public void setLocationType(String value) {
				this.locationType = value;
			}


			public GeocodeResponse.Result.Geometry.Viewport getViewport() {
				return viewport;
			}


			public void setViewport(GeocodeResponse.Result.Geometry.Viewport value) {
				this.viewport = value;
			}


			public GeocodeResponse.Result.Geometry.Bounds getBounds() {
				return bounds;
			}


			public void setBounds(GeocodeResponse.Result.Geometry.Bounds value) {
				this.bounds = value;
			}



			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"southwest",
					"northeast"
			})
			public static class Bounds {

				@Override
				public String toString() {
					return "\nBounds [southwest=" + southwest + "\nnortheast=" + northeast + "]";
				}



				@XmlElement(required = true)
				protected GeocodeResponse.Result.Geometry.Bounds.Southwest southwest;
				@XmlElement(required = true)
				protected GeocodeResponse.Result.Geometry.Bounds.Northeast northeast;


				public GeocodeResponse.Result.Geometry.Bounds.Southwest getSouthwest() {
					return southwest;
				}


				public void setSouthwest(GeocodeResponse.Result.Geometry.Bounds.Southwest value) {
					this.southwest = value;
				}


				public GeocodeResponse.Result.Geometry.Bounds.Northeast getNortheast() {
					return northeast;
				}


				public void setNortheast(GeocodeResponse.Result.Geometry.Bounds.Northeast value) {
					this.northeast = value;
				}



				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"lat",
						"lng"
				})
				public static class Northeast {

					@Override
					public String toString() {
						return "Northeast [lat=" + lat + ", lng=" + lng + "]";
					}


					protected double lat;
					protected double lng;


					public double getLat() {
						return lat;
					}


					public void setLat(double value) {
						this.lat = value;
					}


					public double getLng() {
						return lng;
					}


					public void setLng(double value) {
						this.lng = value;
					}

				}



				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"lat",
						"lng"
				})
				public static class Southwest {

					@Override
					public String toString() {
						return "Southwest [lat=" + lat + ", lng=" + lng + "]";
					}


					protected double lat;
					protected double lng;


					public double getLat() {
						return lat;
					}


					public void setLat(double value) {
						this.lat = value;
					}


					public double getLng() {
						return lng;
					}


					public void setLng(double value) {
						this.lng = value;
					}

				}

			}



			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"lat",
					"lng"
			})
			public static class Location {

				@Override
				public String toString() {
					return "Location [lat=" + lat + ", lng=" + lng + "]";
				}

				protected double lat;
				protected double lng;


				public double getLat() {
					return lat;
				}

				public void setLat(double value) {
					this.lat = value;
				}


				public double getLng() {
					return lng;
				}

				public void setLng(double value) {
					this.lng = value;
				}

			}


			@XmlAccessorType(XmlAccessType.FIELD)
			@XmlType(name = "", propOrder = {
					"southwest",
					"northeast"
			})
			public static class Viewport {

				@Override
				public String toString() {
					return "\nViewport [southwest=" + southwest + "\nnortheast=" + northeast + "]";
				}


				@XmlElement(required = true)
				protected GeocodeResponse.Result.Geometry.Viewport.Southwest southwest;
				@XmlElement(required = true)
				protected GeocodeResponse.Result.Geometry.Viewport.Northeast northeast;


				public GeocodeResponse.Result.Geometry.Viewport.Southwest getSouthwest() {
					return southwest;
				}


				public void setSouthwest(GeocodeResponse.Result.Geometry.Viewport.Southwest value) {
					this.southwest = value;
				}


				public GeocodeResponse.Result.Geometry.Viewport.Northeast getNortheast() {
					return northeast;
				}


				public void setNortheast(GeocodeResponse.Result.Geometry.Viewport.Northeast value) {
					this.northeast = value;
				}



				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"lat",
						"lng"
				})
				public static class Northeast {

					@Override
					public String toString() {
						return "Northeast [lat=" + lat + ", lng=" + lng + "]";
					}


					protected double lat;
					protected double lng;


					public double getLat() {
						return lat;
					}


					public void setLat(double value) {
						this.lat = value;
					}

					public double getLng() {
						return lng;
					}


					public void setLng(double value) {
						this.lng = value;
					}

				}


				@XmlAccessorType(XmlAccessType.FIELD)
				@XmlType(name = "", propOrder = {
						"lat",
						"lng"
				})
				public static class Southwest {

					@Override
					public String toString() {
						return "Southwest [lat=" + lat + ", lng=" + lng + "]";
					}


					protected double lat;
					protected double lng;


					public double getLat() {
						return lat;
					}


					public void setLat(double value) {
						this.lat = value;
					}


					public double getLng() {
						return lng;
					}


					public void setLng(double value) {
						this.lng = value;
					}

				}

			}

		}

	}



	@Override
	public String toString() {
		return "GeocodeResponse [status=" + status + ", result=" + result + "]";
	}

}