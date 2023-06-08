SUMMARY = "Javadocs for jemmy"
DESCRIPTION = "This package contains the API documentation for jemmy."
LICENSE = "CDDL-1.0 | GPL-2.0-only"

PV = "2.3.0.0"

RPM_NAME = "jemmy-javadoc-2.3.0.0-26.6.noarch.rpm"
RPM_HASH = "d0d129f1a1cab5cb44da735b51f01bd332eec949ab0363f697ec412ce352e5483f9861af35dcc8c84dff71b871b8f13a1d1bd5aee3a9282a8d97e0ca7c196d50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jemmy-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem javapackages-tools jemmy"

inherit rpm
