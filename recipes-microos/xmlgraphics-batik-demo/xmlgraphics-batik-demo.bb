SUMMARY = "Demo for xmlgraphics-batik"
DESCRIPTION = "Demonstrations and samples for xmlgraphics-batik."
LICENSE = "Apache-2.0"

PV = "1.15"

RPM_NAME = "xmlgraphics-batik-demo-1.15-2.3.noarch.rpm"
RPM_HASH = "135dd68742df17954ed527d5d4a33d100483811883496bf38fec3d5d8edb4aeb858c782af1ebe03cfcdb74a165b2c7373a936783a4ca27ae24ffeb64dfc8feb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "batik-demo xmlgraphics-batik-demo"
RDEPENDS:${PN} += "xmlgraphics-batik"

inherit rpm
