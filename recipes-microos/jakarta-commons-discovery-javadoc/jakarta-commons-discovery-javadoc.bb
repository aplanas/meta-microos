SUMMARY = "Javadoc for jakarta-commons-discovery"
DESCRIPTION = "This package contains the javadoc documentation for jakarta-commons-discovery."
LICENSE = "Apache-2.0"

PV = "0.5"

RPM_NAME = "jakarta-commons-discovery-javadoc-0.5-1.1.noarch.rpm"
RPM_HASH = "7216fddfeab026c9c75fa1a3c7fe41bb7721bfb8e12068f65f9c7a80b3149afdc17d9164328c3b703ca0034aae0902e4118bc377d4b1e73dfee8b9842c345ffb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jakarta-commons-discovery-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
