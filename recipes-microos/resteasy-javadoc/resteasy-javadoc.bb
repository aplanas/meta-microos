SUMMARY = "Javadoc for resteasy"
DESCRIPTION = "This package contains the API documentation for resteasy."
LICENSE = "Apache-2.0 & CDDL-1.0"

PV = "3.0.26"

RPM_NAME = "resteasy-javadoc-3.0.26-3.10.noarch.rpm"
RPM_HASH = "b0c66ea5aeddd4ab4eb2fb4b43d90d9759e958b04bfc3608c58a9634785401b9a076655a61a03146f50e2f850b7f398b1b53b25af19468b8b5fa7915f04deae2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "resteasy-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
