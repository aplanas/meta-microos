SUMMARY = "Javadoc for plexus-build-api"
DESCRIPTION = "API documentation for plexus-build-api."
LICENSE = "Apache-2.0"

PV = "0.0.7"

RPM_NAME = "plexus-build-api-javadoc-0.0.7-4.4.noarch.rpm"
RPM_HASH = "8d9e33aed0664468bed72fdb3c8acf19879c99dbad45c1976b80d0dca1fa59dcf5160d49e0f6d9be9aa7e7ae0d79106bdbcbd9640ae1a316ee2c156c1c00493b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plexus-build-api-javadoc"
RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
