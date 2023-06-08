SUMMARY = "Javadoc for junit"
DESCRIPTION = "Javadoc for junit."
LICENSE = "EPL-1.0"

PV = "4.13.2"

RPM_NAME = "junit-javadoc-4.13.2-4.1.noarch.rpm"
RPM_HASH = "533878fb9e762b72c8912fd62762206fed36c4b35adaac422013cd4ee1654c0bd4fe00a96598d0a023b752e423361d2bfc4803336e549e351efc4c8863cf513d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "junit-javadoc junit4-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
