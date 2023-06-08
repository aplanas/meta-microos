SUMMARY = "Javadoc for plexus-sec-dispatcher"
DESCRIPTION = "API documentation for plexus-sec-dispatcher."
LICENSE = "Apache-2.0"

PV = "2.0"

RPM_NAME = "plexus-sec-dispatcher-javadoc-2.0-3.4.noarch.rpm"
RPM_HASH = "b4cd3169aedfaadcdf1a38a7910522253bbeb6c7a4551275b596b102a58fc55c483326359afab58feadb9a4773e142a42bf41e2a4151bda95efa2e30b4028838"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-sec-dispatcher-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
