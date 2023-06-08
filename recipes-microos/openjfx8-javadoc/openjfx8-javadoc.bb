SUMMARY = "Javadoc for openjfx8"
DESCRIPTION = "This package contains javadoc for openjfx8."
LICENSE = "BSD-3-Clause & GPL-2.0-only-WITH-Classpath-exception-2.0"

PV = "8.0.202"

RPM_NAME = "openjfx8-javadoc-8.0.202-8.3.noarch.rpm"
RPM_HASH = "10ab072ac1247dc54ff665341df7ea22639a623a35c99bffc69553b906f49d3268a2a864f01e2ceae6ebbade7758f6d94cb6a5f7ff088f3762ad59758dad4d81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1_8_0-openjfx-javadoc openjfx8-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
