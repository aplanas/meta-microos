SUMMARY = "Javadoc for qdox"
DESCRIPTION = "API docs for qdox."
LICENSE = "Apache-2.0"

PV = "2.0.1"

RPM_NAME = "qdox-javadoc-2.0.1-2.6.noarch.rpm"
RPM_HASH = "5cd95781e69feb28fbe2fee4a74c01e5be1c6ced3c125083721e58e420d95081bec6f485a96826ff1aeca0baa24649c73f91398814991151108978665d7fbe05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "qdox-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
