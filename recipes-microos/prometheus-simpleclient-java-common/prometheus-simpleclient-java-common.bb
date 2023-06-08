SUMMARY = "Prometheus Java Simpleclient Common"
DESCRIPTION = "Common code used by various modules of the Simpleclient."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "0.8.0"

RPM_NAME = "prometheus-simpleclient-java-common-0.8.0-6.10.noarch.rpm"
RPM_HASH = "83921655fc5f05e0f53835b942ce258d58950ca65a9b6d872217f930e395867a249d3410dbc81acc76f689eb9a2835e7d76e178773a6c1ed583788599185de76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mvn(io.prometheus:simpleclient_common) mvn(io.prometheus:simpleclient_common:pom:) osgi(io.prometheus.simpleclient_common) prometheus-simpleclient-java-common"
RDEPENDS:${PN} += "java-headless javapackages-filesystem mvn(io.prometheus:simpleclient)"

inherit rpm
