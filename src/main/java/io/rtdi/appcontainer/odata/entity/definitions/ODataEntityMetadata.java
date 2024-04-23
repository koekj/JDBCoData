package io.rtdi.appcontainer.odata.entity.definitions;

import io.rtdi.appcontainer.odata.ODataKind;
import jakarta.xml.bind.annotation.XmlElement;

public class ODataEntityMetadata {

	private String name;
	private ODataKind kind;
	private String url;

	public ODataEntityMetadata(String name, String url) {
		this.name = name;
		this.url = url;
		this.kind = ODataKind.EntitySet;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}

	@XmlElement(name = "kind")
	public String getKind() {
		return kind.name();
	}

	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}

	@Override
	public String toString() {
		return "ODataEntityMetadata [name=" + name + ", kind=" + kind + ", url=" + url + "]";
	}

}