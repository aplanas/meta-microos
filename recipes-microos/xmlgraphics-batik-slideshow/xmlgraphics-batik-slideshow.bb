SUMMARY = "Batik SVG slideshow"
DESCRIPTION = "Batik SVG slideshow."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-slideshow-1.15-2.3.noarch.rpm"
RPM_HASH = "af1fc7694d877fda75d18b393c341c7094193c2196364839f1bae6facbfbd262985fc520d4208dea63ca1f088e4e9b1cb3b12b1e42d0759ac0a0e12c40205c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-slideshow mvn(org.apache.xmlgraphics:batik-slideshow) mvn(org.apache.xmlgraphics:batik-slideshow:pom:) osgi(org.apache.batik.slideshow) xmlgraphics-batik-slideshow"
RDEPENDS:${PN} += "/bin/bash java-headless javapackages-filesystem xmlgraphics-batik"

inherit rpm
