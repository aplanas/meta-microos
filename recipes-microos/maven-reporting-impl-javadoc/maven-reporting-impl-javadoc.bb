SUMMARY = "Javadoc for maven-reporting-impl"
DESCRIPTION = "API documentation for maven-reporting-impl."
LICENSE = "Apache-2.0"

PV = "3.1.0"

RPM_NAME = "maven-reporting-impl-javadoc-3.1.0-1.12.noarch.rpm"
RPM_HASH = "ca950702f0058a5b2ce809ba5c6784ea8dc71735f81cd3bb29b46c531effedd5d2915681154c4f2a7132126667675f57314225d620ea735644fef4be57d78fa4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "maven-reporting-impl-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
