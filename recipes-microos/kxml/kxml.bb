SUMMARY = "Small XML pull parser"
DESCRIPTION = "kXML is a small XML pull parser, specially designed for constrained \
environments such as Applets, Personal Java or MIDP devices."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "kxml-2.3.0-19.9.noarch.rpm"
RPM_HASH = "96872ffb32de8acf1835e8397123d6e2b95360887052a61af4249929eeb06a9d57c7fadf48d2c55390ff097ebef05d0ee89998075d2c19f85f81fa795258ec9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kxml mvn(net.sf.kxml:kxml2) mvn(net.sf.kxml:kxml2-min) mvn(net.sf.kxml:kxml2-min:pom:) mvn(net.sf.kxml:kxml2:pom:) osgi(org.kxml2)"
RDEPENDS:${PN} += "java-headless javapackages-filesystem xpp3"

inherit rpm
