package pl.edu.agh.iosr.virtgraph.model;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class HostList {
	private List<Host> hosts = new ArrayList<Host>();

	public List<Host> getHosts() {
		return hosts;
	}

	public void setHosts(List<Host> hosts) {
		this.hosts = hosts;
	}

	public HostList() {
		//
	}
}
