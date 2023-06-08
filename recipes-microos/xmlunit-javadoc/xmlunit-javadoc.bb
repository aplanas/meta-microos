SUMMARY = "Javadoc for xmlunit"
DESCRIPTION = "Javadoc for xmlunit. Also contains userguide."
LICENSE = "BSD-3-Clause"

PV = "1.6"

RPM_NAME = "xmlunit-javadoc-1.6-2.6.noarch.rpm"
RPM_HASH = "d2de5bb282e41e2f00834a08c7842eb4536a439c0c9341b12830adea6e8bafb1ba591347a247a93845d199aebc04eb7767f0af5ae4530d8440caf92ae521e0b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "xmlunit-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
