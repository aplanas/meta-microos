SUMMARY = "Prometheus Java Simpleclient Hotspot"
DESCRIPTION = "Collectors of data from Java Hotspot."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-hotspot-0.8.0-6.10.noarch.rpm"
RPM_HASH = "1bbbdaddaf53236407af213348e0d4a80296de664a6221625c490c2092dfee63bb24248fc3e336b4731055ec859f3af433c5e9010bd8a89737fd74ee67fb31fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_hotspot) mvn(io.prometheus:simpleclient_hotspot:pom:) osgi(io.prometheus.simpleclient_hotspot) prometheus-simpleclient-java-hotspot"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(io.prometheus:simpleclient)"

inherit rpm
