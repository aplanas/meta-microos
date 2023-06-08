SUMMARY = "Multi-Schema Validator Generator"
DESCRIPTION = "Multi-Schema Validator Generator."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-xmlgen-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "a7d5ee1470d1eab406c042a6fb65ef5a65a4ed965360a14606fbe3b119cc81161fd576fe845842cf0bb02cd10db96bf5c75db548de0f42c52296e818b6ed4553"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-xmlgen mvn(net.java.dev.msv:msv-generator) mvn(net.java.dev.msv:msv-generator:pom:) osgi(net.java.dev.msv.generator)"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem javapackages-tools mvn(net.java.dev.msv:msv-core) mvn(net.java.dev.msv:xsdlib) mvn(xerces:xercesImpl) mvn(xml-resolver:xml-resolver)"

inherit rpm
