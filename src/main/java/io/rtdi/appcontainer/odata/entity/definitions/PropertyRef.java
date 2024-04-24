package io.rtdi.appcontainer.odata.entity.definitions;

import java.util.Objects;

import jakarta.xml.bind.annotation.XmlAttribute;

public class PropertyRef {

	private String name;
	
	public PropertyRef() {};

	public PropertyRef(String name) {
		this.name = name;
	}
	
	@XmlAttribute(name = "Name")
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		return String.format("PropertyRef %s", name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PropertyRef other = (PropertyRef) obj;
		return Objects.equals(name, other.name);
	}

}
