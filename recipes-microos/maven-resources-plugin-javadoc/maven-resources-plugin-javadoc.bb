SUMMARY = "Javadoc for maven-resources-plugin"
DESCRIPTION = "API documentation for maven-resources-plugin."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "maven-resources-plugin-javadoc-3.2.0-3.7.noarch.rpm"
RPM_HASH = "7d6808e8077b9f30697744e820dcd4bec8dda8b0ea3498dbb902073576e7184df86007ef2700d582025532745dab4b9374bdcfcbcf174b5fa67d443eae8c6549"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-resources-plugin-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
