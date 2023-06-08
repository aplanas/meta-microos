SUMMARY = "Multi-Schema Validator RNG Converter"
DESCRIPTION = "Multi-Schema Validator RNG Converter."
LICENSE = "Apache-1.1 & BSD-3-Clause"

PV = "2013.6.1"

RPM_NAME = "msv-rngconv-2013.6.1-3.10.noarch.rpm"
RPM_HASH = "d9f0582c8304ecae8aa2a1a33d2ed460f18aabad37a9387a1f18cbc866e2d9c8a7e63ec44403553d69ecac3c3196f0ea383036c26264a0090bf5e44c1f810e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "msv-rngconv mvn(net.java.dev.msv:msv-rngconverter) mvn(net.java.dev.msv:msv-rngconverter:pom:)"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem javapackages-tools mvn(net.java.dev.msv:msv-core) mvn(net.java.dev.msv:xsdlib) mvn(xerces:xercesImpl) mvn(xml-resolver:xml-resolver)"

inherit rpm
